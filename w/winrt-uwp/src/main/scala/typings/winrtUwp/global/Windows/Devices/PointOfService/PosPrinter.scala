package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinter")
@js.native
abstract class PosPrinter ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter

/* static members */
@JSGlobal("Windows.Devices.PointOfService.PosPrinter")
@js.native
object PosPrinter extends js.Object {
  /**
    * Creates a PosPrinter object for point-of-service printer with the specified DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific point-of-service printer.
    * @return The point-of-service printer that the unique device identifier identifies. Returns a null object in the following cases:
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter] = js.native
  /**
    * Gets the default paired or locally-connected printer.
    * @return The default locally-connected printer.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available point-of-service printers.
    * @return An Advanced Query Syntax (AQS) string that you can use to list the available point-of-service printers.
    */
  def getDeviceSelector(): String = js.native
}

