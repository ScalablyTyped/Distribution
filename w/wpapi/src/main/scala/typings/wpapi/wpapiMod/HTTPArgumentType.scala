package typings.wpapi.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wpapi.wpapiStrings.string
  - typings.wpapi.wpapiStrings.integer
  - typings.wpapi.wpapiStrings.number
  - typings.wpapi.wpapiStrings.boolean
  - typings.wpapi.wpapiStrings.`object`
  - typings.wpapi.wpapiStrings.array
*/
trait HTTPArgumentType extends js.Object

object HTTPArgumentType {
  @scala.inline
  def array: typings.wpapi.wpapiStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.wpapi.wpapiStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typings.wpapi.wpapiStrings.integer = this.cast("integer")
  @scala.inline
  def number: typings.wpapi.wpapiStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.wpapi.wpapiStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.wpapi.wpapiStrings.string = this.cast("string")
}

