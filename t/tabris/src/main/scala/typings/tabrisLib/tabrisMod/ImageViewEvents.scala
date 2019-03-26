package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageViewEvents extends WidgetEvents {
  /**
    * Fired when the [*image*](#image) property has changed.
    * @param value The new value of [*image*](#image).
    */
  var imageChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[ImageView, tabrisLib.Image], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the image loading has finished.
    */
  var load: js.UndefOr[js.Function1[/* event */ ImageViewLoadEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*maxZoomLevel*](#maxZoomLevel) property has changed.
    * @param value The new value of [*maxZoomLevel*](#maxZoomLevel).
    */
  var maxZoomLevelChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[ImageView, scala.Double], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*minZoomLevel*](#minZoomLevel) property has changed.
    * @param value The new value of [*minZoomLevel*](#minZoomLevel).
    */
  var minZoomLevelChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[ImageView, scala.Double], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*scaleMode*](#scaleMode) property has changed.
    * @param value The new value of [*scaleMode*](#scaleMode).
    */
  var scaleModeChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[ImageView, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*tintColor*](#tintColor) property has changed.
    * @param value The new value of [*tintColor*](#tintColor).
    */
  var tintColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[ImageView, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the user zooms the image in or out. The `zoom` event indicates a change to the `zoomLevel`
    * property.
    */
  var zoom: js.UndefOr[js.Function1[/* event */ ImageViewZoomEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*zoomEnabled*](#zoomEnabled) property has changed.
    * @param value The new value of [*zoomEnabled*](#zoomEnabled).
    */
  var zoomEnabledChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[ImageView, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*zoomLevel*](#zoomLevel) property has changed.
    * @param value The new value of [*zoomLevel*](#zoomLevel).
    */
  var zoomLevelChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[ImageView, scala.Double], scala.Unit]
  ] = js.undefined
}

object ImageViewEvents {
  @scala.inline
  def apply(
    backgroundChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.Color] => scala.Unit = null,
    backgroundImageChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.Image] => scala.Unit = null,
    baselineChanged: /* event */ PropertyChangedEvent[Widget, Widget | tabrisLib.Selector] => scala.Unit = null,
    bottomChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    boundsChanged: /* event */ PropertyChangedEvent[Widget, Bounds] => scala.Unit = null,
    centerXChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.offset] => scala.Unit = null,
    centerYChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.offset] => scala.Unit = null,
    classChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null,
    classListChanged: /* event */ PropertyChangedEvent[Widget, js.Array[java.lang.String]] => scala.Unit = null,
    cornerRadiusChanged: /* event */ PropertyChangedEvent[Widget, scala.Double] => scala.Unit = null,
    dataChanged: /* event */ PropertyChangedEvent[Widget, js.Object] => scala.Unit = null,
    dispose: /* event */ EventObject[Widget] => scala.Unit = null,
    elevationChanged: /* event */ PropertyChangedEvent[Widget, scala.Double] => scala.Unit = null,
    enabledChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    fontChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.Font] => scala.Unit = null,
    heightChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.dimension] => scala.Unit = null,
    highlightOnTouchChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    idChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null,
    imageChanged: /* event */ PropertyChangedEvent[ImageView, tabrisLib.Image] => scala.Unit = null,
    layoutDataChanged: /* event */ PropertyChangedEvent[Widget, LayoutData] => scala.Unit = null,
    leftChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    load: /* event */ ImageViewLoadEvent => scala.Unit = null,
    longpress: /* event */ WidgetLongpressEvent => scala.Unit = null,
    maxZoomLevelChanged: /* event */ PropertyChangedEvent[ImageView, scala.Double] => scala.Unit = null,
    minZoomLevelChanged: /* event */ PropertyChangedEvent[ImageView, scala.Double] => scala.Unit = null,
    opacityChanged: /* event */ PropertyChangedEvent[Widget, scala.Double] => scala.Unit = null,
    pan: /* event */ WidgetPanEvent => scala.Unit = null,
    panDown: /* event */ WidgetPanEvent => scala.Unit = null,
    panHorizontal: /* event */ WidgetPanEvent => scala.Unit = null,
    panLeft: /* event */ WidgetPanEvent => scala.Unit = null,
    panRight: /* event */ WidgetPanEvent => scala.Unit = null,
    panUp: /* event */ WidgetPanEvent => scala.Unit = null,
    panVertical: /* event */ WidgetPanEvent => scala.Unit = null,
    resize: /* event */ WidgetResizeEvent => scala.Unit = null,
    rightChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    scaleModeChanged: /* event */ PropertyChangedEvent[ImageView, java.lang.String] => scala.Unit = null,
    swipeDown: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeLeft: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeRight: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeUp: /* event */ WidgetSwipeEvent => scala.Unit = null,
    tap: /* event */ WidgetTapEvent => scala.Unit = null,
    tintColorChanged: /* event */ PropertyChangedEvent[ImageView, tabrisLib.Color] => scala.Unit = null,
    topChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    touchCancel: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchEnd: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchMove: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchStart: /* event */ WidgetTouchEvent => scala.Unit = null,
    transformChanged: /* event */ PropertyChangedEvent[Widget, Transformation] => scala.Unit = null,
    visibleChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    widthChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.dimension] => scala.Unit = null,
    win_themeChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null,
    zoom: /* event */ ImageViewZoomEvent => scala.Unit = null,
    zoomEnabledChanged: /* event */ PropertyChangedEvent[ImageView, scala.Boolean] => scala.Unit = null,
    zoomLevelChanged: /* event */ PropertyChangedEvent[ImageView, scala.Double] => scala.Unit = null
  ): ImageViewEvents = {
    val __obj = js.Dynamic.literal()
    if (backgroundChanged != null) __obj.updateDynamic("backgroundChanged")(js.Any.fromFunction1(backgroundChanged))
    if (backgroundImageChanged != null) __obj.updateDynamic("backgroundImageChanged")(js.Any.fromFunction1(backgroundImageChanged))
    if (baselineChanged != null) __obj.updateDynamic("baselineChanged")(js.Any.fromFunction1(baselineChanged))
    if (bottomChanged != null) __obj.updateDynamic("bottomChanged")(js.Any.fromFunction1(bottomChanged))
    if (boundsChanged != null) __obj.updateDynamic("boundsChanged")(js.Any.fromFunction1(boundsChanged))
    if (centerXChanged != null) __obj.updateDynamic("centerXChanged")(js.Any.fromFunction1(centerXChanged))
    if (centerYChanged != null) __obj.updateDynamic("centerYChanged")(js.Any.fromFunction1(centerYChanged))
    if (classChanged != null) __obj.updateDynamic("classChanged")(js.Any.fromFunction1(classChanged))
    if (classListChanged != null) __obj.updateDynamic("classListChanged")(js.Any.fromFunction1(classListChanged))
    if (cornerRadiusChanged != null) __obj.updateDynamic("cornerRadiusChanged")(js.Any.fromFunction1(cornerRadiusChanged))
    if (dataChanged != null) __obj.updateDynamic("dataChanged")(js.Any.fromFunction1(dataChanged))
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction1(dispose))
    if (elevationChanged != null) __obj.updateDynamic("elevationChanged")(js.Any.fromFunction1(elevationChanged))
    if (enabledChanged != null) __obj.updateDynamic("enabledChanged")(js.Any.fromFunction1(enabledChanged))
    if (fontChanged != null) __obj.updateDynamic("fontChanged")(js.Any.fromFunction1(fontChanged))
    if (heightChanged != null) __obj.updateDynamic("heightChanged")(js.Any.fromFunction1(heightChanged))
    if (highlightOnTouchChanged != null) __obj.updateDynamic("highlightOnTouchChanged")(js.Any.fromFunction1(highlightOnTouchChanged))
    if (idChanged != null) __obj.updateDynamic("idChanged")(js.Any.fromFunction1(idChanged))
    if (imageChanged != null) __obj.updateDynamic("imageChanged")(js.Any.fromFunction1(imageChanged))
    if (layoutDataChanged != null) __obj.updateDynamic("layoutDataChanged")(js.Any.fromFunction1(layoutDataChanged))
    if (leftChanged != null) __obj.updateDynamic("leftChanged")(js.Any.fromFunction1(leftChanged))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (longpress != null) __obj.updateDynamic("longpress")(js.Any.fromFunction1(longpress))
    if (maxZoomLevelChanged != null) __obj.updateDynamic("maxZoomLevelChanged")(js.Any.fromFunction1(maxZoomLevelChanged))
    if (minZoomLevelChanged != null) __obj.updateDynamic("minZoomLevelChanged")(js.Any.fromFunction1(minZoomLevelChanged))
    if (opacityChanged != null) __obj.updateDynamic("opacityChanged")(js.Any.fromFunction1(opacityChanged))
    if (pan != null) __obj.updateDynamic("pan")(js.Any.fromFunction1(pan))
    if (panDown != null) __obj.updateDynamic("panDown")(js.Any.fromFunction1(panDown))
    if (panHorizontal != null) __obj.updateDynamic("panHorizontal")(js.Any.fromFunction1(panHorizontal))
    if (panLeft != null) __obj.updateDynamic("panLeft")(js.Any.fromFunction1(panLeft))
    if (panRight != null) __obj.updateDynamic("panRight")(js.Any.fromFunction1(panRight))
    if (panUp != null) __obj.updateDynamic("panUp")(js.Any.fromFunction1(panUp))
    if (panVertical != null) __obj.updateDynamic("panVertical")(js.Any.fromFunction1(panVertical))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (rightChanged != null) __obj.updateDynamic("rightChanged")(js.Any.fromFunction1(rightChanged))
    if (scaleModeChanged != null) __obj.updateDynamic("scaleModeChanged")(js.Any.fromFunction1(scaleModeChanged))
    if (swipeDown != null) __obj.updateDynamic("swipeDown")(js.Any.fromFunction1(swipeDown))
    if (swipeLeft != null) __obj.updateDynamic("swipeLeft")(js.Any.fromFunction1(swipeLeft))
    if (swipeRight != null) __obj.updateDynamic("swipeRight")(js.Any.fromFunction1(swipeRight))
    if (swipeUp != null) __obj.updateDynamic("swipeUp")(js.Any.fromFunction1(swipeUp))
    if (tap != null) __obj.updateDynamic("tap")(js.Any.fromFunction1(tap))
    if (tintColorChanged != null) __obj.updateDynamic("tintColorChanged")(js.Any.fromFunction1(tintColorChanged))
    if (topChanged != null) __obj.updateDynamic("topChanged")(js.Any.fromFunction1(topChanged))
    if (touchCancel != null) __obj.updateDynamic("touchCancel")(js.Any.fromFunction1(touchCancel))
    if (touchEnd != null) __obj.updateDynamic("touchEnd")(js.Any.fromFunction1(touchEnd))
    if (touchMove != null) __obj.updateDynamic("touchMove")(js.Any.fromFunction1(touchMove))
    if (touchStart != null) __obj.updateDynamic("touchStart")(js.Any.fromFunction1(touchStart))
    if (transformChanged != null) __obj.updateDynamic("transformChanged")(js.Any.fromFunction1(transformChanged))
    if (visibleChanged != null) __obj.updateDynamic("visibleChanged")(js.Any.fromFunction1(visibleChanged))
    if (widthChanged != null) __obj.updateDynamic("widthChanged")(js.Any.fromFunction1(widthChanged))
    if (win_themeChanged != null) __obj.updateDynamic("win_themeChanged")(js.Any.fromFunction1(win_themeChanged))
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (zoomEnabledChanged != null) __obj.updateDynamic("zoomEnabledChanged")(js.Any.fromFunction1(zoomEnabledChanged))
    if (zoomLevelChanged != null) __obj.updateDynamic("zoomLevelChanged")(js.Any.fromFunction1(zoomLevelChanged))
    __obj.asInstanceOf[ImageViewEvents]
  }
}

