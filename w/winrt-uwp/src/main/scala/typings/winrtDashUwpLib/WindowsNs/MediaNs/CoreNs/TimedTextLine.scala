package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a line of text that is displayed with a TimedTextCue . */
@JSGlobal("Windows.Media.Core.TimedTextLine")
@js.native
class TimedTextLine () extends js.Object {
  /** Gets a list of TimedTextSubformat objects that provide formatting for substrings within the TimedTextLine . */
  var subformats: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[TimedTextSubformat] = js.native
  /** Gets or sets the text content of the TimedTextLine . */
  var text: java.lang.String = js.native
}

