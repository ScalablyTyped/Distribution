package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabFolderEvents extends CompositeEvents {
  /**
    * Fired when the [*paging*](#paging) property has changed.
    * @param value The new value of [*paging*](#paging).
    */
  var pagingChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TabFolder, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when `paging` is enabled and a tab is scrolled. The `event` parameter contains position
    * information relative to the currently selected `Tab`. Eg.: scrolling a 500px wide tab 10% to the left
    * sets `offset` to `50`. Scrolling 10% to the right sets `offset` to `-50`.
    */
  var scroll: js.UndefOr[js.Function1[/* event */ TabFolderScrollEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the user taps on a tab. The event also fires when the same tab is tapped multiple times.
    */
  var select: js.UndefOr[js.Function1[/* event */ TabFolderSelectEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*selection*](#selection) property has changed.
    * @param value The new value of [*selection*](#selection).
    */
  var selectionChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[TabFolder, Tab], scala.Unit]] = js.undefined
  /**
    * Fired when the [*textColor*](#textColor) property has changed.
    * @param value The new value of [*textColor*](#textColor).
    */
  var textColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TabFolder, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*win_tabBarTheme*](#win_tabBarTheme) property has changed.
    * @param value The new value of [*win_tabBarTheme*](#win_tabBarTheme).
    */
  var win_tabBarThemeChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TabFolder, java.lang.String], scala.Unit]
  ] = js.undefined
}

object TabFolderEvents {
  @scala.inline
  def apply(
    addChild: /* event */ CompositeAddChildEvent => scala.Unit = null,
    backgroundChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.Color] => scala.Unit = null,
    backgroundImageChanged: /* event */ PropertyChangedEvent[Widget, Image] => scala.Unit = null,
    baselineChanged: /* event */ PropertyChangedEvent[Widget, Widget | Selector] => scala.Unit = null,
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
    paddingChanged: /* event */ PropertyChangedEvent[Composite, BoxDimensions | scala.Double] => scala.Unit = null,
    pagingChanged: /* event */ PropertyChangedEvent[TabFolder, scala.Boolean] => scala.Unit = null,
    pan: /* event */ WidgetPanEvent => scala.Unit = null,
    panDown: /* event */ WidgetPanEvent => scala.Unit = null,
    panHorizontal: /* event */ WidgetPanEvent => scala.Unit = null,
    panLeft: /* event */ WidgetPanEvent => scala.Unit = null,
    panRight: /* event */ WidgetPanEvent => scala.Unit = null,
    panUp: /* event */ WidgetPanEvent => scala.Unit = null,
    panVertical: /* event */ WidgetPanEvent => scala.Unit = null,
    removeChild: /* event */ CompositeRemoveChildEvent => scala.Unit = null,
    resize: /* event */ WidgetResizeEvent => scala.Unit = null,
    rightChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    scroll: /* event */ TabFolderScrollEvent => scala.Unit = null,
    select: /* event */ TabFolderSelectEvent => scala.Unit = null,
    selectionChanged: /* event */ PropertyChangedEvent[TabFolder, Tab] => scala.Unit = null,
    swipeDown: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeLeft: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeRight: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeUp: /* event */ WidgetSwipeEvent => scala.Unit = null,
    tap: /* event */ WidgetTapEvent => scala.Unit = null,
    textColorChanged: /* event */ PropertyChangedEvent[TabFolder, tabrisLib.Color] => scala.Unit = null,
    topChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    touchCancel: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchEnd: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchMove: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchStart: /* event */ WidgetTouchEvent => scala.Unit = null,
    transformChanged: /* event */ PropertyChangedEvent[Widget, Transformation] => scala.Unit = null,
    visibleChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    widthChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.dimension] => scala.Unit = null,
    win_tabBarThemeChanged: /* event */ PropertyChangedEvent[TabFolder, java.lang.String] => scala.Unit = null,
    win_themeChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null
  ): TabFolderEvents = {
    val __obj = js.Dynamic.literal()
    if (addChild != null) __obj.updateDynamic("addChild")(js.Any.fromFunction1(addChild))
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
    if (paddingChanged != null) __obj.updateDynamic("paddingChanged")(js.Any.fromFunction1(paddingChanged))
    if (pagingChanged != null) __obj.updateDynamic("pagingChanged")(js.Any.fromFunction1(pagingChanged))
    if (pan != null) __obj.updateDynamic("pan")(js.Any.fromFunction1(pan))
    if (panDown != null) __obj.updateDynamic("panDown")(js.Any.fromFunction1(panDown))
    if (panHorizontal != null) __obj.updateDynamic("panHorizontal")(js.Any.fromFunction1(panHorizontal))
    if (panLeft != null) __obj.updateDynamic("panLeft")(js.Any.fromFunction1(panLeft))
    if (panRight != null) __obj.updateDynamic("panRight")(js.Any.fromFunction1(panRight))
    if (panUp != null) __obj.updateDynamic("panUp")(js.Any.fromFunction1(panUp))
    if (panVertical != null) __obj.updateDynamic("panVertical")(js.Any.fromFunction1(panVertical))
    if (removeChild != null) __obj.updateDynamic("removeChild")(js.Any.fromFunction1(removeChild))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (rightChanged != null) __obj.updateDynamic("rightChanged")(js.Any.fromFunction1(rightChanged))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1(scroll))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1(selectionChanged))
    if (swipeDown != null) __obj.updateDynamic("swipeDown")(js.Any.fromFunction1(swipeDown))
    if (swipeLeft != null) __obj.updateDynamic("swipeLeft")(js.Any.fromFunction1(swipeLeft))
    if (swipeRight != null) __obj.updateDynamic("swipeRight")(js.Any.fromFunction1(swipeRight))
    if (swipeUp != null) __obj.updateDynamic("swipeUp")(js.Any.fromFunction1(swipeUp))
    if (tap != null) __obj.updateDynamic("tap")(js.Any.fromFunction1(tap))
    if (textColorChanged != null) __obj.updateDynamic("textColorChanged")(js.Any.fromFunction1(textColorChanged))
    if (topChanged != null) __obj.updateDynamic("topChanged")(js.Any.fromFunction1(topChanged))
    if (touchCancel != null) __obj.updateDynamic("touchCancel")(js.Any.fromFunction1(touchCancel))
    if (touchEnd != null) __obj.updateDynamic("touchEnd")(js.Any.fromFunction1(touchEnd))
    if (touchMove != null) __obj.updateDynamic("touchMove")(js.Any.fromFunction1(touchMove))
    if (touchStart != null) __obj.updateDynamic("touchStart")(js.Any.fromFunction1(touchStart))
    if (transformChanged != null) __obj.updateDynamic("transformChanged")(js.Any.fromFunction1(transformChanged))
    if (visibleChanged != null) __obj.updateDynamic("visibleChanged")(js.Any.fromFunction1(visibleChanged))
    if (widthChanged != null) __obj.updateDynamic("widthChanged")(js.Any.fromFunction1(widthChanged))
    if (win_tabBarThemeChanged != null) __obj.updateDynamic("win_tabBarThemeChanged")(js.Any.fromFunction1(win_tabBarThemeChanged))
    if (win_themeChanged != null) __obj.updateDynamic("win_themeChanged")(js.Any.fromFunction1(win_themeChanged))
    __obj.asInstanceOf[TabFolderEvents]
  }
}

