package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputEvents extends WidgetEvents {
  /**
    * Fired when a text input has been finished by pressing the keyboard's Enter key. The label of this key
    * may vary depending on the platform and locale.
    */
  var onAccept: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.TextInputAcceptEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*alignment*](#alignment) property has changed.
    * @param value The new value of [*alignment*](#alignment).
    */
  var onAlignmentChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*autoCapitalize*](#autoCapitalize) property has changed.
    * @param value The new value of [*autoCapitalize*](#autoCapitalize).
    */
  var onAutoCapitalizeChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, _], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*autoCorrect*](#autoCorrect) property has changed.
    * @param value The new value of [*autoCorrect*](#autoCorrect).
    */
  var onAutoCorrectChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the widget lost focus.
    */
  var onBlur: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.TextInput], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*borderColor*](#borderColor) property has changed.
    * @param value The new value of [*borderColor*](#borderColor).
    */
  var onBorderColorChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, tabrisLib.Color], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*cursorColor*](#cursorColor) property has changed.
    * @param value The new value of [*cursorColor*](#cursorColor).
    */
  var onCursorColorChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, tabrisLib.Color], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*editable*](#editable) property has changed.
    * @param value The new value of [*editable*](#editable).
    */
  var onEditableChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*enterKeyType*](#enterKeyType) property has changed.
    * @param value The new value of [*enterKeyType*](#enterKeyType).
    */
  var onEnterKeyTypeChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*fillColor*](#fillColor) property has changed.
    * @param value The new value of [*fillColor*](#fillColor).
    */
  var onFillColorChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, tabrisLib.Color], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the widget gains focus.
    */
  var onFocus: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.TextInput], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*focused*](#focused) property has changed.
    * @param value The new value of [*focused*](#focused).
    */
  var onFocusedChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the text was changed by the user.
    */
  var onInput: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.TextInputInputEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*keepFocus*](#keepFocus) property has changed.
    * @param value The new value of [*keepFocus*](#keepFocus).
    */
  var onKeepFocusChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*keyboard*](#keyboard) property has changed.
    * @param value The new value of [*keyboard*](#keyboard).
    */
  var onKeyboardChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*message*](#message) property has changed.
    * @param value The new value of [*message*](#message).
    */
  var onMessageChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*revealPassword*](#revealPassword) property has changed.
    * @param value The new value of [*revealPassword*](#revealPassword).
    */
  var onRevealPasswordChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The `select` event is fired when the user alters the text [`selection`](#selection). Either by
    * dragging the selection handles of a text selection, by moving the cursor inside the text or by typing
    * which also advances the cursor.
    * The event also fires when the user taps inside a `TextInput` since this involves to set the cursor to
    * the tapped position.
    */
  var onSelect: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.TextInputSelectEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*selection*](#selection) property has changed.
    * @param value The new value of [*selection*](#selection).
    */
  var onSelectionChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, js.Array[scala.Double]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*text*](#text) property has changed.
    * @param value The new value of [*text*](#text).
    */
  var onTextChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*textColor*](#textColor) property has changed.
    * @param value The new value of [*textColor*](#textColor).
    */
  var onTextColorChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, tabrisLib.Color], 
      scala.Unit
    ]
  ] = js.undefined
}

object TextInputEvents {
  @scala.inline
  def apply(
    onAccept: /* event */ tabrisLib.tabrisMod.TextInputAcceptEvent => scala.Unit = null,
    onAlignmentChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, java.lang.String] => scala.Unit = null,
    onAutoCapitalizeChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, _] => scala.Unit = null,
    onAutoCorrectChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, scala.Boolean] => scala.Unit = null,
    onBackgroundChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Color] => scala.Unit = null,
    onBackgroundImageChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Image] => scala.Unit = null,
    onBaselineChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Widget | tabrisLib.Selector] => scala.Unit = null,
    onBlur: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.TextInput] => scala.Unit = null,
    onBorderColorChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, tabrisLib.Color] => scala.Unit = null,
    onBottomChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin] => scala.Unit = null,
    onBoundsChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Bounds] => scala.Unit = null,
    onCenterXChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.offset] => scala.Unit = null,
    onCenterYChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.offset] => scala.Unit = null,
    onClassChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String] => scala.Unit = null,
    onClassListChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, js.Array[java.lang.String]] => scala.Unit = null,
    onCornerRadiusChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double] => scala.Unit = null,
    onCursorColorChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, tabrisLib.Color] => scala.Unit = null,
    onDataChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, js.Object] => scala.Unit = null,
    onDispose: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.Widget] => scala.Unit = null,
    onEditableChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, scala.Boolean] => scala.Unit = null,
    onElevationChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double] => scala.Unit = null,
    onEnabledChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean] => scala.Unit = null,
    onEnterKeyTypeChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, java.lang.String] => scala.Unit = null,
    onFillColorChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, tabrisLib.Color] => scala.Unit = null,
    onFocus: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.TextInput] => scala.Unit = null,
    onFocusedChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, scala.Boolean] => scala.Unit = null,
    onFontChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.Font] => scala.Unit = null,
    onHeightChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.dimension] => scala.Unit = null,
    onHighlightOnTouchChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean] => scala.Unit = null,
    onIdChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String] => scala.Unit = null,
    onInput: /* event */ tabrisLib.tabrisMod.TextInputInputEvent => scala.Unit = null,
    onKeepFocusChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, scala.Boolean] => scala.Unit = null,
    onKeyboardChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, java.lang.String] => scala.Unit = null,
    onLayoutDataChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.LayoutData] => scala.Unit = null,
    onLeftChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin] => scala.Unit = null,
    onLongpress: /* event */ tabrisLib.tabrisMod.WidgetLongpressEvent => scala.Unit = null,
    onMessageChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, java.lang.String] => scala.Unit = null,
    onOpacityChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Double] => scala.Unit = null,
    onPan: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanDown: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanHorizontal: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanLeft: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanRight: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanUp: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onPanVertical: /* event */ tabrisLib.tabrisMod.WidgetPanEvent => scala.Unit = null,
    onResize: /* event */ tabrisLib.tabrisMod.WidgetResizeEvent => scala.Unit = null,
    onRevealPasswordChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, scala.Boolean] => scala.Unit = null,
    onRightChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin] => scala.Unit = null,
    onSelect: /* event */ tabrisLib.tabrisMod.TextInputSelectEvent => scala.Unit = null,
    onSelectionChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, js.Array[scala.Double]] => scala.Unit = null,
    onSwipeDown: /* event */ tabrisLib.tabrisMod.WidgetSwipeEvent => scala.Unit = null,
    onSwipeLeft: /* event */ tabrisLib.tabrisMod.WidgetSwipeEvent => scala.Unit = null,
    onSwipeRight: /* event */ tabrisLib.tabrisMod.WidgetSwipeEvent => scala.Unit = null,
    onSwipeUp: /* event */ tabrisLib.tabrisMod.WidgetSwipeEvent => scala.Unit = null,
    onTap: /* event */ tabrisLib.tabrisMod.WidgetTapEvent => scala.Unit = null,
    onTextChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, java.lang.String] => scala.Unit = null,
    onTextColorChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TextInput, tabrisLib.Color] => scala.Unit = null,
    onTopChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.margin] => scala.Unit = null,
    onTouchCancel: /* event */ tabrisLib.tabrisMod.WidgetTouchEvent => scala.Unit = null,
    onTouchEnd: /* event */ tabrisLib.tabrisMod.WidgetTouchEvent => scala.Unit = null,
    onTouchMove: /* event */ tabrisLib.tabrisMod.WidgetTouchEvent => scala.Unit = null,
    onTouchStart: /* event */ tabrisLib.tabrisMod.WidgetTouchEvent => scala.Unit = null,
    onTransformChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.tabrisMod.Transformation] => scala.Unit = null,
    onVisibleChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, scala.Boolean] => scala.Unit = null,
    onWidthChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, tabrisLib.dimension] => scala.Unit = null,
    onWin_themeChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Widget, java.lang.String] => scala.Unit = null
  ): TextInputEvents = {
    val __obj = js.Dynamic.literal()
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onAlignmentChanged != null) __obj.updateDynamic("onAlignmentChanged")(js.Any.fromFunction1(onAlignmentChanged))
    if (onAutoCapitalizeChanged != null) __obj.updateDynamic("onAutoCapitalizeChanged")(js.Any.fromFunction1(onAutoCapitalizeChanged))
    if (onAutoCorrectChanged != null) __obj.updateDynamic("onAutoCorrectChanged")(js.Any.fromFunction1(onAutoCorrectChanged))
    if (onBackgroundChanged != null) __obj.updateDynamic("onBackgroundChanged")(js.Any.fromFunction1(onBackgroundChanged))
    if (onBackgroundImageChanged != null) __obj.updateDynamic("onBackgroundImageChanged")(js.Any.fromFunction1(onBackgroundImageChanged))
    if (onBaselineChanged != null) __obj.updateDynamic("onBaselineChanged")(js.Any.fromFunction1(onBaselineChanged))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBorderColorChanged != null) __obj.updateDynamic("onBorderColorChanged")(js.Any.fromFunction1(onBorderColorChanged))
    if (onBottomChanged != null) __obj.updateDynamic("onBottomChanged")(js.Any.fromFunction1(onBottomChanged))
    if (onBoundsChanged != null) __obj.updateDynamic("onBoundsChanged")(js.Any.fromFunction1(onBoundsChanged))
    if (onCenterXChanged != null) __obj.updateDynamic("onCenterXChanged")(js.Any.fromFunction1(onCenterXChanged))
    if (onCenterYChanged != null) __obj.updateDynamic("onCenterYChanged")(js.Any.fromFunction1(onCenterYChanged))
    if (onClassChanged != null) __obj.updateDynamic("onClassChanged")(js.Any.fromFunction1(onClassChanged))
    if (onClassListChanged != null) __obj.updateDynamic("onClassListChanged")(js.Any.fromFunction1(onClassListChanged))
    if (onCornerRadiusChanged != null) __obj.updateDynamic("onCornerRadiusChanged")(js.Any.fromFunction1(onCornerRadiusChanged))
    if (onCursorColorChanged != null) __obj.updateDynamic("onCursorColorChanged")(js.Any.fromFunction1(onCursorColorChanged))
    if (onDataChanged != null) __obj.updateDynamic("onDataChanged")(js.Any.fromFunction1(onDataChanged))
    if (onDispose != null) __obj.updateDynamic("onDispose")(js.Any.fromFunction1(onDispose))
    if (onEditableChanged != null) __obj.updateDynamic("onEditableChanged")(js.Any.fromFunction1(onEditableChanged))
    if (onElevationChanged != null) __obj.updateDynamic("onElevationChanged")(js.Any.fromFunction1(onElevationChanged))
    if (onEnabledChanged != null) __obj.updateDynamic("onEnabledChanged")(js.Any.fromFunction1(onEnabledChanged))
    if (onEnterKeyTypeChanged != null) __obj.updateDynamic("onEnterKeyTypeChanged")(js.Any.fromFunction1(onEnterKeyTypeChanged))
    if (onFillColorChanged != null) __obj.updateDynamic("onFillColorChanged")(js.Any.fromFunction1(onFillColorChanged))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusedChanged != null) __obj.updateDynamic("onFocusedChanged")(js.Any.fromFunction1(onFocusedChanged))
    if (onFontChanged != null) __obj.updateDynamic("onFontChanged")(js.Any.fromFunction1(onFontChanged))
    if (onHeightChanged != null) __obj.updateDynamic("onHeightChanged")(js.Any.fromFunction1(onHeightChanged))
    if (onHighlightOnTouchChanged != null) __obj.updateDynamic("onHighlightOnTouchChanged")(js.Any.fromFunction1(onHighlightOnTouchChanged))
    if (onIdChanged != null) __obj.updateDynamic("onIdChanged")(js.Any.fromFunction1(onIdChanged))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onKeepFocusChanged != null) __obj.updateDynamic("onKeepFocusChanged")(js.Any.fromFunction1(onKeepFocusChanged))
    if (onKeyboardChanged != null) __obj.updateDynamic("onKeyboardChanged")(js.Any.fromFunction1(onKeyboardChanged))
    if (onLayoutDataChanged != null) __obj.updateDynamic("onLayoutDataChanged")(js.Any.fromFunction1(onLayoutDataChanged))
    if (onLeftChanged != null) __obj.updateDynamic("onLeftChanged")(js.Any.fromFunction1(onLeftChanged))
    if (onLongpress != null) __obj.updateDynamic("onLongpress")(js.Any.fromFunction1(onLongpress))
    if (onMessageChanged != null) __obj.updateDynamic("onMessageChanged")(js.Any.fromFunction1(onMessageChanged))
    if (onOpacityChanged != null) __obj.updateDynamic("onOpacityChanged")(js.Any.fromFunction1(onOpacityChanged))
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1(onPan))
    if (onPanDown != null) __obj.updateDynamic("onPanDown")(js.Any.fromFunction1(onPanDown))
    if (onPanHorizontal != null) __obj.updateDynamic("onPanHorizontal")(js.Any.fromFunction1(onPanHorizontal))
    if (onPanLeft != null) __obj.updateDynamic("onPanLeft")(js.Any.fromFunction1(onPanLeft))
    if (onPanRight != null) __obj.updateDynamic("onPanRight")(js.Any.fromFunction1(onPanRight))
    if (onPanUp != null) __obj.updateDynamic("onPanUp")(js.Any.fromFunction1(onPanUp))
    if (onPanVertical != null) __obj.updateDynamic("onPanVertical")(js.Any.fromFunction1(onPanVertical))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onRevealPasswordChanged != null) __obj.updateDynamic("onRevealPasswordChanged")(js.Any.fromFunction1(onRevealPasswordChanged))
    if (onRightChanged != null) __obj.updateDynamic("onRightChanged")(js.Any.fromFunction1(onRightChanged))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onSwipeDown != null) __obj.updateDynamic("onSwipeDown")(js.Any.fromFunction1(onSwipeDown))
    if (onSwipeLeft != null) __obj.updateDynamic("onSwipeLeft")(js.Any.fromFunction1(onSwipeLeft))
    if (onSwipeRight != null) __obj.updateDynamic("onSwipeRight")(js.Any.fromFunction1(onSwipeRight))
    if (onSwipeUp != null) __obj.updateDynamic("onSwipeUp")(js.Any.fromFunction1(onSwipeUp))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (onTextChanged != null) __obj.updateDynamic("onTextChanged")(js.Any.fromFunction1(onTextChanged))
    if (onTextColorChanged != null) __obj.updateDynamic("onTextColorChanged")(js.Any.fromFunction1(onTextColorChanged))
    if (onTopChanged != null) __obj.updateDynamic("onTopChanged")(js.Any.fromFunction1(onTopChanged))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransformChanged != null) __obj.updateDynamic("onTransformChanged")(js.Any.fromFunction1(onTransformChanged))
    if (onVisibleChanged != null) __obj.updateDynamic("onVisibleChanged")(js.Any.fromFunction1(onVisibleChanged))
    if (onWidthChanged != null) __obj.updateDynamic("onWidthChanged")(js.Any.fromFunction1(onWidthChanged))
    if (onWin_themeChanged != null) __obj.updateDynamic("onWin_themeChanged")(js.Any.fromFunction1(onWin_themeChanged))
    __obj.asInstanceOf[TextInputEvents]
  }
}

