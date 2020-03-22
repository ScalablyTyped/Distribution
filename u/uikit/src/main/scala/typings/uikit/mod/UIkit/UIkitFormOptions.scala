package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitFormOptions extends js.Object {
  var target: js.UndefOr[String | Boolean] = js.undefined
}

object UIkitFormOptions {
  @scala.inline
  def apply(target: String | Boolean = null): UIkitFormOptions = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitFormOptions]
  }
}

