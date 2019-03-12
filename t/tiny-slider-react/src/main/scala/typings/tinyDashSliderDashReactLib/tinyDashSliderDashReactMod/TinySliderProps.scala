package typings
package tinyDashSliderDashReactLib.tinyDashSliderDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TinySliderProps extends js.Object {
  var onClick: js.UndefOr[
    js.Function3[
      /* slideClicked */ scala.Double, 
      /* info */ java.lang.String, 
      /* event */ stdLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var onIndexChanged: js.UndefOr[js.Function1[/* info */ TinySliderInfo, scala.Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, scala.Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* info */ TinySliderInfo, scala.Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, scala.Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function1[/* info */ TinySliderInfo, scala.Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function1[/* info */ TinySliderInfo, scala.Unit]] = js.undefined
  var settings: js.UndefOr[TinySliderSettings] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
}

object TinySliderProps {
  @scala.inline
  def apply(
    onClick: (/* slideClicked */ scala.Double, /* info */ java.lang.String, /* event */ stdLib.Event) => scala.Unit = null,
    onIndexChanged: /* info */ TinySliderInfo => scala.Unit = null,
    onTouchEnd: /* info */ TinySliderInfo => scala.Unit = null,
    onTouchMove: /* info */ TinySliderInfo => scala.Unit = null,
    onTouchStart: /* info */ TinySliderInfo => scala.Unit = null,
    onTransitionEnd: /* info */ TinySliderInfo => scala.Unit = null,
    onTransitionStart: /* info */ TinySliderInfo => scala.Unit = null,
    settings: TinySliderSettings = null,
    startIndex: scala.Int | scala.Double = null
  ): TinySliderProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction3(onClick))
    if (onIndexChanged != null) __obj.updateDynamic("onIndexChanged")(js.Any.fromFunction1(onIndexChanged))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction1(onTransitionStart))
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinySliderProps]
  }
}

