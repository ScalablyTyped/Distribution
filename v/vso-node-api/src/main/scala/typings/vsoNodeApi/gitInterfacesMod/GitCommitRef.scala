package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.ResourceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitRef extends js.Object {
  /**
    * A collection of related REST reference links.
    */
  var _links: js.Any
  /**
    * Author of the commit.
    */
  var author: GitUserDate
  /**
    * Counts of the types of changes (edits, deletes, etc.) included with the commit.
    */
  var changeCounts: ChangeCountDictionary
  /**
    * An enumeration of the changes included with the commit.
    */
  var changes: js.Array[GitChange]
  /**
    * Comment or message of the commit.
    */
  var comment: String
  /**
    * Indicates if the comment is truncated from the full Git commit comment message.
    */
  var commentTruncated: Boolean
  /**
    * ID (SHA-1) of the commit.
    */
  var commitId: String
  /**
    * Committer of the commit.
    */
  var committer: GitUserDate
  /**
    * An enumeration of the parent commit IDs for this commit.
    */
  var parents: js.Array[String]
  /**
    * Remote URL path to the commit.
    */
  var remoteUrl: String
  /**
    * A list of status metadata from services and extensions that may associate additional information to the commit.
    */
  var statuses: js.Array[GitStatus]
  /**
    * REST URL for this resource.
    */
  var url: String
  /**
    * A list of workitems associated with this commit.
    */
  var workItems: js.Array[ResourceRef]
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
}

