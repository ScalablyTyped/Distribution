package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharacterDelta extends js.Object {
  var characterDelta: js.UndefOr[scala.Double] = js.undefined
  var lineDelta: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CharacterDelta {
  @scala.inline
  def apply(characterDelta: scala.Int | scala.Double = null, lineDelta: scala.Int | scala.Double = null): Anon_CharacterDelta = {
    val __obj = js.Dynamic.literal()
    if (characterDelta != null) __obj.updateDynamic("characterDelta")(characterDelta.asInstanceOf[js.Any])
    if (lineDelta != null) __obj.updateDynamic("lineDelta")(lineDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CharacterDelta]
  }
}

