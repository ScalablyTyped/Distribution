package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRunStatistic extends StObject {
  
  var run: ShallowReference = js.native
  
  var runStatistics: js.Array[RunStatistic] = js.native
}
object TestRunStatistic {
  
  @scala.inline
  def apply(run: ShallowReference, runStatistics: js.Array[RunStatistic]): TestRunStatistic = {
    val __obj = js.Dynamic.literal(run = run.asInstanceOf[js.Any], runStatistics = runStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunStatistic]
  }
  
  @scala.inline
  implicit class TestRunStatisticMutableBuilder[Self <: TestRunStatistic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRun(value: ShallowReference): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunStatistics(value: js.Array[RunStatistic]): Self = StObject.set(x, "runStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunStatisticsVarargs(value: RunStatistic*): Self = StObject.set(x, "runStatistics", js.Array(value :_*))
  }
}
