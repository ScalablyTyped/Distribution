package typings.terraThemeContext

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.terraThemeContext.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libThemeContextProviderMod extends Shortcut {
  
  @JSImport("terra-theme-context/lib/ThemeContextProvider", JSImport.Default)
  @js.native
  val default: FC[ThemeContextProviderProps] = js.native
  
  trait ThemeContextProviderProps extends StObject {
    
    /**
      * The components to be rendered within the context of the ThemeContextProvider. Components rendered here are able to interact with ThemeContextProvider through the ThemeContext.
      */
    var children: ReactElement
    
    /**
      * An object containing the name and className of the selected theme.
      */
    var theme: js.UndefOr[Name] = js.undefined
  }
  object ThemeContextProviderProps {
    
    inline def apply(children: ReactElement): ThemeContextProviderProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeContextProviderProps]
    }
    
    extension [Self <: ThemeContextProviderProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Name): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = FC[ThemeContextProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `libThemeContextProviderMod.foo` */
  override def _to: FC[ThemeContextProviderProps] = default
}
