package typings.themeUiColorModes

import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.Dispatch
import typings.react.mod.JSX.Element
import typings.react.mod.SetStateAction
import typings.std.HTMLElement
import typings.themeUiColorModes.anon.Children
import typings.themeUiColorModes.anon.DangerouslySetInnerHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@theme-ui/color-modes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ColorModeProvider(param0: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ColorModeProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InitializeColorMode(): DetailedReactHTMLElement[DangerouslySetInnerHTML, HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("InitializeColorMode")().asInstanceOf[DetailedReactHTMLElement[DangerouslySetInnerHTML, HTMLElement]]
  
  inline def useColorMode[T /* <: String */](): js.Tuple2[T, Dispatch[SetStateAction[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorMode")().asInstanceOf[js.Tuple2[T, Dispatch[SetStateAction[T]]]]
  
  /* augmented module */
  object themeUiCoreAugmentingMod {
    
    trait ThemeUIContextValue extends StObject {
      
      var colorMode: js.UndefOr[String] = js.undefined
      
      var setColorMode: js.UndefOr[js.Function1[/* colorMode */ SetStateAction[js.UndefOr[String]], Unit]] = js.undefined
    }
    object ThemeUIContextValue {
      
      inline def apply(): ThemeUIContextValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ThemeUIContextValue]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ThemeUIContextValue] (val x: Self) extends AnyVal {
        
        inline def setColorMode(value: String): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
        
        inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
        
        inline def setSetColorMode(value: /* colorMode */ SetStateAction[js.UndefOr[String]] => Unit): Self = StObject.set(x, "setColorMode", js.Any.fromFunction1(value))
        
        inline def setSetColorModeUndefined: Self = StObject.set(x, "setColorMode", js.undefined)
      }
    }
  }
}
