package typings
package tempLib.tempMod.tempNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffixOptions extends js.Object {
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object AffixOptions {
  @scala.inline
  def apply(dir: java.lang.String = null, prefix: java.lang.String = null, suffix: java.lang.String = null): AffixOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[AffixOptions]
  }
}

