package typings.wonderDotJs.distEs2015RendererShaderLibEngineShaderLibMod

import typings.wonderDotJs.distEs2015MaterialMaterialMod.Material
import typings.wonderDotJs.distEs2015RendererCommandRenderCommandMod.RenderCommand
import typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderDotJs.distEs2015RendererShaderChunkShaderChunkMod.GLSLChunk
import typings.wonderDotJs.distEs2015RendererShaderLibShaderLibMod.ShaderLib
import typings.wonderDotJs.distEs2015RendererShaderShaderEngineShaderMod.EngineShader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/EngineShaderLib", "EngineShaderLib")
@js.native
abstract class EngineShaderLib () extends ShaderLib {
  var attributes: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<ShaderVariable> */ js.Any = js.native
  var fsChunk: GLSLChunk = js.native
  var fsSource: String = js.native
  var fsSourceBody: String = js.native
  var fsSourceDefine: String = js.native
  var fsSourceDefineList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<any> */ js.Any = js.native
  var fsSourceExtensionList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<string> */ js.Any = js.native
  var fsSourceFuncDeclare: String = js.native
  var fsSourceFuncDefine: String = js.native
  var fsSourceTop: String = js.native
  var fsSourceVarDeclare: String = js.native
  @JSName("shader")
  var shader_EngineShaderLib: EngineShader = js.native
  var uniforms: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<ShaderVariable> */ js.Any = js.native
  var vsChunk: GLSLChunk = js.native
  var vsSource: String = js.native
  var vsSourceBody: String = js.native
  var vsSourceDefine: String = js.native
  var vsSourceDefineList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<any> */ js.Any = js.native
  var vsSourceExtensionList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<string> */ js.Any = js.native
  var vsSourceFuncDeclare: String = js.native
  var vsSourceFuncDefine: String = js.native
  var vsSourceTop: String = js.native
  var vsSourceVarDeclare: String = js.native
  /* protected */ def addAttributeVariable(variableArr: js.Array[String]): Unit = js.native
  /* protected */ def addUniformVariable(variableArr: js.Array[String]): Unit = js.native
  /* protected */ def getFsChunk(): js.Any = js.native
  /* protected */ def getFsChunk(chunk: GLSLChunk): js.Any = js.native
  /* protected */ def getVsChunk(): js.Any = js.native
  /* protected */ def getVsChunk(chunk: GLSLChunk): js.Any = js.native
  /* protected */ def sendAttributeBuffer(program: Program, name: String, data: js.Any): Unit = js.native
  /* protected */ def sendUniformData(program: Program, name: String, data: js.Any): Unit = js.native
  /* protected */ def setFsSource(fs: String): Unit = js.native
  /* protected */ def setFsSource(fs: String, operator: String): Unit = js.native
  /* protected */ def setFsSource(fs: GLSLChunk): Unit = js.native
  /* protected */ def setFsSource(fs: GLSLChunk, operator: String): Unit = js.native
  def setShaderDefinition(cmd: RenderCommand, material: Material): Unit = js.native
  /* protected */ def setVsSource(vs: String): Unit = js.native
  /* protected */ def setVsSource(vs: String, operator: String): Unit = js.native
  /* protected */ def setVsSource(vs: GLSLChunk): Unit = js.native
  /* protected */ def setVsSource(vs: GLSLChunk, operator: String): Unit = js.native
}

