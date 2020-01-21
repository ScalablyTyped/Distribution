package typings.web3Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.web3Utils.web3UtilsStrings.pure
  - typings.web3Utils.web3UtilsStrings.view
  - typings.web3Utils.web3UtilsStrings.nonpayable
  - typings.web3Utils.web3UtilsStrings.payable
*/
trait StateMutabilityType extends js.Object

object StateMutabilityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nonpayable: typings.web3Utils.web3UtilsStrings.nonpayable = this.cast("nonpayable")
  @scala.inline
  def payable: typings.web3Utils.web3UtilsStrings.payable = this.cast("payable")
  @scala.inline
  def pure: typings.web3Utils.web3UtilsStrings.pure = this.cast("pure")
  @scala.inline
  def view: typings.web3Utils.web3UtilsStrings.view = this.cast("view")
}

