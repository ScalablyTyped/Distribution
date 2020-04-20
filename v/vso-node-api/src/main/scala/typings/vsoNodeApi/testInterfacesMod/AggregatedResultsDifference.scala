package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregatedResultsDifference extends js.Object {
  var increaseInDuration: js.Any
  var increaseInFailures: Double
  var increaseInOtherTests: Double
  var increaseInPassedTests: Double
  var increaseInTotalTests: Double
}

object AggregatedResultsDifference {
  @scala.inline
  def apply(
    increaseInDuration: js.Any,
    increaseInFailures: Double,
    increaseInOtherTests: Double,
    increaseInPassedTests: Double,
    increaseInTotalTests: Double
  ): AggregatedResultsDifference = {
    val __obj = js.Dynamic.literal(increaseInDuration = increaseInDuration.asInstanceOf[js.Any], increaseInFailures = increaseInFailures.asInstanceOf[js.Any], increaseInOtherTests = increaseInOtherTests.asInstanceOf[js.Any], increaseInPassedTests = increaseInPassedTests.asInstanceOf[js.Any], increaseInTotalTests = increaseInTotalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResultsDifference]
  }
}

