package typings.summernote.mod._Global_.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconsOptions extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
}

object IconsOptions {
  @scala.inline
  def apply(options: js.Any = null): IconsOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconsOptions]
  }
}

