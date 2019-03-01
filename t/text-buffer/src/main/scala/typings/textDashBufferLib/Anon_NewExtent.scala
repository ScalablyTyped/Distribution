package typings
package textDashBufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewExtent extends js.Object {
  /** A Point representing the replacement extent. */
  var newExtent: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /** A String representing the replacement text. */
  var newText: java.lang.String
  /** A Point representing the replaced extent. */
  var oldExtent: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  /** A Point representing where the change started. */
  var start: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
}

object Anon_NewExtent {
  @scala.inline
  def apply(
    newExtent: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    newText: java.lang.String,
    oldExtent: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point,
    start: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Point
  ): Anon_NewExtent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newExtent")(newExtent)
    __obj.updateDynamic("newText")(newText)
    __obj.updateDynamic("oldExtent")(oldExtent)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_NewExtent]
  }
}

