package typings.winrt.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  @js.native
  trait DisplayRequest extends IDisplayRequest
  object DisplayRequest {
    
    @scala.inline
    def apply(requestActive: () => Unit, requestRelease: () => Unit): DisplayRequest = {
      val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
      __obj.asInstanceOf[DisplayRequest]
    }
  }
  
  @js.native
  trait IDisplayRequest extends StObject {
    
    def requestActive(): Unit = js.native
    
    def requestRelease(): Unit = js.native
  }
  object IDisplayRequest {
    
    @scala.inline
    def apply(requestActive: () => Unit, requestRelease: () => Unit): IDisplayRequest = {
      val __obj = js.Dynamic.literal(requestActive = js.Any.fromFunction0(requestActive), requestRelease = js.Any.fromFunction0(requestRelease))
      __obj.asInstanceOf[IDisplayRequest]
    }
    
    @scala.inline
    implicit class IDisplayRequestMutableBuilder[Self <: IDisplayRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestActive(value: () => Unit): Self = StObject.set(x, "requestActive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRequestRelease(value: () => Unit): Self = StObject.set(x, "requestRelease", js.Any.fromFunction0(value))
    }
  }
}
