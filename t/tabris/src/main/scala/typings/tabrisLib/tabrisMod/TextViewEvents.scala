package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextViewEvents extends WidgetEvents {
  /**
    * Fired when the [*alignment*](#alignment) property has changed.
    * @param value The new value of [*alignment*](#alignment).
    */
  var alignmentChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextView, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*lineSpacing*](#lineSpacing) property has changed.
    * @param value The new value of [*lineSpacing*](#lineSpacing).
    */
  var lineSpacingChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextView, scala.Double], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*maxLines*](#maxLines) property has changed.
    * @param value The new value of [*maxLines*](#maxLines).
    */
  var maxLinesChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextView, scala.Double | scala.Null], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*selectable*](#selectable) property has changed.
    * @param value The new value of [*selectable*](#selectable).
    */
  var selectableChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextView, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fires when the user clicks on a link in an html text. Requires to set `markupEnabled` to true and to
    * provide a text containing an anchor (`<a>`) with an `href` attribute. Eg. `textView.text = 'Website:
    * <a href="http://example.com>example.com</a>'`. The event object contains a property `url` which
    * provides the anchors `href` url.
    */
  var tapLink: js.UndefOr[js.Function1[/* event */ TextViewTapLinkEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*text*](#text) property has changed.
    * @param value The new value of [*text*](#text).
    */
  var textChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextView, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*textColor*](#textColor) property has changed.
    * @param value The new value of [*textColor*](#textColor).
    */
  var textColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextView, tabrisLib.Color], scala.Unit]
  ] = js.undefined
}

object TextViewEvents {
  @scala.inline
  def apply(
    alignmentChanged: /* event */ PropertyChangedEvent[TextView, java.lang.String] => scala.Unit = null,
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
    lineSpacingChanged: /* event */ PropertyChangedEvent[TextView, scala.Double] => scala.Unit = null,
    longpress: /* event */ WidgetLongpressEvent => scala.Unit = null,
    maxLinesChanged: /* event */ PropertyChangedEvent[TextView, scala.Double | scala.Null] => scala.Unit = null,
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
    selectableChanged: /* event */ PropertyChangedEvent[TextView, scala.Boolean] => scala.Unit = null,
    swipeDown: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeLeft: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeRight: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeUp: /* event */ WidgetSwipeEvent => scala.Unit = null,
    tap: /* event */ WidgetTapEvent => scala.Unit = null,
    tapLink: /* event */ TextViewTapLinkEvent => scala.Unit = null,
    textChanged: /* event */ PropertyChangedEvent[TextView, java.lang.String] => scala.Unit = null,
    textColorChanged: /* event */ PropertyChangedEvent[TextView, tabrisLib.Color] => scala.Unit = null,
    topChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    touchCancel: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchEnd: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchMove: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchStart: /* event */ WidgetTouchEvent => scala.Unit = null,
    transformChanged: /* event */ PropertyChangedEvent[Widget, Transformation] => scala.Unit = null,
    visibleChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    widthChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.dimension] => scala.Unit = null,
    win_themeChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null
  ): TextViewEvents = {
    val __obj = js.Dynamic.literal()
    if (alignmentChanged != null) __obj.updateDynamic("alignmentChanged")(js.Any.fromFunction1(alignmentChanged))
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
    if (lineSpacingChanged != null) __obj.updateDynamic("lineSpacingChanged")(js.Any.fromFunction1(lineSpacingChanged))
    if (longpress != null) __obj.updateDynamic("longpress")(js.Any.fromFunction1(longpress))
    if (maxLinesChanged != null) __obj.updateDynamic("maxLinesChanged")(js.Any.fromFunction1(maxLinesChanged))
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
    if (selectableChanged != null) __obj.updateDynamic("selectableChanged")(js.Any.fromFunction1(selectableChanged))
    if (swipeDown != null) __obj.updateDynamic("swipeDown")(js.Any.fromFunction1(swipeDown))
    if (swipeLeft != null) __obj.updateDynamic("swipeLeft")(js.Any.fromFunction1(swipeLeft))
    if (swipeRight != null) __obj.updateDynamic("swipeRight")(js.Any.fromFunction1(swipeRight))
    if (swipeUp != null) __obj.updateDynamic("swipeUp")(js.Any.fromFunction1(swipeUp))
    if (tap != null) __obj.updateDynamic("tap")(js.Any.fromFunction1(tap))
    if (tapLink != null) __obj.updateDynamic("tapLink")(js.Any.fromFunction1(tapLink))
    if (textChanged != null) __obj.updateDynamic("textChanged")(js.Any.fromFunction1(textChanged))
    if (textColorChanged != null) __obj.updateDynamic("textColorChanged")(js.Any.fromFunction1(textColorChanged))
    if (topChanged != null) __obj.updateDynamic("topChanged")(js.Any.fromFunction1(topChanged))
    if (touchCancel != null) __obj.updateDynamic("touchCancel")(js.Any.fromFunction1(touchCancel))
    if (touchEnd != null) __obj.updateDynamic("touchEnd")(js.Any.fromFunction1(touchEnd))
    if (touchMove != null) __obj.updateDynamic("touchMove")(js.Any.fromFunction1(touchMove))
    if (touchStart != null) __obj.updateDynamic("touchStart")(js.Any.fromFunction1(touchStart))
    if (transformChanged != null) __obj.updateDynamic("transformChanged")(js.Any.fromFunction1(transformChanged))
    if (visibleChanged != null) __obj.updateDynamic("visibleChanged")(js.Any.fromFunction1(visibleChanged))
    if (widthChanged != null) __obj.updateDynamic("widthChanged")(js.Any.fromFunction1(widthChanged))
    if (win_themeChanged != null) __obj.updateDynamic("win_themeChanged")(js.Any.fromFunction1(win_themeChanged))
    __obj.asInstanceOf[TextViewEvents]
  }
}

