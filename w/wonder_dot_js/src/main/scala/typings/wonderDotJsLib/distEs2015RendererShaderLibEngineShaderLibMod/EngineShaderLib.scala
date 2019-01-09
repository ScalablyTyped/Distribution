package typings
package wonderDotJsLib.distEs2015RendererShaderLibEngineShaderLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/lib/EngineShaderLib", "EngineShaderLib")
@js.native
abstract class EngineShaderLib ()
  extends wonderDotJsLib.distEs2015RendererShaderLibShaderLibMod.ShaderLib {
  var attributes: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<ShaderVariable> */ js.Any = js.native
  var fsChunk: wonderDotJsLib.distEs2015RendererShaderChunkShaderChunkMod.GLSLChunk = js.native
  var fsSource: java.lang.String = js.native
  var fsSourceBody: java.lang.String = js.native
  var fsSourceDefine: java.lang.String = js.native
  var fsSourceDefineList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<any> */ js.Any = js.native
  var fsSourceExtensionList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<string> */ js.Any = js.native
  var fsSourceFuncDeclare: java.lang.String = js.native
  var fsSourceFuncDefine: java.lang.String = js.native
  var fsSourceTop: java.lang.String = js.native
  var fsSourceVarDeclare: java.lang.String = js.native
  @JSName("shader")
  var shader_EngineShaderLib: wonderDotJsLib.distEs2015RendererShaderShaderEngineShaderMod.EngineShader = js.native
  var uniforms: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<ShaderVariable> */ js.Any = js.native
  var vsChunk: wonderDotJsLib.distEs2015RendererShaderChunkShaderChunkMod.GLSLChunk = js.native
  var vsSource: java.lang.String = js.native
  var vsSourceBody: java.lang.String = js.native
  var vsSourceDefine: java.lang.String = js.native
  var vsSourceDefineList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<any> */ js.Any = js.native
  var vsSourceExtensionList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<string> */ js.Any = js.native
  var vsSourceFuncDeclare: java.lang.String = js.native
  var vsSourceFuncDefine: java.lang.String = js.native
  var vsSourceTop: java.lang.String = js.native
  var vsSourceVarDeclare: java.lang.String = js.native
  /* protected */ def addAttributeVariable(variableArr: js.Array[java.lang.String]): scala.Unit = js.native
  /* protected */ def addUniformVariable(variableArr: js.Array[java.lang.String]): scala.Unit = js.native
  /* protected */ def getFsChunk(): js.Any = js.native
  /* protected */ def getFsChunk(chunk: wonderDotJsLib.distEs2015RendererShaderChunkShaderChunkMod.GLSLChunk): js.Any = js.native
  /* protected */ def getVsChunk(): js.Any = js.native
  /* protected */ def getVsChunk(chunk: wonderDotJsLib.distEs2015RendererShaderChunkShaderChunkMod.GLSLChunk): js.Any = js.native
  /* protected */ def sendAttributeBuffer(
    program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program,
    name: java.lang.String,
    data: js.Any
  ): scala.Unit = js.native
  /* protected */ def sendUniformData(
    program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program,
    name: java.lang.String,
    data: js.Any
  ): scala.Unit = js.native
  /* protected */ def setFsSource(fs: java.lang.String): scala.Unit = js.native
  /* protected */ def setFsSource(fs: java.lang.String, operator: java.lang.String): scala.Unit = js.native
  /* protected */ def setFsSource(fs: wonderDotJsLib.distEs2015RendererShaderChunkShaderChunkMod.GLSLChunk): scala.Unit = js.native
  /* protected */ def setFsSource(
    fs: wonderDotJsLib.distEs2015RendererShaderChunkShaderChunkMod.GLSLChunk,
    operator: java.lang.String
  ): scala.Unit = js.native
  def setShaderDefinition(
    cmd: wonderDotJsLib.distEs2015RendererCommandRenderCommandMod.RenderCommand,
    material: wonderDotJsLib.distEs2015MaterialMaterialMod.Material
  ): scala.Unit = js.native
  /* protected */ def setVsSource(vs: java.lang.String): scala.Unit = js.native
  /* protected */ def setVsSource(vs: java.lang.String, operator: java.lang.String): scala.Unit = js.native
  /* protected */ def setVsSource(vs: wonderDotJsLib.distEs2015RendererShaderChunkShaderChunkMod.GLSLChunk): scala.Unit = js.native
  /* protected */ def setVsSource(
    vs: wonderDotJsLib.distEs2015RendererShaderChunkShaderChunkMod.GLSLChunk,
    operator: java.lang.String
  ): scala.Unit = js.native
}

