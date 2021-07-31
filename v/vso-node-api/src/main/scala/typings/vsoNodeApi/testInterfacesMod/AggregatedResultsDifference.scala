package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedResultsDifference extends StObject {
  
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
  
  @scala.inline
  implicit class AggregatedResultsDifferenceMutableBuilder[Self <: AggregatedResultsDifference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncreaseInDuration(value: js.Any): Self = StObject.set(x, "increaseInDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseInFailures(value: Double): Self = StObject.set(x, "increaseInFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseInOtherTests(value: Double): Self = StObject.set(x, "increaseInOtherTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseInPassedTests(value: Double): Self = StObject.set(x, "increaseInPassedTests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseInTotalTests(value: Double): Self = StObject.set(x, "increaseInTotalTests", value.asInstanceOf[js.Any])
  }
}
