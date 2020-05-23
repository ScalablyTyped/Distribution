package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reverse-converts a Japanese string which is mix of phonetic and ideographic characters, to a string of phonetic characters. */
trait TextReverseConversionGenerator extends js.Object {
  /** Determines if the language tag specified is available for reverse conversions, but is not installed on the user's device. */
  var languageAvailableButNotInstalled: Boolean
  /** Gets the language tag of the successfully created TextReverseConversionGenerator object. */
  var resolvedLanguage: String
  /**
    * Asynchronously reverse-converts a string which contains ideographic characters to a phonetic expression.
    * @param input The string containing ideographic characters to be reverse-converted.
    * @return An asynchronous operation to return the phonetic expression.
    */
  def convertBackAsync(input: String): IPromiseWithIAsyncOperation[String]
}

object TextReverseConversionGenerator {
  @scala.inline
  def apply(
    convertBackAsync: String => IPromiseWithIAsyncOperation[String],
    languageAvailableButNotInstalled: Boolean,
    resolvedLanguage: String
  ): TextReverseConversionGenerator = {
    val __obj = js.Dynamic.literal(convertBackAsync = js.Any.fromFunction1(convertBackAsync), languageAvailableButNotInstalled = languageAvailableButNotInstalled.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextReverseConversionGenerator]
  }
}

