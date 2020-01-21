package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharacterDelta extends js.Object {
  var characterDelta: js.UndefOr[Double] = js.undefined
  var lineDelta: js.UndefOr[Double] = js.undefined
}

object AnonCharacterDelta {
  @scala.inline
  def apply(characterDelta: Int | Double = null, lineDelta: Int | Double = null): AnonCharacterDelta = {
    val __obj = js.Dynamic.literal()
    if (characterDelta != null) __obj.updateDynamic("characterDelta")(characterDelta.asInstanceOf[js.Any])
    if (lineDelta != null) __obj.updateDynamic("lineDelta")(lineDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharacterDelta]
  }
}

