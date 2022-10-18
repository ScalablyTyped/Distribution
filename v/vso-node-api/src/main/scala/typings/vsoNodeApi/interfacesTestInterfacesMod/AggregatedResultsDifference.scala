package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedResultsDifference extends StObject {
  
  var increaseInDuration: Any
  
  var increaseInFailures: Double
  
  var increaseInOtherTests: Double
  
  var increaseInPassedTests: Double
  
  var increaseInTotalTests: Double
}
object AggregatedResultsDifference {
  
  inline def apply(
    increaseInDuration: Any,
    increaseInFailures: Double,
    increaseInOtherTests: Double,
    increaseInPassedTests: Double,
    increaseInTotalTests: Double
  ): AggregatedResultsDifference = {
    val __obj = js.Dynamic.literal(increaseInDuration = increaseInDuration.asInstanceOf[js.Any], increaseInFailures = increaseInFailures.asInstanceOf[js.Any], increaseInOtherTests = increaseInOtherTests.asInstanceOf[js.Any], increaseInPassedTests = increaseInPassedTests.asInstanceOf[js.Any], increaseInTotalTests = increaseInTotalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResultsDifference]
  }
  
  extension [Self <: AggregatedResultsDifference](x: Self) {
    
    inline def setIncreaseInDuration(value: Any): Self = StObject.set(x, "increaseInDuration", value.asInstanceOf[js.Any])
    
    inline def setIncreaseInFailures(value: Double): Self = StObject.set(x, "increaseInFailures", value.asInstanceOf[js.Any])
    
    inline def setIncreaseInOtherTests(value: Double): Self = StObject.set(x, "increaseInOtherTests", value.asInstanceOf[js.Any])
    
    inline def setIncreaseInPassedTests(value: Double): Self = StObject.set(x, "increaseInPassedTests", value.asInstanceOf[js.Any])
    
    inline def setIncreaseInTotalTests(value: Double): Self = StObject.set(x, "increaseInTotalTests", value.asInstanceOf[js.Any])
  }
}
