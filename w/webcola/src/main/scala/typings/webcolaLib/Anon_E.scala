package typings
package webcolaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var E: js.Array[webcolaLib.distSrcGeomMod.VisibilityEdge]
  var V: js.Array[webcolaLib.distSrcGeomMod.VisibilityVertex]
}

object Anon_E {
  @scala.inline
  def apply(
    E: js.Array[webcolaLib.distSrcGeomMod.VisibilityEdge],
    V: js.Array[webcolaLib.distSrcGeomMod.VisibilityVertex]
  ): Anon_E = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("E")(E)
    __obj.updateDynamic("V")(V)
    __obj.asInstanceOf[Anon_E]
  }
}

