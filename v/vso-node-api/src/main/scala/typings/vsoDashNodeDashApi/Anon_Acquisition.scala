package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acquisition extends js.Object {
  var acquisition: Double
  var install: Double
  var other: Double
  var review: Double
  var sales: Double
  var uninstall: Double
}

object Anon_Acquisition {
  @scala.inline
  def apply(
    acquisition: Double,
    install: Double,
    other: Double,
    review: Double,
    sales: Double,
    uninstall: Double
  ): Anon_Acquisition = {
    val __obj = js.Dynamic.literal(acquisition = acquisition.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any], sales = sales.asInstanceOf[js.Any], uninstall = uninstall.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Acquisition]
  }
}

