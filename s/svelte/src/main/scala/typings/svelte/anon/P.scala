package typings.svelte.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P extends StObject {
  
  def p(inputs: HTMLInputElement*): Unit
  
  def r(): Unit
}
object P {
  
  inline def apply(p: /* repeated */ HTMLInputElement => Unit, r: () => Unit): P = {
    val __obj = js.Dynamic.literal(p = js.Any.fromFunction1(p), r = js.Any.fromFunction0(r))
    __obj.asInstanceOf[P]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: P] (val x: Self) extends AnyVal {
    
    inline def setP(value: /* repeated */ HTMLInputElement => Unit): Self = StObject.set(x, "p", js.Any.fromFunction1(value))
    
    inline def setR(value: () => Unit): Self = StObject.set(x, "r", js.Any.fromFunction0(value))
  }
}
