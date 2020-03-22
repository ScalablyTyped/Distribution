package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodes extends js.Object {
  var edges: js.Array[String]
  var nodes: js.Array[String]
}

object AnonNodes {
  @scala.inline
  def apply(edges: js.Array[String], nodes: js.Array[String]): AnonNodes = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNodes]
  }
}

