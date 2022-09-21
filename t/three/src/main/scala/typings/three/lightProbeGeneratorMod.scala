package typings.three

import typings.three.threeMod.CubeTexture
import typings.three.threeMod.LightProbe
import typings.three.threeMod.WebGLCubeRenderTarget
import typings.three.threeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightProbeGeneratorMod {
  
  object LightProbeGenerator {
    
    @JSImport("three/examples/jsm/lights/LightProbeGenerator", "LightProbeGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromCubeRenderTarget(renderer: WebGLRenderer, cubeRenderTarget: WebGLCubeRenderTarget): LightProbe = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCubeRenderTarget")(renderer.asInstanceOf[js.Any], cubeRenderTarget.asInstanceOf[js.Any])).asInstanceOf[LightProbe]
    
    inline def fromCubeTexture(cubeTexture: CubeTexture): LightProbe = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCubeTexture")(cubeTexture.asInstanceOf[js.Any]).asInstanceOf[LightProbe]
  }
}
