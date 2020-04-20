package typings.typesettable.wrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWrappingResult extends js.Object {
  var noBrokeWords: Double
  var noLines: Double
  var originalText: String
  var truncatedText: String
  var wrappedText: String
}

object IWrappingResult {
  @scala.inline
  def apply(
    noBrokeWords: Double,
    noLines: Double,
    originalText: String,
    truncatedText: String,
    wrappedText: String
  ): IWrappingResult = {
    val __obj = js.Dynamic.literal(noBrokeWords = noBrokeWords.asInstanceOf[js.Any], noLines = noLines.asInstanceOf[js.Any], originalText = originalText.asInstanceOf[js.Any], truncatedText = truncatedText.asInstanceOf[js.Any], wrappedText = wrappedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWrappingResult]
  }
}

