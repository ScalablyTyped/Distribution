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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`[?], E] (val x: Self & `1`[E]) extends AnyVal {
    
    inline def setSend(value: E => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
  }
}
