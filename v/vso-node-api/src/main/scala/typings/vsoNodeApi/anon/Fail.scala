package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fail extends js.Object {
  var fail: scala.Double
  var omit: scala.Double
}

object Fail {
  @scala.inline
  def apply(fail: scala.Double, omit: scala.Double): Fail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], omit = omit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
}

