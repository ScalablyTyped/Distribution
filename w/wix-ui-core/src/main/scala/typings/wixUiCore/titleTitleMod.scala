package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.wixUiCore.anon.GetTitleProps
import typings.wixUiCore.anon.PickTitlePropschildren
import typings.wixUiCore.signatureInputContextMod.SignatureInputContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleTitleMod {
  
  @JSImport("wix-ui-core/dist/src/components/signature-input/title/Title", "Title")
  @js.native
  val Title: FunctionComponent[PickTitlePropschildren] = js.native
  
  type TitleChildrenFn = js.Function1[/* childrenFn */ GetTitleProps, Element]
  
  trait TitleChildrenProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var `data-hook`: js.UndefOr[String] = js.undefined
  }
  object TitleChildrenProps {
    
    inline def apply(): TitleChildrenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleChildrenProps]
    }
    
    extension [Self <: TitleChildrenProps](x: Self) {
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    }
  }
  
  @js.native
  trait TitleProps
    extends StObject
       with SignatureInputContextValue {
    
    var children: js.UndefOr[TitleChildrenFn] = js.native
  }
}
