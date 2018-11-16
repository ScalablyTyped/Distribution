package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Commit extends CommitSummary {
  var changes: GitChanges
  var files: js.Array[GitFile]
}

