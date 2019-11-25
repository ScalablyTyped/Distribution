package typings.vis

import typings.vis.visMod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Edges extends js.Object {
  var edges: js.Array[IdType]
  var nodes: js.Array[IdType]
}

object Anon_Edges {
  @scala.inline
  def apply(edges: js.Array[IdType], nodes: js.Array[IdType]): Anon_Edges = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Edges]
  }
}

