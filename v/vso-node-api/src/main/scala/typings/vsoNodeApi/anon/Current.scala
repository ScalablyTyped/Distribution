package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current extends js.Object {
  var current: scala.Double
  var future: scala.Double
  var past: scala.Double
}

object Current {
  @scala.inline
  def apply(current: scala.Double, future: scala.Double, past: scala.Double): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
}

