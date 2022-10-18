package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitAsyncRefOperationSource extends StObject {
  
  /**
    * A list of commits to cherry pick or revert
    */
  var commitList: js.Array[GitCommitRef]
  
  /**
    * Id of the pull request to cherry pick or revert
    */
  var pullRequestId: Double
}
object GitAsyncRefOperationSource {
  
  inline def apply(commitList: js.Array[GitCommitRef], pullRequestId: Double): GitAsyncRefOperationSource = {
    val __obj = js.Dynamic.literal(commitList = commitList.asInstanceOf[js.Any], pullRequestId = pullRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperationSource]
  }
  
  extension [Self <: GitAsyncRefOperationSource](x: Self) {
    
    inline def setCommitList(value: js.Array[GitCommitRef]): Self = StObject.set(x, "commitList", value.asInstanceOf[js.Any])
    
    inline def setCommitListVarargs(value: GitCommitRef*): Self = StObject.set(x, "commitList", js.Array(value*))
    
    inline def setPullRequestId(value: Double): Self = StObject.set(x, "pullRequestId", value.asInstanceOf[js.Any])
  }
}
