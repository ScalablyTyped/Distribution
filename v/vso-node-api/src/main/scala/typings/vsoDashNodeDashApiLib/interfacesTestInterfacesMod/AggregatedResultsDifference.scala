package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResultsDifference extends js.Object {
  var increaseInDuration: js.Any
  var increaseInFailures: scala.Double
  var increaseInOtherTests: scala.Double
  var increaseInPassedTests: scala.Double
  var increaseInTotalTests: scala.Double
}

object AggregatedResultsDifference {
  @scala.inline
  def apply(
    increaseInDuration: js.Any,
    increaseInFailures: scala.Double,
    increaseInOtherTests: scala.Double,
    increaseInPassedTests: scala.Double,
    increaseInTotalTests: scala.Double
  ): AggregatedResultsDifference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("increaseInDuration")(increaseInDuration)
    __obj.updateDynamic("increaseInFailures")(increaseInFailures)
    __obj.updateDynamic("increaseInOtherTests")(increaseInOtherTests)
    __obj.updateDynamic("increaseInPassedTests")(increaseInPassedTests)
    __obj.updateDynamic("increaseInTotalTests")(increaseInTotalTests)
    __obj.asInstanceOf[AggregatedResultsDifference]
  }
}

