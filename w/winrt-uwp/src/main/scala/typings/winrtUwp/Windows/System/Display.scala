package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an application to request that a device's display remain on even if there is no user activity for an extended period of time. */
object Display {
  
  /** Represents a display request. */
  trait DisplayRequest extends StObject {
    
    /** Activates a display request. */
    def requestActive(): Unit
    
    /** Deactivates a display request. */
    def requestRelease(): Unit
  }
  object DisplayRequest {
    
    inline def apply(requestActive: () => Unit, requestRelease: () => Unit): DisplayRequest = {
      val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
      __obj.asInstanceOf[DisplayRequest]
    }
    
    extension [Self <: DisplayRequest](x: Self) {
      
      inline def setRequestActive(value: () => Unit): Self = StObject.set(x, "requestActive", js.Any.fromFunction0(value))
      
      inline def setRequestRelease(value: () => Unit): Self = StObject.set(x, "requestRelease", js.Any.fromFunction0(value))
    }
  }
}
