package typings.twineSugarcube.extensionsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Number extends js.Object {
  
  /**
    * Returns the number clamped to the specified bounds. Does not modify the original.
    * @param min The lower bound of the number.
    * @param max The upper bound of the number.
    * @since 2.0.0
    * @example
    * $stat.clamp(0, 200)  → Clamps $stat to the bounds 0–200 and returns the new value
    * $stat.clamp(1, 6.6)  → Clamps $stat to the bounds 1–6.6 and returns the new value
    */
  def clamp(min: Double, max: Double): Double = js.native
}
object Number {
  
  @scala.inline
  def apply(clamp: (Double, Double) => Double): Number = {
    val __obj = js.Dynamic.literal(clamp = js.Any.fromFunction2(clamp))
    __obj.asInstanceOf[Number]
  }
  
  @scala.inline
  implicit class NumberOps[Self <: Number] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClamp(value: (Double, Double) => Double): Self = this.set("clamp", js.Any.fromFunction2(value))
  }
}
