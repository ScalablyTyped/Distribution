package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.wixUiCore.anon.PickTitlePropschildren0
import typings.wixUiCore.anon.`6`
import typings.wixUiCore.componentsSignatureInputSignatureInputContextMod.SignatureInputContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSignatureInputTitleTitleMod {
  
  @JSImport("wix-ui-core/src/components/signature-input/title/Title", "Title")
  @js.native
  val Title: FunctionComponent[PickTitlePropschildren0] = js.native
  
  type TitleChildrenFn = js.Function1[/* childrenFn */ `6`, Element]
  
  trait TitleChildrenProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var `data-hook`: js.UndefOr[String] = js.undefined
  }
  object TitleChildrenProps {
    
    @scala.inline
    def apply(): TitleChildrenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleChildrenProps]
    }
    
    @scala.inline
    implicit class TitleChildrenPropsMutableBuilder[Self <: TitleChildrenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    }
  }
  
  @js.native
  trait TitleProps
    extends StObject
       with SignatureInputContextValue {
    
    var children: js.UndefOr[TitleChildrenFn] = js.native
  }
}
