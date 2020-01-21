package typings.webcola

import typings.webcola.layoutMod.Link
import typings.webcola.layoutMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLinks extends js.Object {
  var links: js.Array[Link[Node]]
  var nodes: js.Array[Node]
}

object AnonLinks {
  @scala.inline
  def apply(links: js.Array[Link[Node]], nodes: js.Array[Node]): AnonLinks = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLinks]
  }
}

