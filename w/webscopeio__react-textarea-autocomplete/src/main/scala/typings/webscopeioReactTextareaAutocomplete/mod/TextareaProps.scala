package typings.webscopeioReactTextareaAutocomplete.mod

import typings.react.mod.CSSProperties
import typings.react.mod.SFC
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextareaProps[TItem] extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  /**
    *     When it's true autocomplete will close when use click outside.
    * @default false
    */
  var closeOnClickOutside: js.UndefOr[Boolean] = js.native
  /**
    * ClassNames of the textarea's container.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Styles of textarea's container.
    */
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  /**
    *     ClassNames of dropdown's wrapper.
    */
  var dropdownClassName: js.UndefOr[String] = js.native
  /**
    * Styles of dropdown's wrapper.
    */
  var dropdownStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Allows you to get React ref of the underlying textarea.
    */
  var innerRef: js.UndefOr[js.Function1[/* ref */ HTMLTextAreaElement, Unit]] = js.native
  /**
    * ClassNames of item's wrapper.
    */
  var itemClassName: js.UndefOr[String] = js.native
  /**
    * Styles of item's wrapper.
    */
  var itemStyle: js.UndefOr[CSSProperties] = js.native
  /**
    *     ClassNames of list's wrapper.
    */
  var listClassName: js.UndefOr[String] = js.native
  /**
    * Styles of list's wrapper.
    */
  var listStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * ClassNames of loader's wrapper.
    */
  var loaderClassName: js.UndefOr[String] = js.native
  /**
    * Styles of loader's wrapper.
    */
  var loaderStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Gets data props which is already fetched (and displayed) suggestion.
    */
  var loadingComponent: SFC[js.Object] = js.native
  /**
    * Number of characters that user should type for trigger a suggestion.
    * @default 1
    */
  var minChar: js.UndefOr[Double] = js.native
  /**
    * When it's true the textarea will move along with a caret as a user continues to type.
    * @default false
    */
  var movePopupAsYouType: js.UndefOr[Boolean] = js.native
  /**
    * Listener called every time the textarea's caret position is changed. The listener is called with one attribute - caret position denoted by an integer number.
    */
  var onCaretPositionChange: js.UndefOr[js.Function1[/* pos */ Double, Unit]] = js.native
  /**
    * With default implementation it will scroll the dropdown every time when the item gets out of the view.
    * @default true
    */
  var scrollToItem: js.UndefOr[
    Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit])
  ] = js.native
  /**
    * Define triggers and their corresponding behavior.
    */
  var trigger: TriggerType[TItem] = js.native
}

object TextareaProps {
  @scala.inline
  def apply[TItem](loadingComponent: SFC[js.Object], trigger: TriggerType[TItem]): TextareaProps[TItem] = {
    val __obj = js.Dynamic.literal(loadingComponent = loadingComponent.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaProps[TItem]]
  }
  @scala.inline
  implicit class TextareaPropsOps[Self <: TextareaProps[_], TItem] (val x: Self with TextareaProps[TItem]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadingComponent(value: SFC[js.Object]): Self = this.set("loadingComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrigger(value: TriggerType[TItem]): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseOnClickOutside(value: Boolean): Self = this.set("closeOnClickOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClickOutside: Self = this.set("closeOnClickOutside", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setDropdownClassName(value: String): Self = this.set("dropdownClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownClassName: Self = this.set("dropdownClassName", js.undefined)
    @scala.inline
    def setDropdownStyle(value: CSSProperties): Self = this.set("dropdownStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownStyle: Self = this.set("dropdownStyle", js.undefined)
    @scala.inline
    def setInnerRef(value: /* ref */ HTMLTextAreaElement => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setItemClassName(value: String): Self = this.set("itemClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemClassName: Self = this.set("itemClassName", js.undefined)
    @scala.inline
    def setItemStyle(value: CSSProperties): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setListClassName(value: String): Self = this.set("listClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListClassName: Self = this.set("listClassName", js.undefined)
    @scala.inline
    def setListStyle(value: CSSProperties): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setLoaderClassName(value: String): Self = this.set("loaderClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaderClassName: Self = this.set("loaderClassName", js.undefined)
    @scala.inline
    def setLoaderStyle(value: CSSProperties): Self = this.set("loaderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaderStyle: Self = this.set("loaderStyle", js.undefined)
    @scala.inline
    def setMinChar(value: Double): Self = this.set("minChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinChar: Self = this.set("minChar", js.undefined)
    @scala.inline
    def setMovePopupAsYouType(value: Boolean): Self = this.set("movePopupAsYouType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovePopupAsYouType: Self = this.set("movePopupAsYouType", js.undefined)
    @scala.inline
    def setOnCaretPositionChange(value: /* pos */ Double => Unit): Self = this.set("onCaretPositionChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCaretPositionChange: Self = this.set("onCaretPositionChange", js.undefined)
    @scala.inline
    def setScrollToItemFunction2(value: (/* container */ HTMLDivElement, /* item */ HTMLDivElement) => Unit): Self = this.set("scrollToItem", js.Any.fromFunction2(value))
    @scala.inline
    def setScrollToItem(value: Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit])): Self = this.set("scrollToItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToItem: Self = this.set("scrollToItem", js.undefined)
  }
  
}

