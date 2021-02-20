package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MathUtils {
  
  @JSImport("three", "MathUtils.DEG2RAD")
  @js.native
  val DEG2RAD: Double = js.native
  
  @JSImport("three", "MathUtils.RAD2DEG")
  @js.native
  val RAD2DEG: Double = js.native
  
  @JSImport("three", "MathUtils.ceilPowerOfTwo")
  @js.native
  def ceilPowerOfTwo(value: Double): Double = js.native
  
  @JSImport("three", "MathUtils.clamp")
  @js.native
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  
  @JSImport("three", "MathUtils.degToRad")
  @js.native
  def degToRad(degrees: Double): Double = js.native
  
  @JSImport("three", "MathUtils.euclideanModulo")
  @js.native
  def euclideanModulo(n: Double, m: Double): Double = js.native
  
  @JSImport("three", "MathUtils.floorPowerOfTwo")
  @js.native
  def floorPowerOfTwo(value: Double): Double = js.native
  
  @JSImport("three", "MathUtils.generateUUID")
  @js.native
  def generateUUID(): String = js.native
  
  @JSImport("three", "MathUtils.isPowerOfTwo")
  @js.native
  def isPowerOfTwo(value: Double): Boolean = js.native
  
  @JSImport("three", "MathUtils.lerp")
  @js.native
  def lerp(x: Double, y: Double, t: Double): Double = js.native
  
  @JSImport("three", "MathUtils.mapLinear")
  @js.native
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = js.native
  
  @JSImport("three", "MathUtils.nearestPowerOfTwo")
  @js.native
  def nearestPowerOfTwo(value: Double): Double = js.native
  
  @JSImport("three", "MathUtils.nextPowerOfTwo")
  @js.native
  def nextPowerOfTwo(value: Double): Double = js.native
  
  @JSImport("three", "MathUtils.radToDeg")
  @js.native
  def radToDeg(radians: Double): Double = js.native
  
  @JSImport("three", "MathUtils.randFloat")
  @js.native
  def randFloat(low: Double, high: Double): Double = js.native
  
  @JSImport("three", "MathUtils.randFloatSpread")
  @js.native
  def randFloatSpread(range: Double): Double = js.native
  
  @JSImport("three", "MathUtils.randInt")
  @js.native
  def randInt(low: Double, high: Double): Double = js.native
  
  @JSImport("three", "MathUtils.random16")
  @js.native
  def random16(): Double = js.native
  
  @JSImport("three", "MathUtils.seededRandom")
  @js.native
  def seededRandom(): Double = js.native
  @JSImport("three", "MathUtils.seededRandom")
  @js.native
  def seededRandom(seed: Double): Double = js.native
  
  @JSImport("three", "MathUtils.setQuaternionFromProperEuler")
  @js.native
  def setQuaternionFromProperEuler(q: typings.three.quaternionMod.Quaternion, a: Double, b: Double, c: Double, order: String): Unit = js.native
  
  @JSImport("three", "MathUtils.smootherstep")
  @js.native
  def smootherstep(x: Double, min: Double, max: Double): Double = js.native
  
  @JSImport("three", "MathUtils.smoothstep")
  @js.native
  def smoothstep(x: Double, min: Double, max: Double): Double = js.native
}
