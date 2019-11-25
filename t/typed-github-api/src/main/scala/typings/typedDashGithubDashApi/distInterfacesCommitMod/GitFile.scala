package typings.typedDashGithubDashApi.distInterfacesCommitMod

import typings.typedDashGithubDashApi.typedDashGithubDashApiStrings.modified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitFile extends js.Object {
  var changes: GitChanges
  var filename: String
  var patch: String
  var status: modified
}

object GitFile {
  @scala.inline
  def apply(changes: GitChanges, filename: String, patch: String, status: modified): GitFile = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitFile]
  }
}

