package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsBookingsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/Bookings", JSImport.Default)
  @js.native
  val default: FC[BookingsProps] = js.native
  
  trait BookingsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BookingsProps {
    
    inline def apply(): BookingsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookingsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookingsProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BookingsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsBookingsMod.foo` */
  override def _to: FC[BookingsProps] = default
}
