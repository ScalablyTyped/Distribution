package typings.webscopeioReactTextareaAutocomplete.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactEventHandler
import typings.react.mod.SFC
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLDivElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react.react.InputHTMLAttributes<std.HTMLTextAreaElement>, @webscopeio/react-textarea-autocomplete.@webscopeio/react-textarea-autocomplete.PickedAttributes> */
trait TextareaProps[TItem] extends js.Object {
  /**
    * ClassNames of the textarea.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * 	When it's true autocomplete will close when use click outside.
    * @default false
    */
  var closeOnClickOutside: js.UndefOr[Boolean] = js.undefined
  /**
    * ClassNames of the textarea's container.
    */
  var containerClassName: js.UndefOr[String] = js.undefined
  /**
    * Styles of textarea's container.
    */
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * 	ClassNames of dropdown's wrapper.
    */
  var dropdownClassName: js.UndefOr[String] = js.undefined
  /**
    * Styles of dropdown's wrapper.
    */
  var dropdownStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Allows you to get React ref of the underlying textarea.
    */
  var innerRef: js.UndefOr[js.Function1[/* ref */ HTMLTextAreaElement, Unit]] = js.undefined
  /**
    * ClassNames of item's wrapper.
    */
  var itemClassName: js.UndefOr[String] = js.undefined
  /**
    * Styles of item's wrapper.
    */
  var itemStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * 	ClassNames of list's wrapper.
    */
  var listClassName: js.UndefOr[String] = js.undefined
  /**
    * Styles of list's wrapper.
    */
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * ClassNames of loader's wrapper.
    */
  var loaderClassName: js.UndefOr[String] = js.undefined
  /**
    * Styles of loader's wrapper.
    */
  var loaderStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Gets data props which is already fetched (and displayed) suggestion.
    */
  var loadingComponent: SFC[js.Object]
  /**
    * Number of characters that user should type for trigger a suggestion.
    * @default 1
    */
  var minChar: js.UndefOr[Double] = js.undefined
  /**
    * When it's true the textarea will move along with a caret as a user continues to type.
    * @default false
    */
  var movePopupAsYouType: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLTextAreaElement]] = js.undefined
  /**
    * Listener called every time the textarea's caret position is changed. The listener is called with one attribute - caret position denoted by an integer number.
    */
  var onCaretPositionChange: js.UndefOr[js.Function1[/* pos */ Double, Unit]] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement]] = js.undefined
  var onSelect: js.UndefOr[ReactEventHandler[HTMLTextAreaElement]] = js.undefined
  /**
    * With default implementation it will scroll the dropdown every time when the item gets out of the view.
    * @default true
    */
  var scrollToItem: js.UndefOr[
    Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit])
  ] = js.undefined
  /**
    * Styles of textarea
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Define triggers and their corresponding behavior.
    */
  var trigger: TriggerType[TItem]
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}

object TextareaProps {
  @scala.inline
  def apply[TItem](
    loadingComponent: SFC[js.Object],
    trigger: TriggerType[TItem],
    className: String = null,
    closeOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    containerStyle: CSSProperties = null,
    dropdownClassName: String = null,
    dropdownStyle: CSSProperties = null,
    innerRef: /* ref */ HTMLTextAreaElement => Unit = null,
    itemClassName: String = null,
    itemStyle: CSSProperties = null,
    listClassName: String = null,
    listStyle: CSSProperties = null,
    loaderClassName: String = null,
    loaderStyle: CSSProperties = null,
    minChar: Int | Double = null,
    movePopupAsYouType: js.UndefOr[Boolean] = js.undefined,
    onBlur: FocusEvent[HTMLTextAreaElement] => Unit = null,
    onCaretPositionChange: /* pos */ Double => Unit = null,
    onChange: ChangeEvent[HTMLTextAreaElement] => Unit = null,
    onSelect: SyntheticEvent[HTMLTextAreaElement, Event_] => Unit = null,
    scrollToItem: Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit]) = null,
    style: CSSProperties = null,
    value: String | js.Array[String] | Double = null
  ): TextareaProps[TItem] = {
    val __obj = js.Dynamic.literal(loadingComponent = loadingComponent.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClickOutside)) __obj.updateDynamic("closeOnClickOutside")(closeOnClickOutside.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (loaderClassName != null) __obj.updateDynamic("loaderClassName")(loaderClassName.asInstanceOf[js.Any])
    if (loaderStyle != null) __obj.updateDynamic("loaderStyle")(loaderStyle.asInstanceOf[js.Any])
    if (minChar != null) __obj.updateDynamic("minChar")(minChar.asInstanceOf[js.Any])
    if (!js.isUndefined(movePopupAsYouType)) __obj.updateDynamic("movePopupAsYouType")(movePopupAsYouType.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCaretPositionChange != null) __obj.updateDynamic("onCaretPositionChange")(js.Any.fromFunction1(onCaretPositionChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (scrollToItem != null) __obj.updateDynamic("scrollToItem")(scrollToItem.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaProps[TItem]]
  }
}

