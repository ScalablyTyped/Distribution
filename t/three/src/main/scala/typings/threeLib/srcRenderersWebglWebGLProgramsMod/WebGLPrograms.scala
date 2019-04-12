package typings
package threeLib.srcRenderersWebglWebGLProgramsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLPrograms", "WebGLPrograms")
@js.native
class WebGLPrograms protected () extends js.Object {
  def this(renderer: threeLib.srcRenderersWebGLRendererMod.WebGLRenderer, extensions: threeLib.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions, capabilities: threeLib.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities, textures: threeLib.srcRenderersWebglWebGLTexturesMod.WebGLTextures) = this()
  var programs: js.Array[threeLib.srcRenderersWebglWebGLProgramMod.WebGLProgram] = js.native
  def acquireProgram(
    material: threeLib.srcMaterialsShaderMaterialMod.ShaderMaterial,
    parameters: js.Any,
    code: java.lang.String
  ): threeLib.srcRenderersWebglWebGLProgramMod.WebGLProgram = js.native
  def getParameters(
    material: threeLib.srcMaterialsShaderMaterialMod.ShaderMaterial,
    lights: js.Any,
    fog: js.Any,
    nClipPlanes: scala.Double,
    `object`: js.Any
  ): js.Any = js.native
  def getProgramCode(material: threeLib.srcMaterialsShaderMaterialMod.ShaderMaterial, parameters: js.Any): java.lang.String = js.native
  def releaseProgram(program: threeLib.srcRenderersWebglWebGLProgramMod.WebGLProgram): scala.Unit = js.native
}

