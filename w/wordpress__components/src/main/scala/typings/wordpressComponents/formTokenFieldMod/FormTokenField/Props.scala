package typings.wordpressComponents.formTokenFieldMod.FormTokenField

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * When true, tokens are not able to be added or removed.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Function to call to transform tokens for display.  (In the editor, this
    * is needed to decode HTML entities embedded in tags - otherwise entities
    * like `&` in tag names are double-encoded like `&amp;`, once by the REST
    * API and once by React).
    */
  var displayTransform: js.UndefOr[js.Function1[/* token */ String, String]] = js.undefined
  /**
    * When true, renders tokens as without a background.
    */
  var isBorderless: js.UndefOr[Boolean] = js.undefined
  /**
    * If passed, `TokenField` will disable ability to add new tokens once
    * number of tokens is greater than or equal to `maxLength`.
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of suggestions to display at a time.
    */
  var maxSuggestions: js.UndefOr[Double] = js.undefined
  /**
    * Function to call when the tokens have changed. An array of new tokens is
    * passed to the callback.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Value], Unit]] = js.undefined
  /**
    * Function to call when the TokenField has been focused on. The event is
    * passed to the callback. Useful for analytics.
    */
  var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  /**
    * Function to call when the users types in the input field. It can be used
    * to trigger autocomplete requests.
    */
  var onInputChange: js.UndefOr[js.Function1[/* token */ String, Unit]] = js.undefined
  /**
    * Function to call to transform tokens for saving.  The default is to trim
    * the token value.  This function is also applied when matching
    * suggestions against the current value so that matching works correctly
    * with leading or trailing spaces.  (In the editor, this is needed to
    * remove leading and trailing spaces from tag names, like wp-admin does.
    * Otherwise the REST API won't save them.)
    */
  var saveTransform: js.UndefOr[js.Function1[/* token */ String, String]] = js.undefined
  /**
    * An array of strings to present to the user as suggested tokens.
    */
  var suggestions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If true, will add a token when `TokenField` is focused and `space` is
    * pressed.
    */
  var tokenizeOnSpace: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of strings or objects to display as tokens in the field. If
    * objects are present in the array, they **must** have a property of
    * `value`. Here is an example object that could be passed in as a value:
    */
  var value: js.UndefOr[js.Array[Value]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayTransform: /* token */ String => String = null,
    isBorderless: js.UndefOr[Boolean] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    maxSuggestions: js.UndefOr[Double] = js.undefined,
    onChange: /* value */ js.Array[Value] => Unit = null,
    onFocus: FocusEvent[Element] => Unit = null,
    onInputChange: /* token */ String => Unit = null,
    saveTransform: /* token */ String => String = null,
    suggestions: js.Array[String] = null,
    tokenizeOnSpace: js.UndefOr[Boolean] = js.undefined,
    value: js.Array[Value] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (displayTransform != null) __obj.updateDynamic("displayTransform")(js.Any.fromFunction1(displayTransform))
    if (!js.isUndefined(isBorderless)) __obj.updateDynamic("isBorderless")(isBorderless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSuggestions)) __obj.updateDynamic("maxSuggestions")(maxSuggestions.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1(onInputChange))
    if (saveTransform != null) __obj.updateDynamic("saveTransform")(js.Any.fromFunction1(saveTransform))
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(tokenizeOnSpace)) __obj.updateDynamic("tokenizeOnSpace")(tokenizeOnSpace.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

