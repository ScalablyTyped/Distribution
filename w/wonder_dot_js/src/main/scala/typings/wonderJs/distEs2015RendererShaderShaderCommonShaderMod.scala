package typings.wonderJs

import typings.wonderJs.distEs2015MaterialMaterialMod.Material
import typings.wonderJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderJs.distEs2015RendererShaderShaderEngineShaderMod.EngineShader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderShaderCommonShaderMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/shader/CommonShader", "CommonShader")
  @js.native
  open class CommonShader () extends EngineShader {
    
    def update(cmd: QuadCommand, material: Material): Unit = js.native
  }
  /* static members */
  object CommonShader {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/shader/CommonShader", "CommonShader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): CommonShader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommonShader]
  }
}
