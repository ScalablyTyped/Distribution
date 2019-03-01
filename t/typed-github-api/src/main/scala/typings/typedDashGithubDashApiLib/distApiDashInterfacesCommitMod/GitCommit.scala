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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("comment_count")(comment_count)
    __obj.updateDynamic("committer")(committer)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("parents")(parents)
    __obj.updateDynamic("sha")(sha)
    __obj.updateDynamic("tree")(tree)
    __obj.updateDynamic("url")(url)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[GitCommit]
  }
}

