package typings.three.anon

import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Func extends js.Object {
  
  def func(u: Double, v: Double, dest: Vector3): Unit = js.native
  
  var slices: Double = js.native
  
  var stacks: Double = js.native
}
object Func {
  
  @scala.inline
  def apply(func: (Double, Double, Vector3) => Unit, slices: Double, stacks: Double): Func = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), slices = slices.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Func]
  }
  
  @scala.inline
  implicit class FuncOps[Self <: Func] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFunc(value: (Double, Double, Vector3) => Unit): Self = this.set("func", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSlices(value: Double): Self = this.set("slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStacks(value: Double): Self = this.set("stacks", value.asInstanceOf[js.Any])
  }
}
