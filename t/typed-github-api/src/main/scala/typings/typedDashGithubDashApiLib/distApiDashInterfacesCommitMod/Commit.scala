package typings
package typedDashGithubDashApiLib.distApiDashInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends CommitSummary {
  var files: js.Array[typedDashGithubDashApiLib.Anon_AdditionsBloburl]
  var stats: typedDashGithubDashApiLib.Anon_Additions
}

object Commit {
  @scala.inline
  def apply(
    author: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    comments_url: java.lang.String,
    commit: GitCommitSummary,
    committer: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    files: js.Array[typedDashGithubDashApiLib.Anon_AdditionsBloburl],
    html_url: java.lang.String,
    parents: js.Array[CommitRef],
    sha: java.lang.String,
    stats: typedDashGithubDashApiLib.Anon_Additions,
    url: java.lang.String
  ): Commit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("comments_url")(comments_url)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("committer")(committer)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("parents")(parents)
    __obj.updateDynamic("sha")(sha)
    __obj.updateDynamic("stats")(stats)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Commit]
  }
}

