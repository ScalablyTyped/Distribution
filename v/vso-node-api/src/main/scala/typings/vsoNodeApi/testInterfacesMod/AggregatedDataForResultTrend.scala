package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedDataForResultTrend extends StObject {
  
  /**
    * This is tests execution duration.
    */
  var duration: js.Any = js.native
  
  var resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome] = js.native
  
  var testResultsContext: TestResultsContext = js.native
  
  var totalTests: Double = js.native
}
object AggregatedDataForResultTrend {
  
  @scala.inline
  def apply(
    duration: js.Any,
    resultsByOutcome: NumberDictionary[AggregatedResultsByOutcome],
    testResultsContext: TestResultsContext,
    totalTests: Double
  ): AggregatedDataForResultTrend = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], resultsByOutcome = resultsByOutcome.asInstanceOf[js.Any], testResultsContext = testResultsContext.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedDataForResultTrend]
  }
  
  @scala.inline
  implicit class AggregatedDataForResultTrendMutableBuilder[Self <: AggregatedDataForResultTrend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsByOutcome(value: NumberDictionary[AggregatedResultsByOutcome]): Self = StObject.set(x, "resultsByOutcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultsContext(value: TestResultsContext): Self = StObject.set(x, "testResultsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTests(value: Double): Self = StObject.set(x, "totalTests", value.asInstanceOf[js.Any])
  }
}
