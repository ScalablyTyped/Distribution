package typings.three

import typings.three.examplesJsmPostprocessingSsaarenderpassMod.SSAARenderPass
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcThreeMod.Camera
import typings.three.srcThreeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmPostprocessingTaarenderpassMod {
  
  @JSImport("three/examples/jsm/postprocessing/TAARenderPass", "TAARenderPass")
  @js.native
  open class TAARenderPass protected () extends SSAARenderPass {
    def this(scene: Scene, camera: Camera, clearColor: ColorRepresentation, clearAlpha: Double) = this()
    
    var accumulate: Boolean = js.native
  }
}
