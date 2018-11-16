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
  var d: js.Any = js.native
  var e: js.Any = js.native
  var g: js.Array[js.Array[scala.Double]] = js.native
  var ia: js.Any = js.native
  var ib: js.Any = js.native
  var k: scala.Double = js.native
  var locks: Locks = js.native
  var minD: js.Any = js.native
  var n: scala.Double = js.native
  var numGridSnapNodes: scala.Double = js.native
  var project: js.Array[webcolaLib.Anon_X0] = js.native
  var random: js.Any = js.native
  var scaleSnapByMaxH: scala.Boolean = js.native
  var snapGridSize: scala.Double = js.native
  var snapStrength: scala.Double = js.native
  var threshold: scala.Double = js.native
  var x: js.Array[js.Array[scala.Double]] = js.native
  var xtmp: js.Any = js.native
  def computeDerivatives(x: js.Array[js.Array[scala.Double]]): scala.Unit = js.native
  /* private */ def computeNextPosition(x0: js.Any, r: js.Any): js.Any = js.native
  def computeStepSize(d: js.Array[js.Array[scala.Double]]): scala.Double = js.native
  def computeStress(): scala.Double = js.native
  /* private */ def matrixApply(f: js.Any): js.Any = js.native
  /* private */ def offsetDir(): js.Any = js.native
  def reduceStress(): scala.Double = js.native
  def run(iterations: scala.Double): scala.Double = js.native
  def rungeKutta(): scala.Double = js.native
  /* private */ def stepAndProject(x0: js.Any, r: js.Any, d: js.Any, stepSize: js.Any): js.Any = js.native
  def takeDescentStep(x: js.Array[scala.Double], d: js.Array[scala.Double], stepSize: scala.Double): scala.Unit = js.native
}

@JSImport("webcola/dist/src/descent", "Descent")
@js.native
object Descent extends js.Object {
  var zeroDistance: js.Any = js.native
  /* private */ def copy(a: js.Any, b: js.Any): js.Any = js.native
  def createSquareMatrix(n: scala.Double, f: js.Function2[/* i */ scala.Double, /* j */ scala.Double, scala.Double]): js.Array[js.Array[scala.Double]] = js.native
  /* private */ def dotProd(a: js.Any, b: js.Any): js.Any = js.native
  /* private */ def mApply(m: js.Any, n: js.Any, f: js.Any): js.Any = js.native
  /* private */ def mid(a: js.Any, b: js.Any, m: js.Any): js.Any = js.native
  /* private */ def rightMultiply(m: js.Any, v: js.Any, r: js.Any): js.Any = js.native
}

