package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the barcode scanner device. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScanner")
@js.native
abstract class BarcodeScanner ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner
/* static members */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScanner")
@js.native
object BarcodeScanner extends js.Object {
  
  /**
    * Creates BarcodeScanner object from the DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific barcode scanner, which can be retrieved from the DeviceId property.
    * @return The barcode scanner specified by the unique device identifier. Returns a null object in the following cases:
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner] = js.native
  
  /**
    * Returns the first available barcode scanner.
    * @return The first available barcode scanner. Returns a null object in the following cases:
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScanner] = js.native
  
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available barcode scanners.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available barcode scanners.
    */
  def getDeviceSelector(): String = js.native
}
