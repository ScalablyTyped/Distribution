package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequestTrigger extends BuildTrigger {
  
  var branchFilters: js.Array[String] = js.native
  
  var forks: Forks = js.native
}
object PullRequestTrigger {
  
  @scala.inline
  def apply(branchFilters: js.Array[String], forks: Forks, triggerType: DefinitionTriggerType): PullRequestTrigger = {
    val __obj = js.Dynamic.literal(branchFilters = branchFilters.asInstanceOf[js.Any], forks = forks.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestTrigger]
  }
  
  @scala.inline
  implicit class PullRequestTriggerOps[Self <: PullRequestTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBranchFiltersVarargs(value: String*): Self = this.set("branchFilters", js.Array(value :_*))
    
    @scala.inline
    def setBranchFilters(value: js.Array[String]): Self = this.set("branchFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForks(value: Forks): Self = this.set("forks", value.asInstanceOf[js.Any])
  }
}
