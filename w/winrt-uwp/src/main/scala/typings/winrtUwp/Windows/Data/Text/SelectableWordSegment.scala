package typings.winrtUwp.Windows.Data.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a segment from your provided text that includes a word and any trailing whitespace and/or punctuation after this word. */
@JSGlobal("Windows.Data.Text.SelectableWordSegment")
@js.native
abstract class SelectableWordSegment () extends js.Object {
  /** Gets the TextSegment that identifies the source text's sub-string that is the selected word. */
  var sourceTextSegment: TextSegment = js.native
  /** Gets the text of the selected word identified by this SelectableWordSegment object. */
  var text: String = js.native
}

