package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsBookingPageLinksSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/BookingPageLinksSmall", JSImport.Default)
  @js.native
  val default: FC[BookingPageLinksSmallProps] = js.native
  
  trait BookingPageLinksSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BookingPageLinksSmallProps {
    
    inline def apply(): BookingPageLinksSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookingPageLinksSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookingPageLinksSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BookingPageLinksSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsBookingPageLinksSmallMod.foo` */
  override def _to: FC[BookingPageLinksSmallProps] = default
}
