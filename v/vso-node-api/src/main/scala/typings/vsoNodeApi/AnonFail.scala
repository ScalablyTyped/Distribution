package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFail extends js.Object {
  var fail: Double
  var omit: Double
}

object AnonFail {
  @scala.inline
  def apply(fail: Double, omit: Double): AnonFail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], omit = omit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFail]
  }
}

