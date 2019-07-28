package typings.threeDashTdsDashLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofMath extends js.Object {
  val DEG2RAD: Double
  val RAD2DEG: Double
  def ceilPowerOfTwo(value: Double): Double
  def clamp(value: Double, min: Double, max: Double): Double
  def degToRad(degrees: Double): Double
  def euclideanModulo(n: Double, m: Double): Double
  def floorPowerOfTwo(value: Double): Double
  def generateUUID(): String
  def isPowerOfTwo(value: Double): Boolean
  def lerp(x: Double, y: Double, t: Double): Double
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double
  def nearestPowerOfTwo(value: Double): Double
  def nextPowerOfTwo(value: Double): Double
  def radToDeg(radians: Double): Double
  def randFloat(low: Double, high: Double): Double
  def randFloatSpread(range: Double): Double
  def randInt(low: Double, high: Double): Double
  def random16(): Double
  def smootherstep(x: Double, min: Double, max: Double): Double
  def smoothstep(x: Double, min: Double, max: Double): Double
}

object TypeofMath {
  @scala.inline
  def apply(
    DEG2RAD: Double,
    RAD2DEG: Double,
    ceilPowerOfTwo: Double => Double,
    clamp: (Double, Double, Double) => Double,
    degToRad: Double => Double,
    euclideanModulo: (Double, Double) => Double,
    floorPowerOfTwo: Double => Double,
    generateUUID: () => String,
    isPowerOfTwo: Double => Boolean,
    lerp: (Double, Double, Double) => Double,
    mapLinear: (Double, Double, Double, Double, Double) => Double,
    nearestPowerOfTwo: Double => Double,
    nextPowerOfTwo: Double => Double,
    radToDeg: Double => Double,
    randFloat: (Double, Double) => Double,
    randFloatSpread: Double => Double,
    randInt: (Double, Double) => Double,
    random16: () => Double,
    smootherstep: (Double, Double, Double) => Double,
    smoothstep: (Double, Double, Double) => Double
  ): TypeofMath = {
    val __obj = js.Dynamic.literal(DEG2RAD = DEG2RAD, RAD2DEG = RAD2DEG, ceilPowerOfTwo = js.Any.fromFunction1(ceilPowerOfTwo), clamp = js.Any.fromFunction3(clamp), degToRad = js.Any.fromFunction1(degToRad), euclideanModulo = js.Any.fromFunction2(euclideanModulo), floorPowerOfTwo = js.Any.fromFunction1(floorPowerOfTwo), generateUUID = js.Any.fromFunction0(generateUUID), isPowerOfTwo = js.Any.fromFunction1(isPowerOfTwo), lerp = js.Any.fromFunction3(lerp), mapLinear = js.Any.fromFunction5(mapLinear), nearestPowerOfTwo = js.Any.fromFunction1(nearestPowerOfTwo), nextPowerOfTwo = js.Any.fromFunction1(nextPowerOfTwo), radToDeg = js.Any.fromFunction1(radToDeg), randFloat = js.Any.fromFunction2(randFloat), randFloatSpread = js.Any.fromFunction1(randFloatSpread), randInt = js.Any.fromFunction2(randInt), random16 = js.Any.fromFunction0(random16), smootherstep = js.Any.fromFunction3(smootherstep), smoothstep = js.Any.fromFunction3(smoothstep))
  
    __obj.asInstanceOf[TypeofMath]
  }
}

