package typings.summernote.summernoteMod.Global.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
}

object ModuleOptions {
  @scala.inline
  def apply(options: js.Any = null): ModuleOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ModuleOptions]
  }
}

