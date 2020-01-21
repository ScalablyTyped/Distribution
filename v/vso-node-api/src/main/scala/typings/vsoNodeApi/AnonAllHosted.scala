package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllHosted extends js.Object {
  var all: Double
  var hosted: Double
  var onPremises: Double
}

object AnonAllHosted {
  @scala.inline
  def apply(all: Double, hosted: Double, onPremises: Double): AnonAllHosted = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], hosted = hosted.asInstanceOf[js.Any], onPremises = onPremises.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllHosted]
  }
}

