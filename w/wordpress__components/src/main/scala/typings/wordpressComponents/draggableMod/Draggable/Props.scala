package typings.wordpressComponents.draggableMod.Draggable

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.OnDraggableEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * The HTML id of the element to clone on drag.
    */
  var elementId: String = js.native
  /**
    * A function to be called when dragging ends.
    */
  var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * A function to be called when dragging starts.
    */
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Arbitrary data object attached to the drag and drop event.
    */
  var transferData: js.Any = js.native
  /**
    * Render prop providing `onDragStart` and `onDragEnd` for the
    * draggable element.
    */
  def children(props: OnDraggableEnd): ReactNode = js.native
}

object Props {
  @scala.inline
  def apply(children: OnDraggableEnd => ReactNode, elementId: String, transferData: js.Any): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), elementId = elementId.asInstanceOf[js.Any], transferData = transferData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setChildren(value: OnDraggableEnd => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setElementId(value: String): Self = this.set("elementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransferData(value: js.Any): Self = this.set("transferData", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDragEnd(value: () => Unit): Self = this.set("onDragEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragStart(value: () => Unit): Self = this.set("onDragStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
  }
  
}

