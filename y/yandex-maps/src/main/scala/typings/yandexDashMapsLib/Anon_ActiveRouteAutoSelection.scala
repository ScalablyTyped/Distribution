package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveRouteAutoSelection
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var activeRouteAutoSelection: js.UndefOr[scala.Boolean] = js.undefined
  var boundsAutoApply: js.UndefOr[scala.Boolean] = js.undefined
  var dragUpdateInterval: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var preventDragUpdate: js.UndefOr[scala.Boolean] = js.undefined
  var useMapMargin: js.UndefOr[scala.Boolean] = js.undefined
  var zoomMargin: js.UndefOr[(js.Array[js.Array[scala.Double] | scala.Double]) | scala.Double] = js.undefined
}

object Anon_ActiveRouteAutoSelection {
  @scala.inline
  def apply(
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activeRouteAutoSelection: js.UndefOr[scala.Boolean] = js.undefined,
    boundsAutoApply: js.UndefOr[scala.Boolean] = js.undefined,
    dragUpdateInterval: java.lang.String | scala.Double = null,
    preventDragUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    useMapMargin: js.UndefOr[scala.Boolean] = js.undefined,
    zoomMargin: (js.Array[js.Array[scala.Double] | scala.Double]) | scala.Double = null
  ): Anon_ActiveRouteAutoSelection = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(activeRouteAutoSelection)) __obj.updateDynamic("activeRouteAutoSelection")(activeRouteAutoSelection)
    if (!js.isUndefined(boundsAutoApply)) __obj.updateDynamic("boundsAutoApply")(boundsAutoApply)
    if (dragUpdateInterval != null) __obj.updateDynamic("dragUpdateInterval")(dragUpdateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDragUpdate)) __obj.updateDynamic("preventDragUpdate")(preventDragUpdate)
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin)
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveRouteAutoSelection]
  }
}

