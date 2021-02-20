package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestResultTrendFilter extends StObject {
  
  var branchNames: js.Array[String] = js.native
  
  var buildCount: Double = js.native
  
  var definitionIds: js.Array[Double] = js.native
  
  var envDefinitionIds: js.Array[Double] = js.native
  
  var maxCompleteDate: Date = js.native
  
  var publishContext: String = js.native
  
  var testRunTitles: js.Array[String] = js.native
  
  var trendDays: Double = js.native
}
object TestResultTrendFilter {
  
  @scala.inline
  def apply(
    branchNames: js.Array[String],
    buildCount: Double,
    definitionIds: js.Array[Double],
    envDefinitionIds: js.Array[Double],
    maxCompleteDate: Date,
    publishContext: String,
    testRunTitles: js.Array[String],
    trendDays: Double
  ): TestResultTrendFilter = {
    val __obj = js.Dynamic.literal(branchNames = branchNames.asInstanceOf[js.Any], buildCount = buildCount.asInstanceOf[js.Any], definitionIds = definitionIds.asInstanceOf[js.Any], envDefinitionIds = envDefinitionIds.asInstanceOf[js.Any], maxCompleteDate = maxCompleteDate.asInstanceOf[js.Any], publishContext = publishContext.asInstanceOf[js.Any], testRunTitles = testRunTitles.asInstanceOf[js.Any], trendDays = trendDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultTrendFilter]
  }
  
  @scala.inline
  implicit class TestResultTrendFilterMutableBuilder[Self <: TestResultTrendFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchNames(value: js.Array[String]): Self = StObject.set(x, "branchNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchNamesVarargs(value: String*): Self = StObject.set(x, "branchNames", js.Array(value :_*))
    
    @scala.inline
    def setBuildCount(value: Double): Self = StObject.set(x, "buildCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionIds(value: js.Array[Double]): Self = StObject.set(x, "definitionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionIdsVarargs(value: Double*): Self = StObject.set(x, "definitionIds", js.Array(value :_*))
    
    @scala.inline
    def setEnvDefinitionIds(value: js.Array[Double]): Self = StObject.set(x, "envDefinitionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvDefinitionIdsVarargs(value: Double*): Self = StObject.set(x, "envDefinitionIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxCompleteDate(value: Date): Self = StObject.set(x, "maxCompleteDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishContext(value: String): Self = StObject.set(x, "publishContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRunTitles(value: js.Array[String]): Self = StObject.set(x, "testRunTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestRunTitlesVarargs(value: String*): Self = StObject.set(x, "testRunTitles", js.Array(value :_*))
    
    @scala.inline
    def setTrendDays(value: Double): Self = StObject.set(x, "trendDays", value.asInstanceOf[js.Any])
  }
}
