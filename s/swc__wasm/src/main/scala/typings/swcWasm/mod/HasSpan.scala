package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasSpan extends StObject {
  
  var span: Span
}
object HasSpan {
  
  inline def apply(span: Span): HasSpan = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasSpan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasSpan] (val x: Self) extends AnyVal {
    
    inline def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
