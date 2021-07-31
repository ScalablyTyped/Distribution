package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedResultsByOutcome extends StObject {
  
  var count: Double
  
  var duration: js.Any
  
  var groupByField: String
  
  var groupByValue: js.Any
  
  var outcome: TestOutcome
  
  var rerunResultCount: Double
}
object AggregatedResultsByOutcome {
  
  @scala.inline
  def apply(
    count: Double,
    duration: js.Any,
    groupByField: String,
    groupByValue: js.Any,
    outcome: TestOutcome,
    rerunResultCount: Double
  ): AggregatedResultsByOutcome = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], groupByField = groupByField.asInstanceOf[js.Any], groupByValue = groupByValue.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], rerunResultCount = rerunResultCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResultsByOutcome]
  }
  
  @scala.inline
  implicit class AggregatedResultsByOutcomeMutableBuilder[Self <: AggregatedResultsByOutcome] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByField(value: String): Self = StObject.set(x, "groupByField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByValue(value: js.Any): Self = StObject.set(x, "groupByValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: TestOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRerunResultCount(value: Double): Self = StObject.set(x, "rerunResultCount", value.asInstanceOf[js.Any])
  }
}
