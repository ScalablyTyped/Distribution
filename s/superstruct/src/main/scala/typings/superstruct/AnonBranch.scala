package typings.superstruct

import typings.superstruct.structErrorMod.Branch
import typings.superstruct.structErrorMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBranch extends js.Object {
  var branch: Branch
  var path: Path
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object AnonBranch {
  @scala.inline
  def apply(branch: Branch, path: Path, value: js.Any, `type`: String = null): AnonBranch = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBranch]
  }
}

