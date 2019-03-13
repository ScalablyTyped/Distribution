package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: js.UndefOr[vscodeLib.vscodeMod.Position] = js.undefined
  var start: js.UndefOr[vscodeLib.vscodeMod.Position] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(end: vscodeLib.vscodeMod.Position = null, start: vscodeLib.vscodeMod.Position = null): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_End]
  }
}

