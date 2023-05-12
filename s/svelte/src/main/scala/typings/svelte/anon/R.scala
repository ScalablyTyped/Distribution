package typings.svelte.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R extends StObject {
  
  def p(inputs: HTMLInputElement*): Unit
  
  def r(): Unit
  
  def u(new_indexes: js.Array[Double]): Unit
}
object R {
  
  inline def apply(p: /* repeated */ HTMLInputElement => Unit, r: () => Unit, u: js.Array[Double] => Unit): R = {
    val __obj = js.Dynamic.literal(p = js.Any.fromFunction1(p), r = js.Any.fromFunction0(r), u = js.Any.fromFunction1(u))
    __obj.asInstanceOf[R]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R] (val x: Self) extends AnyVal {
    
    inline def setP(value: /* repeated */ HTMLInputElement => Unit): Self = StObject.set(x, "p", js.Any.fromFunction1(value))
    
    inline def setR(value: () => Unit): Self = StObject.set(x, "r", js.Any.fromFunction0(value))
    
    inline def setU(value: js.Array[Double] => Unit): Self = StObject.set(x, "u", js.Any.fromFunction1(value))
  }
}
