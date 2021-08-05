package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitMatrix extends StObject {
  
  def release(): Unit
  
  def setValueAt(x: Double, y: Double, value: Boolean): Unit
  
  def valueAt(x: Double, y: Double): Boolean
}
object IBitMatrix {
  
  inline def apply(
    release: () => Unit,
    setValueAt: (Double, Double, Boolean) => Unit,
    valueAt: (Double, Double) => Boolean
  ): IBitMatrix = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release), setValueAt = js.Any.fromFunction3(setValueAt), valueAt = js.Any.fromFunction2(valueAt))
    __obj.asInstanceOf[IBitMatrix]
  }
  
  extension [Self <: IBitMatrix](x: Self) {
    
    inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    
    inline def setSetValueAt(value: (Double, Double, Boolean) => Unit): Self = StObject.set(x, "setValueAt", js.Any.fromFunction3(value))
    
    inline def setValueAt(value: (Double, Double) => Boolean): Self = StObject.set(x, "valueAt", js.Any.fromFunction2(value))
  }
}
