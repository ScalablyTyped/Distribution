package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single Japanese word (a "reading") that has been extracted from a Japanese string by JapanesePhoneticAnalyzer . */
@JSGlobal("Windows.Globalization.JapanesePhoneme")
@js.native
abstract class JapanesePhoneme () extends js.Object {
  /** Gets the text to display for this Japanese word. */
  var displayText: java.lang.String = js.native
  /** Gets a Boolean that indicates if this Japanese word is the start of a phrase. */
  var isPhraseStart: scala.Boolean = js.native
  /** Gets the "reading" (the pronunciation of DisplayText ) for this Japanese word. */
  var yomiText: java.lang.String = js.native
}

