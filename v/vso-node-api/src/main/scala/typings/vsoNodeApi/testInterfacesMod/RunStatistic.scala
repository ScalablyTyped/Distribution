package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunStatistic extends StObject {
  
  var count: Double = js.native
  
  var outcome: String = js.native
  
  var resolutionState: TestResolutionState = js.native
  
  var state: String = js.native
}
object RunStatistic {
  
  @scala.inline
  def apply(count: Double, outcome: String, resolutionState: TestResolutionState, state: String): RunStatistic = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], outcome = outcome.asInstanceOf[js.Any], resolutionState = resolutionState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunStatistic]
  }
  
  @scala.inline
  implicit class RunStatisticMutableBuilder[Self <: RunStatistic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionState(value: TestResolutionState): Self = StObject.set(x, "resolutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
