package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFeature extends js.Object {
  var feature: String
}

object AnonFeature {
  @scala.inline
  def apply(feature: String): AnonFeature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeature]
  }
}

