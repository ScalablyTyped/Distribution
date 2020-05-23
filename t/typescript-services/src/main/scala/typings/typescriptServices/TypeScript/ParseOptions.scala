package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var _allowAutomaticSemicolonInsertion: js.Any
  var _languageVersion: js.Any
  def allowAutomaticSemicolonInsertion(): Boolean
  def languageVersion(): LanguageVersion
  def toJSON(key: js.Any): AllowAutomaticSemicolonInsertion
}

object ParseOptions {
  @scala.inline
  def apply(
    _allowAutomaticSemicolonInsertion: js.Any,
    _languageVersion: js.Any,
    allowAutomaticSemicolonInsertion: () => Boolean,
    languageVersion: () => LanguageVersion,
    toJSON: js.Any => AllowAutomaticSemicolonInsertion
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(_allowAutomaticSemicolonInsertion = _allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], _languageVersion = _languageVersion.asInstanceOf[js.Any], allowAutomaticSemicolonInsertion = js.Any.fromFunction0(allowAutomaticSemicolonInsertion), languageVersion = js.Any.fromFunction0(languageVersion), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[ParseOptions]
  }
}

