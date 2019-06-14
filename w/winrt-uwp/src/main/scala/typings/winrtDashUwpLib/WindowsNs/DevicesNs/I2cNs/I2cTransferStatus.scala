package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait I2cTransferStatus extends js.Object

/** Describes whether the data transfers that the ReadPartial , WritePartial , or WriteReadPartial method performed succeeded, or provides the reason that the transfers did not succeed. */
@JSGlobal("Windows.Devices.I2c.I2cTransferStatus")
@js.native
object I2cTransferStatus extends js.Object {
  /** The data was entirely transferred. For WriteReadPartial , the data for both the write and the read operations was entirely transferred. */
  @js.native
  sealed trait fullTransfer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.I2cTransferStatus
  
  /** The I²C device negatively acknowledged the data transfer before all of the data was transferred. */
  @js.native
  sealed trait partialTransfer
    extends winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.I2cTransferStatus
  
  /** The bus address was not acknowledged. */
  @js.native
  sealed trait slaveAddressNotAcknowledged
    extends winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.I2cTransferStatus
  
  /* 0 */ val fullTransfer: fullTransfer with scala.Double = js.native
  /* 1 */ val partialTransfer: partialTransfer with scala.Double = js.native
  /* 2 */ val slaveAddressNotAcknowledged: slaveAddressNotAcknowledged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.I2cNs.I2cTransferStatus with scala.Double] = js.native
}

