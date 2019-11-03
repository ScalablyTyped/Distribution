package typings.viewerjs.Viewer

import typings.std.CustomEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var backdrop: js.UndefOr[Boolean | String] = js.undefined
  var button: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String | Element] = js.undefined
  var filter: js.UndefOr[js.Function] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var hidden: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var hide: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var initialViewIndex: js.UndefOr[Double] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var maxZoomRatio: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var minZoomRatio: js.UndefOr[Double] = js.undefined
  var movable: js.UndefOr[Boolean] = js.undefined
  var navbar: js.UndefOr[Boolean | Visibility] = js.undefined
  var ready: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var rotatable: js.UndefOr[Boolean] = js.undefined
  var scalable: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var shown: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var title: js.UndefOr[Boolean | Visibility | js.Function | (js.Tuple2[Visibility, js.Function])] = js.undefined
  var toggleOnDblclick: js.UndefOr[Boolean] = js.undefined
  var toolbar: js.UndefOr[Boolean | Visibility | ToolbarOptions] = js.undefined
  var tooltip: js.UndefOr[Boolean] = js.undefined
  var transition: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String | js.Function] = js.undefined
  var view: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var viewed: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zIndexInline: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  var zoomRatio: js.UndefOr[Double] = js.undefined
  var zoomable: js.UndefOr[Boolean] = js.undefined
  var zoomed: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    backdrop: Boolean | String = null,
    button: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    container: String | Element = null,
    filter: js.Function = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    hidden: /* event */ CustomEvent[_] => Unit = null,
    hide: /* event */ CustomEvent[_] => Unit = null,
    initialViewIndex: Int | Double = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    interval: Int | Double = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    maxZoomRatio: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    minZoomRatio: Int | Double = null,
    movable: js.UndefOr[Boolean] = js.undefined,
    navbar: Boolean | Visibility = null,
    ready: /* event */ CustomEvent[_] => Unit = null,
    rotatable: js.UndefOr[Boolean] = js.undefined,
    scalable: js.UndefOr[Boolean] = js.undefined,
    show: /* event */ CustomEvent[_] => Unit = null,
    shown: /* event */ CustomEvent[_] => Unit = null,
    title: Boolean | Visibility | js.Function | (js.Tuple2[Visibility, js.Function]) = null,
    toggleOnDblclick: js.UndefOr[Boolean] = js.undefined,
    toolbar: Boolean | Visibility | ToolbarOptions = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    transition: js.UndefOr[Boolean] = js.undefined,
    url: String | js.Function = null,
    view: /* event */ CustomEvent[_] => Unit = null,
    viewed: /* event */ CustomEvent[_] => Unit = null,
    zIndex: Int | Double = null,
    zIndexInline: Int | Double = null,
    zoom: /* event */ CustomEvent[_] => Unit = null,
    zoomRatio: Int | Double = null,
    zoomable: js.UndefOr[Boolean] = js.undefined,
    zoomed: /* event */ CustomEvent[_] => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (hidden != null) __obj.updateDynamic("hidden")(js.Any.fromFunction1(hidden))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (initialViewIndex != null) __obj.updateDynamic("initialViewIndex")(initialViewIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (maxZoomRatio != null) __obj.updateDynamic("maxZoomRatio")(maxZoomRatio.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (minZoomRatio != null) __obj.updateDynamic("minZoomRatio")(minZoomRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable)
    if (navbar != null) __obj.updateDynamic("navbar")(navbar.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable)
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable)
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1(shown))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleOnDblclick)) __obj.updateDynamic("toggleOnDblclick")(toggleOnDblclick)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(js.Any.fromFunction1(view))
    if (viewed != null) __obj.updateDynamic("viewed")(js.Any.fromFunction1(viewed))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zIndexInline != null) __obj.updateDynamic("zIndexInline")(zIndexInline.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (zoomRatio != null) __obj.updateDynamic("zoomRatio")(zoomRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable)
    if (zoomed != null) __obj.updateDynamic("zoomed")(js.Any.fromFunction1(zoomed))
    __obj.asInstanceOf[Options]
  }
}

