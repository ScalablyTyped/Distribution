package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitQueryBranchStatsCriteria extends js.Object {
  
  var baseCommit: GitVersionDescriptor = js.native
  
  var targetCommits: js.Array[GitVersionDescriptor] = js.native
}
object GitQueryBranchStatsCriteria {
  
  @scala.inline
  def apply(baseCommit: GitVersionDescriptor, targetCommits: js.Array[GitVersionDescriptor]): GitQueryBranchStatsCriteria = {
    val __obj = js.Dynamic.literal(baseCommit = baseCommit.asInstanceOf[js.Any], targetCommits = targetCommits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitQueryBranchStatsCriteria]
  }
  
  @scala.inline
  implicit class GitQueryBranchStatsCriteriaOps[Self <: GitQueryBranchStatsCriteria] (val x: Self) extends AnyVal {
    
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
    def setBaseCommit(value: GitVersionDescriptor): Self = this.set("baseCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCommitsVarargs(value: GitVersionDescriptor*): Self = this.set("targetCommits", js.Array(value :_*))
    
    @scala.inline
    def setTargetCommits(value: js.Array[GitVersionDescriptor]): Self = this.set("targetCommits", value.asInstanceOf[js.Any])
  }
}
