package typings
package toDashAbsoluteDashGlobLib.toDashAbsoluteDashGlobMod.toAbsoluteGlobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: java.lang.String = null, root: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Options]
  }
}

