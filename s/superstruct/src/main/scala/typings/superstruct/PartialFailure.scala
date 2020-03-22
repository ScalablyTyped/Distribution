package typings.superstruct

import typings.superstruct.structErrorMod.Branch
import typings.superstruct.structErrorMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<superstruct.superstruct/lib/struct-error.Failure> */
trait PartialFailure extends js.Object {
  var branch: js.UndefOr[Branch] = js.undefined
  var path: js.UndefOr[Path] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object PartialFailure {
  @scala.inline
  def apply(branch: Branch = null, path: Path = null, `type`: String = null, value: js.Any = null): PartialFailure = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFailure]
  }
}

