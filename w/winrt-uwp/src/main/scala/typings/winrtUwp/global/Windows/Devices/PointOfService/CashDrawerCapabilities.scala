package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the cash drawer capabilities. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.CashDrawerCapabilities")
@js.native
open class CashDrawerCapabilities ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.CashDrawerCapabilities {
  
  /** Indicated whether cash drawer open sensor is available. */
  /* CompleteClass */
  var isDrawerOpenSensorAvailable: Boolean = js.native
  
  /** Whether statistics reporting is supported by the cash drawer. */
  /* CompleteClass */
  var isStatisticsReportingSupported: Boolean = js.native
  
  /** Whether statistics updating is supported by the cash drawer. */
  /* CompleteClass */
  var isStatisticsUpdatingSupported: Boolean = js.native
  
  /** Whether the status from multiple drawers is supported. */
  /* CompleteClass */
  var isStatusMultiDrawerDetectSupported: Boolean = js.native
  
  /** Whether status reporting is supported by the cash drawer. */
  /* CompleteClass */
  var isStatusReportingSupported: Boolean = js.native
  
  /** Whether the cash drawer has standard or advanced power reporting. */
  /* CompleteClass */
  var powerReportingType: typings.winrtUwp.Windows.Devices.PointOfService.UnifiedPosPowerReportingType = js.native
}
