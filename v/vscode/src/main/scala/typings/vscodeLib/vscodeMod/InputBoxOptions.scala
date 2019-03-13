package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputBoxOptions extends js.Object {
  /**
  		 * Set to `true` to keep the input box open when focus moves to another part of the editor or to another window.
  		 */
  var ignoreFocusOut: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Set to `true` to show a password prompt that will not show the typed value.
  		 */
  var password: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * An optional string to show as place holder in the input box to guide the user what to type.
  		 */
  var placeHolder: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The text to display underneath the input box.
  		 */
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * An optional function that will be called to validate input and to give a hint
  		 * to the user.
  		 *
  		 * @param value The current value of the input box.
  		 * @return A human readable string which is presented as diagnostic message.
  		 * Return `undefined`, `null`, or the empty string when 'value' is valid.
  		 */
  var validateInput: js.UndefOr[
    js.Function1[
      /* value */ java.lang.String, 
      js.UndefOr[
        java.lang.String | scala.Null | (vscodeLib.Thenable[js.UndefOr[java.lang.String | scala.Null]])
      ]
    ]
  ] = js.undefined
  /**
  		 * The value to prefill in the input box.
  		 */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Selection of the prefilled [`value`](#InputBoxOptions.value). Defined as tuple of two number where the
  		 * first is the inclusive start index and the second the exclusive end index. When `undefined` the whole
  		 * word will be selected, when empty (start equals end) only the cursor will be set,
  		 * otherwise the defined range will be selected.
  		 */
  var valueSelection: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object InputBoxOptions {
  @scala.inline
  def apply(
    ignoreFocusOut: js.UndefOr[scala.Boolean] = js.undefined,
    password: js.UndefOr[scala.Boolean] = js.undefined,
    placeHolder: java.lang.String = null,
    prompt: java.lang.String = null,
    validateInput: /* value */ java.lang.String => js.UndefOr[
      java.lang.String | scala.Null | (vscodeLib.Thenable[js.UndefOr[java.lang.String | scala.Null]])
    ] = null,
    value: java.lang.String = null,
    valueSelection: js.Tuple2[scala.Double, scala.Double] = null
  ): InputBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreFocusOut)) __obj.updateDynamic("ignoreFocusOut")(ignoreFocusOut)
    if (!js.isUndefined(password)) __obj.updateDynamic("password")(password)
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (validateInput != null) __obj.updateDynamic("validateInput")(js.Any.fromFunction1(validateInput))
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueSelection != null) __obj.updateDynamic("valueSelection")(valueSelection)
    __obj.asInstanceOf[InputBoxOptions]
  }
}

