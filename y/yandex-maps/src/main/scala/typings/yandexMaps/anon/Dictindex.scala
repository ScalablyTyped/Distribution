package typings.yandexMaps.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictindex
  extends /* index */ StringDictionary[js.Any] {
  var activeRouteAutoSelection: js.UndefOr[Boolean] = js.undefined
  var boundsAutoApply: js.UndefOr[Boolean] = js.undefined
  var dragUpdateInterval: js.UndefOr[String | Double] = js.undefined
  var preventDragUpdate: js.UndefOr[Boolean] = js.undefined
  var useMapMargin: js.UndefOr[Boolean] = js.undefined
  var zoomMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
}

object Dictindex {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    activeRouteAutoSelection: js.UndefOr[Boolean] = js.undefined,
    boundsAutoApply: js.UndefOr[Boolean] = js.undefined,
    dragUpdateInterval: String | Double = null,
    preventDragUpdate: js.UndefOr[Boolean] = js.undefined,
    useMapMargin: js.UndefOr[Boolean] = js.undefined,
    zoomMargin: (js.Array[js.Array[Double] | Double]) | Double = null
  ): Dictindex = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(activeRouteAutoSelection)) __obj.updateDynamic("activeRouteAutoSelection")(activeRouteAutoSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boundsAutoApply)) __obj.updateDynamic("boundsAutoApply")(boundsAutoApply.get.asInstanceOf[js.Any])
    if (dragUpdateInterval != null) __obj.updateDynamic("dragUpdateInterval")(dragUpdateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDragUpdate)) __obj.updateDynamic("preventDragUpdate")(preventDragUpdate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin.get.asInstanceOf[js.Any])
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex]
  }
}

