package typings.wonderDotJs

import typings.wonderDotJs.distEs2015ComponentGeometryDataBufferContainerMod.BufferContainer
import typings.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderDotJs.distEs2015MaterialMaterialMod.Material
import typings.wonderDotJs.distEs2015MathMatrix4Mod.Matrix4
import typings.wonderDotJs.distEs2015RendererCommandRenderCommandMod.RenderCommand
import typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/command/QuadCommand", JSImport.Namespace)
@js.native
object distEs2015RendererCommandQuadCommandMod extends js.Object {
  @js.native
  abstract class QuadCommand () extends RenderCommand {
    var buffers: BufferContainer = js.native
    var mMatrix: Matrix4 = js.native
    var material: Material = js.native
    val mvpMatrix: Matrix4 = js.native
    var pMatrix: Matrix4 = js.native
    val program: Program = js.native
    var sortId: Double = js.native
    var target: GameObject = js.native
    var vMatrix: Matrix4 = js.native
    val vpMatrix: Matrix4 = js.native
    /* protected */ def draw(material: Material): Unit = js.native
  }
  
}

