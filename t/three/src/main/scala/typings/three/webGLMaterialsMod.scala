package typings.three

import typings.three.fogMod.IFog
import typings.three.materialMod.Material
import typings.three.webGLPropertiesMod.WebGLProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLMaterialsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLMaterials", "WebGLMaterials")
  @js.native
  class WebGLMaterials protected () extends StObject {
    def this(properties: WebGLProperties) = this()
    
    def refreshFogUniforms(uniforms: js.Object, fog: IFog): Unit = js.native
    
    def refreshMaterialUniforms(uniforms: js.Object, material: Material, pixelRatio: Double, height: Double): Unit = js.native
  }
}
