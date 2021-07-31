package typings.webscopeioReactTextareaAutocomplete

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.SFC
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLTextAreaElement
import typings.webscopeioReactTextareaAutocomplete.anon.SelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@webscopeio/react-textarea-autocomplete", JSImport.Default)
  @js.native
  class default[TItem /* <: String | js.Object */] () extends ReactTextareaAutocomplete[TItem]
  
  /* Rewritten from type alias, can be one of: 
    - typings.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.start
    - typings.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.end
    - typings.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.next
    - scala.Double
  */
  type CaretPositionType = _CaretPositionType | Double
  
  type DataProviderType[TItem] = js.Function1[/* token */ String, js.Promise[js.Array[TItem]] | js.Array[TItem]]
  
  trait ItemComponentProps[TItem] extends StObject {
    
    var entity: TItem
    
    var selected: Boolean
  }
  object ItemComponentProps {
    
    @scala.inline
    def apply[TItem](entity: TItem, selected: Boolean): ItemComponentProps[TItem] = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemComponentProps[TItem]]
    }
    
    @scala.inline
    implicit class ItemComponentPropsMutableBuilder[Self <: ItemComponentProps[?], TItem] (val x: Self & ItemComponentProps[TItem]) extends AnyVal {
      
      @scala.inline
      def setEntity(value: TItem): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactTextareaAutocomplete[TItem /* <: String | js.Object */]
    extends Component[TextareaProps[TItem], TextareaState[TItem], js.Any] {
    
    /**
      * Gets the current caret position in the textarea.
      */
    def getCaretPosition(): Double = js.native
    
    /**
      *     Returns currently selected word.
      */
    def getSelectedText(): js.UndefOr[String] = js.native
    
    /**
      * Returns selectionStart and selectionEnd of the textarea.
      */
    def getSelectionPosition(): SelectionEnd = js.native
    
    /**
      * Sets the caret position to the integer value passed as the argument.
      * @param position caret position to set.
      */
    def setCaretPosition(position: Double): Unit = js.native
  }
  
  trait SettingType[TItem] extends StObject {
    
    /**
      * Show autocomplete only if it's preceded by whitespace. Cannot be combined with allowWhitespace.
      * @default false
      */
    var afterWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set this to true if you want to provide autocomplete for words (tokens) containing whitespace.
      * @default false
      */
    var allowWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The component for rendering the item in suggestion list. It has selected and entity props provided by React Textarea Autocomplete.
      */
    var component: SFC[ItemComponentProps[TItem]]
    
    /**
      * Called after each keystroke to get data what the suggestion list should display (array or promise resolving array).
      */
    var dataProvider: DataProviderType[TItem]
    
    /**
      * (Optional for string based item. If the item is an object this method is required) This function defines text
      * which will be placed into textarea after the user makes a selection.
      *
      * You can also specify the behavior of caret if you return object {text: "item", caretPosition: "start"} the caret
      * will be before the word once the user confirms their selection. Other possible value are "next", "end" and number,
      * which is absolute number in contex of textarea (0 is equal position before the first char). Defaults to "next"
      * which is space after the injected word.
      *
      * The default behavior for string based item is a string: <TRIGGER><ITEM><TRIGGER>). This method should always
      * return a unique string, otherwise, you have to use object notation and specify your own key or return object
      * from dataProvider with key property.
      */
    var output: js.UndefOr[
        js.Function2[/* item */ TItem, /* trigger */ js.UndefOr[String], TextToReplaceType | String]
      ] = js.undefined
  }
  object SettingType {
    
    @scala.inline
    def apply[TItem](
      component: SFC[ItemComponentProps[TItem]],
      dataProvider: /* token */ String => js.Promise[js.Array[TItem]] | js.Array[TItem]
    ): SettingType[TItem] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dataProvider = js.Any.fromFunction1(dataProvider))
      __obj.asInstanceOf[SettingType[TItem]]
    }
    
    @scala.inline
    implicit class SettingTypeMutableBuilder[Self <: SettingType[?], TItem] (val x: Self & SettingType[TItem]) extends AnyVal {
      
      @scala.inline
      def setAfterWhitespace(value: Boolean): Self = StObject.set(x, "afterWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterWhitespaceUndefined: Self = StObject.set(x, "afterWhitespace", js.undefined)
      
      @scala.inline
      def setAllowWhitespace(value: Boolean): Self = StObject.set(x, "allowWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowWhitespaceUndefined: Self = StObject.set(x, "allowWhitespace", js.undefined)
      
      @scala.inline
      def setComponent(value: SFC[ItemComponentProps[TItem]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataProvider(value: /* token */ String => js.Promise[js.Array[TItem]] | js.Array[TItem]): Self = StObject.set(x, "dataProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOutput(value: (/* item */ TItem, /* trigger */ js.UndefOr[String]) => TextToReplaceType | String): Self = StObject.set(x, "output", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  trait TextToReplaceType extends StObject {
    
    var caretPosition: CaretPositionType
    
    var key: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object TextToReplaceType {
    
    @scala.inline
    def apply(caretPosition: CaretPositionType, text: String): TextToReplaceType = {
      val __obj = js.Dynamic.literal(caretPosition = caretPosition.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextToReplaceType]
    }
    
    @scala.inline
    implicit class TextToReplaceTypeMutableBuilder[Self <: TextToReplaceType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaretPosition(value: CaretPositionType): Self = StObject.set(x, "caretPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextareaProps[TItem]
    extends StObject
       with TextareaHTMLAttributes[HTMLTextAreaElement] {
    
    /**
      *     When it's true autocomplete will close when use click outside.
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
    
    /**
      * Listener called every time the textarea's caret position is changed. The listener is called with one attribute - caret position denoted by an integer number.
      */
    var onCaretPositionChange: js.UndefOr[js.Function1[/* pos */ Double, Unit]] = js.undefined
    
    /**
      * With default implementation it will scroll the dropdown every time when the item gets out of the view.
      * @default true
      */
    var scrollToItem: js.UndefOr[
        Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit])
      ] = js.undefined
    
    /**
      * Define triggers and their corresponding behavior.
      */
    var trigger: TriggerType[TItem]
  }
  object TextareaProps {
    
    @scala.inline
    def apply[TItem](loadingComponent: SFC[js.Object], trigger: TriggerType[TItem]): TextareaProps[TItem] = {
      val __obj = js.Dynamic.literal(loadingComponent = loadingComponent.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextareaProps[TItem]]
    }
    
    @scala.inline
    implicit class TextareaPropsMutableBuilder[Self <: TextareaProps[?], TItem] (val x: Self & TextareaProps[TItem]) extends AnyVal {
      
      @scala.inline
      def setCloseOnClickOutside(value: Boolean): Self = StObject.set(x, "closeOnClickOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickOutsideUndefined: Self = StObject.set(x, "closeOnClickOutside", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setDropdownStyle(value: CSSProperties): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownStyleUndefined: Self = StObject.set(x, "dropdownStyle", js.undefined)
      
      @scala.inline
      def setInnerRef(value: /* ref */ HTMLTextAreaElement => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setItemClassName(value: String): Self = StObject.set(x, "itemClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemClassNameUndefined: Self = StObject.set(x, "itemClassName", js.undefined)
      
      @scala.inline
      def setItemStyle(value: CSSProperties): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setListClassName(value: String): Self = StObject.set(x, "listClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListClassNameUndefined: Self = StObject.set(x, "listClassName", js.undefined)
      
      @scala.inline
      def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      @scala.inline
      def setLoaderClassName(value: String): Self = StObject.set(x, "loaderClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderClassNameUndefined: Self = StObject.set(x, "loaderClassName", js.undefined)
      
      @scala.inline
      def setLoaderStyle(value: CSSProperties): Self = StObject.set(x, "loaderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderStyleUndefined: Self = StObject.set(x, "loaderStyle", js.undefined)
      
      @scala.inline
      def setLoadingComponent(value: SFC[js.Object]): Self = StObject.set(x, "loadingComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCharUndefined: Self = StObject.set(x, "minChar", js.undefined)
      
      @scala.inline
      def setMovePopupAsYouType(value: Boolean): Self = StObject.set(x, "movePopupAsYouType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovePopupAsYouTypeUndefined: Self = StObject.set(x, "movePopupAsYouType", js.undefined)
      
      @scala.inline
      def setOnCaretPositionChange(value: /* pos */ Double => Unit): Self = StObject.set(x, "onCaretPositionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCaretPositionChangeUndefined: Self = StObject.set(x, "onCaretPositionChange", js.undefined)
      
      @scala.inline
      def setScrollToItem(value: Boolean | (js.Function2[/* container */ HTMLDivElement, /* item */ HTMLDivElement, Unit])): Self = StObject.set(x, "scrollToItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollToItemFunction2(value: (/* container */ HTMLDivElement, /* item */ HTMLDivElement) => Unit): Self = StObject.set(x, "scrollToItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScrollToItemUndefined: Self = StObject.set(x, "scrollToItem", js.undefined)
      
      @scala.inline
      def setTrigger(value: TriggerType[TItem]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextareaState[TItem] extends StObject {
    
    var actualToken: String
    
    var component: js.UndefOr[SFC[ItemComponentProps[TItem]]] = js.undefined
    
    var currentTrigger: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Array[TItem]] = js.undefined
    
    var dataLoading: Boolean
    
    var left: js.UndefOr[Double] = js.undefined
    
    var selectionEnd: Double
    
    var selectionStart: Double
    
    var top: js.UndefOr[Double] = js.undefined
    
    var value: String
  }
  object TextareaState {
    
    @scala.inline
    def apply[TItem](
      actualToken: String,
      dataLoading: Boolean,
      selectionEnd: Double,
      selectionStart: Double,
      value: String
    ): TextareaState[TItem] = {
      val __obj = js.Dynamic.literal(actualToken = actualToken.asInstanceOf[js.Any], dataLoading = dataLoading.asInstanceOf[js.Any], selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextareaState[TItem]]
    }
    
    @scala.inline
    implicit class TextareaStateMutableBuilder[Self <: TextareaState[?], TItem] (val x: Self & TextareaState[TItem]) extends AnyVal {
      
      @scala.inline
      def setActualToken(value: String): Self = StObject.set(x, "actualToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: SFC[ItemComponentProps[TItem]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setCurrentTrigger(value: String): Self = StObject.set(x, "currentTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTriggerUndefined: Self = StObject.set(x, "currentTrigger", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[TItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLoading(value: Boolean): Self = StObject.set(x, "dataLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: TItem*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TriggerType[TItem] = StringDictionary[SettingType[TItem]]
  
  trait _CaretPositionType extends StObject
}
