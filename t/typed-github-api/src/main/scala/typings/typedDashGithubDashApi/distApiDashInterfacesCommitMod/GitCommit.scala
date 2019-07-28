package typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod

import typings.typedDashGithubDashApi.Anon_Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommit extends GitCommitSummary {
  var html_url: String
  var parents: js.Array[CommitRef]
  var sha: String
}

object GitCommit {
  @scala.inline
  def apply(
    author: GitActor,
    comment_count: Double,
    committer: GitActor,
    html_url: String,
    message: String,
    parents: js.Array[CommitRef],
    sha: String,
    tree: GitRef,
    url: String,
    verification: Anon_Payload = null
  ): GitCommit = {
    val __obj = js.Dynamic.literal(author = author, comment_count = comment_count, committer = committer, html_url = html_url, message = message, parents = parents, sha = sha, tree = tree, url = url)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[GitCommit]
  }
}

