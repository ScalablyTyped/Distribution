package typings.wonderJs

import typings.wonderJs.engineMaterialMod.EngineMaterial
import typings.wonderJs.engineShaderLibMod.EngineShaderLib
import typings.wonderJs.programMod.Program
import typings.wonderJs.quadCommandMod.QuadCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endShaderLibMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/EndShaderLib", "EndShaderLib")
  @js.native
  class EndShaderLib () extends EngineShaderLib {
    
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: EngineMaterial): Unit = js.native
  }
  /* static members */
  object EndShaderLib {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/EndShaderLib", "EndShaderLib")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): EndShaderLib = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EndShaderLib]
  }
}
