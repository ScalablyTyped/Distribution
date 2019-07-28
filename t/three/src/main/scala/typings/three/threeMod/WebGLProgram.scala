package typings.three.threeMod

import typings.three.srcRenderersWebGLRendererMod.WebGLRendererParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLProgram")
@js.native
class WebGLProgram protected ()
  extends typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram {
  def this(
    renderer: typings.three.srcRenderersWebGLRendererMod.WebGLRenderer,
    extensions: typings.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions,
    code: String,
    material: typings.three.srcMaterialsShaderMaterialMod.ShaderMaterial,
    shader: typings.three.srcRenderersWebglWebGLShaderMod.WebGLShader,
    parameters: WebGLRendererParameters,
    capabilities: typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
  ) = this()
}

