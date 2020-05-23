package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Details extends js.Object {
  var all: scala.Double
  var details: scala.Double
  var dropLocation: scala.Double
  var label: scala.Double
  var none: scala.Double
  var symbols: scala.Double
  var testResults: scala.Double
}

object Details {
  @scala.inline
  def apply(
    all: scala.Double,
    details: scala.Double,
    dropLocation: scala.Double,
    label: scala.Double,
    none: scala.Double,
    symbols: scala.Double,
    testResults: scala.Double
  ): Details = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
}

