package typings.tweenjsTweenJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait In extends js.Object {
  
  def In(amount: Double): Double = js.native
  
  def InOut(amount: Double): Double = js.native
  
  def Out(amount: Double): Double = js.native
}
object In {
  
  @scala.inline
  def apply(In: Double => Double, InOut: Double => Double, Out: Double => Double): In = {
    val __obj = js.Dynamic.literal(In = js.Any.fromFunction1(In), InOut = js.Any.fromFunction1(InOut), Out = js.Any.fromFunction1(Out))
    __obj.asInstanceOf[In]
  }
  
  @scala.inline
  implicit class InOps[Self <: In] (val x: Self) extends AnyVal {
    
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
    def setIn(value: Double => Double): Self = this.set("In", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInOut(value: Double => Double): Self = this.set("InOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOut(value: Double => Double): Self = this.set("Out", js.Any.fromFunction1(value))
  }
}
