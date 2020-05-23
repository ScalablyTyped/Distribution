package typings.themeUi.anon

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait As extends js.Object {
  var as: js.UndefOr[ElementType[_]] = js.undefined
}

object As {
  @scala.inline
  def apply(as: ElementType[_] = null): As = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
}

