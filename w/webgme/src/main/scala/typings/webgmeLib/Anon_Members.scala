package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Members extends js.Object {
  /** the members of the set of the node in question. */
  var members: js.UndefOr[js.Array[webgmeLib.CoreNs.Node]] = js.undefined
  /** the name of the set. */
  var name: webgmeLib.GmeCommonNs.Name
  /** the node in question. */
  var node: webgmeLib.CoreNs.Node
}

object Anon_Members {
  @scala.inline
  def apply(
    name: webgmeLib.GmeCommonNs.Name,
    node: webgmeLib.CoreNs.Node,
    members: js.Array[webgmeLib.CoreNs.Node] = null
  ): Anon_Members = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("node")(node)
    if (members != null) __obj.updateDynamic("members")(members)
    __obj.asInstanceOf[Anon_Members]
  }
}

