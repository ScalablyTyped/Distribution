package typings.wonderJs

import typings.wonderJs.distEs2015MaterialBasicMaterialMod.BasicMaterial
import typings.wonderJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderJs.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderLibBasicBasicMaterialColorShaderLibMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicMaterialColorShaderLib", "BasicMaterialColorShaderLib")
  @js.native
  open class BasicMaterialColorShaderLib () extends EngineShaderLib {
    
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: BasicMaterial): Unit = js.native
    
    def setShaderDefinition(cmd: QuadCommand, material: BasicMaterial): Unit = js.native
  }
  /* static members */
  object BasicMaterialColorShaderLib {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicMaterialColorShaderLib", "BasicMaterialColorShaderLib")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): BasicMaterialColorShaderLib = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BasicMaterialColorShaderLib]
  }
}
