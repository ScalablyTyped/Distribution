package typings
package wonderDotJsLib.distEs2015RendererShaderShaderShaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/shader/Shader", "Shader")
@js.native
abstract class Shader () extends js.Object {
  var attributes: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<ShaderData> */ js.Any = js.native
  var definitionDataDirty: scala.Boolean = js.native
  val dirty: scala.Boolean = js.native
  var fsSource: java.lang.String = js.native
  var libDirty: scala.Boolean = js.native
  var libs: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<ShaderLib> */ js.Any = js.native
  val program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program = js.native
  var sourceBuilder: wonderDotJsLib.distEs2015RendererShaderSourceBuilderShaderSourceBuilderMod.ShaderSourceBuilder = js.native
  var uniforms: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<ShaderData> */ js.Any = js.native
  var vsSource: java.lang.String = js.native
  def addLib(lib: wonderDotJsLib.distEs2015RendererShaderLibShaderLibMod.ShaderLib): scala.Unit = js.native
  def addShaderLibToTop(lib: wonderDotJsLib.distEs2015RendererShaderLibShaderLibMod.ShaderLib): scala.Unit = js.native
  /* protected */ def buildDefinitionData(
    cmd: wonderDotJsLib.distEs2015RendererCommandRenderCommandMod.RenderCommand,
    material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material
  ): scala.Unit = js.native
  def createFsShader(): js.Any = js.native
  /* protected */ def createShaderSourceBuilder(): wonderDotJsLib.distEs2015RendererShaderSourceBuilderShaderSourceBuilderMod.ShaderSourceBuilder = js.native
  def createVsShader(): js.Any = js.native
  def dispose(): scala.Unit = js.native
  def getLib(libClass: js.Function): wonderDotJsLib.distEs2015RendererShaderLibShaderLibMod.ShaderLib = js.native
  def getLibs(): js.Any = js.native
  def hasLib(_class: js.Function): js.Any = js.native
  def hasLib(lib: wonderDotJsLib.distEs2015RendererShaderLibShaderLibMod.ShaderLib): js.Any = js.native
  def init(material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material): scala.Unit = js.native
  /* protected */ def judgeRefreshShader(
    cmd: wonderDotJsLib.distEs2015RendererCommandRenderCommandMod.RenderCommand,
    material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material
  ): scala.Unit = js.native
  def removeAllLibs(): scala.Unit = js.native
  def removeLib(func: js.Function): js.Any = js.native
  def removeLib(lib: wonderDotJsLib.distEs2015RendererShaderLibShaderLibMod.ShaderLib): js.Any = js.native
  def sortLib(
    func: js.Function2[
      /* a */ wonderDotJsLib.distEs2015RendererShaderLibShaderLibMod.ShaderLib, 
      /* b */ wonderDotJsLib.distEs2015RendererShaderLibShaderLibMod.ShaderLib, 
      _
    ]
  ): scala.Unit = js.native
  def update(
    cmd: wonderDotJsLib.distEs2015RendererCommandRenderCommandMod.RenderCommand,
    material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material
  ): js.Any = js.native
}

