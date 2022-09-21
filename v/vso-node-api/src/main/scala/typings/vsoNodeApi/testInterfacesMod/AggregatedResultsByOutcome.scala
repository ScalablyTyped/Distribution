package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedResultsByOutcome extends StObject {
  
  var count: Double
  
  var duration: Any
  
  var groupByField: String
  
  var groupByValue: Any
  
  var outcome: TestOutcome
  
  var rerunResultCount: Double
}
object AggregatedResultsByOutcome {
  
  inline def apply(
    count: Double,
    duration: Any,
    groupByField: String,
    groupByValue: Any,
    outcome: TestOutcome,
    rerunResultCount: Double
  ): AggregatedResultsByOutcome = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], groupByField = groupByField.asInstanceOf[js.Any], groupByValue = groupByValue.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], rerunResultCount = rerunResultCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResultsByOutcome]
  }
  
  extension [Self <: AggregatedResultsByOutcome](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setGroupByField(value: String): Self = StObject.set(x, "groupByField", value.asInstanceOf[js.Any])
    
    inline def setGroupByValue(value: Any): Self = StObject.set(x, "groupByValue", value.asInstanceOf[js.Any])
    
    inline def setOutcome(value: TestOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setRerunResultCount(value: Double): Self = StObject.set(x, "rerunResultCount", value.asInstanceOf[js.Any])
  }
}
