package typings.vscodeLanguageclient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendT[T /* <: js.Function */] extends StObject {
  
  var send: T
}
object SendT {
  
  inline def apply[T /* <: js.Function */](send: T): SendT[T] = {
    val __obj = js.Dynamic.literal(send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendT[T]]
  }
  
  extension [Self <: SendT[?], T /* <: js.Function */](x: Self & SendT[T]) {
    
    inline def setSend(value: T): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
  }
}
