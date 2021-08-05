package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environments extends StObject {
  
  var details: scala.Double
  
  var environments: scala.Double
  
  var issues: scala.Double
  
  var releaseInfo: scala.Double
  
  var testResults: scala.Double
  
  var workItems: scala.Double
}
object Environments {
  
  inline def apply(
    details: scala.Double,
    environments: scala.Double,
    issues: scala.Double,
    releaseInfo: scala.Double,
    testResults: scala.Double,
    workItems: scala.Double
  ): Environments = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], releaseInfo = releaseInfo.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environments]
  }
  
  extension [Self <: Environments](x: Self) {
    
    inline def setDetails(value: scala.Double): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setEnvironments(value: scala.Double): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setIssues(value: scala.Double): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setReleaseInfo(value: scala.Double): Self = StObject.set(x, "releaseInfo", value.asInstanceOf[js.Any])
    
    inline def setTestResults(value: scala.Double): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    inline def setWorkItems(value: scala.Double): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
  }
}
