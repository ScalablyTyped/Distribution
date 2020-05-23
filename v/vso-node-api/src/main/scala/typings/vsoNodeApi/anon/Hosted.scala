package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hosted extends js.Object {
  var all: scala.Double
  var hosted: scala.Double
  var onPremises: scala.Double
}

object Hosted {
  @scala.inline
  def apply(all: scala.Double, hosted: scala.Double, onPremises: scala.Double): Hosted = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], hosted = hosted.asInstanceOf[js.Any], onPremises = onPremises.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hosted]
  }
}

