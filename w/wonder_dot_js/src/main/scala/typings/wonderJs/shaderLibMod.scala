package typings.wonderJs

import typings.wonderJs.materialMod.Material
import typings.wonderJs.programMod.Program
import typings.wonderJs.renderCommandMod.RenderCommand
import typings.wonderJs.shaderMod.Shader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderLibMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/lib/ShaderLib", "ShaderLib")
  @js.native
  abstract class ShaderLib () extends StObject {
    
    def dispose(): Unit = js.native
    
    def init(): Unit = js.native
    
    def sendShaderVariables(program: Program, cmd: RenderCommand, material: Material): Unit = js.native
    
    var shader: Shader = js.native
  }
}
