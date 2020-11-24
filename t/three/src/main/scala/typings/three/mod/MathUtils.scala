package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "MathUtils")
@js.native
object MathUtils extends js.Object {
  
  val DEG2RAD: Double = js.native
  
  val RAD2DEG: Double = js.native
  
  def ceilPowerOfTwo(value: Double): Double = js.native
  
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  
  def degToRad(degrees: Double): Double = js.native
  
  def euclideanModulo(n: Double, m: Double): Double = js.native
  
  def floorPowerOfTwo(value: Double): Double = js.native
  
  def generateUUID(): String = js.native
  
  def isPowerOfTwo(value: Double): Boolean = js.native
  
  def lerp(x: Double, y: Double, t: Double): Double = js.native
  
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = js.native
  
  def nearestPowerOfTwo(value: Double): Double = js.native
  
  def nextPowerOfTwo(value: Double): Double = js.native
  
  def radToDeg(radians: Double): Double = js.native
  
  def randFloat(low: Double, high: Double): Double = js.native
  
  def randFloatSpread(range: Double): Double = js.native
  
  def randInt(low: Double, high: Double): Double = js.native
  
  def random16(): Double = js.native
  
  def seededRandom(): Double = js.native
  def seededRandom(seed: Double): Double = js.native
  
  def setQuaternionFromProperEuler(q: typings.three.quaternionMod.Quaternion, a: Double, b: Double, c: Double, order: String): Unit = js.native
  
  def smootherstep(x: Double, min: Double, max: Double): Double = js.native
  
  def smoothstep(x: Double, min: Double, max: Double): Double = js.native
}
