package typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod

import typings.typedDashGithubDashApi.Anon_Additions
import typings.typedDashGithubDashApi.Anon_AdditionsBloburl
import typings.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends CommitSummary {
  var files: js.Array[Anon_AdditionsBloburl]
  var stats: Anon_Additions
}

object Commit {
  @scala.inline
  def apply(
    author: UserSummary,
    comments_url: String,
    commit: GitCommitSummary,
    committer: UserSummary,
    files: js.Array[Anon_AdditionsBloburl],
    html_url: String,
    parents: js.Array[CommitRef],
    sha: String,
    stats: Anon_Additions,
    url: String
  ): Commit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Commit]
  }
}

