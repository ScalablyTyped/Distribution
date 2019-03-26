package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverEvents extends NativeObjectEvents {
  /**
    * Fired when the [*anchor*](#anchor) property has changed.
    * @param value The new value of [*anchor*](#anchor).
    */
  var anchorChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Popover, Widget], scala.Unit]] = js.undefined
  /**
    * Fired when the `Popover` was closed.
    */
  var close: js.UndefOr[js.Function1[/* event */ EventObject[Popover], scala.Unit]] = js.undefined
  /**
    * Fired when the [*height*](#height) property has changed.
    * @param value The new value of [*height*](#height).
    */
  var heightChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Popover, tabrisLib.dimension], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*width*](#width) property has changed.
    * @param value The new value of [*width*](#width).
    */
  var widthChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Popover, tabrisLib.dimension], scala.Unit]
  ] = js.undefined
}

object PopoverEvents {
  @scala.inline
  def apply(
    anchorChanged: /* event */ PropertyChangedEvent[Popover, Widget] => scala.Unit = null,
    close: /* event */ EventObject[Popover] => scala.Unit = null,
    heightChanged: /* event */ PropertyChangedEvent[Popover, tabrisLib.dimension] => scala.Unit = null,
    widthChanged: /* event */ PropertyChangedEvent[Popover, tabrisLib.dimension] => scala.Unit = null
  ): PopoverEvents = {
    val __obj = js.Dynamic.literal()
    if (anchorChanged != null) __obj.updateDynamic("anchorChanged")(js.Any.fromFunction1(anchorChanged))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (heightChanged != null) __obj.updateDynamic("heightChanged")(js.Any.fromFunction1(heightChanged))
    if (widthChanged != null) __obj.updateDynamic("widthChanged")(js.Any.fromFunction1(widthChanged))
    __obj.asInstanceOf[PopoverEvents]
  }
}

