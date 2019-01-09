package typings
package wonderDotJsLib.distEs2015MaterialMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/material/Material", "Material")
@js.native
abstract class Material () extends js.Object {
  var color: wonderDotJsLib.distEs2015StructureColorMod.Color = js.native
  var geometry: wonderDotJsLib.distEs2015ComponentGeometryGeometryMod.Geometry = js.native
  val program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program = js.native
  val shader: wonderDotJsLib.distEs2015RendererShaderShaderShaderMod.Shader = js.native
  /* protected */ def createShader(): wonderDotJsLib.distEs2015RendererShaderShaderShaderMod.Shader = js.native
  def dispose(): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def initWhenCreate(): scala.Unit = js.native
  def updateShader(quadCmd: wonderDotJsLib.distEs2015RendererCommandQuadCommandMod.QuadCommand): scala.Unit = js.native
}

