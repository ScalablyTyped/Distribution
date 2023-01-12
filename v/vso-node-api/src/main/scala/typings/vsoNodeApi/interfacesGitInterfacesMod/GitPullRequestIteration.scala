package typings.vsoNodeApi.interfacesGitInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPullRequestIteration extends StObject {
  
  /**
    * A collection of related REST reference links.
    */
  var _links: Any
  
  /**
    * Author of the pull request iteration.
    */
  var author: IdentityRef
  
  /**
    * Changes included with the pull request iteration.
    */
  var changeList: js.Array[GitPullRequestChange]
  
  /**
    * The commits included with the pull request iteration.
    */
  var commits: js.Array[GitCommitRef]
  
  /**
    * The first common Git commit of the source and target refs.
    */
  var commonRefCommit: GitCommitRef
  
  /**
    * The creation date of the pull request iteration.
    */
  var createdDate: js.Date
  
  /**
    * Description of the pull request iteration.
    */
  var description: String
  
  /**
    * Indicates if the Commits property contains a truncated list of commits in this pull request iteration.
    */
  var hasMoreCommits: Boolean
  
  /**
    * ID of the pull request iteration. Iterations are created as a result of creating and pushing updates to a pull request.
    */
  var id: Double
  
  /**
    * The Git push information associated with this pull request iteration.
    */
  var push: GitPushRef
  
  /**
    * The reason for which the pull request iteration was created.
    */
  var reason: IterationReason
  
  /**
    * The source Git commit of this iteration.
    */
  var sourceRefCommit: GitCommitRef
  
  /**
    * The target Git commit of this iteration.
    */
  var targetRefCommit: GitCommitRef
  
  /**
    * The updated date of the pull request iteration.
    */
  var updatedDate: js.Date
}
object GitPullRequestIteration {
  
  inline def apply(
    _links: Any,
    author: IdentityRef,
    changeList: js.Array[GitPullRequestChange],
    commits: js.Array[GitCommitRef],
    commonRefCommit: GitCommitRef,
    createdDate: js.Date,
    description: String,
    hasMoreCommits: Boolean,
    id: Double,
    push: GitPushRef,
    reason: IterationReason,
    sourceRefCommit: GitCommitRef,
    targetRefCommit: GitCommitRef,
    updatedDate: js.Date
  ): GitPullRequestIteration = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changeList = changeList.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], commonRefCommit = commonRefCommit.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasMoreCommits = hasMoreCommits.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceRefCommit = sourceRefCommit.asInstanceOf[js.Any], targetRefCommit = targetRefCommit.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestIteration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitPullRequestIteration] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: IdentityRef): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setChangeList(value: js.Array[GitPullRequestChange]): Self = StObject.set(x, "changeList", value.asInstanceOf[js.Any])
    
    inline def setChangeListVarargs(value: GitPullRequestChange*): Self = StObject.set(x, "changeList", js.Array(value*))
    
    inline def setCommits(value: js.Array[GitCommitRef]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    inline def setCommitsVarargs(value: GitCommitRef*): Self = StObject.set(x, "commits", js.Array(value*))
    
    inline def setCommonRefCommit(value: GitCommitRef): Self = StObject.set(x, "commonRefCommit", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHasMoreCommits(value: Boolean): Self = StObject.set(x, "hasMoreCommits", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPush(value: GitPushRef): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setReason(value: IterationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSourceRefCommit(value: GitCommitRef): Self = StObject.set(x, "sourceRefCommit", value.asInstanceOf[js.Any])
    
    inline def setTargetRefCommit(value: GitCommitRef): Self = StObject.set(x, "targetRefCommit", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDate(value: js.Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
