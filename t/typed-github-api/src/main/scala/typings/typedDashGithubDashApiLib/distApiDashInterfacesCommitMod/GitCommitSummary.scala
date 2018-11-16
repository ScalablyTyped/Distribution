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
  var verification: js.UndefOr[typedDashGithubDashApiLib.Anon_Verified] = js.undefined
}

