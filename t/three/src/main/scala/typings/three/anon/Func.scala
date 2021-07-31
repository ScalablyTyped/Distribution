package typings.three.anon

import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Func extends StObject {
  
  def func(u: Double, v: Double, dest: Vector3): Unit
  
  var slices: Double
  
  var stacks: Double
}
object Func {
  
  @scala.inline
  def apply(func: (Double, Double, Vector3) => Unit, slices: Double, stacks: Double): Func = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), slices = slices.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Func]
  }
  
  @scala.inline
  implicit class FuncMutableBuilder[Self <: Func] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunc(value: (Double, Double, Vector3) => Unit): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSlices(value: Double): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStacks(value: Double): Self = StObject.set(x, "stacks", value.asInstanceOf[js.Any])
  }
}
