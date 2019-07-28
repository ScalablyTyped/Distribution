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
    val __obj = js.Dynamic.literal(acquisition = acquisition, install = install, other = other, review = review, sales = sales, uninstall = uninstall)
  
    __obj.asInstanceOf[Anon_Acquisition]
  }
}

