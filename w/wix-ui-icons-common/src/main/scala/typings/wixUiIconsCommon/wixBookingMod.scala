package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixBookingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixBooking", JSImport.Default)
  @js.native
  val default: FC[WixBookingProps] = js.native
  
  trait WixBookingProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixBookingProps {
    
    inline def apply(): WixBookingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixBookingProps]
    }
    
    extension [Self <: WixBookingProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixBookingProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixBookingMod.foo` */
  override def _to: FC[WixBookingProps] = default
}
