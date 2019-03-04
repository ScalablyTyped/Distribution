package typings
package typesettableLib.buildSrcWrappersWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWrappingResult extends js.Object {
  var noBrokeWords: scala.Double
  var noLines: scala.Double
  var originalText: java.lang.String
  var truncatedText: java.lang.String
  var wrappedText: java.lang.String
}

object IWrappingResult {
  @scala.inline
  def apply(
    noBrokeWords: scala.Double,
    noLines: scala.Double,
    originalText: java.lang.String,
    truncatedText: java.lang.String,
    wrappedText: java.lang.String
  ): IWrappingResult = {
    val __obj = js.Dynamic.literal(noBrokeWords = noBrokeWords, noLines = noLines, originalText = originalText, truncatedText = truncatedText, wrappedText = wrappedText)
  
    __obj.asInstanceOf[IWrappingResult]
  }
}

