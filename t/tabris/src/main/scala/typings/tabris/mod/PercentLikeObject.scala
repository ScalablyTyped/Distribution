package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PercentLikeObject extends js.Object {
  var percent: Double
}

object PercentLikeObject {
  @scala.inline
  def apply(percent: Double): PercentLikeObject = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentLikeObject]
  }
}

