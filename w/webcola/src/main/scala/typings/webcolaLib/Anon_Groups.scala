package typings
package webcolaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groups extends js.Object {
  var groups: js.Array[_]
  var powerEdges: js.Array[webcolaLib.distSrcPowergraphMod.PowerEdge]
}

object Anon_Groups {
  @scala.inline
  def apply(groups: js.Array[_], powerEdges: js.Array[webcolaLib.distSrcPowergraphMod.PowerEdge]): Anon_Groups = {
    val __obj = js.Dynamic.literal(groups = groups, powerEdges = powerEdges)
  
    __obj.asInstanceOf[Anon_Groups]
  }
}

