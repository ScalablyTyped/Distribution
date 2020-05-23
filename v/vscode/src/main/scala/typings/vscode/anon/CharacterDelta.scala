package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterDelta extends js.Object {
  var characterDelta: js.UndefOr[Double] = js.undefined
  var lineDelta: js.UndefOr[Double] = js.undefined
}

object CharacterDelta {
  @scala.inline
  def apply(characterDelta: js.UndefOr[Double] = js.undefined, lineDelta: js.UndefOr[Double] = js.undefined): CharacterDelta = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(characterDelta)) __obj.updateDynamic("characterDelta")(characterDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineDelta)) __obj.updateDynamic("lineDelta")(lineDelta.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterDelta]
  }
}

