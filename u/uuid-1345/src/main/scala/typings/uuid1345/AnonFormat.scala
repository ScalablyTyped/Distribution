package typings.uuid1345

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: String
  var variant: String
  var version: js.UndefOr[Double] = js.undefined
}

object AnonFormat {
  @scala.inline
  def apply(format: String, variant: String, version: Int | Double = null): AnonFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}

