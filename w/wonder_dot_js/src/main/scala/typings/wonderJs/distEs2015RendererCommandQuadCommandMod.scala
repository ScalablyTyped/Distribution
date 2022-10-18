package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryDataBufferContainerMod.BufferContainer
import typings.wonderJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderJs.distEs2015MaterialMaterialMod.Material
import typings.wonderJs.distEs2015MathMatrix4Mod.Matrix4
import typings.wonderJs.distEs2015RendererCommandRenderCommandMod.RenderCommand
import typings.wonderJs.distEs2015RendererProgramProgramMod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererCommandQuadCommandMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/renderer/command/QuadCommand", "QuadCommand")
  @js.native
  open class QuadCommand () extends RenderCommand {
    
    var buffers: BufferContainer = js.native
    
    /* protected */ def draw(material: Material): Unit = js.native
    
    var mMatrix: Matrix4 = js.native
    
    var material: Material = js.native
    
    val mvpMatrix: Matrix4 = js.native
    
    var pMatrix: Matrix4 = js.native
    
    val program: Program = js.native
    
    var sortId: Double = js.native
    
    var target: GameObject = js.native
    
    var vMatrix: Matrix4 = js.native
    
    val vpMatrix: Matrix4 = js.native
  }
}
