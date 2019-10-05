package typings.winrtDashUwp.Windows.Devices.I2c

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
  sealed trait fullTransfer extends I2cTransferStatus
  
  /** The I²C device negatively acknowledged the data transfer before all of the data was transferred. */
  @js.native
  sealed trait partialTransfer extends I2cTransferStatus
  
  /** The bus address was not acknowledged. */
  @js.native
  sealed trait slaveAddressNotAcknowledged extends I2cTransferStatus
  
  /* 0 */ val fullTransfer: typings.winrtDashUwp.Windows.Devices.I2c.I2cTransferStatus.fullTransfer with Double = js.native
  /* 1 */ val partialTransfer: typings.winrtDashUwp.Windows.Devices.I2c.I2cTransferStatus.partialTransfer with Double = js.native
  /* 2 */ val slaveAddressNotAcknowledged: typings.winrtDashUwp.Windows.Devices.I2c.I2cTransferStatus.slaveAddressNotAcknowledged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[I2cTransferStatus with Double] = js.native
}

