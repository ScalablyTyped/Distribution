package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitVector extends StObject {
  
  def release(): Unit = js.native
  
  def setValueAt(index: Double, value: Boolean): Unit = js.native
  
  def valueAt(index: Double): Boolean = js.native
}
object IBitVector {
  
  @scala.inline
  def apply(release: () => Unit, setValueAt: (Double, Boolean) => Unit, valueAt: Double => Boolean): IBitVector = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), setValueAt = js.Any.fromFunction2(setValueAt), valueAt = js.Any.fromFunction1(valueAt))
    __obj.asInstanceOf[IBitVector]
  }
  
  @scala.inline
  implicit class IBitVectorMutableBuilder[Self <: IBitVector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValueAt(value: (Double, Boolean) => Unit): Self = StObject.set(x, "setValueAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueAt(value: Double => Boolean): Self = StObject.set(x, "valueAt", js.Any.fromFunction1(value))
  }
}
