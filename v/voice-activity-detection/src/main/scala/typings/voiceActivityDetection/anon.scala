package typings.voiceActivityDetection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Connect extends StObject {
    
    def connect(): Unit
    
    def destroy(): Unit
    
    def disconnect(): Unit
  }
  object Connect {
    
    inline def apply(connect: () => Unit, destroy: () => Unit, disconnect: () => Unit): Connect = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), destroy = js.Any.fromFunction0(destroy), disconnect = js.Any.fromFunction0(disconnect))
      __obj.asInstanceOf[Connect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Connect] (val x: Self) extends AnyVal {
      
      inline def setConnect(value: () => Unit): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    }
  }
}
