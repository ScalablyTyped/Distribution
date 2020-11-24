package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait C2f extends js.Object {
  
  def c2f(vale: Double): Double = js.native
  
  def f2c(value: Double): Double = js.native
}
object C2f {
  
  @scala.inline
  def apply(c2f: Double => Double, f2c: Double => Double): C2f = {
    val __obj = js.Dynamic.literal(c2f = js.Any.fromFunction1(c2f), f2c = js.Any.fromFunction1(f2c))
    __obj.asInstanceOf[C2f]
  }
  
  @scala.inline
  implicit class C2fOps[Self <: C2f] (val x: Self) extends AnyVal {
    
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
    def setC2f(value: Double => Double): Self = this.set("c2f", js.Any.fromFunction1(value))
    
    @scala.inline
    def setF2c(value: Double => Double): Self = this.set("f2c", js.Any.fromFunction1(value))
  }
}
