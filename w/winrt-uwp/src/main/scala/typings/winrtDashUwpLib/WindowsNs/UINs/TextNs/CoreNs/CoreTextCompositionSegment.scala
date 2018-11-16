package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a segment in a composition string. See Remarks for an illustration. */
@JSGlobal("Windows.UI.Text.Core.CoreTextCompositionSegment")
@js.native
abstract class CoreTextCompositionSegment () extends js.Object {
  /** Gets a string that represents the state of the user input after IME-processing but before final conversion. */
  var preconversionString: java.lang.String = js.native
  /** Gets an object that represents the range that defines this composition segment. */
  var range: CoreTextRange = js.native
}

