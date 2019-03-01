package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChange extends js.Object {
  var newExtent: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  var newRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range
  var newText: java.lang.String
  var oldExtent: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  var oldRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range
  var oldText: java.lang.String
  var start: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
}

object TextChange {
  @scala.inline
  def apply(
    newExtent: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    newRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range,
    newText: java.lang.String,
    oldExtent: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    oldRange: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range,
    oldText: java.lang.String,
    start: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  ): TextChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newExtent")(newExtent)
    __obj.updateDynamic("newRange")(newRange)
    __obj.updateDynamic("newText")(newText)
    __obj.updateDynamic("oldExtent")(oldExtent)
    __obj.updateDynamic("oldRange")(oldRange)
    __obj.updateDynamic("oldText")(oldText)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[TextChange]
  }
}

