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
    * denoted by [`this.from`](#CallHierarchyIncomingCall.from).
    */
  var fromRanges: js.Array[Range]
}
object CallHierarchyIncomingCall {
  
  inline def apply(from: CallHierarchyItem, fromRanges: js.Array[Range]): CallHierarchyIncomingCall = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromRanges = fromRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyIncomingCall]
  }
  
  extension [Self <: CallHierarchyIncomingCall](x: Self) {
    
    inline def setFrom(value: CallHierarchyItem): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromRanges(value: js.Array[Range]): Self = StObject.set(x, "fromRanges", value.asInstanceOf[js.Any])
    
    inline def setFromRangesVarargs(value: Range*): Self = StObject.set(x, "fromRanges", js.Array(value*))
  }
}
