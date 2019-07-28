package typings.wonderDotJs.distEs2015RendererShaderShaderCommonShaderMod

import typings.wonderDotJs.distEs2015MaterialMaterialMod.Material
import typings.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderDotJs.distEs2015RendererShaderShaderEngineShaderMod.EngineShader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/shader/CommonShader", "CommonShader")
@js.native
class CommonShader () extends EngineShader {
  def update(cmd: QuadCommand, material: Material): Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/renderer/shader/shader/CommonShader", "CommonShader")
@js.native
object CommonShader extends js.Object {
  def create(): CommonShader = js.native
}

