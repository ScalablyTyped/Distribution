package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MathUtils {
  
  @JSImport("three", "MathUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "MathUtils.DEG2RAD")
  @js.native
  val DEG2RAD: Double = js.native
  
  @JSImport("three", "MathUtils.RAD2DEG")
  @js.native
  val RAD2DEG: Double = js.native
  
  @scala.inline
  def ceilPowerOfTwo(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ceilPowerOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def degToRad(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degToRad")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def euclideanModulo(n: Double, m: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("euclideanModulo")(n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def floorPowerOfTwo(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("floorPowerOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def generateUUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUUID")().asInstanceOf[String]
  
  @scala.inline
  def isPowerOfTwo(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPowerOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def lerp(x: Double, y: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mapLinear")(x.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def nearestPowerOfTwo(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nearestPowerOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def nextPowerOfTwo(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextPowerOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def radToDeg(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("radToDeg")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def randFloat(low: Double, high: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randFloat")(low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def randFloatSpread(range: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randFloatSpread")(range.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def randInt(low: Double, high: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randInt")(low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def random16(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random16")().asInstanceOf[Double]
  
  @scala.inline
  def seededRandom(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("seededRandom")().asInstanceOf[Double]
  @scala.inline
  def seededRandom(seed: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("seededRandom")(seed.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def setQuaternionFromProperEuler(q: typings.three.quaternionMod.Quaternion, a: Double, b: Double, c: Double, order: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setQuaternionFromProperEuler")(q.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def smootherstep(x: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smootherstep")(x.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def smoothstep(x: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothstep")(x.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
}
