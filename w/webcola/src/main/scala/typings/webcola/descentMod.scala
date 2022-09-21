package typings.webcola

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descentMod {
  
  @JSImport("webcola/dist/src/descent", "Descent")
  @js.native
  open class Descent protected () extends StObject {
    def this(x: js.Array[js.Array[Double]], D: js.Array[js.Array[Double]]) = this()
    def this(x: js.Array[js.Array[Double]], D: js.Array[js.Array[Double]], G: js.Array[js.Array[Double]]) = this()
    
    var D: js.Array[js.Array[Double]] = js.native
    
    var G: js.Array[js.Array[Double]] = js.native
    
    var H: js.Array[js.Array[js.Array[Double]]] = js.native
    
    /* private */ var Hd: Any = js.native
    
    /* private */ var a: Any = js.native
    
    /* private */ var b: Any = js.native
    
    /* private */ var c: Any = js.native
    
    def computeDerivatives(x: js.Array[js.Array[Double]]): Unit = js.native
    
    /* private */ var computeNextPosition: Any = js.native
    
    def computeStepSize(d: js.Array[js.Array[Double]]): Double = js.native
    
    def computeStress(): Double = js.native
    
    /* private */ var d: Any = js.native
    
    /* private */ var e: Any = js.native
    
    var g: js.Array[js.Array[Double]] = js.native
    
    /* private */ var ia: Any = js.native
    
    /* private */ var ib: Any = js.native
    
    var k: Double = js.native
    
    var locks: Locks = js.native
    
    /* private */ var matrixApply: Any = js.native
    
    /* private */ var minD: Any = js.native
    
    var n: Double = js.native
    
    var numGridSnapNodes: Double = js.native
    
    /* private */ var offsetDir: Any = js.native
    
    var project: js.Array[
        js.Function3[/* x0 */ js.Array[Double], /* y0 */ js.Array[Double], /* r */ js.Array[Double], Unit]
      ] = js.native
    
    /* private */ var random: Any = js.native
    
    def reduceStress(): Double = js.native
    
    def run(iterations: Double): Double = js.native
    
    def rungeKutta(): Double = js.native
    
    var scaleSnapByMaxH: Boolean = js.native
    
    var snapGridSize: Double = js.native
    
    var snapStrength: Double = js.native
    
    /* private */ var stepAndProject: Any = js.native
    
    def takeDescentStep(x: js.Array[Double], d: js.Array[Double], stepSize: Double): Unit = js.native
    
    var threshold: Double = js.native
    
    var x: js.Array[js.Array[Double]] = js.native
    
    /* private */ var xtmp: Any = js.native
  }
  /* static members */
  object Descent {
    
    @JSImport("webcola/dist/src/descent", "Descent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webcola/dist/src/descent", "Descent.copy")
    @js.native
    def copy: Any = js.native
    inline def copy_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copy")(x.asInstanceOf[js.Any])
    
    inline def createSquareMatrix(n: Double, f: js.Function2[/* i */ Double, /* j */ Double, Double]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSquareMatrix")(n.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    
    @JSImport("webcola/dist/src/descent", "Descent.dotProd")
    @js.native
    def dotProd: Any = js.native
    inline def dotProd_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dotProd")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/descent", "Descent.mApply")
    @js.native
    def mApply: Any = js.native
    inline def mApply_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mApply")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/descent", "Descent.mid")
    @js.native
    def mid: Any = js.native
    inline def mid_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mid")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/descent", "Descent.rightMultiply")
    @js.native
    def rightMultiply: Any = js.native
    inline def rightMultiply_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightMultiply")(x.asInstanceOf[js.Any])
    
    @JSImport("webcola/dist/src/descent", "Descent.zeroDistance")
    @js.native
    def zeroDistance: Any = js.native
    inline def zeroDistance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zeroDistance")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webcola/dist/src/descent", "Locks")
  @js.native
  open class Locks () extends StObject {
    
    def add(id: Double, x: js.Array[Double]): Unit = js.native
    
    @JSName("apply")
    def apply(f: js.Function2[/* id */ Double, /* x */ js.Array[Double], Unit]): Unit = js.native
    
    def clear(): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    var locks: NumberDictionary[js.Array[Double]] = js.native
  }
  
  @JSImport("webcola/dist/src/descent", "PseudoRandom")
  @js.native
  open class PseudoRandom () extends StObject {
    def this(seed: Double) = this()
    
    /* private */ var a: Any = js.native
    
    /* private */ var c: Any = js.native
    
    def getNext(): Double = js.native
    
    def getNextBetween(min: Double, max: Double): Double = js.native
    
    /* private */ var m: Any = js.native
    
    /* private */ var range: Any = js.native
    
    var seed: Double = js.native
  }
}
