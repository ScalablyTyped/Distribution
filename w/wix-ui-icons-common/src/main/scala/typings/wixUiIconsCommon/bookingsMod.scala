package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBookingsMod.BookingsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookingsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Bookings", JSImport.Default)
  @js.native
  val default: FC[BookingsProps] = js.native
  
  type _To = FC[BookingsProps]
  
  /* This means you don't have to write `default`, but can instead just say `bookingsMod.foo` */
  override def _to: FC[BookingsProps] = default
}
