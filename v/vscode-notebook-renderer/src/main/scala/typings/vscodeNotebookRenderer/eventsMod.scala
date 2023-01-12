package typings.vscodeNotebookRenderer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  trait Disposable extends StObject {
    
    def dispose(): Unit
  }
  object Disposable {
    
    inline def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  type VSCodeEvent[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, Any], 
    /* thisArgs */ js.UndefOr[Any], 
    /* disposables */ js.UndefOr[js.Array[Disposable]], 
    Disposable
  ]
}
