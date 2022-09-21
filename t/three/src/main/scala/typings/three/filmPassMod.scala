package typings.three

import typings.three.passMod.Pass
import typings.three.threeMod.ShaderMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filmPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/FilmPass", "FilmPass")
  @js.native
  open class FilmPass () extends Pass {
    def this(noiseIntensity: Double) = this()
    def this(noiseIntensity: Double, scanlinesIntensity: Double) = this()
    def this(noiseIntensity: Unit, scanlinesIntensity: Double) = this()
    def this(noiseIntensity: Double, scanlinesIntensity: Double, scanlinesCount: Double) = this()
    def this(noiseIntensity: Double, scanlinesIntensity: Unit, scanlinesCount: Double) = this()
    def this(noiseIntensity: Unit, scanlinesIntensity: Double, scanlinesCount: Double) = this()
    def this(noiseIntensity: Unit, scanlinesIntensity: Unit, scanlinesCount: Double) = this()
    def this(noiseIntensity: Double, scanlinesIntensity: Double, scanlinesCount: Double, grayscale: Double) = this()
    def this(noiseIntensity: Double, scanlinesIntensity: Double, scanlinesCount: Unit, grayscale: Double) = this()
    def this(noiseIntensity: Double, scanlinesIntensity: Unit, scanlinesCount: Double, grayscale: Double) = this()
    def this(noiseIntensity: Double, scanlinesIntensity: Unit, scanlinesCount: Unit, grayscale: Double) = this()
    def this(noiseIntensity: Unit, scanlinesIntensity: Double, scanlinesCount: Double, grayscale: Double) = this()
    def this(noiseIntensity: Unit, scanlinesIntensity: Double, scanlinesCount: Unit, grayscale: Double) = this()
    def this(noiseIntensity: Unit, scanlinesIntensity: Unit, scanlinesCount: Double, grayscale: Double) = this()
    def this(noiseIntensity: Unit, scanlinesIntensity: Unit, scanlinesCount: Unit, grayscale: Double) = this()
    
    var fsQuad: js.Object = js.native
    
    var material: ShaderMaterial = js.native
    
    var uniforms: js.Object = js.native
  }
}
