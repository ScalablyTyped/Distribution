package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixChatFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixChatFilled", JSImport.Default)
  @js.native
  val default: SFC[WixChatFilledProps] = js.native
  
  trait WixChatFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object WixChatFilledProps {
    
    @scala.inline
    def apply(): WixChatFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixChatFilledProps]
    }
    
    @scala.inline
    implicit class WixChatFilledPropsMutableBuilder[Self <: WixChatFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[WixChatFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixChatFilledMod.foo` */
  override def _to: SFC[WixChatFilledProps] = default
}
