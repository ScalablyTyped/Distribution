package typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod

import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitSummary extends js.Object {
  var author: UserSummary
  var comments_url: String
  var commit: GitCommitSummary
  var committer: UserSummary
  var html_url: String
  var parents: js.Array[CommitRef]
  var sha: String
  var url: String
}

object CommitSummary {
  @scala.inline
  def apply(
    author: UserSummary,
    comments_url: String,
    commit: GitCommitSummary,
    committer: UserSummary,
    html_url: String,
    parents: js.Array[CommitRef],
    sha: String,
    url: String
  ): CommitSummary = {
    val __obj = js.Dynamic.literal(author = author, comments_url = comments_url, commit = commit, committer = committer, html_url = html_url, parents = parents, sha = sha, url = url)
  
    __obj.asInstanceOf[CommitSummary]
  }
}

