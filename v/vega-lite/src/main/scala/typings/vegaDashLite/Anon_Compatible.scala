package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compatible extends js.Object {
  var compatible: Boolean
  var warning: js.UndefOr[String] = js.undefined
}

object Anon_Compatible {
  @scala.inline
  def apply(compatible: Boolean, warning: String = null): Anon_Compatible = {
    val __obj = js.Dynamic.literal(compatible = compatible)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_Compatible]
  }
}

