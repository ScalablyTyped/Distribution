package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageConfiguration extends js.Object {
  /**
  		 * **Deprecated** Do not use.
  		 *
  		 * @deprecated * Use the autoClosingPairs property in the language configuration file instead.
  		 */
  var __characterPairSupport: js.UndefOr[vscodeLib.Anon_AutoClosingPairs] = js.undefined
  /**
  		 * **Deprecated** Do not use.
  		 *
  		 * @deprecated Will be replaced by a better API soon.
  		 */
  var __electricCharacterSupport: js.UndefOr[vscodeLib.Anon_Brackets] = js.undefined
  /**
  		 * The language's brackets.
  		 * This configuration implicitly affects pressing Enter around these brackets.
  		 */
  var brackets: js.UndefOr[js.Array[CharacterPair]] = js.undefined
  /**
  		 * The language's comment settings.
  		 */
  var comments: js.UndefOr[CommentRule] = js.undefined
  /**
  		 * The language's indentation settings.
  		 */
  var indentationRules: js.UndefOr[IndentationRule] = js.undefined
  /**
  		 * The language's rules to be evaluated when pressing Enter.
  		 */
  var onEnterRules: js.UndefOr[js.Array[OnEnterRule]] = js.undefined
  /**
  		 * The language's word definition.
  		 * If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
  		 * to provide a word definition that uses exclusion of known separators.
  		 * e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
  		 *   /(-?\d*\.\d\w*)|([^\`\~\!\@\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g
  		 */
  var wordPattern: js.UndefOr[stdLib.RegExp] = js.undefined
}

object LanguageConfiguration {
  @scala.inline
  def apply(
    __characterPairSupport: vscodeLib.Anon_AutoClosingPairs = null,
    __electricCharacterSupport: vscodeLib.Anon_Brackets = null,
    brackets: js.Array[CharacterPair] = null,
    comments: CommentRule = null,
    indentationRules: IndentationRule = null,
    onEnterRules: js.Array[OnEnterRule] = null,
    wordPattern: stdLib.RegExp = null
  ): LanguageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (__characterPairSupport != null) __obj.updateDynamic("__characterPairSupport")(__characterPairSupport)
    if (__electricCharacterSupport != null) __obj.updateDynamic("__electricCharacterSupport")(__electricCharacterSupport)
    if (brackets != null) __obj.updateDynamic("brackets")(brackets)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (indentationRules != null) __obj.updateDynamic("indentationRules")(indentationRules)
    if (onEnterRules != null) __obj.updateDynamic("onEnterRules")(onEnterRules)
    if (wordPattern != null) __obj.updateDynamic("wordPattern")(wordPattern)
    __obj.asInstanceOf[LanguageConfiguration]
  }
}

