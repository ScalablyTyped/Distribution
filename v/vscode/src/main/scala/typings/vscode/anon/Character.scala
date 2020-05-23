package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Character extends js.Object {
  var character: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
}

object Character {
  @scala.inline
  def apply(character: js.UndefOr[Double] = js.undefined, line: js.UndefOr[Double] = js.undefined): Character = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(character)) __obj.updateDynamic("character")(character.get.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Character]
  }
}

