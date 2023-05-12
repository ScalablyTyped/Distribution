package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsBookingChannelsSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/BookingChannelsSmall", JSImport.Default)
  @js.native
  val default: FC[BookingChannelsSmallProps] = js.native
  
  trait BookingChannelsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BookingChannelsSmallProps {
    
    inline def apply(): BookingChannelsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookingChannelsSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookingChannelsSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BookingChannelsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsBookingChannelsSmallMod.foo` */
  override def _to: FC[BookingChannelsSmallProps] = default
}
