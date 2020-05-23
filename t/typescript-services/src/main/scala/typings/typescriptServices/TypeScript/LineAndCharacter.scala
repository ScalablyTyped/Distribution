package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineAndCharacter extends js.Object {
  var _character: js.Any
  var _line: js.Any
  def character(): Double
  def line(): Double
}

object LineAndCharacter {
  @scala.inline
  def apply(_character: js.Any, _line: js.Any, character: () => Double, line: () => Double): LineAndCharacter = {
    val __obj = js.Dynamic.literal(_character = _character.asInstanceOf[js.Any], _line = _line.asInstanceOf[js.Any], character = js.Any.fromFunction0(character), line = js.Any.fromFunction0(line))
    __obj.asInstanceOf[LineAndCharacter]
  }
}

