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

