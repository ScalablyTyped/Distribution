package typings
package webcolaLib.distSrcGridrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeAccessor[Node] extends js.Object {
  def getBounds(v: Node): webcolaLib.distSrcRectangleMod.Rectangle
  def getChildren(v: Node): js.Array[scala.Double]
}

object NodeAccessor {
  @scala.inline
  def apply[Node](
    getBounds: js.Function1[Node, webcolaLib.distSrcRectangleMod.Rectangle],
    getChildren: js.Function1[Node, js.Array[scala.Double]]
  ): NodeAccessor[Node] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBounds")(getBounds)
    __obj.updateDynamic("getChildren")(getChildren)
    __obj.asInstanceOf[NodeAccessor[Node]]
  }
}

