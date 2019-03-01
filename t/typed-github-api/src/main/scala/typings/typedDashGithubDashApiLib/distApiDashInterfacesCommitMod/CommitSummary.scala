package typings
package typedDashGithubDashApiLib.distApiDashInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitSummary extends js.Object {
  var author: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
  var comments_url: java.lang.String
  var commit: GitCommitSummary
  var committer: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary
  var html_url: java.lang.String
  var parents: js.Array[CommitRef]
  var sha: java.lang.String
  var url: java.lang.String
}

object CommitSummary {
  @scala.inline
  def apply(
    author: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    comments_url: java.lang.String,
    commit: GitCommitSummary,
    committer: typedDashGithubDashApiLib.distApiDashInterfacesUserMod.UserSummary,
    html_url: java.lang.String,
    parents: js.Array[CommitRef],
    sha: java.lang.String,
    url: java.lang.String
  ): CommitSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("comments_url")(comments_url)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("committer")(committer)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("parents")(parents)
    __obj.updateDynamic("sha")(sha)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CommitSummary]
  }
}

