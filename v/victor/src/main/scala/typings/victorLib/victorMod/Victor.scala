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

object Victor {
  @scala.inline
  def apply(
    absDistanceX: js.Function1[Victor, scala.Double],
    absDistanceY: js.Function1[Victor, scala.Double],
    add: js.Function1[Victor, Victor],
    addScalar: js.Function1[scala.Double, Victor],
    addScalarX: js.Function1[scala.Double, Victor],
    addScalarY: js.Function1[scala.Double, Victor],
    addX: js.Function1[Victor, Victor],
    addY: js.Function1[Victor, Victor],
    angle: js.Function0[scala.Double],
    angleDeg: js.Function0[scala.Double],
    clone: js.Function0[Victor],
    copy: js.Function1[Victor, Victor],
    copyX: js.Function1[Victor, Victor],
    copyY: js.Function1[Victor, Victor],
    cross: js.Function1[Victor, scala.Double],
    direction: js.Function0[scala.Double],
    distance: js.Function1[Victor, scala.Double],
    distanceSq: js.Function1[Victor, scala.Double],
    distanceX: js.Function1[Victor, scala.Double],
    distanceY: js.Function1[Victor, scala.Double],
    divide: js.Function1[Victor, Victor],
    divideScalar: js.Function1[scala.Double, Victor],
    divideScalarX: js.Function1[scala.Double, Victor],
    divideScalarY: js.Function1[scala.Double, Victor],
    divideX: js.Function1[Victor, Victor],
    divideY: js.Function1[Victor, Victor],
    dot: js.Function1[Victor, scala.Double],
    horizontalAngle: js.Function0[scala.Double],
    horizontalAngleDeg: js.Function0[scala.Double],
    invert: js.Function0[Victor],
    invertX: js.Function0[Victor],
    invertY: js.Function0[Victor],
    isEqualTo: js.Function1[Victor, scala.Boolean],
    isZero: js.Function0[scala.Boolean],
    length: js.Function0[scala.Double],
    lengthSq: js.Function0[scala.Double],
    limit: js.Function2[scala.Double, scala.Double, Victor],
    magnitude: js.Function0[scala.Double],
    mix: js.Function2[Victor, scala.Double, Victor],
    mixX: js.Function2[Victor, scala.Double, Victor],
    mixY: js.Function2[Victor, scala.Double, Victor],
    multiply: js.Function1[Victor, Victor],
    multiplyScalar: js.Function1[scala.Double, Victor],
    multiplyScalarX: js.Function1[scala.Double, Victor],
    multiplyScalarY: js.Function1[scala.Double, Victor],
    multiplyX: js.Function1[Victor, Victor],
    multiplyY: js.Function1[Victor, Victor],
    norm: js.Function0[Victor],
    normalize: js.Function0[Victor],
    projectOnto: js.Function1[Victor, Victor],
    randomize: js.Function2[Victor, Victor, Victor],
    randomizeAny: js.Function2[Victor, Victor, Victor],
    randomizeX: js.Function2[Victor, Victor, Victor],
    randomizeY: js.Function2[Victor, Victor, Victor],
    rotate: js.Function1[scala.Double, Victor],
    rotateBy: js.Function1[scala.Double, Victor],
    rotateByDeg: js.Function1[scala.Double, Victor],
    rotateDeg: js.Function1[scala.Double, Victor],
    subtract: js.Function1[Victor, Victor],
    subtractScalar: js.Function1[scala.Double, Victor],
    subtractScalarX: js.Function1[scala.Double, Victor],
    subtractScalarY: js.Function1[scala.Double, Victor],
    subtractX: js.Function1[Victor, Victor],
    subtractY: js.Function1[Victor, Victor],
    toArray: js.Function0[js.Array[scala.Double]],
    toFixed: js.Function0[Victor],
    toObject: js.Function0[VictorCoordinates],
    toString: js.Function0[java.lang.String],
    unfloat: js.Function0[Victor],
    verticalAngle: js.Function0[scala.Double],
    verticalAngleDeg: js.Function0[scala.Double],
    x: scala.Double,
    y: scala.Double,
    zero: js.Function0[Victor]
  ): Victor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("absDistanceX")(absDistanceX)
    __obj.updateDynamic("absDistanceY")(absDistanceY)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addScalar")(addScalar)
    __obj.updateDynamic("addScalarX")(addScalarX)
    __obj.updateDynamic("addScalarY")(addScalarY)
    __obj.updateDynamic("addX")(addX)
    __obj.updateDynamic("addY")(addY)
    __obj.updateDynamic("angle")(angle)
    __obj.updateDynamic("angleDeg")(angleDeg)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("copyX")(copyX)
    __obj.updateDynamic("copyY")(copyY)
    __obj.updateDynamic("cross")(cross)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("distanceSq")(distanceSq)
    __obj.updateDynamic("distanceX")(distanceX)
    __obj.updateDynamic("distanceY")(distanceY)
    __obj.updateDynamic("divide")(divide)
    __obj.updateDynamic("divideScalar")(divideScalar)
    __obj.updateDynamic("divideScalarX")(divideScalarX)
    __obj.updateDynamic("divideScalarY")(divideScalarY)
    __obj.updateDynamic("divideX")(divideX)
    __obj.updateDynamic("divideY")(divideY)
    __obj.updateDynamic("dot")(dot)
    __obj.updateDynamic("horizontalAngle")(horizontalAngle)
    __obj.updateDynamic("horizontalAngleDeg")(horizontalAngleDeg)
    __obj.updateDynamic("invert")(invert)
    __obj.updateDynamic("invertX")(invertX)
    __obj.updateDynamic("invertY")(invertY)
    __obj.updateDynamic("isEqualTo")(isEqualTo)
    __obj.updateDynamic("isZero")(isZero)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("lengthSq")(lengthSq)
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("magnitude")(magnitude)
    __obj.updateDynamic("mix")(mix)
    __obj.updateDynamic("mixX")(mixX)
    __obj.updateDynamic("mixY")(mixY)
    __obj.updateDynamic("multiply")(multiply)
    __obj.updateDynamic("multiplyScalar")(multiplyScalar)
    __obj.updateDynamic("multiplyScalarX")(multiplyScalarX)
    __obj.updateDynamic("multiplyScalarY")(multiplyScalarY)
    __obj.updateDynamic("multiplyX")(multiplyX)
    __obj.updateDynamic("multiplyY")(multiplyY)
    __obj.updateDynamic("norm")(norm)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("projectOnto")(projectOnto)
    __obj.updateDynamic("randomize")(randomize)
    __obj.updateDynamic("randomizeAny")(randomizeAny)
    __obj.updateDynamic("randomizeX")(randomizeX)
    __obj.updateDynamic("randomizeY")(randomizeY)
    __obj.updateDynamic("rotate")(rotate)
    __obj.updateDynamic("rotateBy")(rotateBy)
    __obj.updateDynamic("rotateByDeg")(rotateByDeg)
    __obj.updateDynamic("rotateDeg")(rotateDeg)
    __obj.updateDynamic("subtract")(subtract)
    __obj.updateDynamic("subtractScalar")(subtractScalar)
    __obj.updateDynamic("subtractScalarX")(subtractScalarX)
    __obj.updateDynamic("subtractScalarY")(subtractScalarY)
    __obj.updateDynamic("subtractX")(subtractX)
    __obj.updateDynamic("subtractY")(subtractY)
    __obj.updateDynamic("toArray")(toArray)
    __obj.updateDynamic("toFixed")(toFixed)
    __obj.updateDynamic("toObject")(toObject)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("unfloat")(unfloat)
    __obj.updateDynamic("verticalAngle")(verticalAngle)
    __obj.updateDynamic("verticalAngleDeg")(verticalAngleDeg)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[Victor]
  }
}

