package typings.webgme

import typings.webgme.Core.Node
import typings.webgme.GmeCommon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Members extends js.Object {
  /** the members of the set of the node in question. */
  var members: js.UndefOr[js.Array[Node]] = js.undefined
  /** the name of the set. */
  var name: Name
  /** the node in question. */
  var node: Node
}

object Anon_Members {
  @scala.inline
  def apply(name: Name, node: Node, members: js.Array[Node] = null): Anon_Members = {
    val __obj = js.Dynamic.literal(name = name, node = node)
    if (members != null) __obj.updateDynamic("members")(members)
    __obj.asInstanceOf[Anon_Members]
  }
}

