package typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core-helpers", "formatters")
@js.native
class formatters () extends js.Object

/* static members */
@JSImport("web3-core-helpers", "formatters")
@js.native
object formatters extends js.Object {
  def inputAddressFormatter(address: String): String = js.native
  def inputBlockNumberFormatter(blockNumber: String): String | Double = js.native
  def inputBlockNumberFormatter(blockNumber: Double): String | Double = js.native
  def inputCallFormatter(txObject: js.Any): js.Any = js.native
  def inputDefaultBlockNumberFormatter(blockNumber: String): String = js.native
  def inputLogFormatter(log: js.Any): js.Any = js.native
  def inputPostFormatter(post: js.Any): js.Any = js.native
  def inputSignFormatter(data: String): String = js.native
  def inputTransactionFormatter(txObject: js.Any): js.Any = js.native
  def isPredefinedBlockNumber(blockNumber: String): Boolean = js.native
  def outputBigNumberFormatter(number: Double): Double = js.native
  def outputBlockFormatter(block: js.Any): js.Any = js.native
  def outputLogFormatter(log: js.Any): js.Any = js.native
   // TODO: Create Post interface
  def outputPostFormatter(post: js.Any): js.Any = js.native
   // TODO: Create Post interface
  def outputSyncingFormatter(result: js.Any): js.Any = js.native
  def outputTransactionFormatter(receipt: js.Any): js.Any = js.native
  def outputTransactionReceiptFormatter(receipt: js.Any): js.Any = js.native
   // TODO: Create Block interface
  def txInputFormatter(txObject: js.Any): js.Any = js.native
}

