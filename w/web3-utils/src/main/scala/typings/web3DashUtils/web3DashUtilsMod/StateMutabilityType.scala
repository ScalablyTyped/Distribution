package typings.web3DashUtils.web3DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.web3DashUtils.web3DashUtilsStrings.pure
  - typings.web3DashUtils.web3DashUtilsStrings.view
  - typings.web3DashUtils.web3DashUtilsStrings.nonpayable
  - typings.web3DashUtils.web3DashUtilsStrings.payable
*/
trait StateMutabilityType extends js.Object

object StateMutabilityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nonpayable: typings.web3DashUtils.web3DashUtilsStrings.nonpayable = this.cast("nonpayable")
  @scala.inline
  def payable: typings.web3DashUtils.web3DashUtilsStrings.payable = this.cast("payable")
  @scala.inline
  def pure: typings.web3DashUtils.web3DashUtilsStrings.pure = this.cast("pure")
  @scala.inline
  def view: typings.web3DashUtils.web3DashUtilsStrings.view = this.cast("view")
}

