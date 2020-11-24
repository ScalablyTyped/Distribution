package typings.wordpressComponents.autocompleteMod.Autocomplete

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Completer[T] extends js.Object {
  
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
  implicit class CompleterOps[Self <: Completer[_], T] (val x: Self with Completer[T]) extends AnyVal {
    
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
    def setGetOptionCompletion(value: (js.Any, String) => OptionCompletion): Self = this.set("getOptionCompletion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetOptionLabel(value: T => ReactNode): Self = this.set("getOptionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: T*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptionsFunction1(value: /* query */ String => js.Thenable[js.Array[T]] | js.Array[T]): Self = this.set("options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: (js.Function1[/* query */ String, js.Thenable[js.Array[T]] | js.Array[T]]) | js.Array[T]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerPrefix(value: String): Self = this.set("triggerPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowContext(value: (/* before */ String, /* after */ String) => Boolean): Self = this.set("allowContext", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAllowContext: Self = this.set("allowContext", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setGetOptionKeywords(value: /* option */ T => js.Array[String]): Self = this.set("getOptionKeywords", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOptionKeywords: Self = this.set("getOptionKeywords", js.undefined)
    
    @scala.inline
    def setIsDebounced(value: Boolean): Self = this.set("isDebounced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDebounced: Self = this.set("isDebounced", js.undefined)
    
    @scala.inline
    def setIsOptionDisabled(value: /* option */ T => Boolean): Self = this.set("isOptionDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsOptionDisabled: Self = this.set("isOptionDisabled", js.undefined)
  }
}
