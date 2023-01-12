package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedDataForResultTrend extends StObject {
  
  /**
    * This is tests execution duration.
    */
  var duration: Any
  
  var resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome]
  
  var testResultsContext: TestResultsContext
  
  var totalTests: Double
}
object AggregatedDataForResultTrend {
  
  inline def apply(
    duration: Any,
    resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome],
    testResultsContext: TestResultsContext,
    totalTests: Double
  ): AggregatedDataForResultTrend = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], resultsByOutcome = resultsByOutcome.asInstanceOf[js.Any], testResultsContext = testResultsContext.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedDataForResultTrend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedDataForResultTrend] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = StObject.set(x, "resultsByOutcome", value.asInstanceOf[js.Any])
    
    inline def setTestResultsContext(value: TestResultsContext): Self = StObject.set(x, "testResultsContext", value.asInstanceOf[js.Any])
    
    inline def setTotalTests(value: Double): Self = StObject.set(x, "totalTests", value.asInstanceOf[js.Any])
  }
}
