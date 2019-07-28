package typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod

import typings.typedDashGithubDashApi.Anon_Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCommitSummary extends js.Object {
  var author: GitActor
  var comment_count: Double
  var committer: GitActor
  var message: String
  var tree: GitRef
  var url: String
  var verification: js.UndefOr[Anon_Payload] = js.undefined
}

object GitCommitSummary {
  @scala.inline
  def apply(
    author: GitActor,
    comment_count: Double,
    committer: GitActor,
    message: String,
    tree: GitRef,
    url: String,
    verification: Anon_Payload = null
  ): GitCommitSummary = {
    val __obj = js.Dynamic.literal(author = author, comment_count = comment_count, committer = committer, message = message, tree = tree, url = url)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[GitCommitSummary]
  }
}

