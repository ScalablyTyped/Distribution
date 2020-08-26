package typings.three

import typings.three.fogMod.IFog
import typings.three.materialMod.Material
import typings.three.textureMod.Texture
import typings.three.webGLPropertiesMod.WebGLProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLMaterials", JSImport.Namespace)
@js.native
object webGLMaterialsMod extends js.Object {
  @js.native
  class WebGLMaterials protected () extends js.Object {
    def this(properties: WebGLProperties) = this()
    def refreshFogUniforms(uniforms: js.Object, fog: IFog): Unit = js.native
    def refreshMaterialUniforms(uniforms: js.Object, material: Material, environment: Texture, pixelRatio: Double, height: Double): Unit = js.native
  }
  
}

