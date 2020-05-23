package typings.wordpressComponents.autocompleteMod.Autocomplete

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Completer[T] extends js.Object {
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
    * A function that returns the keywords for the specified option.
    *
    * @param option - a completer option.
    */
  var getOptionKeywords: js.UndefOr[js.Function1[/* option */ T, js.Array[String]]] = js.undefined
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
  var options: (js.Function1[/* query */ String, js.Thenable[js.Array[T]] | js.Array[T]]) | js.Array[T]
  /**
    * The string prefix that should trigger the completer. For example,
    * Gutenberg's block completer is triggered when the `/` character is
    * entered.
    */
  var triggerPrefix: String
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
  def getOptionCompletion(value: js.Any, query: String): OptionCompletion
  /**
    * A function that returns the label for a given option. A label may be
    * a string or a mixed array of strings, elements, and components.
    *
    * @param option - a completer option.
    */
  def getOptionLabel(option: T): ReactNode
}

object Completer {
  @scala.inline
  def apply[T](
    getOptionCompletion: (js.Any, String) => OptionCompletion,
    getOptionLabel: T => ReactNode,
    name: String,
    options: (js.Function1[/* query */ String, js.Thenable[js.Array[T]] | js.Array[T]]) | js.Array[T],
    triggerPrefix: String,
    allowContext: (/* before */ String, /* after */ String) => Boolean = null,
    className: String = null,
    getOptionKeywords: /* option */ T => js.Array[String] = null,
    isDebounced: js.UndefOr[Boolean] = js.undefined,
    isOptionDisabled: /* option */ T => Boolean = null
  ): Completer[T] = {
    val __obj = js.Dynamic.literal(getOptionCompletion = js.Any.fromFunction2(getOptionCompletion), getOptionLabel = js.Any.fromFunction1(getOptionLabel), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], triggerPrefix = triggerPrefix.asInstanceOf[js.Any])
    if (allowContext != null) __obj.updateDynamic("allowContext")(js.Any.fromFunction2(allowContext))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (getOptionKeywords != null) __obj.updateDynamic("getOptionKeywords")(js.Any.fromFunction1(getOptionKeywords))
    if (!js.isUndefined(isDebounced)) __obj.updateDynamic("isDebounced")(isDebounced.get.asInstanceOf[js.Any])
    if (isOptionDisabled != null) __obj.updateDynamic("isOptionDisabled")(js.Any.fromFunction1(isOptionDisabled))
    __obj.asInstanceOf[Completer[T]]
  }
}

