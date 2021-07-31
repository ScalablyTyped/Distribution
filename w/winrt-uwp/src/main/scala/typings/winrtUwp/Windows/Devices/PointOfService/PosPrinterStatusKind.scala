package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterStatusKind extends StObject
/** Describes the power state for a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterStatusKind")
@js.native
object PosPrinterStatusKind extends StObject {
  
  /** The original equipment manufacturer (OEM) reports extended information about the power state of the printer in the PosPrinterStatus.ExtendedStatus property. */
  @js.native
  sealed trait extended
    extends StObject
       with PosPrinterStatusKind
  
  /** The printer is turned off or disconnected from the terminal. */
  @js.native
  sealed trait off
    extends StObject
       with PosPrinterStatusKind
  
  /** The printer is either turned off, or turned on but not ready or not able to respond to requests. */
  @js.native
  sealed trait offOrOffline
    extends StObject
       with PosPrinterStatusKind
  
  /** The printer is turned on, but it is not ready or not able to respond to requests. */
  @js.native
  sealed trait offline
    extends StObject
       with PosPrinterStatusKind
  
  /** The printer is online. */
  @js.native
  sealed trait online
    extends StObject
       with PosPrinterStatusKind
}
