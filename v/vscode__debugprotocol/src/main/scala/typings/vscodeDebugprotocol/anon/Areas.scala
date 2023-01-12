package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.InvalidatedAreas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Areas extends StObject {
  
  /** Set of logical areas that got invalidated. This property has a hint characteristic: a client can only be expected to make a 'best effort' in honouring the areas but there are no guarantees. If this property is missing, empty, or if values are not understood, the client should assume a single value `all`. */
  var areas: js.UndefOr[js.Array[InvalidatedAreas]] = js.undefined
  
  /** If specified, the client only needs to refetch data related to this stack frame (and the `threadId` is ignored). */
  var stackFrameId: js.UndefOr[Double] = js.undefined
  
  /** If specified, the client only needs to refetch data related to this thread. */
  var threadId: js.UndefOr[Double] = js.undefined
}
object Areas {
  
  inline def apply(): Areas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Areas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Areas] (val x: Self) extends AnyVal {
    
    inline def setAreas(value: js.Array[InvalidatedAreas]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
    
    inline def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
    
    inline def setAreasVarargs(value: InvalidatedAreas*): Self = StObject.set(x, "areas", js.Array(value*))
    
    inline def setStackFrameId(value: Double): Self = StObject.set(x, "stackFrameId", value.asInstanceOf[js.Any])
    
    inline def setStackFrameIdUndefined: Self = StObject.set(x, "stackFrameId", js.undefined)
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
  }
}
