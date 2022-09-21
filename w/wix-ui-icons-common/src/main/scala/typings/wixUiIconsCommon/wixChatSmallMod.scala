package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixChatSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixChatSmall", JSImport.Default)
  @js.native
  val default: FC[WixChatSmallProps] = js.native
  
  trait WixChatSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixChatSmallProps {
    
    inline def apply(): WixChatSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixChatSmallProps]
    }
    
    extension [Self <: WixChatSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixChatSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixChatSmallMod.foo` */
  override def _to: FC[WixChatSmallProps] = default
}
