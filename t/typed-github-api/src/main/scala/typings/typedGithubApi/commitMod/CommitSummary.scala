package typings.typedGithubApi.commitMod

import typings.typedGithubApi.userMod.UserSummary
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
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommitSummary]
  }
}

