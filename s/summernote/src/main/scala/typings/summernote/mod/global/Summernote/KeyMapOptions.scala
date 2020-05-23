package typings.summernote.mod.global.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyMapOptions extends js.Object {
  var mac: js.UndefOr[KeyMapMacOptions] = js.undefined
  var pc: js.UndefOr[KeyMapPcOptions] = js.undefined
}

object KeyMapOptions {
  @scala.inline
  def apply(mac: KeyMapMacOptions = null, pc: KeyMapPcOptions = null): KeyMapOptions = {
    val __obj = js.Dynamic.literal()
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (pc != null) __obj.updateDynamic("pc")(pc.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapOptions]
  }
}

