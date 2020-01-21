package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdgesNodes extends js.Object {
  var edges: js.Array[String]
  var nodes: js.Array[String]
}

object AnonEdgesNodes {
  @scala.inline
  def apply(edges: js.Array[String], nodes: js.Array[String]): AnonEdgesNodes = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEdgesNodes]
  }
}

