package typings.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the barcode scanner capabilities. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerCapabilities")
@js.native
abstract class BarcodeScannerCapabilities ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerCapabilities {
  
  /** Indicates whether the barcode scanner supports image preview. */
  /* CompleteClass */
  var isImagePreviewSupported: Boolean = js.native
  
  /** Indicates whether the barcode scanner supports the software trigger functionality. */
  /* CompleteClass */
  var isSoftwareTriggerSupported: Boolean = js.native
  
  /** Indicates whether the barcode scanner supports reporting of usage statistics. */
  /* CompleteClass */
  var isStatisticsReportingSupported: Boolean = js.native
  
  /** Indicates whether the barcode scanner supports updating or resetting of usage statistics. */
  /* CompleteClass */
  var isStatisticsUpdatingSupported: Boolean = js.native
  
  /** Gets the power reporting type for the barcode scanner. */
  /* CompleteClass */
  var powerReportingType: typings.winrtUwp.Windows.Devices.PointOfService.UnifiedPosPowerReportingType = js.native
}
