package typings.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a segment in a composition string. See Remarks for an illustration. */
trait CoreTextCompositionSegment extends js.Object {
  /** Gets a string that represents the state of the user input after IME-processing but before final conversion. */
  var preconversionString: String
  /** Gets an object that represents the range that defines this composition segment. */
  var range: CoreTextRange
}

object CoreTextCompositionSegment {
  @scala.inline
  def apply(preconversionString: String, range: CoreTextRange): CoreTextCompositionSegment = {
    val __obj = js.Dynamic.literal(preconversionString = preconversionString.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextCompositionSegment]
  }
}

