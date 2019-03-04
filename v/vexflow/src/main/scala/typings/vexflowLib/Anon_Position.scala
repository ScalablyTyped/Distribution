package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: js.UndefOr[vexflowLib.VexNs.FlowNs.TextBracketNs.Positions] = js.undefined
  var start: vexflowLib.VexNs.FlowNs.Note
  var stop: vexflowLib.VexNs.FlowNs.Note
  var superscript: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Position {
  @scala.inline
  def apply(
    start: vexflowLib.VexNs.FlowNs.Note,
    stop: vexflowLib.VexNs.FlowNs.Note,
    position: vexflowLib.VexNs.FlowNs.TextBracketNs.Positions = null,
    superscript: java.lang.String = null,
    text: java.lang.String = null
  ): Anon_Position = {
    val __obj = js.Dynamic.literal(start = start, stop = stop)
    if (position != null) __obj.updateDynamic("position")(position)
    if (superscript != null) __obj.updateDynamic("superscript")(superscript)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Position]
  }
}

