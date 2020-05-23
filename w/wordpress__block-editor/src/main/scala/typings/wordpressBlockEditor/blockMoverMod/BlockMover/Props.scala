package typings.wordpressBlockEditor.blockMoverMod.BlockMover

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var blockElementId: js.UndefOr[String] = js.undefined
  var clientIds: js.Array[String]
  var instanceId: js.UndefOr[String] = js.undefined
  var isDraggable: js.UndefOr[Boolean] = js.undefined
  var isHidden: js.UndefOr[Boolean] = js.undefined
  var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    clientIds: js.Array[String],
    blockElementId: String = null,
    instanceId: String = null,
    isDraggable: js.UndefOr[Boolean] = js.undefined,
    isHidden: js.UndefOr[Boolean] = js.undefined,
    onDragEnd: () => Unit = null,
    onDragStart: () => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal(clientIds = clientIds.asInstanceOf[js.Any])
    if (blockElementId != null) __obj.updateDynamic("blockElementId")(blockElementId.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden.get.asInstanceOf[js.Any])
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction0(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    __obj.asInstanceOf[Props]
  }
}

