package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This object is passed as a parameter to the event handlers for the DrawerClosed event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.CashDrawerClosedEventArgs")
@js.native
open class CashDrawerClosedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.CashDrawerClosedEventArgs {
  
  /** Gets the data associated with the DrawerClosed event. */
  /* CompleteClass */
  var cashDrawer: typings.winrtUwp.Windows.Devices.PointOfService.CashDrawer = js.native
}
