package typings.winrtDashUwp.Windows.Data.Text

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a word from your provided text. */
@JSGlobal("Windows.Data.Text.WordSegment")
@js.native
abstract class WordSegment () extends js.Object {
  /** Gets the alternate forms (if any) associated with the current word. */
  var alternateForms: IVectorView[AlternateWordForm] = js.native
  /** Gets the TextSegment that identifies the source text's sub-string that is a word. */
  var sourceTextSegment: TextSegment = js.native
  /** Gets the text of the word identified by this WordSegment object. */
  var text: String = js.native
}

