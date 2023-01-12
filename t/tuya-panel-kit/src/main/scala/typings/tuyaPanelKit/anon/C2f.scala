package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait C2f extends StObject {
  
  def c2f(vale: Double): Double
  
  def f2c(value: Double): Double
}
object C2f {
  
  inline def apply(c2f: Double => Double, f2c: Double => Double): C2f = {
    val __obj = js.Dynamic.literal(c2f = js.Any.fromFunction1(c2f), f2c = js.Any.fromFunction1(f2c))
    __obj.asInstanceOf[C2f]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: C2f] (val x: Self) extends AnyVal {
    
    inline def setC2f(value: Double => Double): Self = StObject.set(x, "c2f", js.Any.fromFunction1(value))
    
    inline def setF2c(value: Double => Double): Self = StObject.set(x, "f2c", js.Any.fromFunction1(value))
  }
}
