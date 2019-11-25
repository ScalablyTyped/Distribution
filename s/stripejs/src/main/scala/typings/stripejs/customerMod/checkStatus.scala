package typings.stripejs.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripejs.stripejsStrings.pass
  - typings.stripejs.stripejsStrings.fail
  - typings.stripejs.stripejsStrings.unavailable
  - typings.stripejs.stripejsStrings.unchecked
*/
trait checkStatus extends js.Object

object checkStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typings.stripejs.stripejsStrings.fail = this.cast("fail")
  @scala.inline
  def pass: typings.stripejs.stripejsStrings.pass = this.cast("pass")
  @scala.inline
  def unavailable: typings.stripejs.stripejsStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unchecked: typings.stripejs.stripejsStrings.unchecked = this.cast("unchecked")
}

