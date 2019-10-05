package typings.winrtDashUwp.Windows.Data.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies an alternate form of the word represented by a WordSegment object.. For example, this may contain a number in a normalized format. */
@JSGlobal("Windows.Data.Text.AlternateWordForm")
@js.native
abstract class AlternateWordForm () extends js.Object {
  /** Gets the text of the alternate word form identified by this AlternateWordForm object. */
  var alternateText: String = js.native
  /** Gets the normalization format for this current AlternateWordForm object. */
  var normalizationFormat: AlternateNormalizationFormat = js.native
  /** Gets the TextSegment that identifies the source text's sub-string for which this AlternateWordForm object is an alternate. */
  var sourceTextSegment: TextSegment = js.native
}

