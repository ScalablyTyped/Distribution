package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nodes extends js.Object {
  var edges: js.Array[String]
  var nodes: js.Array[String]
}

object Nodes {
  @scala.inline
  def apply(edges: js.Array[String], nodes: js.Array[String]): Nodes = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
}

