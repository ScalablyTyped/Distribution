package typings.tinySliderReact.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinySliderProps extends js.Object {
  var onClick: js.UndefOr[
    js.Function3[/* slideClicked */ Double, /* info */ String, /* event */ Event_, Unit]
  ] = js.undefined
  var onIndexChanged: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, Unit]] = js.undefined
  var settings: js.UndefOr[TinySliderSettings] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
}

object TinySliderProps {
  @scala.inline
  def apply(
    onClick: (/* slideClicked */ Double, /* info */ String, /* event */ Event_) => Unit = null,
    onIndexChanged: /* info */ TinySliderInfo => Unit = null,
    onTouchEnd: /* info */ TinySliderInfo => Unit = null,
    onTouchMove: /* info */ TinySliderInfo => Unit = null,
    onTouchStart: /* info */ TinySliderInfo => Unit = null,
    onTransitionEnd: /* info */ TinySliderInfo => Unit = null,
    onTransitionStart: /* info */ TinySliderInfo => Unit = null,
    settings: TinySliderSettings = null,
    startIndex: Int | Double = null
  ): TinySliderProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    if (onIndexChanged != null) __obj.updateDynamic("onIndexChanged")(js.Any.fromFunction1(onIndexChanged))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction1(onTransitionStart))
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinySliderProps]
  }
}

