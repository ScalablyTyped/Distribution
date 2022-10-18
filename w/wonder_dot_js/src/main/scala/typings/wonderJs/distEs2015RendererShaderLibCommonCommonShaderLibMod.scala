package typings.wonderJs

import typings.wonderJs.distEs2015MaterialEngineMaterialMod.EngineMaterial
import typings.wonderJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderJs.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderLibCommonCommonShaderLibMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/CommonShaderLib", "CommonShaderLib")
  @js.native
  open class CommonShaderLib () extends EngineShaderLib {
    
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: EngineMaterial): Unit = js.native
    
    def setShaderDefinition(cmd: QuadCommand, material: EngineMaterial): Unit = js.native
  }
  /* static members */
  object CommonShaderLib {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/CommonShaderLib", "CommonShaderLib")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): CommonShaderLib = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommonShaderLib]
  }
}
