package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommit extends GitCommitRef {
  var push: GitPushRef
  var treeId: java.lang.String
}

object GitCommit {
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
    push: GitPushRef,
    remoteUrl: java.lang.String,
    statuses: js.Array[GitStatus],
    treeId: java.lang.String,
    url: java.lang.String,
    workItems: js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]
  ): GitCommit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("changeCounts")(changeCounts)
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("commentTruncated")(commentTruncated)
    __obj.updateDynamic("commitId")(commitId)
    __obj.updateDynamic("committer")(committer)
    __obj.updateDynamic("parents")(parents)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("remoteUrl")(remoteUrl)
    __obj.updateDynamic("statuses")(statuses)
    __obj.updateDynamic("treeId")(treeId)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("workItems")(workItems)
    __obj.asInstanceOf[GitCommit]
  }
}

