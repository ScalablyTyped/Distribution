package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloneStatistics extends StObject {
  
  /**
    * Number of Requirments cloned so far.
    */
  var clonedRequirementsCount: Double = js.native
  
  /**
    * Number of shared steps cloned so far.
    */
  var clonedSharedStepsCount: Double = js.native
  
  /**
    * Number of test cases cloned so far
    */
  var clonedTestCasesCount: Double = js.native
  
  /**
    * Total number of requirements to be cloned
    */
  var totalRequirementsCount: Double = js.native
  
  /**
    * Total number of test cases to be cloned
    */
  var totalTestCasesCount: Double = js.native
}
object CloneStatistics {
  
  @scala.inline
  def apply(
    clonedRequirementsCount: Double,
    clonedSharedStepsCount: Double,
    clonedTestCasesCount: Double,
    totalRequirementsCount: Double,
    totalTestCasesCount: Double
  ): CloneStatistics = {
    val __obj = js.Dynamic.literal(clonedRequirementsCount = clonedRequirementsCount.asInstanceOf[js.Any], clonedSharedStepsCount = clonedSharedStepsCount.asInstanceOf[js.Any], clonedTestCasesCount = clonedTestCasesCount.asInstanceOf[js.Any], totalRequirementsCount = totalRequirementsCount.asInstanceOf[js.Any], totalTestCasesCount = totalTestCasesCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneStatistics]
  }
  
  @scala.inline
  implicit class CloneStatisticsMutableBuilder[Self <: CloneStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClonedRequirementsCount(value: Double): Self = StObject.set(x, "clonedRequirementsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClonedSharedStepsCount(value: Double): Self = StObject.set(x, "clonedSharedStepsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClonedTestCasesCount(value: Double): Self = StObject.set(x, "clonedTestCasesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRequirementsCount(value: Double): Self = StObject.set(x, "totalRequirementsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTestCasesCount(value: Double): Self = StObject.set(x, "totalTestCasesCount", value.asInstanceOf[js.Any])
  }
}
