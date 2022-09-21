package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullRequestTrigger
  extends StObject
     with BuildTrigger {
  
  var branchFilters: js.Array[String]
  
  var forks: Forks
}
object PullRequestTrigger {
  
  inline def apply(branchFilters: js.Array[String], forks: Forks, triggerType: DefinitionTriggerType): PullRequestTrigger = {
    val __obj = js.Dynamic.literal(branchFilters = branchFilters.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestTrigger]
  }
  
  extension [Self <: PullRequestTrigger](x: Self) {
    
    inline def setBranchFilters(value: js.Array[String]): Self = StObject.set(x, "branchFilters", value.asInstanceOf[js.Any])
    
    inline def setBranchFiltersVarargs(value: String*): Self = StObject.set(x, "branchFilters", js.Array(value*))
    
    inline def setForks(value: Forks): Self = StObject.set(x, "forks", value.asInstanceOf[js.Any])
  }
}
