package typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D printer. */
@JSGlobal("Windows.Devices.Printers.Print3DDevice")
@js.native
abstract class Print3DDevice () extends js.Object {
  /** Gets the PrintSchema object for obtaining capabilities and print ticket information. */
  var printSchema: PrintSchema = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Printers.Print3DDevice")
@js.native
object Print3DDevice extends js.Object {
  /**
    * Creates a Print3DDevice object that represents a 3D printer connected to the device.
    * @param deviceId The device ID of the 3D printer.
    * @return A Print3DDevice object that corresponds to the specified 3D printer.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[Print3DDevice] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that can be used to find all 3D printers that are connected to the device.
    * @return An AQS string that can be used to find all 3D printers connected to the device.
    */
  def getDeviceSelector(): String = js.native
}

