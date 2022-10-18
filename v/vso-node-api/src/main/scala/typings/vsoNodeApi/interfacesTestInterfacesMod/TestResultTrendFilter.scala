package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResultTrendFilter extends StObject {
  
  var branchNames: js.Array[String]
  
  var buildCount: Double
  
  var definitionIds: js.Array[Double]
  
  var envDefinitionIds: js.Array[Double]
  
  var maxCompleteDate: js.Date
  
  var publishContext: String
  
  var testRunTitles: js.Array[String]
  
  var trendDays: Double
}
object TestResultTrendFilter {
  
  inline def apply(
    branchNames: js.Array[String],
    buildCount: Double,
    definitionIds: js.Array[Double],
    envDefinitionIds: js.Array[Double],
    maxCompleteDate: js.Date,
    publishContext: String,
    testRunTitles: js.Array[String],
    trendDays: Double
  ): TestResultTrendFilter = {
    val __obj = js.Dynamic.literal(branchNames = branchNames.asInstanceOf[js.Any], buildCount = buildCount.asInstanceOf[js.Any], definitionIds = definitionIds.asInstanceOf[js.Any], envDefinitionIds = envDefinitionIds.asInstanceOf[js.Any], maxCompleteDate = maxCompleteDate.asInstanceOf[js.Any], publishContext = publishContext.asInstanceOf[js.Any], testRunTitles = testRunTitles.asInstanceOf[js.Any], trendDays = trendDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultTrendFilter]
  }
  
  extension [Self <: TestResultTrendFilter](x: Self) {
    
    inline def setBranchNames(value: js.Array[String]): Self = StObject.set(x, "branchNames", value.asInstanceOf[js.Any])
    
    inline def setBranchNamesVarargs(value: String*): Self = StObject.set(x, "branchNames", js.Array(value*))
    
    inline def setBuildCount(value: Double): Self = StObject.set(x, "buildCount", value.asInstanceOf[js.Any])
    
    inline def setDefinitionIds(value: js.Array[Double]): Self = StObject.set(x, "definitionIds", value.asInstanceOf[js.Any])
    
    inline def setDefinitionIdsVarargs(value: Double*): Self = StObject.set(x, "definitionIds", js.Array(value*))
    
    inline def setEnvDefinitionIds(value: js.Array[Double]): Self = StObject.set(x, "envDefinitionIds", value.asInstanceOf[js.Any])
    
    inline def setEnvDefinitionIdsVarargs(value: Double*): Self = StObject.set(x, "envDefinitionIds", js.Array(value*))
    
    inline def setMaxCompleteDate(value: js.Date): Self = StObject.set(x, "maxCompleteDate", value.asInstanceOf[js.Any])
    
    inline def setPublishContext(value: String): Self = StObject.set(x, "publishContext", value.asInstanceOf[js.Any])
    
    inline def setTestRunTitles(value: js.Array[String]): Self = StObject.set(x, "testRunTitles", value.asInstanceOf[js.Any])
    
    inline def setTestRunTitlesVarargs(value: String*): Self = StObject.set(x, "testRunTitles", js.Array(value*))
    
    inline def setTrendDays(value: Double): Self = StObject.set(x, "trendDays", value.asInstanceOf[js.Any])
  }
}
