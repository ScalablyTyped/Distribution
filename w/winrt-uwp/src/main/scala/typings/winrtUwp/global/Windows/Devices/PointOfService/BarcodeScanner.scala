package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the barcode scanner device. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScanner")
@js.native
abstract class BarcodeScanner ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner
object BarcodeScanner {
  
  @JSGlobal("Windows.Devices.PointOfService.BarcodeScanner")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates BarcodeScanner object from the DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific barcode scanner, which can be retrieved from the DeviceId property.
    * @return The barcode scanner specified by the unique device identifier. Returns a null object in the following cases:
    */
  /* static member */
  @scala.inline
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner]]
  
  /**
    * Returns the first available barcode scanner.
    * @return The first available barcode scanner. Returns a null object in the following cases:
    */
  /* static member */
  @scala.inline
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner]]
  
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available barcode scanners.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available barcode scanners.
    */
  /* static member */
  @scala.inline
  def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
}
