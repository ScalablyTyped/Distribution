package typings.winrt.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  trait DisplayRequest
    extends StObject
       with IDisplayRequest
  object DisplayRequest {
    
    inline def apply(requestActive: () => Unit, requestRelease: () => Unit): DisplayRequest = {
      val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
      __obj.asInstanceOf[DisplayRequest]
    }
  }
  
  trait IDisplayRequest extends StObject {
    
    def requestActive(): Unit
    
    def requestRelease(): Unit
  }
  object IDisplayRequest {
    
    inline def apply(requestActive: () => Unit, requestRelease: () => Unit): IDisplayRequest = {
      val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
      __obj.asInstanceOf[IDisplayRequest]
    }
    
    extension [Self <: IDisplayRequest](x: Self) {
      
      inline def setRequestActive(value: () => Unit): Self = StObject.set(x, "requestActive", js.Any.fromFunction0(value))
      
      inline def setRequestRelease(value: () => Unit): Self = StObject.set(x, "requestRelease", js.Any.fromFunction0(value))
    }
  }
}
