package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[js.Array[webgmeLib.CoreNs.Node]] = js.undefined
  var node: webgmeLib.CoreNs.Node
}

object Anon_Children {
  @scala.inline
  def apply(node: webgmeLib.CoreNs.Node, children: js.Array[webgmeLib.CoreNs.Node] = null): Anon_Children = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("node")(node)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Anon_Children]
  }
}

