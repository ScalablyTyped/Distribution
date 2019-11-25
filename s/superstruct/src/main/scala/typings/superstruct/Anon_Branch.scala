package typings.superstruct

import typings.superstruct.libStructDashErrorMod.Branch
import typings.superstruct.libStructDashErrorMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Branch extends js.Object {
  var branch: Branch
  var path: Path
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object Anon_Branch {
  @scala.inline
  def apply(branch: Branch, path: Path, value: js.Any, `type`: String = null): Anon_Branch = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Branch]
  }
}

