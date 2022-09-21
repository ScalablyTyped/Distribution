package typings.three

import typings.three.ssaarenderpassMod.SSAARenderPass
import typings.three.threeMod.Camera
import typings.three.threeMod.Scene
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taarenderpassMod {
  
  @JSImport("three/examples/jsm/postprocessing/TAARenderPass", "TAARenderPass")
  @js.native
  open class TAARenderPass protected () extends SSAARenderPass {
    def this(scene: Scene, camera: Camera, clearColor: ColorRepresentation, clearAlpha: Double) = this()
    
    var accumulate: Boolean = js.native
  }
}
