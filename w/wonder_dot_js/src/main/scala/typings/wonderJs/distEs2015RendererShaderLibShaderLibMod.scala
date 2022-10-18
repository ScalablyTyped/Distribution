package typings.wonderJs

import typings.wonderJs.distEs2015MaterialMaterialMod.Material
import typings.wonderJs.distEs2015RendererCommandRenderCommandMod.RenderCommand
import typings.wonderJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderJs.distEs2015RendererShaderShaderShaderMod.Shader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderLibShaderLibMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/renderer/shader/lib/ShaderLib", "ShaderLib")
  @js.native
  open class ShaderLib () extends StObject {
    
    def dispose(): Unit = js.native
    
    def init(): Unit = js.native
    
    def sendShaderVariables(program: Program, cmd: RenderCommand, material: Material): Unit = js.native
    
    var shader: Shader = js.native
  }
}
