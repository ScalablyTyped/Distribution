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
      /* event */ reactLib.Event, 
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
    onClick: js.Function3[
      /* slideClicked */ scala.Double, 
      /* info */ java.lang.String, 
      /* event */ reactLib.Event, 
      scala.Unit
    ] = null,
    onIndexChanged: js.Function1[/* info */ TinySliderInfo, scala.Unit] = null,
    onTouchEnd: js.Function1[/* info */ TinySliderInfo, scala.Unit] = null,
    onTouchMove: js.Function1[/* info */ TinySliderInfo, scala.Unit] = null,
    onTouchStart: js.Function1[/* info */ TinySliderInfo, scala.Unit] = null,
    onTransitionEnd: js.Function1[/* info */ TinySliderInfo, scala.Unit] = null,
    onTransitionStart: js.Function1[/* info */ TinySliderInfo, scala.Unit] = null,
    settings: TinySliderSettings = null,
    startIndex: scala.Int | scala.Double = null
  ): TinySliderProps = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onIndexChanged != null) __obj.updateDynamic("onIndexChanged")(onIndexChanged)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(onTransitionEnd)
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(onTransitionStart)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinySliderProps]
  }
}

