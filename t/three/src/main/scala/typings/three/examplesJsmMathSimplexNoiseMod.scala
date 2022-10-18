package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMathSimplexNoiseMod {
  
  @JSImport("three/examples/jsm/math/SimplexNoise", "SimplexNoise")
  @js.native
  open class SimplexNoise () extends StObject {
    def this(r: js.Object) = this()
    
    def dot(g: js.Array[Double], x: Double, y: Double): Double = js.native
    
    def dot3(g: js.Array[Double], x: Double, y: Double, z: Double): Double = js.native
    
    def dot4(g: js.Array[Double], x: Double, y: Double, z: Double, w: Double): Double = js.native
    
    def noise(xin: Double, yin: Double): Double = js.native
    
    def noise3d(xin: Double, yin: Double, zin: Double): Double = js.native
    
    def noise4d(x: Double, y: Double, z: Double, w: Double): Double = js.native
  }
}
