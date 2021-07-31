package typings.vizJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface defines the shape of an object that is held by the caller.
  * This `Module` was created by emscripten, and is therefore largely arcane.
  * This currently just lists a subset of what is defined in `Module`.
  */
trait Module extends StObject {
  
  def run(): Unit
}
object Module {
  
  @scala.inline
  def apply(run: () => Unit): Module = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
  }
}
