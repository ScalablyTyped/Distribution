package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EdgesNodes extends js.Object {
  var edges: js.Array[String]
  var nodes: js.Array[String]
}

object Anon_EdgesNodes {
  @scala.inline
  def apply(edges: js.Array[String], nodes: js.Array[String]): Anon_EdgesNodes = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EdgesNodes]
  }
}

