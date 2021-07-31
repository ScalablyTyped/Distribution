package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitQueryBranchStatsCriteria extends StObject {
  
  var baseCommit: GitVersionDescriptor
  
  var targetCommits: js.Array[GitVersionDescriptor]
}
object GitQueryBranchStatsCriteria {
  
  @scala.inline
  def apply(baseCommit: GitVersionDescriptor, targetCommits: js.Array[GitVersionDescriptor]): GitQueryBranchStatsCriteria = {
    val __obj = js.Dynamic.literal(baseCommit = baseCommit.asInstanceOf[js.Any], targetCommits = targetCommits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitQueryBranchStatsCriteria]
  }
  
  @scala.inline
  implicit class GitQueryBranchStatsCriteriaMutableBuilder[Self <: GitQueryBranchStatsCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseCommit(value: GitVersionDescriptor): Self = StObject.set(x, "baseCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCommits(value: js.Array[GitVersionDescriptor]): Self = StObject.set(x, "targetCommits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCommitsVarargs(value: GitVersionDescriptor*): Self = StObject.set(x, "targetCommits", js.Array(value :_*))
  }
}
