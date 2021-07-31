package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data from the ImagePreviewReceived event. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerImagePreviewReceivedEventArgs")
@js.native
abstract class BarcodeScannerImagePreviewReceivedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerImagePreviewReceivedEventArgs {
  
  /** Gets the BitmapImage from the device representing a preview frame. */
  /* CompleteClass */
  var preview: IRandomAccessStreamWithContentType = js.native
}
