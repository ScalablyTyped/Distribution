package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetEvents extends NativeObjectEvents {
  /**
    * Fired when the [*background*](#background) property has changed.
    * @param value The new value of [*background*](#background).
    */
  var backgroundChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*backgroundImage*](#backgroundImage) property has changed.
    * @param value The new value of [*backgroundImage*](#backgroundImage).
    */
  var backgroundImageChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.Image], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*baseline*](#baseline) property has changed.
    * @param value The new value of [*baseline*](#baseline).
    */
  var baselineChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, Widget | tabrisLib.Selector], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*bottom*](#bottom) property has changed.
    * @param value The new value of [*bottom*](#bottom).
    */
  var bottomChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.margin], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*bounds*](#bounds) property has changed.
    * @param value The new value of [*bounds*](#bounds).
    */
  var boundsChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Widget, Bounds], scala.Unit]] = js.undefined
  /**
    * Fired when the [*centerX*](#centerX) property has changed.
    * @param value The new value of [*centerX*](#centerX).
    */
  var centerXChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.offset], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*centerY*](#centerY) property has changed.
    * @param value The new value of [*centerY*](#centerY).
    */
  var centerYChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.offset], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*class*](#class) property has changed.
    * @param value The new value of [*class*](#class).
    */
  var classChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*classList*](#classList) property has changed.
    * @param value The new value of [*classList*](#classList).
    */
  var classListChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, js.Array[java.lang.String]], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*cornerRadius*](#cornerRadius) property has changed.
    * @param value The new value of [*cornerRadius*](#cornerRadius).
    */
  var cornerRadiusChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Widget, scala.Double], scala.Unit]] = js.undefined
  /**
    * Fired when the [*data*](#data) property has changed.
    * @param value The new value of [*data*](#data).
    */
  var dataChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Widget, js.Object], scala.Unit]] = js.undefined
  /**
    * Fired when the widget is about to be disposed. At this point the widget and its children are still
    * accessible.
    */
  var dispose: js.UndefOr[js.Function1[/* event */ EventObject[Widget], scala.Unit]] = js.undefined
  /**
    * Fired when the [*elevation*](#elevation) property has changed.
    * @param value The new value of [*elevation*](#elevation).
    */
  var elevationChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Widget, scala.Double], scala.Unit]] = js.undefined
  /**
    * Fired when the [*enabled*](#enabled) property has changed.
    * @param value The new value of [*enabled*](#enabled).
    */
  var enabledChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*font*](#font) property has changed.
    * @param value The new value of [*font*](#font).
    */
  var fontChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.Font], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*height*](#height) property has changed.
    * @param value The new value of [*height*](#height).
    */
  var heightChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.dimension], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*highlightOnTouch*](#highlightOnTouch) property has changed.
    * @param value The new value of [*highlightOnTouch*](#highlightOnTouch).
    */
  var highlightOnTouchChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*id*](#id) property has changed.
    * @param value The new value of [*id*](#id).
    */
  var idChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*layoutData*](#layoutData) property has changed.
    * @param value The new value of [*layoutData*](#layoutData).
    */
  var layoutDataChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Widget, LayoutData], scala.Unit]] = js.undefined
  /**
    * Fired when the [*left*](#left) property has changed.
    * @param value The new value of [*left*](#left).
    */
  var leftChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.margin], scala.Unit]
  ] = js.undefined
  /**
    * Fired after pressing a widget for a specific amount of time (about a second), and again on lifting
    * the finger.
    */
  var longpress: js.UndefOr[js.Function1[/* event */ WidgetLongpressEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*opacity*](#opacity) property has changed.
    * @param value The new value of [*opacity*](#opacity).
    */
  var opacityChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[Widget, scala.Double], scala.Unit]] = js.undefined
  /**
    * Fired continuously after a finger touching the widget moved for a certain distance.
    */
  var pan: js.UndefOr[js.Function1[/* event */ WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving down.
    */
  var panDown: js.UndefOr[js.Function1[/* event */ WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving left or right.
    */
  var panHorizontal: js.UndefOr[js.Function1[/* event */ WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving left.
    */
  var panLeft: js.UndefOr[js.Function1[/* event */ WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving right.
    */
  var panRight: js.UndefOr[js.Function1[/* event */ WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving up.
    */
  var panUp: js.UndefOr[js.Function1[/* event */ WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger starts moving up or down.
    */
  var panVertical: js.UndefOr[js.Function1[/* event */ WidgetPanEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the widget's size has changed. You can use this event to apply new
    * [*layoutData*](#layoutdata).
    */
  var resize: js.UndefOr[js.Function1[/* event */ WidgetResizeEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*right*](#right) property has changed.
    * @param value The new value of [*right*](#right).
    */
  var rightChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.margin], scala.Unit]
  ] = js.undefined
  /**
    * Fired when a finger moves down quickly.
    */
  var swipeDown: js.UndefOr[js.Function1[/* event */ WidgetSwipeEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger moves left quickly.
    */
  var swipeLeft: js.UndefOr[js.Function1[/* event */ WidgetSwipeEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger moves right quickly.
    */
  var swipeRight: js.UndefOr[js.Function1[/* event */ WidgetSwipeEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a finger moves up quickly.
    */
  var swipeUp: js.UndefOr[js.Function1[/* event */ WidgetSwipeEvent, scala.Unit]] = js.undefined
  /**
    * Fired once when a finger briefly touched the widget.
    */
  var tap: js.UndefOr[js.Function1[/* event */ WidgetTapEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*top*](#top) property has changed.
    * @param value The new value of [*top*](#top).
    */
  var topChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.margin], scala.Unit]
  ] = js.undefined
  /**
    * Fired instead of touchEnd when the touch ends on another widget than it started on.
    */
  var touchCancel: js.UndefOr[js.Function1[/* event */ WidgetTouchEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a touch ends on the same widget than it started on.
    */
  var touchEnd: js.UndefOr[js.Function1[/* event */ WidgetTouchEvent, scala.Unit]] = js.undefined
  /**
    * Fired repeatedly while swiping across the screen.
    */
  var touchMove: js.UndefOr[js.Function1[/* event */ WidgetTouchEvent, scala.Unit]] = js.undefined
  /**
    * Fired when a widget is touched. See [Touch Events](../touch.md).
    */
  var touchStart: js.UndefOr[js.Function1[/* event */ WidgetTouchEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*transform*](#transform) property has changed.
    * @param value The new value of [*transform*](#transform).
    */
  var transformChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, Transformation], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*visible*](#visible) property has changed.
    * @param value The new value of [*visible*](#visible).
    */
  var visibleChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*width*](#width) property has changed.
    * @param value The new value of [*width*](#width).
    */
  var widthChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, tabrisLib.dimension], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*win_theme*](#win_theme) property has changed.
    * @param value The new value of [*win_theme*](#win_theme).
    */
  var win_themeChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Widget, java.lang.String], scala.Unit]
  ] = js.undefined
}

object WidgetEvents {
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
    layoutDataChanged: /* event */ PropertyChangedEvent[Widget, LayoutData] => scala.Unit = null,
    leftChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    longpress: /* event */ WidgetLongpressEvent => scala.Unit = null,
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
    swipeDown: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeLeft: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeRight: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeUp: /* event */ WidgetSwipeEvent => scala.Unit = null,
    tap: /* event */ WidgetTapEvent => scala.Unit = null,
    topChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    touchCancel: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchEnd: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchMove: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchStart: /* event */ WidgetTouchEvent => scala.Unit = null,
    transformChanged: /* event */ PropertyChangedEvent[Widget, Transformation] => scala.Unit = null,
    visibleChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    widthChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.dimension] => scala.Unit = null,
    win_themeChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null
  ): WidgetEvents = {
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
    if (layoutDataChanged != null) __obj.updateDynamic("layoutDataChanged")(js.Any.fromFunction1(layoutDataChanged))
    if (leftChanged != null) __obj.updateDynamic("leftChanged")(js.Any.fromFunction1(leftChanged))
    if (longpress != null) __obj.updateDynamic("longpress")(js.Any.fromFunction1(longpress))
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
    if (swipeDown != null) __obj.updateDynamic("swipeDown")(js.Any.fromFunction1(swipeDown))
    if (swipeLeft != null) __obj.updateDynamic("swipeLeft")(js.Any.fromFunction1(swipeLeft))
    if (swipeRight != null) __obj.updateDynamic("swipeRight")(js.Any.fromFunction1(swipeRight))
    if (swipeUp != null) __obj.updateDynamic("swipeUp")(js.Any.fromFunction1(swipeUp))
    if (tap != null) __obj.updateDynamic("tap")(js.Any.fromFunction1(tap))
    if (topChanged != null) __obj.updateDynamic("topChanged")(js.Any.fromFunction1(topChanged))
    if (touchCancel != null) __obj.updateDynamic("touchCancel")(js.Any.fromFunction1(touchCancel))
    if (touchEnd != null) __obj.updateDynamic("touchEnd")(js.Any.fromFunction1(touchEnd))
    if (touchMove != null) __obj.updateDynamic("touchMove")(js.Any.fromFunction1(touchMove))
    if (touchStart != null) __obj.updateDynamic("touchStart")(js.Any.fromFunction1(touchStart))
    if (transformChanged != null) __obj.updateDynamic("transformChanged")(js.Any.fromFunction1(transformChanged))
    if (visibleChanged != null) __obj.updateDynamic("visibleChanged")(js.Any.fromFunction1(visibleChanged))
    if (widthChanged != null) __obj.updateDynamic("widthChanged")(js.Any.fromFunction1(widthChanged))
    if (win_themeChanged != null) __obj.updateDynamic("win_themeChanged")(js.Any.fromFunction1(win_themeChanged))
    __obj.asInstanceOf[WidgetEvents]
  }
}

