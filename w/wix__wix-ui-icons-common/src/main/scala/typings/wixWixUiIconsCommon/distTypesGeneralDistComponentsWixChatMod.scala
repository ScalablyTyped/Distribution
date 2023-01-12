package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsWixChatMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/WixChat", JSImport.Default)
  @js.native
  val default: FC[WixChatProps] = js.native
  
  trait WixChatProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixChatProps {
    
    inline def apply(): WixChatProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixChatProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WixChatProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixChatProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsWixChatMod.foo` */
  override def _to: FC[WixChatProps] = default
}
