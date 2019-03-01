package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllHosted extends js.Object {
  var all: scala.Double
  var hosted: scala.Double
  var onPremises: scala.Double
}

object Anon_AllHosted {
  @scala.inline
  def apply(all: scala.Double, hosted: scala.Double, onPremises: scala.Double): Anon_AllHosted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("hosted")(hosted)
    __obj.updateDynamic("onPremises")(onPremises)
    __obj.asInstanceOf[Anon_AllHosted]
  }
}

