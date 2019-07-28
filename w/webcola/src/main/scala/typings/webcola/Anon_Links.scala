package typings.webcola

import typings.webcola.distSrcLayoutMod.Link
import typings.webcola.distSrcLayoutMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Links extends js.Object {
  var links: js.Array[Link[Node]]
  var nodes: js.Array[Node]
}

object Anon_Links {
  @scala.inline
  def apply(links: js.Array[Link[Node]], nodes: js.Array[Node]): Anon_Links = {
    val __obj = js.Dynamic.literal(links = links, nodes = nodes)
  
    __obj.asInstanceOf[Anon_Links]
  }
}

