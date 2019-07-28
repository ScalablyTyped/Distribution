package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Character extends js.Object {
  var character: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
}

object Anon_Character {
  @scala.inline
  def apply(character: Int | Double = null, line: Int | Double = null): Anon_Character = {
    val __obj = js.Dynamic.literal()
    if (character != null) __obj.updateDynamic("character")(character.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Character]
  }
}

