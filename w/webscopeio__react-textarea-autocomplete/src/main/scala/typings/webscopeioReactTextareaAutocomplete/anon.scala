package typings.webscopeioReactTextareaAutocomplete

import typings.react.mod.CSSProperties
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import typings.webscopeioReactTextareaAutocomplete.mod.TriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BoundariesElement[TItem, CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */] extends StObject {
    
    /**
      * Element which should prevent autocomplete to overflow. Defaults to body.
      */
    var boundariesElement: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * ClassNames of the textarea.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * ClassNames of the textarea's container.
      */
    var containerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Styles of textarea's container.
      */
    var containerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      *     ClassNames of dropdown's wrapper.
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
      *     ClassNames of list's wrapper.
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
    var loadingComponent: typings.webscopeioReactTextareaAutocomplete.mod.Component[Data[TItem]]
    
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
    
    /**
      * Listener called every time the textarea's caret position is changed.
      * The listener is called with one attribute - caret position denoted by an integer number.
      */
    var onCaretPositionChange: js.UndefOr[js.Function1[/* pos */ Double, Unit]] = js.undefined
    
    /**
      * Callback get called everytime item is highlighted in the list
      */
    var onItemHighlighted: js.UndefOr[js.Function1[/* event */ CurrentTrigger[TItem], Unit]] = js.undefined
    
    /**
      * Callback get called everytime item is selected
      */
    var onItemSelected: js.UndefOr[js.Function1[/* event */ Item[TItem], Unit]] = js.undefined
    
    /**
      * When set to true the autocomplete will be rendered at the end of the <body>
      * @default false
      */
    var renderToBody: js.UndefOr[Boolean] = js.undefined
    
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
      * What component use for as textarea. Default is textarea. (You can combine this with react-autosize-textarea for instance)
      */
    var textAreaComponent: js.UndefOr[
        typings.webscopeioReactTextareaAutocomplete.mod.Component[CustomTextAreaProps] | Component[CustomTextAreaProps]
      ] = js.undefined
    
    /**
      * Define triggers and their corresponding behavior.
      */
    var trigger: TriggerType[TItem]
  }
  object BoundariesElement {
    
    inline def apply[TItem, CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */](
      loadingComponent: typings.webscopeioReactTextareaAutocomplete.mod.Component[Data[TItem]],
      trigger: TriggerType[TItem]
    ): BoundariesElement[TItem, CustomTextAreaProps] = {
      val __obj = js.Dynamic.literal(loadingComponent = loadingComponent.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundariesElement[TItem, CustomTextAreaProps]]
    }
    
    extension [Self <: BoundariesElement[?, ?], TItem, CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */](x: Self & (BoundariesElement[TItem, CustomTextAreaProps])) {
      
      inline def setBoundariesElement(value: String | HTMLElement): Self = StObject.set(x, "boundariesElement", value.asInstanceOf[js.Any])
      
      inline def setBoundariesElementUndefined: Self = StObject.set(x, "boundariesElement", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      inline def setDropdownStyle(value: CSSProperties): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      inline def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
      
      inline def setInnerRef(value: /* ref */ HTMLTextAreaElement => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setItemClassName(value: String): Self = StObject.set(x, "itemClassName", value.asInstanceOf[js.Any])
      
      inline def setItemClassNameUndefined: Self = StObject.set(x, "itemClassName", js.undefined)
      
      inline def setItemStyle(value: CSSProperties): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setListClassName(value: String): Self = StObject.set(x, "listClassName", value.asInstanceOf[js.Any])
      
      inline def setListClassNameUndefined: Self = StObject.set(x, "listClassName", js.undefined)
      
      inline def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setLoaderClassName(value: String): Self = StObject.set(x, "loaderClassName", value.asInstanceOf[js.Any])
      
      inline def setLoaderClassNameUndefined: Self = StObject.set(x, "loaderClassName", js.undefined)
      
      inline def setLoaderStyle(value: CSSProperties): Self = StObject.set(x, "loaderStyle", value.asInstanceOf[js.Any])
      
      inline def setLoaderStyleUndefined: Self = StObject.set(x, "loaderStyle", js.undefined)
      
      inline def setLoadingComponent(value: typings.webscopeioReactTextareaAutocomplete.mod.Component[Data[TItem]]): Self = StObject.set(x, "loadingComponent", value.asInstanceOf[js.Any])
      
      inline def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
      
      inline def setMinCharUndefined: Self = StObject.set(x, "minChar", js.undefined)
      
      inline def setMovePopupAsYouType(value: Boolean): Self = StObject.set(x, "movePopupAsYouType", value.asInstanceOf[js.Any])
      
      inline def setMovePopupAsYouTypeUndefined: Self = StObject.set(x, "movePopupAsYouType", js.undefined)
      
      inline def setOnCaretPositionChange(value: /* pos */ Double => Unit): Self = StObject.set(x, "onCaretPositionChange", js.Any.fromFunction1(value))
      
      inline def setOnCaretPositionChangeUndefined: Self = StObject.set(x, "onCaretPositionChange", js.undefined)
      
      inline def setOnItemHighlighted(value: /* event */ CurrentTrigger[TItem] => Unit): Self = StObject.set(x, "onItemHighlighted", js.Any.fromFunction1(value))
      
      inline def setOnItemHighlightedUndefined: Self = StObject.set(x, "onItemHighlighted", js.undefined)
      
      inline def setOnItemSelected(value: /* event */ Item[TItem] => Unit): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1(value))
      
      inline def setOnItemSelectedUndefined: Self = StObject.set(x, "onItemSelected", js.undefined)
      
      inline def setRenderToBody(value: Boolean): Self = StObject.set(x, "renderToBody", value.asInstanceOf[js.Any])
      
      inline def setRenderToBodyUndefined: Self = StObject.set(x, "renderToBody", js.undefined)
      
      inline def setScrollToItem(value: Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit])): Self = StObject.set(x, "scrollToItem", value.asInstanceOf[js.Any])
      
      inline def setScrollToItemFunction2(value: (/* container */ HTMLDivElement, /* item */ HTMLDivElement) => Unit): Self = StObject.set(x, "scrollToItem", js.Any.fromFunction2(value))
      
      inline def setScrollToItemUndefined: Self = StObject.set(x, "scrollToItem", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextAreaComponent(
        value: typings.webscopeioReactTextareaAutocomplete.mod.Component[CustomTextAreaProps] | Component[CustomTextAreaProps]
      ): Self = StObject.set(x, "textAreaComponent", value.asInstanceOf[js.Any])
      
      inline def setTextAreaComponentUndefined: Self = StObject.set(x, "textAreaComponent", js.undefined)
      
      inline def setTrigger(value: TriggerType[TItem]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  trait Component[CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */] extends StObject {
    
    var component: typings.webscopeioReactTextareaAutocomplete.mod.Component[CustomTextAreaProps]
    
    var ref: String
  }
  object Component {
    
    inline def apply[CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */](
      component: typings.webscopeioReactTextareaAutocomplete.mod.Component[CustomTextAreaProps],
      ref: String
    ): Component[CustomTextAreaProps] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component[CustomTextAreaProps]]
    }
    
    extension [Self <: Component[?], CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */](x: Self & Component[CustomTextAreaProps]) {
      
      inline def setComponent(value: typings.webscopeioReactTextareaAutocomplete.mod.Component[CustomTextAreaProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait CurrentTrigger[TItem] extends StObject {
    
    var currentTrigger: String
    
    var item: TItem | Null
  }
  object CurrentTrigger {
    
    inline def apply[TItem](currentTrigger: String): CurrentTrigger[TItem] = {
      val __obj = js.Dynamic.literal(currentTrigger = currentTrigger.asInstanceOf[js.Any], item = null)
      __obj.asInstanceOf[CurrentTrigger[TItem]]
    }
    
    extension [Self <: CurrentTrigger[?], TItem](x: Self & CurrentTrigger[TItem]) {
      
      inline def setCurrentTrigger(value: String): Self = StObject.set(x, "currentTrigger", value.asInstanceOf[js.Any])
      
      inline def setItem(value: TItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemNull: Self = StObject.set(x, "item", null)
    }
  }
  
  trait Data[TItem] extends StObject {
    
    var data: js.Array[TItem] | js.Promise[js.Array[TItem]]
  }
  object Data {
    
    inline def apply[TItem](data: js.Array[TItem] | js.Promise[js.Array[TItem]]): Data[TItem] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[TItem]]
    }
    
    extension [Self <: Data[?], TItem](x: Self & Data[TItem]) {
      
      inline def setData(value: js.Array[TItem] | js.Promise[js.Array[TItem]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: TItem*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait Item[TItem] extends StObject {
    
    var currentTrigger: String
    
    var item: TItem
  }
  object Item {
    
    inline def apply[TItem](currentTrigger: String, item: TItem): Item[TItem] = {
      val __obj = js.Dynamic.literal(currentTrigger = currentTrigger.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item[TItem]]
    }
    
    extension [Self <: Item[?], TItem](x: Self & Item[TItem]) {
      
      inline def setCurrentTrigger(value: String): Self = StObject.set(x, "currentTrigger", value.asInstanceOf[js.Any])
      
      inline def setItem(value: TItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionEnd extends StObject {
    
    var selectionEnd: Double
    
    var selectionStart: Double
  }
  object SelectionEnd {
    
    inline def apply(selectionEnd: Double, selectionStart: Double): SelectionEnd = {
      val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionEnd]
    }
    
    extension [Self <: SelectionEnd](x: Self) {
      
      inline def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
      
      inline def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    }
  }
}
