package typings.vscodeLanguageclient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Send[E] extends StObject {
  
  def send(data: E): js.Promise[Unit]
}
object Send {
  
  inline def apply[E](send: E => js.Promise[Unit]): Send[E] = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Send[E]]
  }
  
  extension [Self <: Send[?], E](x: Self & Send[E]) {
    
    inline def setSend(value: E => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
