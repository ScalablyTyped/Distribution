package typings
package atWebscopeioReactDashTextareaDashAutocompleteLib.atWebscopeioReactDashTextareaDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @webscopeio/react-textarea-autocomplete.PickedAttributes ]: react.react.React.InputHTMLAttributes<std.HTMLTextAreaElement>[P]} */ trait TextareaProps[TItem] extends js.Object {
  /**
    * ClassNames of the textarea.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 	When it's true autocomplete will close when use click outside.
    * @default false
    */
  var closeOnClickOutside: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * ClassNames of the textarea's container.
    */
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styles of textarea's container.
    */
  var containerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * 	ClassNames of dropdown's wrapper.
    */
  var dropdownClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styles of dropdown's wrapper.
    */
  var dropdownStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Allows you to get React ref of the underlying textarea.
    */
  var innerRef: js.UndefOr[js.Function1[/* ref */ stdLib.HTMLTextAreaElement, scala.Unit]] = js.undefined
  /**
    * ClassNames of item's wrapper.
    */
  var itemClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styles of item's wrapper.
    */
  var itemStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * 	ClassNames of list's wrapper.
    */
  var listClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styles of list's wrapper.
    */
  var listStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * ClassNames of loader's wrapper.
    */
  var loaderClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styles of loader's wrapper.
    */
  var loaderStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Gets data props which is already fetched (and displayed) suggestion.
    */
  var loadingComponent: reactLib.reactMod.ReactNs.SFC[js.Object]
  /**
    * Number of characters that user should type for trigger a suggestion.
    * @default 1
    */
  var minChar: js.UndefOr[scala.Double] = js.undefined
  /**
    * When it's true the textarea will move along with a caret as a user continues to type.
    * @default false
    */
  var movePopupAsYouType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Listener called every time the textarea's caret position is changed. The listener is called with one attribute - caret position denoted by an integer number.
    */
  var onCaretPositionChange: js.UndefOr[js.Function1[/* pos */ scala.Double, scala.Unit]] = js.undefined
  /**
    * With default implementation it will scroll the dropdown every time when the item gets out of the view.
    * @default true
    */
  var scrollToItem: js.UndefOr[
    scala.Boolean | (js.Function2[/* container */ stdLib.HTMLDivElement, /* item */ stdLib.HTMLDivElement, scala.Unit])
  ] = js.undefined
  /**
    * Styles of textarea
    */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Define triggers and their corresponding behavior.
    */
  var trigger: TriggerType[TItem]
}

object TextareaProps {
  @scala.inline
  def apply[TItem](
    loadingComponent: reactLib.reactMod.ReactNs.SFC[js.Object],
    trigger: TriggerType[TItem],
    className: java.lang.String = null,
    closeOnClickOutside: js.UndefOr[scala.Boolean] = js.undefined,
    containerClassName: java.lang.String = null,
    containerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    dropdownClassName: java.lang.String = null,
    dropdownStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    innerRef: /* ref */ stdLib.HTMLTextAreaElement => scala.Unit = null,
    itemClassName: java.lang.String = null,
    itemStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    listClassName: java.lang.String = null,
    listStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    loaderClassName: java.lang.String = null,
    loaderStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    minChar: scala.Int | scala.Double = null,
    movePopupAsYouType: js.UndefOr[scala.Boolean] = js.undefined,
    onCaretPositionChange: /* pos */ scala.Double => scala.Unit = null,
    scrollToItem: scala.Boolean | (js.Function2[/* container */ stdLib.HTMLDivElement, /* item */ stdLib.HTMLDivElement, scala.Unit]) = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TextareaProps[TItem] = {
    val __obj = js.Dynamic.literal(loadingComponent = loadingComponent, trigger = trigger)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnClickOutside)) __obj.updateDynamic("closeOnClickOutside")(closeOnClickOutside)
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (loaderClassName != null) __obj.updateDynamic("loaderClassName")(loaderClassName)
    if (loaderStyle != null) __obj.updateDynamic("loaderStyle")(loaderStyle)
    if (minChar != null) __obj.updateDynamic("minChar")(minChar.asInstanceOf[js.Any])
    if (!js.isUndefined(movePopupAsYouType)) __obj.updateDynamic("movePopupAsYouType")(movePopupAsYouType)
    if (onCaretPositionChange != null) __obj.updateDynamic("onCaretPositionChange")(js.Any.fromFunction1(onCaretPositionChange))
    if (scrollToItem != null) __obj.updateDynamic("scrollToItem")(scrollToItem.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TextareaProps[TItem]]
  }
}

