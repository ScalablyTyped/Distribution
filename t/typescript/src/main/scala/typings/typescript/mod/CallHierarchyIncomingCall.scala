package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallHierarchyIncomingCall extends StObject {
  
  var from: CallHierarchyItem
  
  var fromSpans: js.Array[TextSpan]
}
object CallHierarchyIncomingCall {
  
  inline def apply(from: CallHierarchyItem, fromSpans: js.Array[TextSpan]): CallHierarchyIncomingCall = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromSpans = fromSpans.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyIncomingCall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallHierarchyIncomingCall] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: CallHierarchyItem): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromSpans(value: js.Array[TextSpan]): Self = StObject.set(x, "fromSpans", value.asInstanceOf[js.Any])
    
    inline def setFromSpansVarargs(value: TextSpan*): Self = StObject.set(x, "fromSpans", js.Array(value*))
  }
}
