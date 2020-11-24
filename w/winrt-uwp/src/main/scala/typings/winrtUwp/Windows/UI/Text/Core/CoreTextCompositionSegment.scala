package typings.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a segment in a composition string. See Remarks for an illustration. */
@js.native
trait CoreTextCompositionSegment extends js.Object {
  
  /** Gets a string that represents the state of the user input after IME-processing but before final conversion. */
  var preconversionString: String = js.native
  
  /** Gets an object that represents the range that defines this composition segment. */
  var range: CoreTextRange = js.native
}
object CoreTextCompositionSegment {
  
  @scala.inline
  def apply(preconversionString: String, range: CoreTextRange): CoreTextCompositionSegment = {
    val __obj = js.Dynamic.literal(preconversionString = preconversionString.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextCompositionSegment]
  }
  
  @scala.inline
  implicit class CoreTextCompositionSegmentOps[Self <: CoreTextCompositionSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPreconversionString(value: String): Self = this.set("preconversionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: CoreTextRange): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
