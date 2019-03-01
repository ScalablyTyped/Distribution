package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitFile extends js.Object {
  var changes: GitChanges
  var filename: java.lang.String
  var patch: java.lang.String
  var status: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.modified
}

object GitFile {
  @scala.inline
  def apply(
    changes: GitChanges,
    filename: java.lang.String,
    patch: java.lang.String,
    status: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.modified
  ): GitFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[GitFile]
  }
}

