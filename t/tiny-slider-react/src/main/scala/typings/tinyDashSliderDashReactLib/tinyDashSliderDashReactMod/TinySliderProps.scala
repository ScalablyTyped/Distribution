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

