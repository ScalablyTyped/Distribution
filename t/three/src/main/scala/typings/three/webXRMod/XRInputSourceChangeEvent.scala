package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRInputSourceChangeEvent extends StObject {
  
  var added: js.Array[XRInputSource]
  
  var removed: js.Array[XRInputSource]
  
  var session: XRSession
}
object XRInputSourceChangeEvent {
  
  inline def apply(added: js.Array[XRInputSource], removed: js.Array[XRInputSource], session: XRSession): XRInputSourceChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRInputSourceChangeEvent]
  }
  
  extension [Self <: XRInputSourceChangeEvent](x: Self) {
    
    inline def setAdded(value: js.Array[XRInputSource]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: XRInputSource*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    inline def setRemoved(value: js.Array[XRInputSource]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: XRInputSource*): Self = StObject.set(x, "removed", js.Array(value :_*))
    
    inline def setSession(value: XRSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
