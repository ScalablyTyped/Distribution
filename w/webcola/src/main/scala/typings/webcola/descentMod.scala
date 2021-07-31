package typings.webcola

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descentMod {
  
  @JSImport("webcola/dist/src/descent", "Descent")
  @js.native
  class Descent protected () extends StObject {
    def this(x: js.Array[js.Array[Double]], D: js.Array[js.Array[Double]]) = this()
    def this(x: js.Array[js.Array[Double]], D: js.Array[js.Array[Double]], G: js.Array[js.Array[Double]]) = this()
    
    var D: js.Array[js.Array[Double]] = js.native
    
    var G: js.Array[js.Array[Double]] = js.native
    
    var H: js.Array[js.Array[js.Array[Double]]] = js.native
    
    var Hd: js.Any = js.native
    
    var a: js.Any = js.native
    
    var b: js.Any = js.native
    
    var c: js.Any = js.native
    
    def computeDerivatives(x: js.Array[js.Array[Double]]): Unit = js.native
    
    var computeNextPosition: js.Any = js.native
    
    def computeStepSize(d: js.Array[js.Array[Double]]): Double = js.native
    
    def computeStress(): Double = js.native
    
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
    
    def reduceStress(): Double = js.native
    
    def run(iterations: Double): Double = js.native
    
    def rungeKutta(): Double = js.native
    
    var scaleSnapByMaxH: Boolean = js.native
    
    var snapGridSize: Double = js.native
    
    var snapStrength: Double = js.native
    
    var stepAndProject: js.Any = js.native
    
    def takeDescentStep(x: js.Array[Double], d: js.Array[Double], stepSize: Double): Unit = js.native
    
    var threshold: Double = js.native
    
    var x: js.Array[js.Array[Double]] = js.native
    
    var xtmp: js.Any = js.native
  }
  /* static members */
  object Descent {
    
    @JSImport("webcola/dist/src/descent", "Descent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webcola/dist/src/descent", "Descent.copy")
    @js.native
    def copy: js.Any = js.native
    @scala.inline
    def copy_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copy")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def createSquareMatrix(n: Double, f: js.Function2[/* i */ Double, /* j */ Double, Double]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSquareMatrix")(n.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    
    @JSImport("webcola/dist/src/descent", "Descent.dotProd")
    @js.native
    def dotProd: js.Any = js.native
    @scala.inline
    def dotProd_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotProd")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/descent", "Descent.mApply")
    @js.native
    def mApply: js.Any = js.native
    @scala.inline
    def mApply_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mApply")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/descent", "Descent.mid")
    @js.native
    def mid: js.Any = js.native
    @scala.inline
    def mid_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mid")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/descent", "Descent.rightMultiply")
    @js.native
    def rightMultiply: js.Any = js.native
    @scala.inline
    def rightMultiply_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightMultiply")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/descent", "Descent.zeroDistance")
    @js.native
    def zeroDistance: js.Any = js.native
    @scala.inline
    def zeroDistance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zeroDistance")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webcola/dist/src/descent", "Locks")
  @js.native
  class Locks () extends StObject {
    
    def add(id: Double, x: js.Array[Double]): Unit = js.native
    
    @JSName("apply")
    def apply(f: js.Function2[/* id */ Double, /* x */ js.Array[Double], Unit]): Unit = js.native
    
    def clear(): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    var locks: NumberDictionary[js.Array[Double]] = js.native
  }
  
  @JSImport("webcola/dist/src/descent", "PseudoRandom")
  @js.native
  class PseudoRandom () extends StObject {
    def this(seed: Double) = this()
    
    var a: js.Any = js.native
    
    var c: js.Any = js.native
    
    def getNext(): Double = js.native
    
    def getNextBetween(min: Double, max: Double): Double = js.native
    
    var m: js.Any = js.native
    
    var range: js.Any = js.native
    
    var seed: Double = js.native
  }
}
