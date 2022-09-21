package typings.vscodeLanguageclient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[E] extends StObject {
  
  def send(data: E): js.Promise[Unit]
}
object `1` {
  
  inline def apply[E](send: E => js.Promise[Unit]): `1`[E] = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[`1`[E]]
  }
  
  extension [Self <: `1`[?], E](x: Self & `1`[E]) {
    
    inline def setSend(value: E => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
