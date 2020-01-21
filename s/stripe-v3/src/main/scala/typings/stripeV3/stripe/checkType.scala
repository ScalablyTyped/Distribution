package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV3.stripeV3Strings.pass
  - typings.stripeV3.stripeV3Strings.fail
  - typings.stripeV3.stripeV3Strings.unavailable
  - typings.stripeV3.stripeV3Strings.unchecked
*/
trait checkType extends js.Object

object checkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typings.stripeV3.stripeV3Strings.fail = this.cast("fail")
  @scala.inline
  def pass: typings.stripeV3.stripeV3Strings.pass = this.cast("pass")
  @scala.inline
  def unavailable: typings.stripeV3.stripeV3Strings.unavailable = this.cast("unavailable")
  @scala.inline
  def unchecked: typings.stripeV3.stripeV3Strings.unchecked = this.cast("unchecked")
}

