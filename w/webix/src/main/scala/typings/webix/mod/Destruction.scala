package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destruction extends StObject {
  
  def destructor(): Unit
}
object Destruction {
  
  @JSImport("webix", "Destruction")
  @js.native
  val ^ : Destruction = js.native
  
  @scala.inline
  implicit class DestructionMutableBuilder[Self <: Destruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestructor(value: () => Unit): Self = StObject.set(x, "destructor", js.Any.fromFunction0(value))
  }
}
