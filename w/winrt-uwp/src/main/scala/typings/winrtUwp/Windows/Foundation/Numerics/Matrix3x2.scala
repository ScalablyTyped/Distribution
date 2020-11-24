package typings.winrtUwp.Windows.Foundation.Numerics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a 3*2 floating point matrix. */
@js.native
trait Matrix3x2 extends js.Object {
  
  /** The row one and column one element of the matrix. */
  var m11: Double = js.native
  
  /** The row one and column two element of the matrix. */
  var m12: Double = js.native
  
  /** The row two and column one element of the matrix. */
  var m21: Double = js.native
  
  /** The row two and column two element of the matrix. */
  var m22: Double = js.native
  
  /** The row three and column one element of the matrix. */
  var m31: Double = js.native
  
  /** The row three and column two element of the matrix. */
  var m32: Double = js.native
}
object Matrix3x2 {
  
  @scala.inline
  def apply(m11: Double, m12: Double, m21: Double, m22: Double, m31: Double, m32: Double): Matrix3x2 = {
    val __obj = js.Dynamic.literal(m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m31 = m31.asInstanceOf[js.Any], m32 = m32.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix3x2]
  }
  
  @scala.inline
  implicit class Matrix3x2Ops[Self <: Matrix3x2] (val x: Self) extends AnyVal {
    
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
    def setM11(value: Double): Self = this.set("m11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM12(value: Double): Self = this.set("m12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM21(value: Double): Self = this.set("m21", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM22(value: Double): Self = this.set("m22", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM31(value: Double): Self = this.set("m31", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM32(value: Double): Self = this.set("m32", value.asInstanceOf[js.Any])
  }
}
