package typings.three

import typings.three.examplesJsmPostprocessingPassMod.Pass
import typings.three.srcThreeMod.ShaderMaterial
import typings.three.srcThreeMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingDotScreenPassMod {
  
  @JSImport("three/examples/jsm/postprocessing/DotScreenPass", "DotScreenPass")
  @js.native
  open class DotScreenPass () extends Pass {
    def this(center: Vector2) = this()
    def this(center: Unit, angle: Double) = this()
    def this(center: Vector2, angle: Double) = this()
    def this(center: Unit, angle: Double, scale: Double) = this()
    def this(center: Unit, angle: Unit, scale: Double) = this()
    def this(center: Vector2, angle: Double, scale: Double) = this()
    def this(center: Vector2, angle: Unit, scale: Double) = this()
    
    var fsQuad: js.Object = js.native
    
    var material: ShaderMaterial = js.native
    
    var uniforms: js.Object = js.native
  }
}
