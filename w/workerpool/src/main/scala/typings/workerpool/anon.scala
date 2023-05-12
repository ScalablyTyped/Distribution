package typings.workerpool

import typings.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait On extends StObject {
    
    var on: js.UndefOr[js.Function1[/* payload */ Any, Unit]] = js.undefined
    
    var transfer: js.UndefOr[js.Array[Transferable]] = js.undefined
  }
  object On {
    
    inline def apply(): On = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[On]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: On] (val x: Self) extends AnyVal {
      
      inline def setOn(value: /* payload */ Any => Unit): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setTransfer(value: js.Array[Transferable]): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
      
      inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
      
      inline def setTransferVarargs(value: Transferable*): Self = StObject.set(x, "transfer", js.Array(value*))
    }
  }
}
