package typings.wordpressComponents.draggableMod.Draggable

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.OnDraggableEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * The HTML id of the element to clone on drag.
    */
  var elementId: String
  /**
    * A function to be called when dragging ends.
    */
  var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A function to be called when dragging starts.
    */
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Arbitrary data object attached to the drag and drop event.
    */
  var transferData: js.Any
  /**
    * Render prop providing `onDragStart` and `onDragEnd` for the
    * draggable element.
    */
  def children(props: OnDraggableEnd): ReactNode
}

object Props {
  @scala.inline
  def apply(
    children: OnDraggableEnd => ReactNode,
    elementId: String,
    transferData: js.Any,
    onDragEnd: () => Unit = null,
    onDragStart: () => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), elementId = elementId.asInstanceOf[js.Any], transferData = transferData.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction0(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    __obj.asInstanceOf[Props]
  }
}

