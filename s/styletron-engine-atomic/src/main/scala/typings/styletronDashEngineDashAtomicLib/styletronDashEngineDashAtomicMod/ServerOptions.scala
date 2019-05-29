package typings
package styletronDashEngineDashAtomicLib.styletronDashEngineDashAtomicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(prefix: java.lang.String = null): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[ServerOptions]
  }
}

