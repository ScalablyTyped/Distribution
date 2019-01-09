package typings
package wonderDotJsLib.distEs2015RendererCommandQuadCommandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/command/QuadCommand", "QuadCommand")
@js.native
abstract class QuadCommand ()
  extends wonderDotJsLib.distEs2015RendererCommandRenderCommandMod.RenderCommand {
  var buffers: wonderDotJsLib.distEs2015ComponentGeometryDataBufferContainerMod.BufferContainer = js.native
  var mMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  var material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material = js.native
  val mvpMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  var pMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  val program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program = js.native
  var sortId: scala.Double = js.native
  var target: wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject = js.native
  var vMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  val vpMatrix: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4 = js.native
  /* protected */ def draw(material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material): scala.Unit = js.native
}

