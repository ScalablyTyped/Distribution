package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
    val __obj = js.Dynamic.literal(increaseInDuration = increaseInDuration, increaseInFailures = increaseInFailures, increaseInOtherTests = increaseInOtherTests, increaseInPassedTests = increaseInPassedTests, increaseInTotalTests = increaseInTotalTests)
  
    __obj.asInstanceOf[AggregatedResultsDifference]
  }
}

