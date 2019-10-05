package typings.viewerjs.viewerjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options
  * @see {@link https://github.com/fengyuanchen/viewerjs#options}
  */
trait ViewerOption extends js.Object {
  /**
    * Show the button on the top-right of the viewer.
    * @default true
    */
  var button: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable to request full screen when play.
    * @default true
    * @description Requires the browser supports
    * @see {@link http://caniuse.com/fullscreen}
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /**
    * A shortcut of the `hidden` event.
    * @default null
    */
  var hidden: js.UndefOr[ViewerMethod | Null] = js.undefined
  /**
    * A shortcut of the `hide` event.
    * @default null
    */
  var hide: js.UndefOr[ViewerMethod | Null] = js.undefined
  /**
    * Enable inline mode.
    * @default false
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /**
    * Define interval of each image when playing.
    * @default 5000
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Enable keyboard support.
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /**
    * Define the max ratio of the image when zoom in.
    * @default 100
    */
  var maxZoomRatio: js.UndefOr[Double] = js.undefined
  /**
    * Define the minimum height of the viewer.
    * @default 100
    * @description Only available in inline mode (set the `inline` option to `true`).
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    * Define the minimum width of the viewer.
    * @default 200
    * @description Only available in inline mode (set the `inline` option to `true`).
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    * Define the min ratio of the image when zoom out.
    * @default 0.01
    */
  var minZoomRatio: js.UndefOr[Double] = js.undefined
  /**
    * Enable to move the image.
    * @default true
    */
  var movable: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the visibility of the navbar.
    * - `0` or `false`: hide the navbar
    * - `1` or `true`: show the navbar
    * - `2`: show the navbar only when screen width great then 768 pixels
    * - `3`: show the navbar only when screen width great then 992 pixels
    * - `4`: show the navbar only when screen width great then 1200 pixels
    * @default true
    */
  var navbar: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * A shortcut of the `ready` event.
    * @default null
    */
  var ready: js.UndefOr[ViewerMethod | Null] = js.undefined
  /**
    * Enable to rotate the image.
    * @default true
    */
  var rotatable: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable to scale the image.
    * @default true
    */
  var scalable: js.UndefOr[Boolean] = js.undefined
  /**
    * A shortcut of the `show` event.
    * @default null
    */
  var show: js.UndefOr[ViewerMethod | Null] = js.undefined
  /**
    * A shortcut of the `shown` event.
    * @default null
    */
  var shown: js.UndefOr[ViewerMethod | Null] = js.undefined
  /**
    * Specify the visibility of the title (the current image's name and dimensions).
    * `0` or `false`: hide the title
    * `1` or `true`: show the title
    * `2`: show the title only when screen width great then 768 pixels
    * `3`: show the title only when screen width great then 992 pixels
    * `4`: show the title only when screen width great then 1200 pixels
    * @default true
    * @description The name comes from the `alt` attribute of an image element or the image name parsed from URL.
    */
  var title: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Specify the visibility of the toolbar.
    * - `0` or `false`: hide the toolbar
    * - `1` or `true`: show the toolbar
    * - `2`: show the toolbar only when screen width great then 768 pixels
    * - `3`: show the toolbar only when screen width great then 992 pixels
    * - `4`: show the toolbar only when screen width great then 1200 pixels
    * @default true
    */
  var toolbar: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Show the tooltip with image ratio (percentage) when zoom in or zoom out
    * @default true
    */
  var tooltip: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable CSS3 Transition for some special elements.
    * @default true
    */
  var transition: js.UndefOr[Boolean] = js.undefined
  /**
    * Define where to get the original image URL for viewing.
    * @default 'src'
    * @description If it is a string, it should be one of the attributes of each image element.
    * @description If it is a function, it will be called on each image and should return a valid image URL.
    */
  var url: js.UndefOr[String | ImageSourceDelegate] = js.undefined
  /**
    * A shortcut of the `view` event.
    * @default null
    */
  var view: js.UndefOr[ViewerMethod | Null] = js.undefined
  /**
    * A shortcut of the `viewed` event.
    * @default null
    */
  var viewed: js.UndefOr[ViewerMethod | Null] = js.undefined
  /**
    * Define the CSS `z-index` value of viewer in modal mode.
    * @default 2015
    */
  var zIndex: js.UndefOr[Double] = js.undefined
  /**
    * Define the CSS `z-index` value of viewer in inline mode.
    * @default 0
    */
  var zIndexInline: js.UndefOr[Double] = js.undefined
  /**
    * Define the ratio when zoom the image by wheeling mouse.
    * @default 0.1
    */
  var zoomRatio: js.UndefOr[Double] = js.undefined
  /**
    * Enable to zoom the image.
    * @default true
    */
  var zoomable: js.UndefOr[Boolean] = js.undefined
}

object ViewerOption {
  @scala.inline
  def apply(
    button: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    hidden: () => Unit = null,
    hide: () => Unit = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    interval: Int | Double = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    maxZoomRatio: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    minZoomRatio: Int | Double = null,
    movable: js.UndefOr[Boolean] = js.undefined,
    navbar: Boolean | Double = null,
    ready: () => Unit = null,
    rotatable: js.UndefOr[Boolean] = js.undefined,
    scalable: js.UndefOr[Boolean] = js.undefined,
    show: () => Unit = null,
    shown: () => Unit = null,
    title: Boolean | Double = null,
    toolbar: Boolean | Double = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    transition: js.UndefOr[Boolean] = js.undefined,
    url: String | ImageSourceDelegate = null,
    view: () => Unit = null,
    viewed: () => Unit = null,
    zIndex: Int | Double = null,
    zIndexInline: Int | Double = null,
    zoomRatio: Int | Double = null,
    zoomable: js.UndefOr[Boolean] = js.undefined
  ): ViewerOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (hidden != null) __obj.updateDynamic("hidden")(js.Any.fromFunction0(hidden))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (maxZoomRatio != null) __obj.updateDynamic("maxZoomRatio")(maxZoomRatio.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (minZoomRatio != null) __obj.updateDynamic("minZoomRatio")(minZoomRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable)
    if (navbar != null) __obj.updateDynamic("navbar")(navbar.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable)
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable)
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction0(shown))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(js.Any.fromFunction0(view))
    if (viewed != null) __obj.updateDynamic("viewed")(js.Any.fromFunction0(viewed))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zIndexInline != null) __obj.updateDynamic("zIndexInline")(zIndexInline.asInstanceOf[js.Any])
    if (zoomRatio != null) __obj.updateDynamic("zoomRatio")(zoomRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable)
    __obj.asInstanceOf[ViewerOption]
  }
}

