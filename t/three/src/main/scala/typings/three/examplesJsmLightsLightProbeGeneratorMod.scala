package typings.three

import typings.three.srcThreeMod.CubeTexture
import typings.three.srcThreeMod.LightProbe
import typings.three.srcThreeMod.WebGLCubeRenderTarget
import typings.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLightsLightProbeGeneratorMod {
  
  object LightProbeGenerator {
    
    @JSImport("three/examples/jsm/lights/LightProbeGenerator", "LightProbeGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromCubeRenderTarget(renderer: WebGLRenderer, cubeRenderTarget: WebGLCubeRenderTarget): LightProbe = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCubeRenderTarget")(renderer.asInstanceOf[js.Any], cubeRenderTarget.asInstanceOf[js.Any])).asInstanceOf[LightProbe]
    
    inline def fromCubeTexture(cubeTexture: CubeTexture): LightProbe = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCubeTexture")(cubeTexture.asInstanceOf[js.Any]).asInstanceOf[LightProbe]
  }
}
