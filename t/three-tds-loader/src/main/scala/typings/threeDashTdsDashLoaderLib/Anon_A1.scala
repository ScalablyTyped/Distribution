package typings
package threeDashTdsDashLoaderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A1 extends js.Object {
  val DEG2RAD: scala.Double
  val RAD2DEG: scala.Double
  def ceilPowerOfTwo(value: scala.Double): scala.Double
  def clamp(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double
  def degToRad(degrees: scala.Double): scala.Double
  def euclideanModulo(n: scala.Double, m: scala.Double): scala.Double
  def floorPowerOfTwo(value: scala.Double): scala.Double
  def generateUUID(): java.lang.String
  def isPowerOfTwo(value: scala.Double): scala.Boolean
  def lerp(x: scala.Double, y: scala.Double, t: scala.Double): scala.Double
  def mapLinear(x: scala.Double, a1: scala.Double, a2: scala.Double, b1: scala.Double, b2: scala.Double): scala.Double
  def nearestPowerOfTwo(value: scala.Double): scala.Double
  def nextPowerOfTwo(value: scala.Double): scala.Double
  def radToDeg(radians: scala.Double): scala.Double
  def randFloat(low: scala.Double, high: scala.Double): scala.Double
  def randFloatSpread(range: scala.Double): scala.Double
  def randInt(low: scala.Double, high: scala.Double): scala.Double
  def random16(): scala.Double
  def smootherstep(x: scala.Double, min: scala.Double, max: scala.Double): scala.Double
  def smoothstep(x: scala.Double, min: scala.Double, max: scala.Double): scala.Double
}

object Anon_A1 {
  @scala.inline
  def apply(
    DEG2RAD: scala.Double,
    RAD2DEG: scala.Double,
    ceilPowerOfTwo: js.Function1[scala.Double, scala.Double],
    clamp: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    degToRad: js.Function1[scala.Double, scala.Double],
    euclideanModulo: js.Function2[scala.Double, scala.Double, scala.Double],
    floorPowerOfTwo: js.Function1[scala.Double, scala.Double],
    generateUUID: js.Function0[java.lang.String],
    isPowerOfTwo: js.Function1[scala.Double, scala.Boolean],
    lerp: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    mapLinear: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    nearestPowerOfTwo: js.Function1[scala.Double, scala.Double],
    nextPowerOfTwo: js.Function1[scala.Double, scala.Double],
    radToDeg: js.Function1[scala.Double, scala.Double],
    randFloat: js.Function2[scala.Double, scala.Double, scala.Double],
    randFloatSpread: js.Function1[scala.Double, scala.Double],
    randInt: js.Function2[scala.Double, scala.Double, scala.Double],
    random16: js.Function0[scala.Double],
    smootherstep: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    smoothstep: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double]
  ): Anon_A1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DEG2RAD")(DEG2RAD)
    __obj.updateDynamic("RAD2DEG")(RAD2DEG)
    __obj.updateDynamic("ceilPowerOfTwo")(ceilPowerOfTwo)
    __obj.updateDynamic("clamp")(clamp)
    __obj.updateDynamic("degToRad")(degToRad)
    __obj.updateDynamic("euclideanModulo")(euclideanModulo)
    __obj.updateDynamic("floorPowerOfTwo")(floorPowerOfTwo)
    __obj.updateDynamic("generateUUID")(generateUUID)
    __obj.updateDynamic("isPowerOfTwo")(isPowerOfTwo)
    __obj.updateDynamic("lerp")(lerp)
    __obj.updateDynamic("mapLinear")(mapLinear)
    __obj.updateDynamic("nearestPowerOfTwo")(nearestPowerOfTwo)
    __obj.updateDynamic("nextPowerOfTwo")(nextPowerOfTwo)
    __obj.updateDynamic("radToDeg")(radToDeg)
    __obj.updateDynamic("randFloat")(randFloat)
    __obj.updateDynamic("randFloatSpread")(randFloatSpread)
    __obj.updateDynamic("randInt")(randInt)
    __obj.updateDynamic("random16")(random16)
    __obj.updateDynamic("smootherstep")(smootherstep)
    __obj.updateDynamic("smoothstep")(smoothstep)
    __obj.asInstanceOf[Anon_A1]
  }
}

