package typings.webcola.gridrouterMod

import typings.webcola.rectangleMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeAccessor[Node] extends js.Object {
  def getBounds(v: Node): Rectangle = js.native
  def getChildren(v: Node): js.Array[Double] = js.native
}

object NodeAccessor {
  @scala.inline
  def apply[Node](getBounds: Node => Rectangle, getChildren: Node => js.Array[Double]): NodeAccessor[Node] = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction1(getBounds), getChildren = js.Any.fromFunction1(getChildren))
    __obj.asInstanceOf[NodeAccessor[Node]]
  }
  @scala.inline
  implicit class NodeAccessorOps[Self <: NodeAccessor[_], Node] (val x: Self with NodeAccessor[Node]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetBounds(value: Node => Rectangle): Self = this.set("getBounds", js.Any.fromFunction1(value))
    @scala.inline
    def setGetChildren(value: Node => js.Array[Double]): Self = this.set("getChildren", js.Any.fromFunction1(value))
  }
  
}

