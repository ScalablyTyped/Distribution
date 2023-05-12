package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallHierarchyIncomingCall extends StObject {
  
  /**
    * The item that makes the call.
    */
  var from: CallHierarchyItem
  
  /**
    * The ranges at which the calls appear. This is relative to the caller
    * denoted by {@link CallHierarchyIncomingCall.from `this.from`}.
    */
  var fromRanges: js.Array[Range]
}
object CallHierarchyIncomingCall {
  
  inline def apply(from: CallHierarchyItem, fromRanges: js.Array[Range]): CallHierarchyIncomingCall = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromRanges = fromRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyIncomingCall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallHierarchyIncomingCall] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: CallHierarchyItem): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromRanges(value: js.Array[Range]): Self = StObject.set(x, "fromRanges", value.asInstanceOf[js.Any])
    
    inline def setFromRangesVarargs(value: Range*): Self = StObject.set(x, "fromRanges", js.Array(value*))
  }
}
