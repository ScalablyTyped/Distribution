package typings
package wonderDotJsLib.distEs2015MaterialShaderManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/material/ShaderManager", "ShaderManager")
@js.native
class ShaderManager protected () extends js.Object {
  def this(material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material) = this()
  val shader: wonderDotJsLib.distEs2015RendererShaderShaderShaderMod.Shader = js.native
  def dispose(): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def setShader(shader: wonderDotJsLib.distEs2015RendererShaderShaderShaderMod.Shader): scala.Unit = js.native
  def update(quadCmd: wonderDotJsLib.distEs2015RendererCommandQuadCommandMod.QuadCommand): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/material/ShaderManager", "ShaderManager")
@js.native
object ShaderManager extends js.Object {
  def create(material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material): wonderDotJsLib.distEs2015MaterialShaderManagerMod.ShaderManager = js.native
}

