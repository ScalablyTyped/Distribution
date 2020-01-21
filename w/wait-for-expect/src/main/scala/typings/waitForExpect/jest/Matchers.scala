package typings.waitForExpect.jest

import typings.waitForExpect.AnonMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R] extends js.Object {
  def toBeInRange(range: AnonMax): R
}

object Matchers {
  @scala.inline
  def apply[R](toBeInRange: AnonMax => R): Matchers[R] = {
    val __obj = js.Dynamic.literal(toBeInRange = js.Any.fromFunction1(toBeInRange))
  
    __obj.asInstanceOf[Matchers[R]]
  }
}

