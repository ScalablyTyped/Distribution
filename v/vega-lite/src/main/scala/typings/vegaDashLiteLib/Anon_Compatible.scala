package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compatible extends js.Object {
  var compatible: scala.Boolean
  var warning: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Compatible {
  @scala.inline
  def apply(compatible: scala.Boolean, warning: java.lang.String = null): Anon_Compatible = {
    val __obj = js.Dynamic.literal(compatible = compatible)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_Compatible]
  }
}

