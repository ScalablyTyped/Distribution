package typings.wonderDotJs.distEs2015MaterialShaderManagerMod

import typings.wonderDotJs.distEs2015MaterialMaterialMod.Material
import typings.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderDotJs.distEs2015RendererShaderShaderShaderMod.Shader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/material/ShaderManager", "ShaderManager")
@js.native
class ShaderManager protected () extends js.Object {
  def this(material: Material) = this()
  val shader: Shader = js.native
  def dispose(): Unit = js.native
  def init(): Unit = js.native
  def setShader(shader: Shader): Unit = js.native
  def update(quadCmd: QuadCommand): Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/material/ShaderManager", "ShaderManager")
@js.native
object ShaderManager extends js.Object {
  def create(material: Material): ShaderManager = js.native
}

