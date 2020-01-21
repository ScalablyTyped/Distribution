package typings.webcola.gridrouterMod

import typings.webcola.rectangleMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeAccessor[Node] extends js.Object {
  def getBounds(v: Node): Rectangle
  def getChildren(v: Node): js.Array[Double]
}

object NodeAccessor {
  @scala.inline
  def apply[Node](getBounds: Node => Rectangle, getChildren: Node => js.Array[Double]): NodeAccessor[Node] = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction1(getBounds), getChildren = js.Any.fromFunction1(getChildren))
  
    __obj.asInstanceOf[NodeAccessor[Node]]
  }
}

