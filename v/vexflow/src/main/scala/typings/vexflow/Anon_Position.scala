package typings.vexflow

import typings.vexflow.Vex.Flow.Note
import typings.vexflow.Vex.Flow.TextBracket.Positions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: js.UndefOr[Positions] = js.undefined
  var start: Note
  var stop: Note
  var superscript: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Anon_Position {
  @scala.inline
  def apply(
    start: Note,
    stop: Note,
    position: Positions = null,
    superscript: String = null,
    text: String = null
  ): Anon_Position = {
    val __obj = js.Dynamic.literal(start = start, stop = stop)
    if (position != null) __obj.updateDynamic("position")(position)
    if (superscript != null) __obj.updateDynamic("superscript")(superscript)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Position]
  }
}

