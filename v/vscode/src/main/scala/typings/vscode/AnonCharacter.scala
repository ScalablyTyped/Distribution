package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharacter extends js.Object {
  var character: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
}

object AnonCharacter {
  @scala.inline
  def apply(character: Int | Double = null, line: Int | Double = null): AnonCharacter = {
    val __obj = js.Dynamic.literal()
    if (character != null) __obj.updateDynamic("character")(character.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharacter]
  }
}

