package typings.winrtUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a range of text inside a text input control. */
@js.native
trait CoreTextRange extends StObject {
  
  /** The end position of a range in Application Character Position (ACP) terms. */
  var endCaretPosition: Double = js.native
  
  /** The start position of a range in Application Character Position (ACP) terms. */
  var startCaretPosition: Double = js.native
}
object CoreTextRange {
  
  @scala.inline
  def apply(endCaretPosition: Double, startCaretPosition: Double): CoreTextRange = {
    val __obj = js.Dynamic.literal(endCaretPosition = endCaretPosition.asInstanceOf[js.Any], startCaretPosition = startCaretPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextRange]
  }
  
  @scala.inline
  implicit class CoreTextRangeMutableBuilder[Self <: CoreTextRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndCaretPosition(value: Double): Self = StObject.set(x, "endCaretPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCaretPosition(value: Double): Self = StObject.set(x, "startCaretPosition", value.asInstanceOf[js.Any])
  }
}
