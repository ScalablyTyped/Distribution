package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  var position: js.UndefOr[typings.vexflow.Vex.Flow.TextBracket.Positions] = js.native
  var start: typings.vexflow.Vex.Flow.Note = js.native
  var stop: typings.vexflow.Vex.Flow.Note = js.native
  var superscript: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object Position {
  @scala.inline
  def apply(start: typings.vexflow.Vex.Flow.Note, stop: typings.vexflow.Vex.Flow.Note): Position = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
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
    def setStart(value: typings.vexflow.Vex.Flow.Note): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: typings.vexflow.Vex.Flow.Note): Self = this.set("stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: typings.vexflow.Vex.Flow.TextBracket.Positions): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSuperscript(value: String): Self = this.set("superscript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperscript: Self = this.set("superscript", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

