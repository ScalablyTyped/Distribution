package typings.winrtDashUwp.Windows.Devices.I2c

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.I2c.I2cTransferStatus.fullTransfer
import typings.winrtDashUwp.Windows.Devices.I2c.I2cTransferStatus.partialTransfer
import typings.winrtDashUwp.Windows.Devices.I2c.I2cTransferStatus.slaveAddressNotAcknowledged
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[I2cTransferStatus with Double] = js.native
  /* 0 */ @js.native
  object fullTransfer extends TopLevel[fullTransfer with Double]
  
  /* 1 */ @js.native
  object partialTransfer extends TopLevel[partialTransfer with Double]
  
  /* 2 */ @js.native
  object slaveAddressNotAcknowledged extends TopLevel[slaveAddressNotAcknowledged with Double]
  
}

