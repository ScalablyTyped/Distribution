package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destruction extends StObject {
  
  def destructor(): Unit
}
object Destruction {
  
  inline def apply(destructor: () => Unit): Destruction = {
    val __obj = js.Dynamic.literal(destructor = js.Any.fromFunction0(destructor))
    __obj.asInstanceOf[Destruction]
  }
  
  extension [Self <: Destruction](x: Self) {
    
    inline def setDestructor(value: () => Unit): Self = StObject.set(x, "destructor", js.Any.fromFunction0(value))
  }
}
