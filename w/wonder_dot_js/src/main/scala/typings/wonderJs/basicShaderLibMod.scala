package typings.wonderJs

import typings.wonderJs.basicMaterialMod.BasicMaterial
import typings.wonderJs.engineShaderLibMod.EngineShaderLib
import typings.wonderJs.programMod.Program
import typings.wonderJs.quadCommandMod.QuadCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicShaderLibMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicShaderLib", "BasicShaderLib")
  @js.native
  class BasicShaderLib () extends EngineShaderLib {
    
    def sendShaderVariables(program: Program, cmd: QuadCommand, material: BasicMaterial): Unit = js.native
    
    def setShaderDefinition(cmd: QuadCommand, material: BasicMaterial): Unit = js.native
  }
  /* static members */
  object BasicShaderLib {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/BasicShaderLib", "BasicShaderLib")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): BasicShaderLib = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BasicShaderLib]
  }
}
