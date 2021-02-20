package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environments extends StObject {
  
  var details: scala.Double = js.native
  
  var environments: scala.Double = js.native
  
  var issues: scala.Double = js.native
  
  var releaseInfo: scala.Double = js.native
  
  var testResults: scala.Double = js.native
  
  var workItems: scala.Double = js.native
}
object Environments {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class EnvironmentsMutableBuilder[Self <: Environments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: scala.Double): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironments(value: scala.Double): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues(value: scala.Double): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseInfo(value: scala.Double): Self = StObject.set(x, "releaseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResults(value: scala.Double): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItems(value: scala.Double): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
  }
}
