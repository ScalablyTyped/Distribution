package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitVector extends StObject {
  
  def release(): Unit
  
  def setValueAt(index: Double, value: Boolean): Unit
  
  def valueAt(index: Double): Boolean
}
object IBitVector {
  
  inline def apply(release: () => Unit, setValueAt: (Double, Boolean) => Unit, valueAt: Double => Boolean): IBitVector = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), setValueAt = js.Any.fromFunction2(setValueAt), valueAt = js.Any.fromFunction1(valueAt))
    __obj.asInstanceOf[IBitVector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBitVector] (val x: Self) extends AnyVal {
    
    inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    
    inline def setSetValueAt(value: (Double, Boolean) => Unit): Self = StObject.set(x, "setValueAt", js.Any.fromFunction2(value))
    
    inline def setValueAt(value: Double => Boolean): Self = StObject.set(x, "valueAt", js.Any.fromFunction1(value))
  }
}
