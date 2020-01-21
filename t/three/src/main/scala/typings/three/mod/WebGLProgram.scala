package typings.three.mod

import typings.three.webGLRendererMod.WebGLRendererParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLProgram")
@js.native
class WebGLProgram protected ()
  extends typings.three.webGLProgramMod.WebGLProgram {
  def this(
    renderer: typings.three.webGLRendererMod.WebGLRenderer,
    extensions: typings.three.webGLExtensionsMod.WebGLExtensions,
    code: String,
    material: typings.three.shaderMaterialMod.ShaderMaterial,
    shader: typings.three.webGLShaderMod.WebGLShader,
    parameters: WebGLRendererParameters
  ) = this()
}

