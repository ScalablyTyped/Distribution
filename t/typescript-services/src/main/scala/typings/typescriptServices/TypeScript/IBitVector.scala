package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBitVector extends js.Object {
  
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
  implicit class IBitVectorOps[Self <: IBitVector] (val x: Self) extends AnyVal {
    
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
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValueAt(value: (Double, Boolean) => Unit): Self = this.set("setValueAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueAt(value: Double => Boolean): Self = this.set("valueAt", js.Any.fromFunction1(value))
  }
}
