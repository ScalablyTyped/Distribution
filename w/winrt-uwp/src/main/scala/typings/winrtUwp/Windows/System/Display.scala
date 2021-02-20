package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an application to request that a device's display remain on even if there is no user activity for an extended period of time. */
object Display {
  
  /** Represents a display request. */
  @js.native
  trait DisplayRequest extends StObject {
    
    /** Activates a display request. */
    def requestActive(): Unit = js.native
    
    /** Deactivates a display request. */
    def requestRelease(): Unit = js.native
  }
  object DisplayRequest {
    
    @scala.inline
    def apply(requestActive: () => Unit, requestRelease: () => Unit): DisplayRequest = {
      val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
      __obj.asInstanceOf[DisplayRequest]
    }
    
    @scala.inline
    implicit class DisplayRequestMutableBuilder[Self <: DisplayRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestActive(value: () => Unit): Self = StObject.set(x, "requestActive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequestRelease(value: () => Unit): Self = StObject.set(x, "requestRelease", js.Any.fromFunction0(value))
    }
  }
}
