package typings
package yogDashBigpipeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var _default: js.UndefOr[java.lang.String] = js.undefined
  var quickling: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(_default: java.lang.String = null, quickling: java.lang.String = null): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (_default != null) __obj.updateDynamic("_default")(_default)
    if (quickling != null) __obj.updateDynamic("quickling")(quickling)
    __obj.asInstanceOf[Anon_Default]
  }
}

