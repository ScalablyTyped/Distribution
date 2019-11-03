package typings.superstruct

import typings.superstruct.umdStructDashErrorMod.Branch
import typings.superstruct.umdStructDashErrorMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BranchPath extends js.Object {
  var branch: Branch
  var path: Path
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object Anon_BranchPath {
  @scala.inline
  def apply(branch: Branch, path: Path, value: js.Any, `type`: String = null): Anon_BranchPath = {
    val __obj = js.Dynamic.literal(branch = branch, path = path, value = value)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_BranchPath]
  }
}

