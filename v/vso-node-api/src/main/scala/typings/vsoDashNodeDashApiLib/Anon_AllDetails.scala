package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllDetails extends js.Object {
  var all: scala.Double
  var details: scala.Double
  var dropLocation: scala.Double
  var label: scala.Double
  var none: scala.Double
  var symbols: scala.Double
  var testResults: scala.Double
}

object Anon_AllDetails {
  @scala.inline
  def apply(
    all: scala.Double,
    details: scala.Double,
    dropLocation: scala.Double,
    label: scala.Double,
    none: scala.Double,
    symbols: scala.Double,
    testResults: scala.Double
  ): Anon_AllDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("dropLocation")(dropLocation)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("symbols")(symbols)
    __obj.updateDynamic("testResults")(testResults)
    __obj.asInstanceOf[Anon_AllDetails]
  }
}

