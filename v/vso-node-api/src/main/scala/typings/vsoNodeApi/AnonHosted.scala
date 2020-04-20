package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHosted extends js.Object {
  var all: Double
  var hosted: Double
  var onPremises: Double
}

object AnonHosted {
  @scala.inline
  def apply(all: Double, hosted: Double, onPremises: Double): AnonHosted = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], hosted = hosted.asInstanceOf[js.Any], onPremises = onPremises.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHosted]
  }
}

