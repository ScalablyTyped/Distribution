package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallHierarchyOutgoingCall extends StObject {
  
  /**
    * The range at which this item is called. This is the range relative to the caller, e.g the item
    * passed to [`provideCallHierarchyOutgoingCalls`](#CallHierarchyItemProvider.provideCallHierarchyOutgoingCalls)
    * and not [`this.to`](#CallHierarchyOutgoingCall.to).
    */
  var fromRanges: js.Array[Range]
  
  /**
    * The item that is called.
    */
  var to: CallHierarchyItem
}
object CallHierarchyOutgoingCall {
  
  inline def apply(fromRanges: js.Array[Range], to: CallHierarchyItem): CallHierarchyOutgoingCall = {
    val __obj = js.Dynamic.literal(fromRanges = fromRanges.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallHierarchyOutgoingCall]
  }
  
  extension [Self <: CallHierarchyOutgoingCall](x: Self) {
    
    inline def setFromRanges(value: js.Array[Range]): Self = StObject.set(x, "fromRanges", value.asInstanceOf[js.Any])
    
    inline def setFromRangesVarargs(value: Range*): Self = StObject.set(x, "fromRanges", js.Array(value*))
    
    inline def setTo(value: CallHierarchyItem): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
