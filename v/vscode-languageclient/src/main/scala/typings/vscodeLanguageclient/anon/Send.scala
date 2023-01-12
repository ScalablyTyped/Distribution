package typings.vscodeLanguageclient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Send[T /* <: js.Function */] extends StObject {
  
  var send: T
}
object Send {
  
  inline def apply[T /* <: js.Function */](send: T): Send[T] = {
    val __obj = js.Dynamic.literal(send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[Send[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Send[?], T /* <: js.Function */] (val x: Self & Send[T]) extends AnyVal {
    
    inline def setSend(value: T): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
  }
}
