package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsWixChatFilledSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/WixChatFilledSmall", JSImport.Default)
  @js.native
  val default: FC[WixChatFilledSmallProps] = js.native
  
  trait WixChatFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixChatFilledSmallProps {
    
    inline def apply(): WixChatFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixChatFilledSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WixChatFilledSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixChatFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsWixChatFilledSmallMod.foo` */
  override def _to: FC[WixChatFilledSmallProps] = default
}
