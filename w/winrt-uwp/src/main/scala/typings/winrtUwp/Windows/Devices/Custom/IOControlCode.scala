package typings.winrtUwp.Windows.Devices.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the control code. */
@JSGlobal("Windows.Devices.Custom.IOControlCode")
@js.native
class IOControlCode protected () extends js.Object {
  /**
    * The control code.
    * @param deviceType The device type.
    * @param function The device function.
    * @param accessMode The access mode.
    * @param bufferingMethod The buffering method.
    */
  def this(
    deviceType: Double,
    func: Double,
    accessMode: IOControlAccessMode,
    bufferingMethod: IOControlBufferingMethod
  ) = this()
  /** The access mode. */
  var accessMode: IOControlAccessMode = js.native
  /** The buffering method. */
  var bufferingMethod: IOControlBufferingMethod = js.native
  /** The control code. */
  var controlCode: Double = js.native
  /** The device type. */
  var deviceType: Double = js.native
  /** The function. */
  var function: Double = js.native
}

