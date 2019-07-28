package typings.three.srcRenderersWebglWebGLProgramsMod

import typings.three.srcMaterialsShaderMaterialMod.ShaderMaterial
import typings.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typings.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions
import typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLPrograms", "WebGLPrograms")
@js.native
class WebGLPrograms protected () extends js.Object {
  def this(renderer: WebGLRenderer, extensions: WebGLExtensions, capabilities: WebGLCapabilities) = this()
  var programs: js.Array[WebGLProgram] = js.native
  def acquireProgram(material: ShaderMaterial, parameters: js.Any, code: String): WebGLProgram = js.native
  def getParameters(material: ShaderMaterial, lights: js.Any, fog: js.Any, nClipPlanes: Double, `object`: js.Any): js.Any = js.native
  def getProgramCode(material: ShaderMaterial, parameters: js.Any): String = js.native
  def releaseProgram(program: WebGLProgram): Unit = js.native
}

