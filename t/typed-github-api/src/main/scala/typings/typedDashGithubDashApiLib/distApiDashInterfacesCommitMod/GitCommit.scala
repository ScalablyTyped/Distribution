package typings
package typedDashGithubDashApiLib.distApiDashInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommit extends GitCommitSummary {
  var html_url: java.lang.String
  var parents: js.Array[CommitRef]
  var sha: java.lang.String
}

object GitCommit {
  @scala.inline
  def apply(
    author: GitActor,
    comment_count: scala.Double,
    committer: GitActor,
    html_url: java.lang.String,
    message: java.lang.String,
    parents: js.Array[CommitRef],
    sha: java.lang.String,
    tree: GitRef,
    url: java.lang.String,
    verification: typedDashGithubDashApiLib.Anon_Payload = null
  ): GitCommit = {
    val __obj = js.Dynamic.literal(author = author, comment_count = comment_count, committer = committer, html_url = html_url, message = message, parents = parents, sha = sha, tree = tree, url = url)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[GitCommit]
  }
}

