package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait session
  extends StObject
     with WebixStorage {
  
  def clear(): Unit
}
object session {
  
  inline def apply(clear: () => Unit, get: String => Any, put: (String, Any) => Unit, remove: String => Unit): session = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[session]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: session] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
  }
}
