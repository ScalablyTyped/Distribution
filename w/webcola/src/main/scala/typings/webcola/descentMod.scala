package typings.webcola

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/descent", JSImport.Namespace)
@js.native
object descentMod extends js.Object {
  @js.native
  class Descent protected () extends js.Object {
    def this(x: js.Array[js.Array[Double]], D: js.Array[js.Array[Double]]) = this()
    def this(x: js.Array[js.Array[Double]], D: js.Array[js.Array[Double]], G: js.Array[js.Array[Double]]) = this()
    var D: js.Array[js.Array[Double]] = js.native
    var G: js.Array[js.Array[Double]] = js.native
    var H: js.Array[js.Array[js.Array[Double]]] = js.native
    var Hd: js.Any = js.native
    var a: js.Any = js.native
    var b: js.Any = js.native
    var c: js.Any = js.native
    var computeNextPosition: js.Any = js.native
    var d: js.Any = js.native
    var e: js.Any = js.native
    var g: js.Array[js.Array[Double]] = js.native
    var ia: js.Any = js.native
    var ib: js.Any = js.native
    var k: Double = js.native
    var locks: Locks = js.native
    var matrixApply: js.Any = js.native
    var minD: js.Any = js.native
    var n: Double = js.native
    var numGridSnapNodes: Double = js.native
    var offsetDir: js.Any = js.native
    var project: js.Array[
        js.Function3[/* x0 */ js.Array[Double], /* y0 */ js.Array[Double], /* r */ js.Array[Double], Unit]
      ] = js.native
    var random: js.Any = js.native
    var scaleSnapByMaxH: Boolean = js.native
    var snapGridSize: Double = js.native
    var snapStrength: Double = js.native
    var stepAndProject: js.Any = js.native
    var threshold: Double = js.native
    var x: js.Array[js.Array[Double]] = js.native
    var xtmp: js.Any = js.native
    def computeDerivatives(x: js.Array[js.Array[Double]]): Unit = js.native
    def computeStepSize(d: js.Array[js.Array[Double]]): Double = js.native
    def computeStress(): Double = js.native
    def reduceStress(): Double = js.native
    def run(iterations: Double): Double = js.native
    def rungeKutta(): Double = js.native
    def takeDescentStep(x: js.Array[Double], d: js.Array[Double], stepSize: Double): Unit = js.native
  }
  
  @js.native
  class Locks () extends js.Object {
    var locks: NumberDictionary[js.Array[Double]] = js.native
    def add(id: Double, x: js.Array[Double]): Unit = js.native
    @JSName("apply")
    def apply(f: js.Function2[/* id */ Double, /* x */ js.Array[Double], Unit]): Unit = js.native
    def clear(): Unit = js.native
    def isEmpty(): Boolean = js.native
  }
  
  @js.native
  class PseudoRandom () extends js.Object {
    def this(seed: Double) = this()
    var a: js.Any = js.native
    var c: js.Any = js.native
    var m: js.Any = js.native
    var range: js.Any = js.native
    var seed: Double = js.native
    def getNext(): Double = js.native
    def getNextBetween(min: Double, max: Double): Double = js.native
  }
  
  /* static members */
  @js.native
  object Descent extends js.Object {
    var copy: js.Any = js.native
    var dotProd: js.Any = js.native
    var mApply: js.Any = js.native
    var mid: js.Any = js.native
    var rightMultiply: js.Any = js.native
    var zeroDistance: js.Any = js.native
    def createSquareMatrix(n: Double, f: js.Function2[/* i */ Double, /* j */ Double, Double]): js.Array[js.Array[Double]] = js.native
  }
  
}

