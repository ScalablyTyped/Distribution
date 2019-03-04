package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  var comment: java.lang.String
  /**
    * Indicates if the comment is truncated from the full Git commit comment message.
    */
  var commentTruncated: scala.Boolean
  /**
    * ID (SHA-1) of the commit.
    */
  var commitId: java.lang.String
  /**
    * Committer of the commit.
    */
  var committer: GitUserDate
  /**
    * An enumeration of the parent commit IDs for this commit.
    */
  var parents: js.Array[java.lang.String]
  /**
    * Remote URL path to the commit.
    */
  var remoteUrl: java.lang.String
  /**
    * A list of status metadata from services and extensions that may associate additional information to the commit.
    */
  var statuses: js.Array[GitStatus]
  /**
    * REST URL for this resource.
    */
  var url: java.lang.String
  /**
    * A list of workitems associated with this commit.
    */
  var workItems: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]
}

object GitCommitRef {
  @scala.inline
  def apply(
    _links: js.Any,
    author: GitUserDate,
    changeCounts: ChangeCountDictionary,
    changes: js.Array[GitChange],
    comment: java.lang.String,
    commentTruncated: scala.Boolean,
    commitId: java.lang.String,
    committer: GitUserDate,
    parents: js.Array[java.lang.String],
    remoteUrl: java.lang.String,
    statuses: js.Array[GitStatus],
    url: java.lang.String,
    workItems: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]
  ): GitCommitRef = {
    val __obj = js.Dynamic.literal(_links = _links, author = author, changeCounts = changeCounts, changes = changes, comment = comment, commentTruncated = commentTruncated, commitId = commitId, committer = committer, parents = parents, remoteUrl = remoteUrl, statuses = statuses, url = url, workItems = workItems)
  
    __obj.asInstanceOf[GitCommitRef]
  }
}

