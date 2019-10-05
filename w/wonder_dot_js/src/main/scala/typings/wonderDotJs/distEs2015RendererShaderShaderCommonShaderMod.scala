package typings.wonderDotJs

import typings.wonderDotJs.distEs2015MaterialMaterialMod.Material
import typings.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderDotJs.distEs2015RendererShaderShaderCommonShaderMod.CommonShader
import typings.wonderDotJs.distEs2015RendererShaderShaderEngineShaderMod.EngineShader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/shader/CommonShader", JSImport.Namespace)
@js.native
object distEs2015RendererShaderShaderCommonShaderMod extends js.Object {
  @js.native
  class CommonShader () extends EngineShader {
    def update(cmd: QuadCommand, material: Material): Unit = js.native
  }
  
  /* static members */
  @js.native
  object CommonShader extends js.Object {
    def create(): CommonShader = js.native
  }
  
}

