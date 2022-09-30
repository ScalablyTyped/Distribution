package typings.wordpressComponents

import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.PromiseLike
import typings.wordpressComponents.autocompleteMod.Autocomplete.Props
import typings.wordpressRichText.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteMod {
  
  object default {
    
    // tslint:disable-next-line:no-unnecessary-generics
    inline def apply[T](props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/components/autocomplete", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object Autocomplete {
    
    /**
      * There are currently two supported actions:
      *   - `insert-at-caret` (default): Insert the `value` into the text.
      *   - `replace`: Replace the current block with the block specified in
      *      the `value` property.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
      - typings.wordpressComponents.wordpressComponentsStrings.replace
    */
    trait Action extends StObject
    object Action {
      
      inline def `insert-at-caret`: typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret` = "insert-at-caret".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`]
      
      inline def replace: typings.wordpressComponents.wordpressComponentsStrings.replace = "replace".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.replace]
    }
    
    trait Completer[T] extends StObject {
      
      /**
        * A function that takes a string before and a string after the
        * autocomplete trigger and query text and returns a boolean indicating
        * whether the completer should be considered for that context.
        */
      var allowContext: js.UndefOr[js.Function2[/* before */ String, /* after */ String, Boolean]] = js.undefined
      
      /**
        * A class name to apply to the autocompletion popup menu.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * A function that takes an option and responds with how the option
        * should be completed.
        *
        * @remarks
        *
        * By default, the result is a value to be inserted in the text.
        * However, a completer may explicitly declare how a completion should
        * be treated by returning an object with action and value properties.
        * The action declares what should be done with the value.
        *
        * There are currently two supported actions:
        *   - `insert-at-caret` (default): Insert the `value` into the text.
        *   - `replace`: Replace the current block with the block specified in
        *      the `value` property.
        *
        * @param value - the value of the completer option.
        * @param query - the text value of the autocomplete query.
        */
      def getOptionCompletion(value: Any, query: String): OptionCompletion
      
      /**
        * A function that returns the keywords for the specified option.
        *
        * @param option - a completer option.
        */
      var getOptionKeywords: js.UndefOr[js.Function1[/* option */ T, js.Array[String]]] = js.undefined
      
      /**
        * A function that returns the label for a given option. A label may be
        * a string or a mixed array of strings, elements, and components.
        *
        * @param option - a completer option.
        */
      def getOptionLabel(option: T): ReactNode
      
      /**
        * Whether to apply debouncing for the autocompleter. Set to `true` to
        * enable debouncing.
        */
      var isDebounced: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A function that returns whether or not the specified option should
        * be disabled. Disabled options cannot be selected.
        *
        * @param option - a completer option.
        */
      var isOptionDisabled: js.UndefOr[js.Function1[/* option */ T, Boolean]] = js.undefined
      
      /**
        * The name of the completer. Useful for identifying a specific
        * completer to be overridden via extensibility hooks.
        */
      var name: String
      
      /**
        * The raw options for completion. May be an array, a function that
        * returns an array, or a function that returns a promise for an array.
        *
        * Options may be of any type or shape. The completer declares how
        * those options are rendered and what their completions should be when
        * selected.
        */
      var options: (js.Function1[/* query */ String, PromiseLike[js.Array[T]] | js.Array[T]]) | js.Array[T]
      
      /**
        * The string prefix that should trigger the completer. For example,
        * Gutenberg's block completer is triggered when the `/` character is
        * entered.
        */
      var triggerPrefix: String
    }
    object Completer {
      
      inline def apply[T](
        getOptionCompletion: (Any, String) => OptionCompletion,
        getOptionLabel: T => ReactNode,
        name: String,
        options: (js.Function1[/* query */ String, PromiseLike[js.Array[T]] | js.Array[T]]) | js.Array[T],
        triggerPrefix: String
      ): Completer[T] = {
        val __obj = js.Dynamic.literal(getOptionCompletion = js.Any.fromFunction2(getOptionCompletion), getOptionLabel = js.Any.fromFunction1(getOptionLabel), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], triggerPrefix = triggerPrefix.asInstanceOf[js.Any])
        __obj.asInstanceOf[Completer[T]]
      }
      
      extension [Self <: Completer[?], T](x: Self & Completer[T]) {
        
        inline def setAllowContext(value: (/* before */ String, /* after */ String) => Boolean): Self = StObject.set(x, "allowContext", js.Any.fromFunction2(value))
        
        inline def setAllowContextUndefined: Self = StObject.set(x, "allowContext", js.undefined)
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setGetOptionCompletion(value: (Any, String) => OptionCompletion): Self = StObject.set(x, "getOptionCompletion", js.Any.fromFunction2(value))
        
        inline def setGetOptionKeywords(value: /* option */ T => js.Array[String]): Self = StObject.set(x, "getOptionKeywords", js.Any.fromFunction1(value))
        
        inline def setGetOptionKeywordsUndefined: Self = StObject.set(x, "getOptionKeywords", js.undefined)
        
        inline def setGetOptionLabel(value: T => ReactNode): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
        
        inline def setIsDebounced(value: Boolean): Self = StObject.set(x, "isDebounced", value.asInstanceOf[js.Any])
        
        inline def setIsDebouncedUndefined: Self = StObject.set(x, "isDebounced", js.undefined)
        
        inline def setIsOptionDisabled(value: /* option */ T => Boolean): Self = StObject.set(x, "isOptionDisabled", js.Any.fromFunction1(value))
        
        inline def setIsOptionDisabledUndefined: Self = StObject.set(x, "isOptionDisabled", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOptions(value: (js.Function1[/* query */ String, PromiseLike[js.Array[T]] | js.Array[T]]) | js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsFunction1(value: /* query */ String => PromiseLike[js.Array[T]] | js.Array[T]): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
        
        inline def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value*))
        
        inline def setTriggerPrefix(value: String): Self = StObject.set(x, "triggerPrefix", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.mod.ReactNode
      - typings.wordpressComponents.anon.Action
      - typings.wordpressComponents.anon.Value
    */
    type OptionCompletion = _OptionCompletion | ReactNode
    
    trait Props[T] extends StObject {
      
      def children(props: RenderProps): Element | Null
      
      var completers: js.Array[Completer[T]]
      
      var isSelected: js.UndefOr[Boolean] = js.undefined
      
      var onChange: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.undefined
      
      var onReplace: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.undefined
      
      var record: js.UndefOr[Value] = js.undefined
    }
    object Props {
      
      inline def apply[T](children: RenderProps => Element | Null, completers: js.Array[Completer[T]]): Props[T] = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), completers = completers.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props[T]]
      }
      
      extension [Self <: Props[?], T](x: Self & Props[T]) {
        
        inline def setChildren(value: RenderProps => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        inline def setCompleters(value: js.Array[Completer[T]]): Self = StObject.set(x, "completers", value.asInstanceOf[js.Any])
        
        inline def setCompletersVarargs(value: Completer[T]*): Self = StObject.set(x, "completers", js.Array(value*))
        
        inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
        
        inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
        
        inline def setOnChange(value: /* value */ Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        inline def setOnReplace(value: /* value */ Value => Unit): Self = StObject.set(x, "onReplace", js.Any.fromFunction1(value))
        
        inline def setOnReplaceUndefined: Self = StObject.set(x, "onReplace", js.undefined)
        
        inline def setRecord(value: Value): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
        
        inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      }
    }
    
    trait RenderProps extends StObject {
      
      var activeId: String
      
      var isExpanded: Boolean
      
      var listBoxId: String
      
      def onKeyDown(event: KeyboardEvent[HTMLElement]): Unit
    }
    object RenderProps {
      
      inline def apply(
        activeId: String,
        isExpanded: Boolean,
        listBoxId: String,
        onKeyDown: KeyboardEvent[HTMLElement] => Unit
      ): RenderProps = {
        val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], listBoxId = listBoxId.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown))
        __obj.asInstanceOf[RenderProps]
      }
      
      extension [Self <: RenderProps](x: Self) {
        
        inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
        
        inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
        
        inline def setListBoxId(value: String): Self = StObject.set(x, "listBoxId", value.asInstanceOf[js.Any])
        
        inline def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      }
    }
    
    trait _OptionCompletion extends StObject
    object _OptionCompletion {
      
      inline def Action(): typings.wordpressComponents.anon.Action = {
        val __obj = js.Dynamic.literal(action = "insert-at-caret")
        __obj.asInstanceOf[typings.wordpressComponents.anon.Action]
      }
      
      inline def Value(value: typings.wordpressRichText.mod.Value): typings.wordpressComponents.anon.Value = {
        val __obj = js.Dynamic.literal(action = "replace", value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressComponents.anon.Value]
      }
    }
  }
}
