package typings.winrtUwp.Windows.Foundation.Numerics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a quaternion (an axis about which a rotation occurs and a rotation amount about that axis). */
@js.native
trait Quaternion extends js.Object {
  
  /** The w component that represents a rotation amount about the axis that is defined by the X, Y, and Z fields. */
  var w: Double = js.native
  
  /** The x component of the vector that represents the axis about which a rotation occurs. */
  var x: Double = js.native
  
  /** The y component of the vector that represents the axis about which a rotation occurs. */
  var y: Double = js.native
  
  /** The z component of the vector that represents the axis about which a rotation occurs. */
  var z: Double = js.native
}
object Quaternion {
  
  @scala.inline
  def apply(w: Double, x: Double, y: Double, z: Double): Quaternion = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quaternion]
  }
  
  @scala.inline
  implicit class QuaternionOps[Self <: Quaternion] (val x: Self) extends AnyVal {
    
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
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
