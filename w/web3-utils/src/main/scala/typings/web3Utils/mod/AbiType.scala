package typings.web3Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.web3Utils.web3UtilsStrings.function
  - typings.web3Utils.web3UtilsStrings.constructor
  - typings.web3Utils.web3UtilsStrings.event
  - typings.web3Utils.web3UtilsStrings.fallback
*/
trait AbiType extends js.Object

object AbiType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def constructor: typings.web3Utils.web3UtilsStrings.constructor = this.cast("constructor")
  @scala.inline
  def event: typings.web3Utils.web3UtilsStrings.event = this.cast("event")
  @scala.inline
  def fallback: typings.web3Utils.web3UtilsStrings.fallback = this.cast("fallback")
  @scala.inline
  def function: typings.web3Utils.web3UtilsStrings.function = this.cast("function")
}

