package typings
package threeLib.srcRenderersWebglWebGLProgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLProgram", "WebGLProgram")
@js.native
class WebGLProgram protected () extends js.Object {
  def this(renderer: threeLib.srcRenderersWebGLRendererMod.WebGLRenderer, extensions: threeLib.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions, code: java.lang.String, material: threeLib.srcMaterialsShaderMaterialMod.ShaderMaterial, shader: threeLib.srcRenderersWebglWebGLShaderMod.WebGLShader, parameters: threeLib.srcRenderersWebGLRendererMod.WebGLRendererParameters, capabilities: threeLib.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities, textures: threeLib.srcRenderersWebglWebGLTexturesMod.WebGLTextures) = this()
  /**
    * @deprecated Use {@link WebGLProgram#getAttributes getAttributes()} instead.
    */
  var attributes: js.Any = js.native
  var code: java.lang.String = js.native
  var fragmentShader: threeLib.srcRenderersWebglWebGLShaderMod.WebGLShader = js.native
  var id: scala.Double = js.native
  var program: js.Any = js.native
  /**
    * @deprecated Use {@link WebGLProgram#getUniforms getUniforms()} instead.
    */
  var uniforms: js.Any = js.native
  var usedTimes: scala.Double = js.native
  var vertexShader: threeLib.srcRenderersWebglWebGLShaderMod.WebGLShader = js.native
  def destroy(): scala.Unit = js.native
  def getAttributes(): js.Any = js.native
  def getUniforms(): threeLib.srcRenderersWebglWebGLUniformsMod.WebGLUniforms = js.native
}

