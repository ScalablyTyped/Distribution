package typings.wonderJs

import typings.wonderJs.engineMaterialMod.EngineMaterial
import typings.wonderJs.engineShaderLibMod.EngineShaderLib
import typings.wonderJs.programMod.Program
import typings.wonderJs.quadCommandMod.QuadCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticeCommonShaderLibMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/VerticeCommonShaderLib", "VerticeCommonShaderLib")
  @js.native
  class VerticeCommonShaderLib () extends EngineShaderLib {
    
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: EngineMaterial): Unit = js.native
    
    def setShaderDefinition(cmd: QuadCommand, material: EngineMaterial): Unit = js.native
  }
  /* static members */
  object VerticeCommonShaderLib {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/lib/common/VerticeCommonShaderLib", "VerticeCommonShaderLib")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): VerticeCommonShaderLib = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[VerticeCommonShaderLib]
  }
}
