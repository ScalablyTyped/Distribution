package typings.wonderFrp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposableIdisposableMod {
  
  trait IDisposable extends StObject {
    
    def dispose(): Unit
  }
  object IDisposable {
    
    inline def apply(dispose: () => Unit): IDisposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[IDisposable]
    }
    
    extension [Self <: IDisposable](x: Self) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
}
