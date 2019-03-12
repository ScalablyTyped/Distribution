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
    getBounds: Node => webcolaLib.distSrcRectangleMod.Rectangle,
    getChildren: Node => js.Array[scala.Double]
  ): NodeAccessor[Node] = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction1(getBounds), getChildren = js.Any.fromFunction1(getChildren))
  
    __obj.asInstanceOf[NodeAccessor[Node]]
  }
}

