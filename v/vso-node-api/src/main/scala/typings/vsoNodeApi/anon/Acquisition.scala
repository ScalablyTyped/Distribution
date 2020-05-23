package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acquisition extends js.Object {
  var acquisition: scala.Double
  var install: scala.Double
  var other: scala.Double
  var review: scala.Double
  var sales: scala.Double
  var uninstall: scala.Double
}

object Acquisition {
  @scala.inline
  def apply(
    acquisition: scala.Double,
    install: scala.Double,
    other: scala.Double,
    review: scala.Double,
    sales: scala.Double,
    uninstall: scala.Double
  ): Acquisition = {
    val __obj = js.Dynamic.literal(acquisition = acquisition.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], sales = sales.asInstanceOf[js.Any], uninstall = uninstall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acquisition]
  }
}

