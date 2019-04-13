package typings
package victorLib.victorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("victor", JSImport.Namespace)
@js.native
class ^ protected () extends Victor {
  /**
    * Can be used without the new keyword.
    * @param x The X component
    * @param y The Y component
    */
  def this(x: scala.Double, y: scala.Double) = this()
  /* CompleteClass */
  override var x: scala.Double = js.native
  /* CompleteClass */
  override var y: scala.Double = js.native
  /**
    * Same as distanceX but always returns an absolute value.
    * @param vector
    */
  /* CompleteClass */
  override def absDistanceX(vector: Victor): scala.Double = js.native
  /**
    * Same as distanceY but always returns an absolute value.
    * @param vector
    */
  /* CompleteClass */
  override def absDistanceY(vector: Victor): scala.Double = js.native
  /**
    * Adds another vector to itself.
    * @param vector
    */
  /* CompleteClass */
  override def add(vector: Victor): Victor = js.native
  /**
    * Adds the given scalar to both vector axis.
    *
    * @param scalar
    */
  /* CompleteClass */
  override def addScalar(scalar: scala.Double): Victor = js.native
  /**
    * Adds the given scalar to the X axis.
    *
    * @param scalar
    */
  /* CompleteClass */
  override def addScalarX(scalar: scala.Double): Victor = js.native
  /**
    * Adds the given scalar to the Y axis.
    *
    * @param scalar
    */
  /* CompleteClass */
  override def addScalarY(scalar: scala.Double): Victor = js.native
  /**
    * Adds another vector's X component to itself.
    * @param vector
    */
  /* CompleteClass */
  override def addX(vector: Victor): Victor = js.native
  /**
    * Adds another vector's Y component to itself.
    * @param vector
    */
  /* CompleteClass */
  override def addY(vector: Victor): Victor = js.native
  /**
    * Alias for horizontalAngle.
    */
  /* CompleteClass */
  override def angle(): scala.Double = js.native
  /**
    * Alias for horizontalAngleDeg.
    */
  /* CompleteClass */
  override def angleDeg(): scala.Double = js.native
  /**
    * Copies the X and Y components of another vector in to itself.
    * @param vector
    */
  /* CompleteClass */
  override def copy(vector: Victor): Victor = js.native
  /**
    * Copies the X component of another vector in to itself.
    * @param vector
    */
  /* CompleteClass */
  override def copyX(vector: Victor): Victor = js.native
  /**
    * Copies the Y component of another vector in to itself.
    * @param vector
    */
  /* CompleteClass */
  override def copyY(vector: Victor): Victor = js.native
  /**
    * Returns the cross product of two vectors.
    * @param vector
    */
  /* CompleteClass */
  override def cross(vector: Victor): scala.Double = js.native
  /**
    * Alias for horizontalAngle.
    */
  /* CompleteClass */
  override def direction(): scala.Double = js.native
  /**
    * Returns the euclidean distance between two vectors.
    * @param vector
    */
  /* CompleteClass */
  override def distance(vector: Victor): scala.Double = js.native
  /**
    * Returns the squared euclidean distance between two vectors. If the distance is only needed for comparison, this function is faster than distance.
    * @param vector
    */
  /* CompleteClass */
  override def distanceSq(vector: Victor): scala.Double = js.native
  /**
    * Returns the distance of the X component from another vector.
    * @param vector
    */
  /* CompleteClass */
  override def distanceX(vector: Victor): scala.Double = js.native
  /**
    * Returns the distance of the Y component from another vector.
    * @param vector
    */
  /* CompleteClass */
  override def distanceY(vector: Victor): scala.Double = js.native
  /**
    * Divides both components by another vector.
    * @param scalar
    */
  /* CompleteClass */
  override def divide(scalar: Victor): Victor = js.native
  /**
    * Divides both vector axis by the given scalar value.
    *
    * @param scalar
    */
  /* CompleteClass */
  override def divideScalar(scalar: scala.Double): Victor = js.native
  /**
    * Divides the X axis by the given scalar value.
    *
    * @param scalar
    */
  /* CompleteClass */
  override def divideScalarX(scalar: scala.Double): Victor = js.native
  /**
    * Divides the Y axis by the given scalar value.
    *
    * @param scalar
    */
  /* CompleteClass */
  override def divideScalarY(scalar: scala.Double): Victor = js.native
  /**
    * Divides the X component by the X component of another vector.
    * @param vector
    */
  /* CompleteClass */
  override def divideX(vector: Victor): Victor = js.native
  /**
    * Divides the Y component by the Y component of another vector.
    * @param vector
    */
  /* CompleteClass */
  override def divideY(vector: Victor): Victor = js.native
  /**
    * Returns the dot product of two vectors.
    * @param vector
    */
  /* CompleteClass */
  override def dot(vector: Victor): scala.Double = js.native
  /**
    * Returns the angle towards X in radians.
    */
  /* CompleteClass */
  override def horizontalAngle(): scala.Double = js.native
  /**
    * Same as horizontalAngle but returns degrees.
    */
  /* CompleteClass */
  override def horizontalAngleDeg(): scala.Double = js.native
  /**
    * Inverts both components.
    */
  /* CompleteClass */
  override def invert(): Victor = js.native
  /**
    * Inverts the X component.
    */
  /* CompleteClass */
  override def invertX(): Victor = js.native
  /**
    * Inverts the Y component.
    */
  /* CompleteClass */
  override def invertY(): Victor = js.native
  /**
    * Returns a true if this vector is the same as another.
    * @param vector
    */
  /* CompleteClass */
  override def isEqualTo(vector: Victor): scala.Boolean = js.native
  /**
    * Returns a true if vector is (0, 0).
    */
  /* CompleteClass */
  override def isZero(): scala.Boolean = js.native
  /**
    * Returns the length / magnitude.
    */
  /* CompleteClass */
  override def length(): scala.Double = js.native
  /**
    * Returns the squared length / magnitude. If the length is only needed for comparison, this function is faster than length.
    */
  /* CompleteClass */
  override def lengthSq(): scala.Double = js.native
  /**
    * If either component is greater than max, multiplies the component by multiplier.
    * @param max
    * @param multiplier
    */
  /* CompleteClass */
  override def limit(max: scala.Double, multiplier: scala.Double): Victor = js.native
  /**
    * Alias for length.
    */
  /* CompleteClass */
  override def magnitude(): scala.Double = js.native
  /**
    * Performs a linear blend / interpolation towards another vector.
    * @param vector
    * @param amount
    */
  /* CompleteClass */
  override def mix(vector: Victor, amount: scala.Double): Victor = js.native
  /**
    * Performs a linear blend / interpolation of the X component towards another vector.
    * @param vector Number amount Value between 0 and 1. Default: 0.5
    * @param amount
    */
  /* CompleteClass */
  override def mixX(vector: Victor, amount: scala.Double): Victor = js.native
  /**
    * Performs a linear blend / interpolation of the Y component towards another vector.
    * @param vector
    * @param amount
    */
  /* CompleteClass */
  override def mixY(vector: Victor, amount: scala.Double): Victor = js.native
  /**
    * Multiplies both components with another vector.
    * @param vector
    */
  /* CompleteClass */
  override def multiply(vector: Victor): Victor = js.native
  /**
    * Multiplies both vector axis by the given scalar value
    *
    * @param scalar
    */
  /* CompleteClass */
  override def multiplyScalar(scalar: scala.Double): Victor = js.native
  /**
    * Multiplies the X axis by the given scalar
    *
    * @param scalar
    */
  /* CompleteClass */
  override def multiplyScalarX(scalar: scala.Double): Victor = js.native
  /**
    * Multiplies the Y axis by the given scalar
    *
    * @param scalar
    */
  /* CompleteClass */
  override def multiplyScalarY(scalar: scala.Double): Victor = js.native
  /**
    * Multiplies the X component with the X component of another vector.
    * @param vector
    */
  /* CompleteClass */
  override def multiplyX(vector: Victor): Victor = js.native
  /**
    * Multiplies the Y component with the Y component of another vector.
    * @param vector
    */
  /* CompleteClass */
  override def multiplyY(vector: Victor): Victor = js.native
  /**
    * Alias of normalize.
    */
  /* CompleteClass */
  override def norm(): Victor = js.native
  /**
    * Normalizes the vector by scaling it down to a length of 1 while keeping its direction.
    */
  /* CompleteClass */
  override def normalize(): Victor = js.native
  /**
    * Projects a vector onto another vector, setting itself to the result.
    * @param vector
    */
  /* CompleteClass */
  override def projectOnto(vector: Victor): Victor = js.native
  /**
    * Randomizes the components with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  /* CompleteClass */
  override def randomize(topLeft: Victor, bottomRight: Victor): Victor = js.native
  /**
    * Randomly randomizes either the X component or the Y component with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  /* CompleteClass */
  override def randomizeAny(topLeft: Victor, bottomRight: Victor): Victor = js.native
  /**
    * Randomizes the X component with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  /* CompleteClass */
  override def randomizeX(topLeft: Victor, bottomRight: Victor): Victor = js.native
  /**
    * Randomizes the Y component with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  /* CompleteClass */
  override def randomizeY(topLeft: Victor, bottomRight: Victor): Victor = js.native
  /**
    * Rotates the vector to a certain angle, in radians CCW from +X axis.
    * @param angle
    */
  /* CompleteClass */
  override def rotate(angle: scala.Double): Victor = js.native
  /**
    * Rotates the vector by a rotation angle, given in radians CCW from +X axis.
    * @param rotation
    */
  /* CompleteClass */
  override def rotateBy(rotation: scala.Double): Victor = js.native
  /**
    * Same as rotateBy but uses degrees
    * @param rotation
    */
  /* CompleteClass */
  override def rotateByDeg(rotation: scala.Double): Victor = js.native
  /**
    * Same as rotate but uses degrees
    * @param angle
    */
  /* CompleteClass */
  override def rotateDeg(angle: scala.Double): Victor = js.native
  /**
    * Subtracts another vector from itself.
    * @param vector
    */
  /* CompleteClass */
  override def subtract(vector: Victor): Victor = js.native
  /**
    * Subtracts the given scalar from both axis.
    *
    * @param scalar
    */
  /* CompleteClass */
  override def subtractScalar(scalar: scala.Double): Victor = js.native
  /**
    * Subtracts the given scalar from the X axis.
    *
    * @param scalar
    */
  /* CompleteClass */
  override def subtractScalarX(scalar: scala.Double): Victor = js.native
  /**
    * Subtracts the given scalar from the Y axis.
    *
    * @param scalar
    */
  /* CompleteClass */
  override def subtractScalarY(scalar: scala.Double): Victor = js.native
  /**
    * Subtracts another vector's X component from itself.
    * @param vector
    */
  /* CompleteClass */
  override def subtractX(vector: Victor): Victor = js.native
  /**
    * Subtracts another vector's Y component from itself.
    * @param vector
    */
  /* CompleteClass */
  override def subtractY(vector: Victor): Victor = js.native
  /**
    * Returns an array representation of the X and Y components.
    */
  /* CompleteClass */
  override def toArray(): js.Array[scala.Double] = js.native
  /**
    * Rounds both axis to a certain precision.
    */
  /* CompleteClass */
  override def toFixed(): Victor = js.native
  /**
    * Returns an object representation of tha X and Y components.
    */
  /* CompleteClass */
  override def toObject(): VictorCoordinates = js.native
  /**
    * Rounds the components to integer numbers.
    */
  /* CompleteClass */
  override def unfloat(): Victor = js.native
  /**
    * Returns the angle towards Y in radians.
    */
  /* CompleteClass */
  override def verticalAngle(): scala.Double = js.native
  /**
    * Same as verticalAngle but returns degrees.
    */
  /* CompleteClass */
  override def verticalAngleDeg(): scala.Double = js.native
  /**
    * Sets the vector to zero (0,0).
    */
  /* CompleteClass */
  override def zero(): Victor = js.native
}

@JSImport("victor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates vector from array.
    * @param arr array An array that contains the X component in the first element and the Y component in the second
    */
  def fromArray(arr: js.Array[scala.Double]): Victor = js.native
  /**
    * Creates vector from object.
    * @param obj An object containing the X component in the x property and the Y component in the y property
    */
  def fromObject(obj: VictorCoordinates): Victor = js.native
}

