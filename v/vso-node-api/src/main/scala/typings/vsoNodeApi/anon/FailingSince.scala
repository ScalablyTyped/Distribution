package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailingSince extends js.Object {
  var failingSince: scala.Double
  var regular: scala.Double
}

object FailingSince {
  @scala.inline
  def apply(failingSince: scala.Double, regular: scala.Double): FailingSince = {
    val __obj = js.Dynamic.literal(failingSince = failingSince.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailingSince]
  }
}

