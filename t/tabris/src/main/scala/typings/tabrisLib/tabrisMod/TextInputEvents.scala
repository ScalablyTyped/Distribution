package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputEvents extends WidgetEvents {
  /**
    * Fired when a text input has been finished by pressing the keyboard's Enter key. The label of this key
    * may vary depending on the platform and locale.
    */
  var accept: js.UndefOr[js.Function1[/* event */ TextInputAcceptEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*alignment*](#alignment) property has changed.
    * @param value The new value of [*alignment*](#alignment).
    */
  var alignmentChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*autoCapitalize*](#autoCapitalize) property has changed.
    * @param value The new value of [*autoCapitalize*](#autoCapitalize).
    */
  var autoCapitalizeChanged: js.UndefOr[js.Function1[/* event */ PropertyChangedEvent[TextInput, _], scala.Unit]] = js.undefined
  /**
    * Fired when the [*autoCorrect*](#autoCorrect) property has changed.
    * @param value The new value of [*autoCorrect*](#autoCorrect).
    */
  var autoCorrectChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the widget lost focus.
    */
  var blur: js.UndefOr[js.Function1[/* event */ EventObject[TextInput], scala.Unit]] = js.undefined
  /**
    * Fired when the [*borderColor*](#borderColor) property has changed.
    * @param value The new value of [*borderColor*](#borderColor).
    */
  var borderColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*cursorColor*](#cursorColor) property has changed.
    * @param value The new value of [*cursorColor*](#cursorColor).
    */
  var cursorColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*editable*](#editable) property has changed.
    * @param value The new value of [*editable*](#editable).
    */
  var editableChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*enterKeyType*](#enterKeyType) property has changed.
    * @param value The new value of [*enterKeyType*](#enterKeyType).
    */
  var enterKeyTypeChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*fillColor*](#fillColor) property has changed.
    * @param value The new value of [*fillColor*](#fillColor).
    */
  var fillColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, tabrisLib.Color], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the widget gains focus.
    */
  var focus: js.UndefOr[js.Function1[/* event */ EventObject[TextInput], scala.Unit]] = js.undefined
  /**
    * Fired when the [*focused*](#focused) property has changed.
    * @param value The new value of [*focused*](#focused).
    */
  var focusedChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the text was changed by the user.
    */
  var input: js.UndefOr[js.Function1[/* event */ TextInputInputEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*keepFocus*](#keepFocus) property has changed.
    * @param value The new value of [*keepFocus*](#keepFocus).
    */
  var keepFocusChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*keyboard*](#keyboard) property has changed.
    * @param value The new value of [*keyboard*](#keyboard).
    */
  var keyboardChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*message*](#message) property has changed.
    * @param value The new value of [*message*](#message).
    */
  var messageChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*revealPassword*](#revealPassword) property has changed.
    * @param value The new value of [*revealPassword*](#revealPassword).
    */
  var revealPasswordChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * The `select` event is fired when the user alters the text [`selection`](#selection). Either by
    * dragging the selection handles of a text selection, by moving the cursor inside the text or by typing
    * which also advances the cursor.
    * The event also fires when the user taps inside a `TextInput` since this involves to set the cursor to
    * the tapped position.
    */
  var select: js.UndefOr[js.Function1[/* event */ TextInputSelectEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*selection*](#selection) property has changed.
    * @param value The new value of [*selection*](#selection).
    */
  var selectionChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, js.Array[scala.Double]], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*text*](#text) property has changed.
    * @param value The new value of [*text*](#text).
    */
  var textChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*textColor*](#textColor) property has changed.
    * @param value The new value of [*textColor*](#textColor).
    */
  var textColorChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TextInput, tabrisLib.Color], scala.Unit]
  ] = js.undefined
}

object TextInputEvents {
  @scala.inline
  def apply(
    accept: /* event */ TextInputAcceptEvent => scala.Unit = null,
    alignmentChanged: /* event */ PropertyChangedEvent[TextInput, java.lang.String] => scala.Unit = null,
    autoCapitalizeChanged: /* event */ PropertyChangedEvent[TextInput, _] => scala.Unit = null,
    autoCorrectChanged: /* event */ PropertyChangedEvent[TextInput, scala.Boolean] => scala.Unit = null,
    backgroundChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.Color] => scala.Unit = null,
    backgroundImageChanged: /* event */ PropertyChangedEvent[Widget, Image] => scala.Unit = null,
    baselineChanged: /* event */ PropertyChangedEvent[Widget, Widget | Selector] => scala.Unit = null,
    blur: /* event */ EventObject[TextInput] => scala.Unit = null,
    borderColorChanged: /* event */ PropertyChangedEvent[TextInput, tabrisLib.Color] => scala.Unit = null,
    bottomChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    boundsChanged: /* event */ PropertyChangedEvent[Widget, Bounds] => scala.Unit = null,
    centerXChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.offset] => scala.Unit = null,
    centerYChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.offset] => scala.Unit = null,
    classChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null,
    classListChanged: /* event */ PropertyChangedEvent[Widget, js.Array[java.lang.String]] => scala.Unit = null,
    cornerRadiusChanged: /* event */ PropertyChangedEvent[Widget, scala.Double] => scala.Unit = null,
    cursorColorChanged: /* event */ PropertyChangedEvent[TextInput, tabrisLib.Color] => scala.Unit = null,
    dataChanged: /* event */ PropertyChangedEvent[Widget, js.Object] => scala.Unit = null,
    dispose: /* event */ EventObject[Widget] => scala.Unit = null,
    editableChanged: /* event */ PropertyChangedEvent[TextInput, scala.Boolean] => scala.Unit = null,
    elevationChanged: /* event */ PropertyChangedEvent[Widget, scala.Double] => scala.Unit = null,
    enabledChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    enterKeyTypeChanged: /* event */ PropertyChangedEvent[TextInput, java.lang.String] => scala.Unit = null,
    fillColorChanged: /* event */ PropertyChangedEvent[TextInput, tabrisLib.Color] => scala.Unit = null,
    focus: /* event */ EventObject[TextInput] => scala.Unit = null,
    focusedChanged: /* event */ PropertyChangedEvent[TextInput, scala.Boolean] => scala.Unit = null,
    fontChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.Font] => scala.Unit = null,
    heightChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.dimension] => scala.Unit = null,
    highlightOnTouchChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    idChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null,
    input: /* event */ TextInputInputEvent => scala.Unit = null,
    keepFocusChanged: /* event */ PropertyChangedEvent[TextInput, scala.Boolean] => scala.Unit = null,
    keyboardChanged: /* event */ PropertyChangedEvent[TextInput, java.lang.String] => scala.Unit = null,
    layoutDataChanged: /* event */ PropertyChangedEvent[Widget, LayoutData] => scala.Unit = null,
    leftChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    longpress: /* event */ WidgetLongpressEvent => scala.Unit = null,
    messageChanged: /* event */ PropertyChangedEvent[TextInput, java.lang.String] => scala.Unit = null,
    opacityChanged: /* event */ PropertyChangedEvent[Widget, scala.Double] => scala.Unit = null,
    pan: /* event */ WidgetPanEvent => scala.Unit = null,
    panDown: /* event */ WidgetPanEvent => scala.Unit = null,
    panHorizontal: /* event */ WidgetPanEvent => scala.Unit = null,
    panLeft: /* event */ WidgetPanEvent => scala.Unit = null,
    panRight: /* event */ WidgetPanEvent => scala.Unit = null,
    panUp: /* event */ WidgetPanEvent => scala.Unit = null,
    panVertical: /* event */ WidgetPanEvent => scala.Unit = null,
    resize: /* event */ WidgetResizeEvent => scala.Unit = null,
    revealPasswordChanged: /* event */ PropertyChangedEvent[TextInput, scala.Boolean] => scala.Unit = null,
    rightChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    select: /* event */ TextInputSelectEvent => scala.Unit = null,
    selectionChanged: /* event */ PropertyChangedEvent[TextInput, js.Array[scala.Double]] => scala.Unit = null,
    swipeDown: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeLeft: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeRight: /* event */ WidgetSwipeEvent => scala.Unit = null,
    swipeUp: /* event */ WidgetSwipeEvent => scala.Unit = null,
    tap: /* event */ WidgetTapEvent => scala.Unit = null,
    textChanged: /* event */ PropertyChangedEvent[TextInput, java.lang.String] => scala.Unit = null,
    textColorChanged: /* event */ PropertyChangedEvent[TextInput, tabrisLib.Color] => scala.Unit = null,
    topChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.margin] => scala.Unit = null,
    touchCancel: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchEnd: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchMove: /* event */ WidgetTouchEvent => scala.Unit = null,
    touchStart: /* event */ WidgetTouchEvent => scala.Unit = null,
    transformChanged: /* event */ PropertyChangedEvent[Widget, Transformation] => scala.Unit = null,
    visibleChanged: /* event */ PropertyChangedEvent[Widget, scala.Boolean] => scala.Unit = null,
    widthChanged: /* event */ PropertyChangedEvent[Widget, tabrisLib.dimension] => scala.Unit = null,
    win_themeChanged: /* event */ PropertyChangedEvent[Widget, java.lang.String] => scala.Unit = null
  ): TextInputEvents = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(js.Any.fromFunction1(accept))
    if (alignmentChanged != null) __obj.updateDynamic("alignmentChanged")(js.Any.fromFunction1(alignmentChanged))
    if (autoCapitalizeChanged != null) __obj.updateDynamic("autoCapitalizeChanged")(js.Any.fromFunction1(autoCapitalizeChanged))
    if (autoCorrectChanged != null) __obj.updateDynamic("autoCorrectChanged")(js.Any.fromFunction1(autoCorrectChanged))
    if (backgroundChanged != null) __obj.updateDynamic("backgroundChanged")(js.Any.fromFunction1(backgroundChanged))
    if (backgroundImageChanged != null) __obj.updateDynamic("backgroundImageChanged")(js.Any.fromFunction1(backgroundImageChanged))
    if (baselineChanged != null) __obj.updateDynamic("baselineChanged")(js.Any.fromFunction1(baselineChanged))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction1(blur))
    if (borderColorChanged != null) __obj.updateDynamic("borderColorChanged")(js.Any.fromFunction1(borderColorChanged))
    if (bottomChanged != null) __obj.updateDynamic("bottomChanged")(js.Any.fromFunction1(bottomChanged))
    if (boundsChanged != null) __obj.updateDynamic("boundsChanged")(js.Any.fromFunction1(boundsChanged))
    if (centerXChanged != null) __obj.updateDynamic("centerXChanged")(js.Any.fromFunction1(centerXChanged))
    if (centerYChanged != null) __obj.updateDynamic("centerYChanged")(js.Any.fromFunction1(centerYChanged))
    if (classChanged != null) __obj.updateDynamic("classChanged")(js.Any.fromFunction1(classChanged))
    if (classListChanged != null) __obj.updateDynamic("classListChanged")(js.Any.fromFunction1(classListChanged))
    if (cornerRadiusChanged != null) __obj.updateDynamic("cornerRadiusChanged")(js.Any.fromFunction1(cornerRadiusChanged))
    if (cursorColorChanged != null) __obj.updateDynamic("cursorColorChanged")(js.Any.fromFunction1(cursorColorChanged))
    if (dataChanged != null) __obj.updateDynamic("dataChanged")(js.Any.fromFunction1(dataChanged))
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction1(dispose))
    if (editableChanged != null) __obj.updateDynamic("editableChanged")(js.Any.fromFunction1(editableChanged))
    if (elevationChanged != null) __obj.updateDynamic("elevationChanged")(js.Any.fromFunction1(elevationChanged))
    if (enabledChanged != null) __obj.updateDynamic("enabledChanged")(js.Any.fromFunction1(enabledChanged))
    if (enterKeyTypeChanged != null) __obj.updateDynamic("enterKeyTypeChanged")(js.Any.fromFunction1(enterKeyTypeChanged))
    if (fillColorChanged != null) __obj.updateDynamic("fillColorChanged")(js.Any.fromFunction1(fillColorChanged))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction1(focus))
    if (focusedChanged != null) __obj.updateDynamic("focusedChanged")(js.Any.fromFunction1(focusedChanged))
    if (fontChanged != null) __obj.updateDynamic("fontChanged")(js.Any.fromFunction1(fontChanged))
    if (heightChanged != null) __obj.updateDynamic("heightChanged")(js.Any.fromFunction1(heightChanged))
    if (highlightOnTouchChanged != null) __obj.updateDynamic("highlightOnTouchChanged")(js.Any.fromFunction1(highlightOnTouchChanged))
    if (idChanged != null) __obj.updateDynamic("idChanged")(js.Any.fromFunction1(idChanged))
    if (input != null) __obj.updateDynamic("input")(js.Any.fromFunction1(input))
    if (keepFocusChanged != null) __obj.updateDynamic("keepFocusChanged")(js.Any.fromFunction1(keepFocusChanged))
    if (keyboardChanged != null) __obj.updateDynamic("keyboardChanged")(js.Any.fromFunction1(keyboardChanged))
    if (layoutDataChanged != null) __obj.updateDynamic("layoutDataChanged")(js.Any.fromFunction1(layoutDataChanged))
    if (leftChanged != null) __obj.updateDynamic("leftChanged")(js.Any.fromFunction1(leftChanged))
    if (longpress != null) __obj.updateDynamic("longpress")(js.Any.fromFunction1(longpress))
    if (messageChanged != null) __obj.updateDynamic("messageChanged")(js.Any.fromFunction1(messageChanged))
    if (opacityChanged != null) __obj.updateDynamic("opacityChanged")(js.Any.fromFunction1(opacityChanged))
    if (pan != null) __obj.updateDynamic("pan")(js.Any.fromFunction1(pan))
    if (panDown != null) __obj.updateDynamic("panDown")(js.Any.fromFunction1(panDown))
    if (panHorizontal != null) __obj.updateDynamic("panHorizontal")(js.Any.fromFunction1(panHorizontal))
    if (panLeft != null) __obj.updateDynamic("panLeft")(js.Any.fromFunction1(panLeft))
    if (panRight != null) __obj.updateDynamic("panRight")(js.Any.fromFunction1(panRight))
    if (panUp != null) __obj.updateDynamic("panUp")(js.Any.fromFunction1(panUp))
    if (panVertical != null) __obj.updateDynamic("panVertical")(js.Any.fromFunction1(panVertical))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (revealPasswordChanged != null) __obj.updateDynamic("revealPasswordChanged")(js.Any.fromFunction1(revealPasswordChanged))
    if (rightChanged != null) __obj.updateDynamic("rightChanged")(js.Any.fromFunction1(rightChanged))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1(selectionChanged))
    if (swipeDown != null) __obj.updateDynamic("swipeDown")(js.Any.fromFunction1(swipeDown))
    if (swipeLeft != null) __obj.updateDynamic("swipeLeft")(js.Any.fromFunction1(swipeLeft))
    if (swipeRight != null) __obj.updateDynamic("swipeRight")(js.Any.fromFunction1(swipeRight))
    if (swipeUp != null) __obj.updateDynamic("swipeUp")(js.Any.fromFunction1(swipeUp))
    if (tap != null) __obj.updateDynamic("tap")(js.Any.fromFunction1(tap))
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
    __obj.asInstanceOf[TextInputEvents]
  }
}

