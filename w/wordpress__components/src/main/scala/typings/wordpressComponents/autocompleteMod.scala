package typings.wordpressComponents

import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.wordpressComponents.autocompleteMod.Autocomplete.Props
import typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
import typings.wordpressComponents.wordpressComponentsStrings.replace
import typings.wordpressRichText.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteMod {
  
  object default {
    
    // tslint:disable-next-line:no-unnecessary-generics
    @JSImport("@wordpress/components/autocomplete", JSImport.Default)
    @js.native
    def apply[T](props: Props[T]): Element = js.native
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
      
      @scala.inline
      def `insert-at-caret`: typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret` = "insert-at-caret".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`]
      
      @scala.inline
      def replace: typings.wordpressComponents.wordpressComponentsStrings.replace = "replace".asInstanceOf[typings.wordpressComponents.wordpressComponentsStrings.replace]
    }
    
    @js.native
    trait Completer[T] extends StObject {
      
      /**
        * A function that takes a string before and a string after the
        * autocomplete trigger and query text and returns a boolean indicating
        * whether the completer should be considered for that context.
        */
      var allowContext: js.UndefOr[js.Function2[/* before */ String, /* after */ String, Boolean]] = js.native
      
      /**
        * A class name to apply to the autocompletion popup menu.
        */
      var className: js.UndefOr[String] = js.native
      
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
      def getOptionCompletion(value: js.Any, query: String): OptionCompletion = js.native
      
      /**
        * A function that returns the keywords for the specified option.
        *
        * @param option - a completer option.
        */
      var getOptionKeywords: js.UndefOr[js.Function1[/* option */ T, js.Array[String]]] = js.native
      
      /**
        * A function that returns the label for a given option. A label may be
        * a string or a mixed array of strings, elements, and components.
        *
        * @param option - a completer option.
        */
      def getOptionLabel(option: T): ReactNode = js.native
      
      /**
        * Whether to apply debouncing for the autocompleter. Set to `true` to
        * enable debouncing.
        */
      var isDebounced: js.UndefOr[Boolean] = js.native
      
      /**
        * A function that returns whether or not the specified option should
        * be disabled. Disabled options cannot be selected.
        *
        * @param option - a completer option.
        */
      var isOptionDisabled: js.UndefOr[js.Function1[/* option */ T, Boolean]] = js.native
      
      /**
        * The name of the completer. Useful for identifying a specific
        * completer to be overridden via extensibility hooks.
        */
      var name: String = js.native
      
      /**
        * The raw options for completion. May be an array, a function that
        * returns an array, or a function that returns a promise for an array.
        *
        * Options may be of any type or shape. The completer declares how
        * those options are rendered and what their completions should be when
        * selected.
        */
      var options: (js.Function1[/* query */ String, js.Thenable[js.Array[T]] | js.Array[T]]) | js.Array[T] = js.native
      
      /**
        * The string prefix that should trigger the completer. For example,
        * Gutenberg's block completer is triggered when the `/` character is
        * entered.
        */
      var triggerPrefix: String = js.native
    }
    object Completer {
      
      @scala.inline
      def apply[T](
        getOptionCompletion: (js.Any, String) => OptionCompletion,
        getOptionLabel: T => ReactNode,
        name: String,
        options: (js.Function1[/* query */ String, js.Thenable[js.Array[T]] | js.Array[T]]) | js.Array[T],
        triggerPrefix: String
      ): Completer[T] = {
        val __obj = js.Dynamic.literal(getOptionCompletion = js.Any.fromFunction2(getOptionCompletion), getOptionLabel = js.Any.fromFunction1(getOptionLabel), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], triggerPrefix = triggerPrefix.asInstanceOf[js.Any])
        __obj.asInstanceOf[Completer[T]]
      }
      
      @scala.inline
      implicit class CompleterMutableBuilder[Self <: Completer[_], T] (val x: Self with Completer[T]) extends AnyVal {
        
        @scala.inline
        def setAllowContext(value: (/* before */ String, /* after */ String) => Boolean): Self = StObject.set(x, "allowContext", js.Any.fromFunction2(value))
        
        @scala.inline
        def setAllowContextUndefined: Self = StObject.set(x, "allowContext", js.undefined)
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setGetOptionCompletion(value: (js.Any, String) => OptionCompletion): Self = StObject.set(x, "getOptionCompletion", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetOptionKeywords(value: /* option */ T => js.Array[String]): Self = StObject.set(x, "getOptionKeywords", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetOptionKeywordsUndefined: Self = StObject.set(x, "getOptionKeywords", js.undefined)
        
        @scala.inline
        def setGetOptionLabel(value: T => ReactNode): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
        
        @scala.inline
        def setIsDebounced(value: Boolean): Self = StObject.set(x, "isDebounced", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDebouncedUndefined: Self = StObject.set(x, "isDebounced", js.undefined)
        
        @scala.inline
        def setIsOptionDisabled(value: /* option */ T => Boolean): Self = StObject.set(x, "isOptionDisabled", js.Any.fromFunction1(value))
        
        @scala.inline
        def setIsOptionDisabledUndefined: Self = StObject.set(x, "isOptionDisabled", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptions(value: (js.Function1[/* query */ String, js.Thenable[js.Array[T]] | js.Array[T]]) | js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsFunction1(value: /* query */ String => js.Thenable[js.Array[T]] | js.Array[T]): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
        
        @scala.inline
        def setTriggerPrefix(value: String): Self = StObject.set(x, "triggerPrefix", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.mod.ReactNode
      - typings.wordpressComponents.anon.Action
      - typings.wordpressComponents.anon.Value
    */
    type OptionCompletion = _OptionCompletion | ReactNode
    
    @js.native
    trait Props[T] extends StObject {
      
      def children(props: RenderProps): Element | Null = js.native
      
      var completers: js.Array[Completer[T]] = js.native
      
      var isSelected: js.UndefOr[Boolean] = js.native
      
      var onChange: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.native
      
      var onReplace: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.native
      
      var record: js.UndefOr[Value] = js.native
    }
    object Props {
      
      @scala.inline
      def apply[T](children: RenderProps => Element | Null, completers: js.Array[Completer[T]]): Props[T] = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), completers = completers.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props[T]]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props[_], T] (val x: Self with Props[T]) extends AnyVal {
        
        @scala.inline
        def setChildren(value: RenderProps => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCompleters(value: js.Array[Completer[T]]): Self = StObject.set(x, "completers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompletersVarargs(value: Completer[T]*): Self = StObject.set(x, "completers", js.Array(value :_*))
        
        @scala.inline
        def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
        
        @scala.inline
        def setOnChange(value: /* value */ Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        @scala.inline
        def setOnReplace(value: /* value */ Value => Unit): Self = StObject.set(x, "onReplace", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnReplaceUndefined: Self = StObject.set(x, "onReplace", js.undefined)
        
        @scala.inline
        def setRecord(value: Value): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      }
    }
    
    @js.native
    trait RenderProps extends StObject {
      
      var activeId: String = js.native
      
      var isExpanded: Boolean = js.native
      
      var listBoxId: String = js.native
      
      def onKeyDown(event: KeyboardEvent[HTMLElement]): Unit = js.native
    }
    object RenderProps {
      
      @scala.inline
      def apply(
        activeId: String,
        isExpanded: Boolean,
        listBoxId: String,
        onKeyDown: KeyboardEvent[HTMLElement] => Unit
      ): RenderProps = {
        val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], listBoxId = listBoxId.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown))
        __obj.asInstanceOf[RenderProps]
      }
      
      @scala.inline
      implicit class RenderPropsMutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setListBoxId(value: String): Self = StObject.set(x, "listBoxId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      }
    }
    
    trait _OptionCompletion extends StObject
    object _OptionCompletion {
      
      @scala.inline
      def Action(action: `insert-at-caret`): typings.wordpressComponents.anon.Action = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressComponents.anon.Action]
      }
      
      @scala.inline
      def Value(action: replace, value: typings.wordpressRichText.mod.Value): typings.wordpressComponents.anon.Value = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.wordpressComponents.anon.Value]
      }
    }
  }
}
