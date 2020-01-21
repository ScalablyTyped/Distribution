package typings.yogBigpipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var _default: js.UndefOr[String] = js.undefined
  var quickling: js.UndefOr[String] = js.undefined
}

object AnonDefault {
  @scala.inline
  def apply(_default: String = null, quickling: String = null): AnonDefault = {
    val __obj = js.Dynamic.literal()
    if (_default != null) __obj.updateDynamic("_default")(_default.asInstanceOf[js.Any])
    if (quickling != null) __obj.updateDynamic("quickling")(quickling.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

