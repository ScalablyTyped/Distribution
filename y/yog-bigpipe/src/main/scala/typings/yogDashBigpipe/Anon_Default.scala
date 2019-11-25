package typings.yogDashBigpipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var _default: js.UndefOr[String] = js.undefined
  var quickling: js.UndefOr[String] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(_default: String = null, quickling: String = null): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (_default != null) __obj.updateDynamic("_default")(_default.asInstanceOf[js.Any])
    if (quickling != null) __obj.updateDynamic("quickling")(quickling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default]
  }
}

