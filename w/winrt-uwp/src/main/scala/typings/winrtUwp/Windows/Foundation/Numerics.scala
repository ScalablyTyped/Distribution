package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a set of graphics-oriented math types. */
object Numerics {
  
  /** Describes a 3*2 floating point matrix. */
  trait Matrix3x2 extends StObject {
    
    /** The row one and column one element of the matrix. */
    var m11: Double
    
    /** The row one and column two element of the matrix. */
    var m12: Double
    
    /** The row two and column one element of the matrix. */
    var m21: Double
    
    /** The row two and column two element of the matrix. */
    var m22: Double
    
    /** The row three and column one element of the matrix. */
    var m31: Double
    
    /** The row three and column two element of the matrix. */
    var m32: Double
  }
  object Matrix3x2 {
    
    @scala.inline
    def apply(m11: Double, m12: Double, m21: Double, m22: Double, m31: Double, m32: Double): Matrix3x2 = {
      val __obj = js.Dynamic.literal(m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m31 = m31.asInstanceOf[js.Any], m32 = m32.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matrix3x2]
    }
    
    @scala.inline
    implicit class Matrix3x2MutableBuilder[Self <: Matrix3x2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setM11(value: Double): Self = StObject.set(x, "m11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM12(value: Double): Self = StObject.set(x, "m12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM21(value: Double): Self = StObject.set(x, "m21", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM22(value: Double): Self = StObject.set(x, "m22", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM31(value: Double): Self = StObject.set(x, "m31", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM32(value: Double): Self = StObject.set(x, "m32", value.asInstanceOf[js.Any])
    }
  }
  
  /** Describes a 4*4 floating point matrix. */
  trait Matrix4x4 extends StObject {
    
    /** The row one and column one element of the matrix. */
    var m11: Double
    
    /** The row one and column two element of the matrix. */
    var m12: Double
    
    /** The row one and column three element of the matrix. */
    var m13: Double
    
    /** The row one and column four element of the matrix. */
    var m14: Double
    
    /** The row two and column one element of the matrix. */
    var m21: Double
    
    /** The row two and column two element of the matrix. */
    var m22: Double
    
    /** The row two and column three element of the matrix. */
    var m23: Double
    
    /** The row two and column four element of the matrix. */
    var m24: Double
    
    /** The row three and column one element of the matrix. */
    var m31: Double
    
    /** The row three and column two element of the matrix. */
    var m32: Double
    
    /** The row three and column three element of the matrix. */
    var m33: Double
    
    /** The row three and column four element of the matrix. */
    var m34: Double
    
    /** The row four and column one element of the matrix. */
    var m41: Double
    
    /** The row four and column two element of the matrix. */
    var m42: Double
    
    /** The row four and column three element of the matrix. */
    var m43: Double
    
    /** The row four and column four element of the matrix. */
    var m44: Double
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
    implicit class Matrix4x4MutableBuilder[Self <: Matrix4x4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setM11(value: Double): Self = StObject.set(x, "m11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM12(value: Double): Self = StObject.set(x, "m12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM13(value: Double): Self = StObject.set(x, "m13", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM14(value: Double): Self = StObject.set(x, "m14", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM21(value: Double): Self = StObject.set(x, "m21", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM22(value: Double): Self = StObject.set(x, "m22", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM23(value: Double): Self = StObject.set(x, "m23", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM24(value: Double): Self = StObject.set(x, "m24", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM31(value: Double): Self = StObject.set(x, "m31", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM32(value: Double): Self = StObject.set(x, "m32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM33(value: Double): Self = StObject.set(x, "m33", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM34(value: Double): Self = StObject.set(x, "m34", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM41(value: Double): Self = StObject.set(x, "m41", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM42(value: Double): Self = StObject.set(x, "m42", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM43(value: Double): Self = StObject.set(x, "m43", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM44(value: Double): Self = StObject.set(x, "m44", value.asInstanceOf[js.Any])
    }
  }
  
  /** Describes a quaternion (an axis about which a rotation occurs and a rotation amount about that axis). */
  trait Quaternion extends StObject {
    
    /** The w component that represents a rotation amount about the axis that is defined by the X, Y, and Z fields. */
    var w: Double
    
    /** The x component of the vector that represents the axis about which a rotation occurs. */
    var x: Double
    
    /** The y component of the vector that represents the axis about which a rotation occurs. */
    var y: Double
    
    /** The z component of the vector that represents the axis about which a rotation occurs. */
    var z: Double
  }
  object Quaternion {
    
    @scala.inline
    def apply(w: Double, x: Double, y: Double, z: Double): Quaternion = {
      val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quaternion]
    }
    
    @scala.inline
    implicit class QuaternionMutableBuilder[Self <: Quaternion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  /** Describes a vector of two floating-point components. */
  trait Vector2 extends StObject {
    
    /** The x component of the vector. */
    var x: Double
    
    /** The y component of the vector. */
    var y: Double
  }
  object Vector2 {
    
    @scala.inline
    def apply(x: Double, y: Double): Vector2 = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vector2]
    }
    
    @scala.inline
    implicit class Vector2MutableBuilder[Self <: Vector2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /** Describes a vector of three floating-point components. */
  trait Vector3 extends StObject {
    
    /** The x component of the vector. */
    var x: Double
    
    /** The y component of the vector. */
    var y: Double
    
    /** The z component of the vector. */
    var z: Double
  }
  object Vector3 {
    
    @scala.inline
    def apply(x: Double, y: Double, z: Double): Vector3 = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vector3]
    }
    
    @scala.inline
    implicit class Vector3MutableBuilder[Self <: Vector3] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
