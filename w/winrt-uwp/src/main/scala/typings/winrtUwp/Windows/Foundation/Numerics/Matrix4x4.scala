package typings.winrtUwp.Windows.Foundation.Numerics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a 4*4 floating point matrix. */
@js.native
trait Matrix4x4 extends js.Object {
  
  /** The row one and column one element of the matrix. */
  var m11: Double = js.native
  
  /** The row one and column two element of the matrix. */
  var m12: Double = js.native
  
  /** The row one and column three element of the matrix. */
  var m13: Double = js.native
  
  /** The row one and column four element of the matrix. */
  var m14: Double = js.native
  
  /** The row two and column one element of the matrix. */
  var m21: Double = js.native
  
  /** The row two and column two element of the matrix. */
  var m22: Double = js.native
  
  /** The row two and column three element of the matrix. */
  var m23: Double = js.native
  
  /** The row two and column four element of the matrix. */
  var m24: Double = js.native
  
  /** The row three and column one element of the matrix. */
  var m31: Double = js.native
  
  /** The row three and column two element of the matrix. */
  var m32: Double = js.native
  
  /** The row three and column three element of the matrix. */
  var m33: Double = js.native
  
  /** The row three and column four element of the matrix. */
  var m34: Double = js.native
  
  /** The row four and column one element of the matrix. */
  var m41: Double = js.native
  
  /** The row four and column two element of the matrix. */
  var m42: Double = js.native
  
  /** The row four and column three element of the matrix. */
  var m43: Double = js.native
  
  /** The row four and column four element of the matrix. */
  var m44: Double = js.native
}
object Matrix4x4 {
  
  @scala.inline
  def apply(
    m11: Double,
    m12: Double,
    m13: Double,
    m14: Double,
    m21: Double,
    m22: Double,
    m23: Double,
    m24: Double,
    m31: Double,
    m32: Double,
    m33: Double,
    m34: Double,
    m41: Double,
    m42: Double,
    m43: Double,
    m44: Double
  ): Matrix4x4 = {
    val __obj = js.Dynamic.literal(m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m13 = m13.asInstanceOf[js.Any], m14 = m14.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m23 = m23.asInstanceOf[js.Any], m24 = m24.asInstanceOf[js.Any], m31 = m31.asInstanceOf[js.Any], m32 = m32.asInstanceOf[js.Any], m33 = m33.asInstanceOf[js.Any], m34 = m34.asInstanceOf[js.Any], m41 = m41.asInstanceOf[js.Any], m42 = m42.asInstanceOf[js.Any], m43 = m43.asInstanceOf[js.Any], m44 = m44.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix4x4]
  }
  
  @scala.inline
  implicit class Matrix4x4Ops[Self <: Matrix4x4] (val x: Self) extends AnyVal {
    
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
    def setM13(value: Double): Self = this.set("m13", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM14(value: Double): Self = this.set("m14", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM21(value: Double): Self = this.set("m21", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM22(value: Double): Self = this.set("m22", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM23(value: Double): Self = this.set("m23", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM24(value: Double): Self = this.set("m24", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM31(value: Double): Self = this.set("m31", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM32(value: Double): Self = this.set("m32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM33(value: Double): Self = this.set("m33", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM34(value: Double): Self = this.set("m34", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM41(value: Double): Self = this.set("m41", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM42(value: Double): Self = this.set("m42", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM43(value: Double): Self = this.set("m43", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM44(value: Double): Self = this.set("m44", value.asInstanceOf[js.Any])
  }
}
