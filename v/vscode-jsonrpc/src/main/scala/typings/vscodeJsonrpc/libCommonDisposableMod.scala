package typings.vscodeJsonrpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDisposableMod {
  
  trait Disposable extends StObject {
    
    /**
      * Dispose this object.
      */
    def dispose(): Unit
  }
  object Disposable {
    
    inline def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    @JSImport("vscode-jsonrpc/lib/common/disposable", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(func: js.Function0[Unit]): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(func.asInstanceOf[js.Any]).asInstanceOf[Disposable]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
}
