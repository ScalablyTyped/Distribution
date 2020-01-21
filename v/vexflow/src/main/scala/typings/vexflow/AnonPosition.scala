package typings.vexflow

import typings.vexflow.Vex.Flow.Note
import typings.vexflow.Vex.Flow.TextBracket.Positions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var position: js.UndefOr[Positions] = js.undefined
  var start: Note
  var stop: Note
  var superscript: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonPosition {
  @scala.inline
  def apply(
    start: Note,
    stop: Note,
    position: Positions = null,
    superscript: String = null,
    text: String = null
  ): AnonPosition = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (superscript != null) __obj.updateDynamic("superscript")(superscript.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

