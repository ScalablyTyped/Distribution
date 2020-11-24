package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.ResourceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCommitRef extends js.Object {
  
  /**
    * A collection of related REST reference links.
    */
  var _links: js.Any = js.native
  
  /**
    * Author of the commit.
    */
  var author: GitUserDate = js.native
  
  /**
    * Counts of the types of changes (edits, deletes, etc.) included with the commit.
    */
  var changeCounts: ChangeCountDictionary = js.native
  
  /**
    * An enumeration of the changes included with the commit.
    */
  var changes: js.Array[GitChange] = js.native
  
  /**
    * Comment or message of the commit.
    */
  var comment: String = js.native
  
  /**
    * Indicates if the comment is truncated from the full Git commit comment message.
    */
  var commentTruncated: Boolean = js.native
  
  /**
    * ID (SHA-1) of the commit.
    */
  var commitId: String = js.native
  
  /**
    * Committer of the commit.
    */
  var committer: GitUserDate = js.native
  
  /**
    * An enumeration of the parent commit IDs for this commit.
    */
  var parents: js.Array[String] = js.native
  
  /**
    * Remote URL path to the commit.
    */
  var remoteUrl: String = js.native
  
  /**
    * A list of status metadata from services and extensions that may associate additional information to the commit.
    */
  var statuses: js.Array[GitStatus] = js.native
  
  /**
    * REST URL for this resource.
    */
  var url: String = js.native
  
  /**
    * A list of workitems associated with this commit.
    */
  var workItems: js.Array[ResourceRef] = js.native
}
object GitCommitRef {
  
  @scala.inline
  def apply(
    _links: js.Any,
    author: GitUserDate,
    changeCounts: ChangeCountDictionary,
    changes: js.Array[GitChange],
    comment: String,
    commentTruncated: Boolean,
    commitId: String,
    committer: GitUserDate,
    parents: js.Array[String],
    remoteUrl: String,
    statuses: js.Array[GitStatus],
    url: String,
    workItems: js.Array[ResourceRef]
  ): GitCommitRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommitRef]
  }
  
  @scala.inline
  implicit class GitCommitRefOps[Self <: GitCommitRef] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: GitUserDate): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeCounts(value: ChangeCountDictionary): Self = this.set("changeCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: GitChange*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[GitChange]): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentTruncated(value: Boolean): Self = this.set("commentTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitId(value: String): Self = this.set("commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitter(value: GitUserDate): Self = this.set("committer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: String*): Self = this.set("parents", js.Array(value :_*))
    
    @scala.inline
    def setParents(value: js.Array[String]): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUrl(value: String): Self = this.set("remoteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesVarargs(value: GitStatus*): Self = this.set("statuses", js.Array(value :_*))
    
    @scala.inline
    def setStatuses(value: js.Array[GitStatus]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemsVarargs(value: ResourceRef*): Self = this.set("workItems", js.Array(value :_*))
    
    @scala.inline
    def setWorkItems(value: js.Array[ResourceRef]): Self = this.set("workItems", value.asInstanceOf[js.Any])
  }
}
