package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationViewEvents extends CompositeEvents {
  /**
    * Fired when the [*actionColor*](#actionColor) property has changed.
    * @param value The new value of [*actionColor*](#actionColor).
    */
  var actionColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*actionTextColor*](#actionTextColor) property has changed.
    * @param value The new value of [*actionTextColor*](#actionTextColor).
    */
  var actionTextColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the height of the bottom toolbar changes, e.g. if it changes visibility.
    * @param value The new value of [*bottomToolbarHeight*](#bottomToolbarHeight).
    */
  var bottomToolbarHeightChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, scala.Double], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*drawerActionVisible*](#drawerActionVisible) property has changed.
    * @param value The new value of [*drawerActionVisible*](#drawerActionVisible).
    */
  var drawerActionVisibleChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*navigationAction*](#navigationAction) property has changed.
    * @param value The new value of [*navigationAction*](#navigationAction).
    */
  var navigationActionChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, Action], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*pageAnimation*](#pageAnimation) property has changed.
    * @param value The new value of [*pageAnimation*](#pageAnimation).
    */
  var pageAnimationChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*titleTextColor*](#titleTextColor) property has changed.
    * @param value The new value of [*titleTextColor*](#titleTextColor).
    */
  var titleTextColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*toolbarColor*](#toolbarColor) property has changed.
    * @param value The new value of [*toolbarColor*](#toolbarColor).
    */
  var toolbarColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*toolbarVisible*](#toolbarVisible) property has changed.
    * @param value The new value of [*toolbarVisible*](#toolbarVisible).
    */
  var toolbarVisibleChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the height of the top toolbar changes, e.g. if it changes visibility.
    * @param value The new value of [*topToolbarHeight*](#topToolbarHeight).
    */
  var topToolbarHeightChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, scala.Double], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*win_drawerActionBackground*](#win_drawerActionBackground) property has changed.
    * @param value The new value of [*win_drawerActionBackground*](#win_drawerActionBackground).
    */
  var win_drawerActionBackgroundChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*win_drawerActionTheme*](#win_drawerActionTheme) property has changed.
    * @param value The new value of [*win_drawerActionTheme*](#win_drawerActionTheme).
    */
  var win_drawerActionThemeChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*win_toolbarOverflowTheme*](#win_toolbarOverflowTheme) property has changed.
    * @param value The new value of [*win_toolbarOverflowTheme*](#win_toolbarOverflowTheme).
    */
  var win_toolbarOverflowThemeChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*win_toolbarTheme*](#win_toolbarTheme) property has changed.
    * @param value The new value of [*win_toolbarTheme*](#win_toolbarTheme).
    */
  var win_toolbarThemeChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[NavigationView, java.lang.String], scala.Unit]
  ] = js.undefined
}

object NavigationViewEvents {
  @scala.inline
  def apply(
    actionColorChanged: /* event */ PropertyChangedEvent[NavigationView, tabrisLib.Color] => scala.Unit = null,
    actionTextColorChanged: /* event */ PropertyChangedEvent[NavigationView, tabrisLib.Color] => scala.Unit = null,
    addChild: /* event */ CompositeAddChildEvent => scala.Unit = null,
    backgroundChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.Color] => scala.Unit = null,
    backgroundImageChanged: /* event */ PropertyChangedEvent[Widget, Image] => scala.Unit = null,
    baselineChanged: /* event */ PropertyChangedEvent[Widget, Widget | Selector] => scala.Unit = null,
    bottomChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    bottomToolbarHeightChanged: /* event */ PropertyChangedEvent[NavigationView, scala.Double] => scala.Unit = null,
    boundsChanged: /* event */ PropertyChangedEvent[Widget, Bounds] => scala.Unit = null,
    centerXChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.offset] => scala.Unit = null,
    centerYChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.offset] => scala.Unit = null,
    classChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null,
    classListChanged: /* event */ PropertyChangedEvent[Widget, js.Array[java.lang.String]] => scala.Unit = null,
    cornerRadiusChanged: /* event */ PropertyChangedEvent[Widget, scala.Double] => scala.Unit = null,
    dataChanged: /* event */ PropertyChangedEvent[Widget, js.Object] => scala.Unit = null,
    dispose: /* event */ EventObject[Widget] => scala.Unit = null,
    drawerActionVisibleChanged: /* event */ PropertyChangedEvent[NavigationView, scala.Boolean] => scala.Unit = null,
    elevationChanged: /* event */ PropertyChangedEvent[Widget, scala.Double] => scala.Unit = null,
    enabledChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    fontChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.Font] => scala.Unit = null,
    heightChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.dimension] => scala.Unit = null,
    highlightOnTouchChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    idChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null,
    layoutDataChanged: /* event */ PropertyChangedEvent[Widget, LayoutData] => scala.Unit = null,
    leftChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    longpress: /* event */ WidgetLongpressEvent => scala.Unit = null,
    navigationActionChanged: /* event */ PropertyChangedEvent[NavigationView, Action] => scala.Unit = null,
    opacityChanged: /* event */ PropertyChangedEvent[Widget, scala.Double] => scala.Unit = null,
    paddingChanged: /* event */ PropertyChangedEvent[Composite, BoxDimensions | scala.Double] => scala.Unit = null,
    pageAnimationChanged: /* event */ PropertyChangedEvent[NavigationView, java.lang.String] => scala.Unit = null,
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
    swipeDown: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeLeft: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeRight: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeUp: /* event */ WidgetSwipeEvent => scala.Unit = null,
    tap: /* event */ WidgetTapEvent => scala.Unit = null,
    titleTextColorChanged: /* event */ PropertyChangedEvent[NavigationView, tabrisLib.Color] => scala.Unit = null,
    toolbarColorChanged: /* event */ PropertyChangedEvent[NavigationView, tabrisLib.Color] => scala.Unit = null,
    toolbarVisibleChanged: /* event */ PropertyChangedEvent[NavigationView, scala.Boolean] => scala.Unit = null,
    topChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    topToolbarHeightChanged: /* event */ PropertyChangedEvent[NavigationView, scala.Double] => scala.Unit = null,
    touchCancel: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchEnd: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchMove: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchStart: /* event */ WidgetTouchEvent => scala.Unit = null,
    transformChanged: /* event */ PropertyChangedEvent[Widget, Transformation] => scala.Unit = null,
    visibleChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    widthChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.dimension] => scala.Unit = null,
    win_drawerActionBackgroundChanged: /* event */ PropertyChangedEvent[NavigationView, tabrisLib.Color] => scala.Unit = null,
    win_drawerActionThemeChanged: /* event */ PropertyChangedEvent[NavigationView, java.lang.String] => scala.Unit = null,
    win_themeChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null,
    win_toolbarOverflowThemeChanged: /* event */ PropertyChangedEvent[NavigationView, java.lang.String] => scala.Unit = null,
    win_toolbarThemeChanged: /* event */ PropertyChangedEvent[NavigationView, java.lang.String] => scala.Unit = null
  ): NavigationViewEvents = {
    val __obj = js.Dynamic.literal()
    if (actionColorChanged != null) __obj.updateDynamic("actionColorChanged")(js.Any.fromFunction1(actionColorChanged))
    if (actionTextColorChanged != null) __obj.updateDynamic("actionTextColorChanged")(js.Any.fromFunction1(actionTextColorChanged))
    if (addChild != null) __obj.updateDynamic("addChild")(js.Any.fromFunction1(addChild))
    if (backgroundChanged != null) __obj.updateDynamic("backgroundChanged")(js.Any.fromFunction1(backgroundChanged))
    if (backgroundImageChanged != null) __obj.updateDynamic("backgroundImageChanged")(js.Any.fromFunction1(backgroundImageChanged))
    if (baselineChanged != null) __obj.updateDynamic("baselineChanged")(js.Any.fromFunction1(baselineChanged))
    if (bottomChanged != null) __obj.updateDynamic("bottomChanged")(js.Any.fromFunction1(bottomChanged))
    if (bottomToolbarHeightChanged != null) __obj.updateDynamic("bottomToolbarHeightChanged")(js.Any.fromFunction1(bottomToolbarHeightChanged))
    if (boundsChanged != null) __obj.updateDynamic("boundsChanged")(js.Any.fromFunction1(boundsChanged))
    if (centerXChanged != null) __obj.updateDynamic("centerXChanged")(js.Any.fromFunction1(centerXChanged))
    if (centerYChanged != null) __obj.updateDynamic("centerYChanged")(js.Any.fromFunction1(centerYChanged))
    if (classChanged != null) __obj.updateDynamic("classChanged")(js.Any.fromFunction1(classChanged))
    if (classListChanged != null) __obj.updateDynamic("classListChanged")(js.Any.fromFunction1(classListChanged))
    if (cornerRadiusChanged != null) __obj.updateDynamic("cornerRadiusChanged")(js.Any.fromFunction1(cornerRadiusChanged))
    if (dataChanged != null) __obj.updateDynamic("dataChanged")(js.Any.fromFunction1(dataChanged))
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction1(dispose))
    if (drawerActionVisibleChanged != null) __obj.updateDynamic("drawerActionVisibleChanged")(js.Any.fromFunction1(drawerActionVisibleChanged))
    if (elevationChanged != null) __obj.updateDynamic("elevationChanged")(js.Any.fromFunction1(elevationChanged))
    if (enabledChanged != null) __obj.updateDynamic("enabledChanged")(js.Any.fromFunction1(enabledChanged))
    if (fontChanged != null) __obj.updateDynamic("fontChanged")(js.Any.fromFunction1(fontChanged))
    if (heightChanged != null) __obj.updateDynamic("heightChanged")(js.Any.fromFunction1(heightChanged))
    if (highlightOnTouchChanged != null) __obj.updateDynamic("highlightOnTouchChanged")(js.Any.fromFunction1(highlightOnTouchChanged))
    if (idChanged != null) __obj.updateDynamic("idChanged")(js.Any.fromFunction1(idChanged))
    if (layoutDataChanged != null) __obj.updateDynamic("layoutDataChanged")(js.Any.fromFunction1(layoutDataChanged))
    if (leftChanged != null) __obj.updateDynamic("leftChanged")(js.Any.fromFunction1(leftChanged))
    if (longpress != null) __obj.updateDynamic("longpress")(js.Any.fromFunction1(longpress))
    if (navigationActionChanged != null) __obj.updateDynamic("navigationActionChanged")(js.Any.fromFunction1(navigationActionChanged))
    if (opacityChanged != null) __obj.updateDynamic("opacityChanged")(js.Any.fromFunction1(opacityChanged))
    if (paddingChanged != null) __obj.updateDynamic("paddingChanged")(js.Any.fromFunction1(paddingChanged))
    if (pageAnimationChanged != null) __obj.updateDynamic("pageAnimationChanged")(js.Any.fromFunction1(pageAnimationChanged))
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
    if (swipeDown != null) __obj.updateDynamic("swipeDown")(js.Any.fromFunction1(swipeDown))
    if (swipeLeft != null) __obj.updateDynamic("swipeLeft")(js.Any.fromFunction1(swipeLeft))
    if (swipeRight != null) __obj.updateDynamic("swipeRight")(js.Any.fromFunction1(swipeRight))
    if (swipeUp != null) __obj.updateDynamic("swipeUp")(js.Any.fromFunction1(swipeUp))
    if (tap != null) __obj.updateDynamic("tap")(js.Any.fromFunction1(tap))
    if (titleTextColorChanged != null) __obj.updateDynamic("titleTextColorChanged")(js.Any.fromFunction1(titleTextColorChanged))
    if (toolbarColorChanged != null) __obj.updateDynamic("toolbarColorChanged")(js.Any.fromFunction1(toolbarColorChanged))
    if (toolbarVisibleChanged != null) __obj.updateDynamic("toolbarVisibleChanged")(js.Any.fromFunction1(toolbarVisibleChanged))
    if (topChanged != null) __obj.updateDynamic("topChanged")(js.Any.fromFunction1(topChanged))
    if (topToolbarHeightChanged != null) __obj.updateDynamic("topToolbarHeightChanged")(js.Any.fromFunction1(topToolbarHeightChanged))
    if (touchCancel != null) __obj.updateDynamic("touchCancel")(js.Any.fromFunction1(touchCancel))
    if (touchEnd != null) __obj.updateDynamic("touchEnd")(js.Any.fromFunction1(touchEnd))
    if (touchMove != null) __obj.updateDynamic("touchMove")(js.Any.fromFunction1(touchMove))
    if (touchStart != null) __obj.updateDynamic("touchStart")(js.Any.fromFunction1(touchStart))
    if (transformChanged != null) __obj.updateDynamic("transformChanged")(js.Any.fromFunction1(transformChanged))
    if (visibleChanged != null) __obj.updateDynamic("visibleChanged")(js.Any.fromFunction1(visibleChanged))
    if (widthChanged != null) __obj.updateDynamic("widthChanged")(js.Any.fromFunction1(widthChanged))
    if (win_drawerActionBackgroundChanged != null) __obj.updateDynamic("win_drawerActionBackgroundChanged")(js.Any.fromFunction1(win_drawerActionBackgroundChanged))
    if (win_drawerActionThemeChanged != null) __obj.updateDynamic("win_drawerActionThemeChanged")(js.Any.fromFunction1(win_drawerActionThemeChanged))
    if (win_themeChanged != null) __obj.updateDynamic("win_themeChanged")(js.Any.fromFunction1(win_themeChanged))
    if (win_toolbarOverflowThemeChanged != null) __obj.updateDynamic("win_toolbarOverflowThemeChanged")(js.Any.fromFunction1(win_toolbarOverflowThemeChanged))
    if (win_toolbarThemeChanged != null) __obj.updateDynamic("win_toolbarThemeChanged")(js.Any.fromFunction1(win_toolbarThemeChanged))
    __obj.asInstanceOf[NavigationViewEvents]
  }
}

