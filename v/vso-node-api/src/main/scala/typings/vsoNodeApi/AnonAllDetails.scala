package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllDetails extends js.Object {
  var all: Double
  var details: Double
  var dropLocation: Double
  var label: Double
  var none: Double
  var symbols: Double
  var testResults: Double
}

object AnonAllDetails {
  @scala.inline
  def apply(
    all: Double,
    details: Double,
    dropLocation: Double,
    label: Double,
    none: Double,
    symbols: Double,
    testResults: Double
  ): AnonAllDetails = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllDetails]
  }
}

