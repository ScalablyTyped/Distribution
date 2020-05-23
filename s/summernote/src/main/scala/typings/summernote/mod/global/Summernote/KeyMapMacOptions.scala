package typings.summernote.mod.global.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyMapMacOptions extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
}

object KeyMapMacOptions {
  @scala.inline
  def apply(options: js.Any = null): KeyMapMacOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapMacOptions]
  }
}

