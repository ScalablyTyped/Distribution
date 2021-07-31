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
  
  @scala.inline
  def apply(branchFilters: js.Array[String], forks: Forks, triggerType: DefinitionTriggerType): PullRequestTrigger = {
    val __obj = js.Dynamic.literal(branchFilters = branchFilters.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestTrigger]
  }
  
  @scala.inline
  implicit class PullRequestTriggerMutableBuilder[Self <: PullRequestTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchFilters(value: js.Array[String]): Self = StObject.set(x, "branchFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchFiltersVarargs(value: String*): Self = StObject.set(x, "branchFilters", js.Array(value :_*))
    
    @scala.inline
    def setForks(value: Forks): Self = StObject.set(x, "forks", value.asInstanceOf[js.Any])
  }
}
