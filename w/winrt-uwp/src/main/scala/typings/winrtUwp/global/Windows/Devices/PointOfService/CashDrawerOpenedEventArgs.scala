package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This object is passed as a parameter to the event handlers for the DrawerOpened event. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerOpenedEventArgs")
@js.native
abstract class CashDrawerOpenedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.CashDrawerOpenedEventArgs {
  
  /** Gets the data associated with the DrawerOpened event. */
  /* CompleteClass */
  var cashDrawer: typings.winrtUwp.Windows.Devices.PointOfService.CashDrawer = js.native
}
