package typings.winrtUwp.Windows.Data.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies an alternate form of the word represented by a WordSegment object.. For example, this may contain a number in a normalized format. */
trait AlternateWordForm extends js.Object {
  /** Gets the text of the alternate word form identified by this AlternateWordForm object. */
  var alternateText: String
  /** Gets the normalization format for this current AlternateWordForm object. */
  var normalizationFormat: AlternateNormalizationFormat
  /** Gets the TextSegment that identifies the source text's sub-string for which this AlternateWordForm object is an alternate. */
  var sourceTextSegment: TextSegment
}

object AlternateWordForm {
  @scala.inline
  def apply(
    alternateText: String,
    normalizationFormat: AlternateNormalizationFormat,
    sourceTextSegment: TextSegment
  ): AlternateWordForm = {
    val __obj = js.Dynamic.literal(alternateText = alternateText.asInstanceOf[js.Any], normalizationFormat = normalizationFormat.asInstanceOf[js.Any], sourceTextSegment = sourceTextSegment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlternateWordForm]
  }
}

