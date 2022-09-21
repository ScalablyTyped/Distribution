package typings.webscopeioReactTextareaAutocomplete

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import typings.webscopeioReactTextareaAutocomplete.anon.BoundariesElement
import typings.webscopeioReactTextareaAutocomplete.anon.SelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@webscopeio/react-textarea-autocomplete", JSImport.Default)
  @js.native
  open class default[TItem /* <: String | js.Object */, CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */] () extends ReactTextareaAutocomplete[TItem, CustomTextAreaProps]
  
  /* Rewritten from type alias, can be one of: 
    - typings.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.start
    - typings.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.end
    - typings.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.next
    - scala.Double
  */
  type CaretPositionType = _CaretPositionType | Double
  
  type Component[P /* <: js.Object */] = FunctionComponent[P] | (ComponentClass[P, ComponentState])
  
  type DataProviderType[TItem] = js.Function1[/* token */ String, js.Promise[js.Array[TItem]] | js.Array[TItem]]
  
  trait ItemComponentProps[TItem] extends StObject {
    
    var entity: TItem
    
    var selected: Boolean
  }
  object ItemComponentProps {
    
    inline def apply[TItem](entity: TItem, selected: Boolean): ItemComponentProps[TItem] = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemComponentProps[TItem]]
    }
    
    extension [Self <: ItemComponentProps[?], TItem](x: Self & ItemComponentProps[TItem]) {
      
      inline def setEntity(value: TItem): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactTextareaAutocomplete[TItem /* <: String | js.Object */, CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */]
    extends typings.react.mod.Component[TextareaProps[TItem, CustomTextAreaProps], TextareaState[TItem], Any] {
    
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
    var component: Component[ItemComponentProps[TItem]]
    
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
    
    inline def apply[TItem](
      component: Component[ItemComponentProps[TItem]],
      dataProvider: /* token */ String => js.Promise[js.Array[TItem]] | js.Array[TItem]
    ): SettingType[TItem] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dataProvider = js.Any.fromFunction1(dataProvider))
      __obj.asInstanceOf[SettingType[TItem]]
    }
    
    extension [Self <: SettingType[?], TItem](x: Self & SettingType[TItem]) {
      
      inline def setAfterWhitespace(value: Boolean): Self = StObject.set(x, "afterWhitespace", value.asInstanceOf[js.Any])
      
      inline def setAfterWhitespaceUndefined: Self = StObject.set(x, "afterWhitespace", js.undefined)
      
      inline def setAllowWhitespace(value: Boolean): Self = StObject.set(x, "allowWhitespace", value.asInstanceOf[js.Any])
      
      inline def setAllowWhitespaceUndefined: Self = StObject.set(x, "allowWhitespace", js.undefined)
      
      inline def setComponent(value: Component[ItemComponentProps[TItem]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDataProvider(value: /* token */ String => js.Promise[js.Array[TItem]] | js.Array[TItem]): Self = StObject.set(x, "dataProvider", js.Any.fromFunction1(value))
      
      inline def setOutput(value: (/* item */ TItem, /* trigger */ js.UndefOr[String]) => TextToReplaceType | String): Self = StObject.set(x, "output", js.Any.fromFunction2(value))
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  trait TextToReplaceType extends StObject {
    
    var caretPosition: CaretPositionType
    
    var key: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object TextToReplaceType {
    
    inline def apply(caretPosition: CaretPositionType, text: String): TextToReplaceType = {
      val __obj = js.Dynamic.literal(caretPosition = caretPosition.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextToReplaceType]
    }
    
    extension [Self <: TextToReplaceType](x: Self) {
      
      inline def setCaretPosition(value: CaretPositionType): Self = StObject.set(x, "caretPosition", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type TextareaProps[TItem, CustomTextAreaProps /* <: TextareaHTMLAttributes[HTMLTextAreaElement] */] = CustomTextAreaProps & (BoundariesElement[TItem, CustomTextAreaProps])
  
  trait TextareaState[TItem] extends StObject {
    
    var actualToken: String
    
    var component: js.UndefOr[FC[ItemComponentProps[TItem]]] = js.undefined
    
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
    
    inline def apply[TItem](
      actualToken: String,
      dataLoading: Boolean,
      selectionEnd: Double,
      selectionStart: Double,
      value: String
    ): TextareaState[TItem] = {
      val __obj = js.Dynamic.literal(actualToken = actualToken.asInstanceOf[js.Any], dataLoading = dataLoading.asInstanceOf[js.Any], selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextareaState[TItem]]
    }
    
    extension [Self <: TextareaState[?], TItem](x: Self & TextareaState[TItem]) {
      
      inline def setActualToken(value: String): Self = StObject.set(x, "actualToken", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: FC[ItemComponentProps[TItem]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCurrentTrigger(value: String): Self = StObject.set(x, "currentTrigger", value.asInstanceOf[js.Any])
      
      inline def setCurrentTriggerUndefined: Self = StObject.set(x, "currentTrigger", js.undefined)
      
      inline def setData(value: js.Array[TItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataLoading(value: Boolean): Self = StObject.set(x, "dataLoading", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: TItem*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
      
      inline def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TriggerType[TItem] = StringDictionary[SettingType[TItem]]
  
  trait _CaretPositionType extends StObject
}
