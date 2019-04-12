package typings
package threeLib.srcMathInterpolantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Interpolant", "Interpolant")
@js.native
abstract class Interpolant protected () extends js.Object {
  def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: scala.Double) = this()
  def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: scala.Double, resultBuffer: js.Any) = this()
  var parameterPositions: js.Any = js.native
  var resultBuffer: js.Any = js.native
  var samplesValues: js.Any = js.native
  var valueSize: scala.Double = js.native
  def evaluate(time: scala.Double): js.Any = js.native
}

