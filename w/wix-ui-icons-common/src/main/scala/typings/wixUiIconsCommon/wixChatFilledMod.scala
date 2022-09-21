package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixChatFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixChatFilled", JSImport.Default)
  @js.native
  val default: FC[WixChatFilledProps] = js.native
  
  trait WixChatFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixChatFilledProps {
    
    inline def apply(): WixChatFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixChatFilledProps]
    }
    
    extension [Self <: WixChatFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixChatFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixChatFilledMod.foo` */
  override def _to: FC[WixChatFilledProps] = default
}
