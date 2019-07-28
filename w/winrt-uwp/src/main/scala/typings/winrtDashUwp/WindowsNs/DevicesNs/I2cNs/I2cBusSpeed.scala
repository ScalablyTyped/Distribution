package typings.winrtDashUwp.WindowsNs.DevicesNs.I2cNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait I2cBusSpeed extends js.Object

/** Describes the bus speeds that are available for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
@JSGlobal("Windows.Devices.I2c.I2cBusSpeed")
@js.native
object I2cBusSpeed extends js.Object {
  /** A fast speed of 400 kHz. */
  @js.native
  sealed trait fastMode extends I2cBusSpeed
  
  /** The standard speed of 100 kilohertz (kHz). This speed is the default. */
  @js.native
  sealed trait standardMode extends I2cBusSpeed
  
  /* 1 */ val fastMode: typings.winrtDashUwp.WindowsNs.DevicesNs.I2cNs.I2cBusSpeed.fastMode with Double = js.native
  /* 0 */ val standardMode: typings.winrtDashUwp.WindowsNs.DevicesNs.I2cNs.I2cBusSpeed.standardMode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[I2cBusSpeed with Double] = js.native
}

