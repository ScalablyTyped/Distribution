package typings.typedGithubApi.commitMod

import typings.typedGithubApi.anon.Additions
import typings.typedGithubApi.anon.Bloburl
import typings.typedGithubApi.userMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commit extends CommitSummary {
  var files: js.Array[Bloburl] = js.native
  var stats: Additions = js.native
}

object Commit {
  @scala.inline
  def apply(
    author: UserSummary,
    comments_url: String,
    commit: GitCommitSummary,
    committer: UserSummary,
    files: js.Array[Bloburl],
    html_url: String,
    parents: js.Array[CommitRef],
    sha: String,
    stats: Additions,
    url: String
  ): Commit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
  @scala.inline
  implicit class CommitOps[Self <: Commit] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: Bloburl*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[Bloburl]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Additions): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
  
}

