package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Passed extends js.Object {
  var passed: Boolean
}

object Passed {
  @scala.inline
  def apply(passed: Boolean): Passed = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passed]
  }
}

