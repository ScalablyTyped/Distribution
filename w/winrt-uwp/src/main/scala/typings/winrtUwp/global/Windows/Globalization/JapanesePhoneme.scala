package typings.winrtUwp.global.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single Japanese word (a "reading") that has been extracted from a Japanese string by JapanesePhoneticAnalyzer . */
@JSGlobal("Windows.Globalization.JapanesePhoneme")
@js.native
abstract class JapanesePhoneme ()
  extends typings.winrtUwp.Windows.Globalization.JapanesePhoneme {
  /** Gets the text to display for this Japanese word. */
  /* CompleteClass */
  override var displayText: String = js.native
  /** Gets a Boolean that indicates if this Japanese word is the start of a phrase. */
  /* CompleteClass */
  override var isPhraseStart: Boolean = js.native
  /** Gets the "reading" (the pronunciation of DisplayText ) for this Japanese word. */
  /* CompleteClass */
  override var yomiText: String = js.native
}

