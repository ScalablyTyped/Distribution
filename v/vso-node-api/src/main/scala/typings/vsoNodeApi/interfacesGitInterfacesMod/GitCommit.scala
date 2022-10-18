package typings.vsoNodeApi.interfacesGitInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.ResourceRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitCommit
  extends StObject
     with GitCommitRef {
  
  var push: GitPushRef
  
  var treeId: String
}
object GitCommit {
  
  inline def apply(
    _links: Any,
    author: GitUserDate,
    changeCounts: ChangeCountDictionary,
    changes: js.Array[GitChange],
    comment: String,
    commentTruncated: Boolean,
    commitId: String,
    committer: GitUserDate,
    parents: js.Array[String],
    push: GitPushRef,
    remoteUrl: String,
    statuses: js.Array[GitStatus],
    treeId: String,
    url: String,
    workItems: js.Array[ResourceRef]
  ): GitCommit = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommit]
  }
  
  extension [Self <: GitCommit](x: Self) {
    
    inline def setPush(value: GitPushRef): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
  }
}
