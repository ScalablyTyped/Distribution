package typings.webgme

import typings.webgme.Core.Node
import typings.webgme.GmeCommon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMembers extends js.Object {
  /** the members of the set of the node in question. */
  var members: js.UndefOr[js.Array[Node]] = js.undefined
  /** the name of the set. */
  var name: Name
  /** the node in question. */
  var node: Node
}

object AnonMembers {
  @scala.inline
  def apply(name: Name, node: Node, members: js.Array[Node] = null): AnonMembers = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMembers]
  }
}

