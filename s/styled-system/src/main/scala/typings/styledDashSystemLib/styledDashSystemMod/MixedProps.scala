package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MixedProps extends js.Object {
  var key: js.UndefOr[js.Any] = js.undefined
  // Defaults to "variant"
  var prop: js.UndefOr[java.lang.String] = js.undefined
}

object MixedProps {
  @scala.inline
  def apply(key: js.Any = null, prop: java.lang.String = null): MixedProps = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (prop != null) __obj.updateDynamic("prop")(prop)
    __obj.asInstanceOf[MixedProps]
  }
}

