package typings
package victorLib.victorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Victor extends js.Object {
  var x: scala.Double
  var y: scala.Double
  /**
    * Same as distanceX but always returns an absolute value.
    * @param vector
    */
  def absDistanceX(vector: Victor): scala.Double
  /**
    * Same as distanceY but always returns an absolute value.
    * @param vector
    */
  def absDistanceY(vector: Victor): scala.Double
  /**
    * Adds another vector to itself.
    * @param vector
    */
  def add(vector: Victor): Victor
  /**
    * Adds the given scalar to both vector axis.
    *
    * @param scalar
    */
  def addScalar(scalar: scala.Double): Victor
  /**
    * Adds the given scalar to the X axis.
    *
    * @param scalar
    */
  def addScalarX(scalar: scala.Double): Victor
  /**
    * Adds the given scalar to the Y axis.
    *
    * @param scalar
    */
  def addScalarY(scalar: scala.Double): Victor
  /**
    * Adds another vector's X component to itself.
    * @param vector
    */
  def addX(vector: Victor): Victor
  /**
    * Adds another vector's Y component to itself.
    * @param vector
    */
  def addY(vector: Victor): Victor
  /**
    * Alias for horizontalAngle.
    */
  def angle(): scala.Double
  /**
    * Alias for horizontalAngleDeg.
    */
  def angleDeg(): scala.Double
  /**
    * Copies the X and Y components of another vector in to itself.
    * @param vector
    */
  def copy(vector: Victor): Victor
  /**
    * Copies the X component of another vector in to itself.
    * @param vector
    */
  def copyX(vector: Victor): Victor
  /**
    * Copies the Y component of another vector in to itself.
    * @param vector
    */
  def copyY(vector: Victor): Victor
  /**
    * Returns the cross product of two vectors.
    * @param vector
    */
  def cross(vector: Victor): scala.Double
  /**
    * Alias for horizontalAngle.
    */
  def direction(): scala.Double
  /**
    * Returns the euclidean distance between two vectors.
    * @param vector
    */
  def distance(vector: Victor): scala.Double
  /**
    * Returns the squared euclidean distance between two vectors. If the distance is only needed for comparison, this function is faster than distance.
    * @param vector
    */
  def distanceSq(vector: Victor): scala.Double
  /**
    * Returns the distance of the X component from another vector.
    * @param vector
    */
  def distanceX(vector: Victor): scala.Double
  /**
    * Returns the distance of the Y component from another vector.
    * @param vector
    */
  def distanceY(vector: Victor): scala.Double
  /**
    * Divides both components by another vector.
    * @param scalar
    */
  def divide(scalar: Victor): Victor
  /**
    * Divides both vector axis by the given scalar value.
    *
    * @param scalar
    */
  def divideScalar(scalar: scala.Double): Victor
  /**
    * Divides the X axis by the given scalar value.
    *
    * @param scalar
    */
  def divideScalarX(scalar: scala.Double): Victor
  /**
    * Divides the Y axis by the given scalar value.
    *
    * @param scalar
    */
  def divideScalarY(scalar: scala.Double): Victor
  /**
    * Divides the X component by the X component of another vector.
    * @param vector
    */
  def divideX(vector: Victor): Victor
  /**
    * Divides the Y component by the Y component of another vector.
    * @param vector
    */
  def divideY(vector: Victor): Victor
  /**
    * Returns the dot product of two vectors.
    * @param vector
    */
  def dot(vector: Victor): scala.Double
  /**
    * Returns the angle towards X in radians.
    */
  def horizontalAngle(): scala.Double
  /**
    * Same as horizontalAngle but returns degrees.
    */
  def horizontalAngleDeg(): scala.Double
  /**
    * Inverts both components.
    */
  def invert(): Victor
  /**
    * Inverts the X component.
    */
  def invertX(): Victor
  /**
    * Inverts the Y component.
    */
  def invertY(): Victor
  /**
    * Returns a true if this vector is the same as another.
    * @param vector
    */
  def isEqualTo(vector: Victor): scala.Boolean
  /**
    * Returns a true if vector is (0, 0).
    */
  def isZero(): scala.Boolean
  /**
    * Returns the length / magnitude.
    */
  def length(): scala.Double
  /**
    * Returns the squared length / magnitude. If the length is only needed for comparison, this function is faster than length.
    */
  def lengthSq(): scala.Double
  /**
    * If either component is greater than max, multiplies the component by multiplier.
    * @param max
    * @param multiplier
    */
  def limit(max: scala.Double, multiplier: scala.Double): Victor
  /**
    * Alias for length.
    */
  def magnitude(): scala.Double
  /**
    * Performs a linear blend / interpolation towards another vector.
    * @param vector
    * @param amount
    */
  def mix(vector: Victor, amount: scala.Double): Victor
  /**
    * Performs a linear blend / interpolation of the X component towards another vector.
    * @param vector Number amount Value between 0 and 1. Default: 0.5
    * @param amount
    */
  def mixX(vector: Victor, amount: scala.Double): Victor
  /**
    * Performs a linear blend / interpolation of the Y component towards another vector.
    * @param vector
    * @param amount
    */
  def mixY(vector: Victor, amount: scala.Double): Victor
  /**
    * Multiplies both components with another vector.
    * @param vector
    */
  def multiply(vector: Victor): Victor
  /**
    * Multiplies both vector axis by the given scalar value
    *
    * @param scalar
    */
  def multiplyScalar(scalar: scala.Double): Victor
  /**
    * Multiplies the X axis by the given scalar
    *
    * @param scalar
    */
  def multiplyScalarX(scalar: scala.Double): Victor
  /**
    * Multiplies the Y axis by the given scalar
    *
    * @param scalar
    */
  def multiplyScalarY(scalar: scala.Double): Victor
  /**
    * Multiplies the X component with the X component of another vector.
    * @param vector
    */
  def multiplyX(vector: Victor): Victor
  /**
    * Multiplies the Y component with the Y component of another vector.
    * @param vector
    */
  def multiplyY(vector: Victor): Victor
  /**
    * Alias of normalize.
    */
  def norm(): Victor
  /**
    * Normalizes the vector by scaling it down to a length of 1 while keeping its direction.
    */
  def normalize(): Victor
  /**
    * Projects a vector onto another vector, setting itself to the result.
    * @param vector
    */
  def projectOnto(vector: Victor): Victor
  /**
    * Randomizes the components with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  def randomize(topLeft: Victor, bottomRight: Victor): Victor
  /**
    * Randomly randomizes either the X component or the Y component with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  def randomizeAny(topLeft: Victor, bottomRight: Victor): Victor
  /**
    * Randomizes the X component with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  def randomizeX(topLeft: Victor, bottomRight: Victor): Victor
  /**
    * Randomizes the Y component with a value between topLeft and bottomRight.
    * @param topLeft
    * @param bottomRight
    */
  def randomizeY(topLeft: Victor, bottomRight: Victor): Victor
  /**
    * Rotates the vector to a certain angle, in radians CCW from +X axis.
    * @param angle
    */
  def rotate(angle: scala.Double): Victor
  /**
    * Rotates the vector by a rotation angle, given in radians CCW from +X axis.
    * @param rotation
    */
  def rotateBy(rotation: scala.Double): Victor
  /**
    * Same as rotateBy but uses degrees
    * @param rotation
    */
  def rotateByDeg(rotation: scala.Double): Victor
  /**
    * Same as rotate but uses degrees
    * @param angle
    */
  def rotateDeg(angle: scala.Double): Victor
  /**
    * Subtracts another vector from itself.
    * @param vector
    */
  def subtract(vector: Victor): Victor
  /**
    * Subtracts the given scalar from both axis.
    *
    * @param scalar
    */
  def subtractScalar(scalar: scala.Double): Victor
  /**
    * Subtracts the given scalar from the X axis.
    *
    * @param scalar
    */
  def subtractScalarX(scalar: scala.Double): Victor
  /**
    * Subtracts the given scalar from the Y axis.
    *
    * @param scalar
    */
  def subtractScalarY(scalar: scala.Double): Victor
  /**
    * Subtracts another vector's X component from itself.
    * @param vector
    */
  def subtractX(vector: Victor): Victor
  /**
    * Subtracts another vector's Y component from itself.
    * @param vector
    */
  def subtractY(vector: Victor): Victor
  /**
    * Returns an array representation of the X and Y components.
    */
  def toArray(): js.Array[scala.Double]
  /**
    * Rounds both axis to a certain precision.
    */
  def toFixed(): Victor
  /**
    * Returns an object representation of tha X and Y components.
    */
  def toObject(): VictorCoordinates
  /**
    * Rounds the components to integer numbers.
    */
  def unfloat(): Victor
  /**
    * Returns the angle towards Y in radians.
    */
  def verticalAngle(): scala.Double
  /**
    * Same as verticalAngle but returns degrees.
    */
  def verticalAngleDeg(): scala.Double
  /**
    * Sets the vector to zero (0,0).
    */
  def zero(): Victor
}

