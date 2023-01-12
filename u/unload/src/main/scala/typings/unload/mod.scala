package typings.unload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(fn: js.Function0[Unit]): AddReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(fn.asInstanceOf[js.Any]).asInstanceOf[AddReturn]
  
  inline def getSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")().asInstanceOf[Double]
  
  inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
  
  inline def runAll(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAll")().asInstanceOf[js.Promise[Any]]
  
  trait AddReturn extends StObject {
    
    def remove(): Unit
    
    def run(): Any
  }
  object AddReturn {
    
    inline def apply(remove: () => Unit, run: () => Any): AddReturn = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove), run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[AddReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddReturn] (val x: Self) extends AnyVal {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setRun(value: () => Any): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    }
  }
}
