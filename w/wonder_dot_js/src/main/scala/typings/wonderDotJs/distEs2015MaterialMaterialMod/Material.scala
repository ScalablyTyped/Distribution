package typings.wonderDotJs.distEs2015MaterialMaterialMod

import typings.wonderDotJs.distEs2015ComponentGeometryGeometryMod.Geometry
import typings.wonderDotJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderDotJs.distEs2015RendererShaderShaderShaderMod.Shader
import typings.wonderDotJs.distEs2015StructureColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/material/Material", "Material")
@js.native
abstract class Material () extends js.Object {
  var color: Color = js.native
  var geometry: Geometry = js.native
  val program: Program = js.native
  val shader: Shader = js.native
  /* protected */ def createShader(): Shader = js.native
  def dispose(): Unit = js.native
  def init(): Unit = js.native
  def initWhenCreate(): Unit = js.native
  def updateShader(quadCmd: QuadCommand): Unit = js.native
}

