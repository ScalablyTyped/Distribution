package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixBookingSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WixBookingSmall", JSImport.Default)
  @js.native
  val default: FC[WixBookingSmallProps] = js.native
  
  trait WixBookingSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixBookingSmallProps {
    
    inline def apply(): WixBookingSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixBookingSmallProps]
    }
    
    extension [Self <: WixBookingSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixBookingSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixBookingSmallMod.foo` */
  override def _to: FC[WixBookingSmallProps] = default
}
