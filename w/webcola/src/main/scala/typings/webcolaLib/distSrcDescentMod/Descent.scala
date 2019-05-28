package typings
package webcolaLib.distSrcDescentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/descent", "Descent")
@js.native
class Descent protected () extends js.Object {
  def this(x: js.Array[js.Array[scala.Double]], D: js.Array[js.Array[scala.Double]]) = this()
  def this(x: js.Array[js.Array[scala.Double]], D: js.Array[js.Array[scala.Double]], G: js.Array[js.Array[scala.Double]]) = this()
  var D: js.Array[js.Array[scala.Double]] = js.native
  var G: js.Array[js.Array[scala.Double]] = js.native
  var H: js.Array[js.Array[js.Array[scala.Double]]] = js.native
  var Hd: js.Any = js.native
  var a: js.Any = js.native
  var b: js.Any = js.native
  var c: js.Any = js.native
  var computeNextPosition: js.Any = js.native
  var d: js.Any = js.native
  var e: js.Any = js.native
  var g: js.Array[js.Array[scala.Double]] = js.native
  var ia: js.Any = js.native
  var ib: js.Any = js.native
  var k: scala.Double = js.native
  var locks: Locks = js.native
  var matrixApply: js.Any = js.native
  var minD: js.Any = js.native
  var n: scala.Double = js.native
  var numGridSnapNodes: scala.Double = js.native
  var offsetDir: js.Any = js.native
  var project: js.Array[webcolaLib.Fn_R] = js.native
  var random: js.Any = js.native
  var scaleSnapByMaxH: scala.Boolean = js.native
  var snapGridSize: scala.Double = js.native
  var snapStrength: scala.Double = js.native
  var stepAndProject: js.Any = js.native
  var threshold: scala.Double = js.native
  var x: js.Array[js.Array[scala.Double]] = js.native
  var xtmp: js.Any = js.native
  def computeDerivatives(x: js.Array[js.Array[scala.Double]]): scala.Unit = js.native
  def computeStepSize(d: js.Array[js.Array[scala.Double]]): scala.Double = js.native
  def computeStress(): scala.Double = js.native
  def reduceStress(): scala.Double = js.native
  def run(iterations: scala.Double): scala.Double = js.native
  def rungeKutta(): scala.Double = js.native
  def takeDescentStep(x: js.Array[scala.Double], d: js.Array[scala.Double], stepSize: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("webcola/dist/src/descent", "Descent")
@js.native
object Descent extends js.Object {
  var copy: js.Any = js.native
  var dotProd: js.Any = js.native
  var mApply: js.Any = js.native
  var mid: js.Any = js.native
  var rightMultiply: js.Any = js.native
  var zeroDistance: js.Any = js.native
  def createSquareMatrix(n: scala.Double, f: js.Function2[/* i */ scala.Double, /* j */ scala.Double, scala.Double]): js.Array[js.Array[scala.Double]] = js.native
}

