package typings
package webcolaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Links extends js.Object {
  var links: js.Array[webcolaLib.distSrcLayoutMod.Link[webcolaLib.distSrcLayoutMod.Node]]
  var nodes: js.Array[webcolaLib.distSrcLayoutMod.Node]
}

object Anon_Links {
  @scala.inline
  def apply(
    links: js.Array[webcolaLib.distSrcLayoutMod.Link[webcolaLib.distSrcLayoutMod.Node]],
    nodes: js.Array[webcolaLib.distSrcLayoutMod.Node]
  ): Anon_Links = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[Anon_Links]
  }
}

