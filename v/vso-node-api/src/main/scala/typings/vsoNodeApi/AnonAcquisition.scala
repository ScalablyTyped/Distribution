package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcquisition extends js.Object {
  var acquisition: Double
  var install: Double
  var other: Double
  var review: Double
  var sales: Double
  var uninstall: Double
}

object AnonAcquisition {
  @scala.inline
  def apply(
    acquisition: Double,
    install: Double,
    other: Double,
    review: Double,
    sales: Double,
    uninstall: Double
  ): AnonAcquisition = {
    val __obj = js.Dynamic.literal(acquisition = acquisition.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], sales = sales.asInstanceOf[js.Any], uninstall = uninstall.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAcquisition]
  }
}

