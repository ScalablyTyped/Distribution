package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineAndCharacter extends js.Object {
  var _character: js.Any = js.native
  var _line: js.Any = js.native
  def character(): Double = js.native
  def line(): Double = js.native
}

object LineAndCharacter {
  @scala.inline
  def apply(_character: js.Any, _line: js.Any, character: () => Double, line: () => Double): LineAndCharacter = {
    val __obj = js.Dynamic.literal(_character = _character.asInstanceOf[js.Any], _line = _line.asInstanceOf[js.Any], character = js.Any.fromFunction0(character), line = js.Any.fromFunction0(line))
    __obj.asInstanceOf[LineAndCharacter]
  }
  @scala.inline
  implicit class LineAndCharacterOps[Self <: LineAndCharacter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_character(value: js.Any): Self = this.set("_character", value.asInstanceOf[js.Any])
    @scala.inline
    def set_line(value: js.Any): Self = this.set("_line", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharacter(value: () => Double): Self = this.set("character", js.Any.fromFunction0(value))
    @scala.inline
    def setLine(value: () => Double): Self = this.set("line", js.Any.fromFunction0(value))
  }
  
}

