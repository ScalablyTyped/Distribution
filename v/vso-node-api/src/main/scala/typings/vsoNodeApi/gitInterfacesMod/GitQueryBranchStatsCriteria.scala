package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitQueryBranchStatsCriteria extends StObject {
  
  var baseCommit: GitVersionDescriptor
  
  var targetCommits: js.Array[GitVersionDescriptor]
}
object GitQueryBranchStatsCriteria {
  
  inline def apply(baseCommit: GitVersionDescriptor, targetCommits: js.Array[GitVersionDescriptor]): GitQueryBranchStatsCriteria = {
    val __obj = js.Dynamic.literal(baseCommit = baseCommit.asInstanceOf[js.Any], targetCommits = targetCommits.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitQueryBranchStatsCriteria]
  }
  
  extension [Self <: GitQueryBranchStatsCriteria](x: Self) {
    
    inline def setBaseCommit(value: GitVersionDescriptor): Self = StObject.set(x, "baseCommit", value.asInstanceOf[js.Any])
    
    inline def setTargetCommits(value: js.Array[GitVersionDescriptor]): Self = StObject.set(x, "targetCommits", value.asInstanceOf[js.Any])
    
    inline def setTargetCommitsVarargs(value: GitVersionDescriptor*): Self = StObject.set(x, "targetCommits", js.Array(value*))
  }
}
