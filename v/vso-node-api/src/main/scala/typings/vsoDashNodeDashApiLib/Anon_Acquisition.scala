package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acquisition extends js.Object {
  var acquisition: scala.Double
  var install: scala.Double
  var other: scala.Double
  var review: scala.Double
  var sales: scala.Double
  var uninstall: scala.Double
}

object Anon_Acquisition {
  @scala.inline
  def apply(
    acquisition: scala.Double,
    install: scala.Double,
    other: scala.Double,
    review: scala.Double,
    sales: scala.Double,
    uninstall: scala.Double
  ): Anon_Acquisition = {
    val __obj = js.Dynamic.literal(acquisition = acquisition, install = install, other = other, review = review, sales = sales, uninstall = uninstall)
  
    __obj.asInstanceOf[Anon_Acquisition]
  }
}

