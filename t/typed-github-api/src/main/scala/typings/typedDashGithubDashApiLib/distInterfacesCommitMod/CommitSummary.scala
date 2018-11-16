package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommitSummary extends CommitRef {
  var author: js.UndefOr[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary] = js.undefined
  var committer: js.UndefOr[typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary] = js.undefined
  var gitCommit: GitCommitSummary
  var htmlUri: java.lang.String
  var parents: js.Array[CommitRef]
}

