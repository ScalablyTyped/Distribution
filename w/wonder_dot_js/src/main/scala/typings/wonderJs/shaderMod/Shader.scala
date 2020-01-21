package typings.wonderJs.shaderMod

import typings.wonderJs.materialMod.Material
import typings.wonderJs.programMod.Program
import typings.wonderJs.renderCommandMod.RenderCommand
import typings.wonderJs.shaderLibMod.ShaderLib
import typings.wonderJs.shaderSourceBuilderMod.ShaderSourceBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/shader/Shader", "Shader")
@js.native
abstract class Shader () extends js.Object {
  var attributes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderData> */ js.Any = js.native
  var definitionDataDirty: Boolean = js.native
  val dirty: Boolean = js.native
  var fsSource: String = js.native
  var libDirty: Boolean = js.native
  var libs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<ShaderLib> */ js.Any = js.native
  val program: Program = js.native
  var sourceBuilder: ShaderSourceBuilder = js.native
  var uniforms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderData> */ js.Any = js.native
  var vsSource: String = js.native
  def addLib(lib: ShaderLib): Unit = js.native
  def addShaderLibToTop(lib: ShaderLib): Unit = js.native
  /* protected */ def buildDefinitionData(cmd: RenderCommand, material: Material): Unit = js.native
  def createFsShader(): js.Any = js.native
  /* protected */ def createShaderSourceBuilder(): ShaderSourceBuilder = js.native
  def createVsShader(): js.Any = js.native
  def dispose(): Unit = js.native
  def getLib(libClass: js.Function): ShaderLib = js.native
  def getLibs(): js.Any = js.native
  def hasLib(_class: js.Function): js.Any = js.native
  def hasLib(lib: ShaderLib): js.Any = js.native
  def init(material: Material): Unit = js.native
  /* protected */ def judgeRefreshShader(cmd: RenderCommand, material: Material): Unit = js.native
  def removeAllLibs(): Unit = js.native
  def removeLib(func: js.Function): js.Any = js.native
  def removeLib(lib: ShaderLib): js.Any = js.native
  def sortLib(func: js.Function2[/* a */ ShaderLib, /* b */ ShaderLib, _]): Unit = js.native
  def update(cmd: RenderCommand, material: Material): js.Any = js.native
}

