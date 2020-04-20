package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailingSince extends js.Object {
  var failingSince: Double
  var regular: Double
}

object AnonFailingSince {
  @scala.inline
  def apply(failingSince: Double, regular: Double): AnonFailingSince = {
    val __obj = js.Dynamic.literal(failingSince = failingSince.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailingSince]
  }
}

