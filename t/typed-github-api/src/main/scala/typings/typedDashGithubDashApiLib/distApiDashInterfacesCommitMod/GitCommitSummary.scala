package typings
package typedDashGithubDashApiLib.distApiDashInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitSummary extends js.Object {
  var author: GitActor
  var comment_count: scala.Double
  var committer: GitActor
  var message: java.lang.String
  var tree: GitRef
  var url: java.lang.String
  var verification: js.UndefOr[typedDashGithubDashApiLib.Anon_Payload] = js.undefined
}

object GitCommitSummary {
  @scala.inline
  def apply(
    author: GitActor,
    comment_count: scala.Double,
    committer: GitActor,
    message: java.lang.String,
    tree: GitRef,
    url: java.lang.String,
    verification: typedDashGithubDashApiLib.Anon_Payload = null
  ): GitCommitSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("comment_count")(comment_count)
    __obj.updateDynamic("committer")(committer)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("tree")(tree)
    __obj.updateDynamic("url")(url)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[GitCommitSummary]
  }
}

