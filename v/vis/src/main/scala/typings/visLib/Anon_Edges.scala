package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Edges extends js.Object {
  var edges: js.Array[visLib.visMod.IdType]
  var nodes: js.Array[visLib.visMod.IdType]
}

object Anon_Edges {
  @scala.inline
  def apply(edges: js.Array[visLib.visMod.IdType], nodes: js.Array[visLib.visMod.IdType]): Anon_Edges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[Anon_Edges]
  }
}

