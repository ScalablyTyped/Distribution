package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedResultsDifference extends js.Object {
  
  var increaseInDuration: js.Any = js.native
  
  var increaseInFailures: Double = js.native
  
  var increaseInOtherTests: Double = js.native
  
  var increaseInPassedTests: Double = js.native
  
  var increaseInTotalTests: Double = js.native
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
  
  @scala.inline
  implicit class AggregatedResultsDifferenceOps[Self <: AggregatedResultsDifference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIncreaseInDuration(value: js.Any): Self = this.set("increaseInDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseInFailures(value: Double): Self = this.set("increaseInFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseInOtherTests(value: Double): Self = this.set("increaseInOtherTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseInPassedTests(value: Double): Self = this.set("increaseInPassedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseInTotalTests(value: Double): Self = this.set("increaseInTotalTests", value.asInstanceOf[js.Any])
  }
}
