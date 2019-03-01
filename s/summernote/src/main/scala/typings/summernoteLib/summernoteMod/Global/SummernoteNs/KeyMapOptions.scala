package typings
package summernoteLib.summernoteMod.Global.SummernoteNs

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
    if (mac != null) __obj.updateDynamic("mac")(mac)
    if (pc != null) __obj.updateDynamic("pc")(pc)
    __obj.asInstanceOf[KeyMapOptions]
  }
}

