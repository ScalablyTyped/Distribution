package typings.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRuleFailurePositionJson extends js.Object {
  var character: Double = js.native
  var line: Double = js.native
  var position: Double = js.native
}

object IRuleFailurePositionJson {
  @scala.inline
  def apply(character: Double, line: Double, position: Double): IRuleFailurePositionJson = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRuleFailurePositionJson]
  }
  @scala.inline
  implicit class IRuleFailurePositionJsonOps[Self <: IRuleFailurePositionJson] (val x: Self) extends AnyVal {
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
    def setCharacter(value: Double): Self = this.set("character", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

