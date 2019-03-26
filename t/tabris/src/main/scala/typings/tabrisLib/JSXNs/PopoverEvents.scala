package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverEvents extends NativeObjectEvents {
  /**
    * Fired when the [*anchor*](#anchor) property has changed.
    * @param value The new value of [*anchor*](#anchor).
    */
  var onAnchorChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Popover, tabrisLib.tabrisMod.Widget], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the `Popover` was closed.
    */
  var onClose: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.Popover], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*height*](#height) property has changed.
    * @param value The new value of [*height*](#height).
    */
  var onHeightChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Popover, tabrisLib.dimension], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*width*](#width) property has changed.
    * @param value The new value of [*width*](#width).
    */
  var onWidthChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Popover, tabrisLib.dimension], 
      scala.Unit
    ]
  ] = js.undefined
}

object PopoverEvents {
  @scala.inline
  def apply(
    onAnchorChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Popover, tabrisLib.tabrisMod.Widget] => scala.Unit = null,
    onClose: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.Popover] => scala.Unit = null,
    onHeightChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Popover, tabrisLib.dimension] => scala.Unit = null,
    onWidthChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Popover, tabrisLib.dimension] => scala.Unit = null
  ): PopoverEvents = {
    val __obj = js.Dynamic.literal()
    if (onAnchorChanged != null) __obj.updateDynamic("onAnchorChanged")(js.Any.fromFunction1(onAnchorChanged))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onHeightChanged != null) __obj.updateDynamic("onHeightChanged")(js.Any.fromFunction1(onHeightChanged))
    if (onWidthChanged != null) __obj.updateDynamic("onWidthChanged")(js.Any.fromFunction1(onWidthChanged))
    __obj.asInstanceOf[PopoverEvents]
  }
}

