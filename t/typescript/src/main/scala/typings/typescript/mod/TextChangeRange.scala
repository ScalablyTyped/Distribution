package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextChangeRange extends StObject {
  
  var newLength: Double = js.native
  
  var span: TextSpan = js.native
}
object TextChangeRange {
  
  @scala.inline
  def apply(newLength: Double, span: TextSpan): TextChangeRange = {
    val __obj = js.Dynamic.literal(newLength = newLength.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChangeRange]
  }
  
  @scala.inline
  implicit class TextChangeRangeMutableBuilder[Self <: TextChangeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewLength(value: Double): Self = StObject.set(x, "newLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpan(value: TextSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
