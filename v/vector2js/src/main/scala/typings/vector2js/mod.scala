package typings.vector2js

import typings.vector2js.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vector2js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Vector {
    def this(x: Double, y: Double) = this()
  }
  @JSImport("vector2js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vector2js", "down")
  @js.native
  val down: Vector = js.native
  
  @JSImport("vector2js", "downLeft")
  @js.native
  val downLeft: Vector = js.native
  
  @JSImport("vector2js", "downRight")
  @js.native
  val downRight: Vector = js.native
  
  /**
    * @description Creates a Vector from an array
    * @param Array: [10,10]
    * @return Vector
    */
  /* static member */
  inline def fromArray(array: js.Array[Double]): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Vector]
  
  /**
    * @description Creates a Vector from an angle
    * @param angle in degrees
    * @return Vector
    */
  /* static member */
  inline def fromDegrees(angle: Double): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDegrees")(angle.asInstanceOf[js.Any]).asInstanceOf[Vector]
  
  /**
    * @description Creates a Vector from an angle
    * @param angle in radians
    * @return Vector
    */
  /* static member */
  inline def fromRadians(agnle: Double): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRadians")(agnle.asInstanceOf[js.Any]).asInstanceOf[Vector]
  
  /**
    * @description Creates a Vector from string
    * @param string format: x,y 10,10
    * @return Vector
    */
  /* static member */
  inline def fromString(s: String): Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(s.asInstanceOf[js.Any]).asInstanceOf[Vector]
  
  @JSImport("vector2js", "left")
  @js.native
  val left: Vector = js.native
  
  @JSImport("vector2js", "one")
  @js.native
  val one: Vector = js.native
  
  @JSImport("vector2js", "right")
  @js.native
  val right: Vector = js.native
  
  @JSImport("vector2js", "up")
  @js.native
  val up: Vector = js.native
  
  @JSImport("vector2js", "upLeft")
  @js.native
  val upLeft: Vector = js.native
  
  @JSImport("vector2js", "upRight")
  @js.native
  val upRight: Vector = js.native
  
  @JSImport("vector2js", "zero")
  @js.native
  val zero: Vector = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.vector2js.mod.Vector
    - typings.vector2js.anon.X
  */
  trait InputVec extends StObject
  
  @js.native
  trait Vector
    extends StObject
       with InputVec {
    
    /**
      * @description Clone and abs component values (x, y positive).
      * @return Vector
      */
    def abs(): Vector = js.native
    
    /**
      * @description abs component values (x, y positive).
      * @return this
      */
    def absSelf(): this.type = js.native
    
    def add(other: Double): Vector = js.native
    /**
      * @description Clone self and add other vector to it.
      * @param vector to add with.
      * @return Vector
      */
    def add(other: InputVec): Vector = js.native
    
    /**
      * @description Clone and add scalar.
      * @param value to add.
      * @return Vector
      */
    def addScalar(scalar: Double): Vector = js.native
    
    /**
      * @description Add scalar value to self.
      * @param value to add to components.
      * @return this
      */
    def addScalarSelf(`val`: Double): this.type = js.native
    
    def addSelf(other: Double): this.type = js.native
    /**
      * @description Add other vector to self.
      * @param vector to add.
      * @return this
      */
    def addSelf(other: InputVec): this.type = js.native
    
    /**
      * @description Clone and apply a function on x and y components.
      * @param function to apply on components.
      * @return Vector
      */
    @JSName("apply")
    def apply(func: js.Function1[/* component */ Double, Double]): Vector = js.native
    
    /**
      * @description Apply a function on x and y components of the vector.
      * @param function to apply on components.
      * @return this
      */
    def applySelf(func: js.Function1[/* component */ Double, Double]): this.type = js.native
    
    /**
      * @description Clone and clamp.
      * Note: this function does not validate that min < max.
      * @param min value
      * @param max value
      * @return Vector
      */
    def clamp(min: Double, max: Double): Vector = js.native
    
    /**
      * @description Clamp vector values into range.
      * Note: this function does not validate that min < max.
      * @param min value
      * @param max value
      * @return this
      */
    def clampSelf(min: Double, max: Double): this.type = js.native
    
    /**
      * @param vector The vector to copy values from
      * @return this
      */
    def copy(vector: InputVec): this.type = js.native
    
    /**
      * @param vector  The vector to copy X from
      * @return this
      */
    def copyX(vector: InputVec): this.type = js.native
    
    /**
      * @param vector  The vector to copy Y from
      * @return this
      */
    def copyY(vector: InputVec): this.type = js.native
    
    /**
      * @param vector to compute cross-product with.
      * @return Vector
      */
    def cross(other: InputVec): Vector = js.native
    
    /**
      * @description Get degrees from another vector in degrees.
      * @param  other vector to get angle from.
      * @return Angle in degrees from this to other
      */
    def degreesTo(other: InputVec): Double = js.native
    
    /**
      * @description Get the distance from another vector.
      * @param  other vector to get distance from.
      * @return Distance between the two vectors
      */
    def distanceFrom(other: InputVec): Double = js.native
    
    def div(other: Double): Vector = js.native
    /**
      * @description Clone and divide by other vector.
      * @param vector to divide with.
      * @return Vector
      */
    def div(other: InputVec): Vector = js.native
    
    /**
      * @description Clone and divide by scalar.
      * @param value to divide by.
      * @return Vector
      */
    def divScalar(scalar: Double): Vector = js.native
    
    /**
      * @description Divide self by scalar.
      * @param value to divide components by.
      * @return this
      */
    def divScalarSelf(`val`: Double): this.type = js.native
    
    def divSelf(other: Double): this.type = js.native
    /**
      * @description Divide self by other vector.
      * @param vector to divide from.
      * @return this
      */
    def divSelf(other: InputVec): this.type = js.native
    
    /**
      * @param vector to compute dot-product with.
      * @return Dot Product
      */
    def dot(other: InputVec): Double = js.native
    
    /**
      * @param vector the vector to compare with
      * @return equality of each component
      */
    def equals(vector: InputVec): Boolean = js.native
    
    /**
      * @description Clone and flip between x and y values.
      * @return Cloned vector vith flipped X and Y components
      */
    def flipXY(): Vector = js.native
    
    /**
      * @description flip between x and y values.
      * @return this
      */
    def flipXYSelf(): this.type = js.native
    
    /**
      * @description Convert to a string with a given format.
      * @param fmat - a string in which %x and %y will be replaced with the vector values.
      * @return String
      */
    def format(format: String): String = js.native
    
    /**
      * @description Clone and invert x and y values
      * @return "{-x,-y}"
      */
    def invert(): Vector = js.native
    
    /**
      * @description Invert x and y values (*-1)
      * @return this
      */
    def invertSelf(): this.type = js.native
    
    /**
      * @description get length (aka magnitude)
      * @return length
      */
    def length(): Double = js.native
    
    def mul(other: Double): Vector = js.native
    /**
      * @description Clone self and multiply by other vector.
      * @param vector to multiply with.
      * @return Vector
      */
    def mul(other: InputVec): Vector = js.native
    
    /**
      * @description Clone and multiply by scalar.
      * @param value to multiply with.
      * @return Vector
      */
    def mulScalar(scalar: Double): Vector = js.native
    
    /**
      * @description Multiply self by scalar.
      * @param value to multiply components with.
      * @return this
      */
    def mulScalarSelf(`val`: Double): this.type = js.native
    
    def mulSelf(other: Double): this.type = js.native
    /**
      * @description Multiply self vector by other vector.
      * @param vector to multiply components with.
      * @return this
      */
    def mulSelf(other: InputVec): this.type = js.native
    
    /**
      * @description Clone and normalize the vector.
      * @return Vector
      */
    def normalize(): Vector = js.native
    
    /**
      * @description Normalize vector
      * @return this
      */
    def normalizeSelf(): this.type = js.native
    
    /**
      * @description Get angle from another vector in radians.
      * @param  other vector to get angle from.
      * @return Angle in radians from this to other
      */
    def radiansTo(other: InputVec): Double = js.native
    
    /**
      * @description Clone and replace nan, null, undefined, etc by defaults.
      * @param x default value
      * @param y default value
      * @return Vector
      */
    def repair(x: Double, y: Double): Vector = js.native
    
    /**
      * @description If any of the components of this vector are nan, null, undefined, etc. set them to defaults.
      * @param x default value
      * @param y default value
      * @return this
      */
    def repairSelf(x: Double, y: Double): this.type = js.native
    
    /**
      * @description Clone and rotate by a given angle.
      * @param degrees to rotate this vector by.
      * @return Cloned Rotated Vector
      */
    def rotateDegrees(degrees: Double): Vector = js.native
    
    /**
      * @description Rotate by a given angle.
      * @param degrees to rotate this vector by.
      * @return this
      */
    def rotateDegreesSelf(degrees: Double): this.type = js.native
    
    /**
      * @description Clone and rotate the vector by a given angle.
      * @param radians to rotate this vector by.
      * @return Cloned Rotated Vector
      */
    def rotateRadians(radians: Double): Vector = js.native
    
    /**
      * @description Rotate by a given angle.
      * @param radians to rotate by.
      * @return this
      */
    def rotateRadiansSelf(radians: Double): this.type = js.native
    
    /**
      * @description Clone and round components values
      * @return Vector
      */
    def round(): Vector = js.native
    
    /**
      * @description round components values
      * @return this
      */
    def roundSelf(): this.type = js.native
    
    /**
      * @description Set values from x, y.
      * @param [x] x component to set.
      * @param [y] y component to set.
      * @return this
      */
    def set(): this.type = js.native
    def set(x: Double): this.type = js.native
    def set(x: Double, y: Double): this.type = js.native
    def set(x: Unit, y: Double): this.type = js.native
    
    def sub(other: Double): Vector = js.native
    /**
      * @description Clone self and subtract other vector from it.
      * @param vector to subtract from.
      * @return Vector
      */
    def sub(other: InputVec): Vector = js.native
    
    /**
      * @description Clone and substract scalar.
      * @param value to subtract.
      * @return Vector
      */
    def subScalar(scalar: Double): Vector = js.native
    
    /**
      * @description Subtract scalar from self.
      * @param value to subtract from components.
      * @return this
      */
    def subScalarSelf(`val`: Double): this.type = js.native
    
    def subSelf(other: Double): this.type = js.native
    /**
      * @description Subtract other vector from self.
      * @param vector to subtract.
      * @return this
      */
    def subSelf(other: InputVec): this.type = js.native
    
    /**
      * @description Convert to array with x, y.
      * @return [x, y]
      */
    def toArray(): js.Array[Double] = js.native
    
    /**
      * @description Get angle from X axis.
      * This is equivalent to doing vector.zero.degreeto(this).
      * @return Angle In Degrees (0-360)
      */
    def toDegrees(other: InputVec): Double = js.native
    
    /**
      * @description Convert to an Object with {x, y}.
      * @return "{ x, y }"
      */
    def toDict(): X = js.native
    
    /**
      * @description Get angle from X axis.
      * Same as vector.zero.radiansto(this)
      * @param  other vector to get angle from.
      * @return angle in radians
      */
    def toRadians(other: InputVec): Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
