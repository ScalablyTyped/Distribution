package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CashDrawerStatusKind extends StObject
/** Defines the constants that indicate the cash drawer power status. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerStatusKind")
@js.native
object CashDrawerStatusKind extends StObject {
  
  /** The device status is not any of the above states. This is available so a POS driver can provide custom notifications to the app. */
  @js.native
  sealed trait extended
    extends StObject
       with CashDrawerStatusKind
  
  /** The device is powered off or detached from the terminal. */
  @js.native
  sealed trait off
    extends StObject
       with CashDrawerStatusKind
  
  /** The device is either off or offline, but the current state can not be distinguished. */
  @js.native
  sealed trait offOrOffline
    extends StObject
       with CashDrawerStatusKind
  
  /** The device is powered on but is not available to respond to requests. */
  @js.native
  sealed trait offline
    extends StObject
       with CashDrawerStatusKind
  
  /** The device is powered on and ready to use. */
  @js.native
  sealed trait online
    extends StObject
       with CashDrawerStatusKind
}
