package typings.waitDashForDashExpect.jest

import typings.waitDashForDashExpect.Anon_Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R] extends js.Object {
  def toBeInRange(range: Anon_Max): R
}

object Matchers {
  @scala.inline
  def apply[R](toBeInRange: Anon_Max => R): Matchers[R] = {
    val __obj = js.Dynamic.literal(toBeInRange = js.Any.fromFunction1(toBeInRange))
  
    __obj.asInstanceOf[Matchers[R]]
  }
}

