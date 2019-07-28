package typings.temp.tempMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffixOptions extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object AffixOptions {
  @scala.inline
  def apply(dir: String = null, prefix: String = null, suffix: String = null): AffixOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[AffixOptions]
  }
}

