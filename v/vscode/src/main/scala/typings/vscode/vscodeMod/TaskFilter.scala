package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskFilter extends js.Object {
  /**
  		 * The task type to return;
  		 */
  var `type`: js.UndefOr[String] = js.undefined
  /**
  		 * The task version as used in the tasks.json file.
  		 * The string support the package.json semver notation.
  		 */
  var version: js.UndefOr[String] = js.undefined
}

object TaskFilter {
  @scala.inline
  def apply(`type`: String = null, version: String = null): TaskFilter = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TaskFilter]
  }
}

