package typings
package wonderDotJsLib.distEs2015RendererShaderSourceBuilderEngineShaderSourceBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/sourceBuilder/EngineShaderSourceBuilder", "EngineShaderSourceBuilder")
@js.native
class EngineShaderSourceBuilder ()
  extends wonderDotJsLib.distEs2015RendererShaderSourceBuilderShaderSourceBuilderMod.ShaderSourceBuilder {
  var fsSourceBody: java.lang.String = js.native
  var fsSourceDefine: java.lang.String = js.native
  var fsSourceDefineList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<SourceDefine> */ js.Any = js.native
  var fsSourceExtensionList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<string> */ js.Any = js.native
  var fsSourceFuncDeclare: java.lang.String = js.native
  var fsSourceFuncDefine: java.lang.String = js.native
  var fsSourceTop: java.lang.String = js.native
  var fsSourceVarDeclare: java.lang.String = js.native
  var vsSourceBody: java.lang.String = js.native
  var vsSourceDefine: java.lang.String = js.native
  var vsSourceDefineList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<SourceDefine> */ js.Any = js.native
  var vsSourceExtensionList: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<string> */ js.Any = js.native
  var vsSourceFuncDeclare: java.lang.String = js.native
  var vsSourceFuncDefine: java.lang.String = js.native
  var vsSourceTop: java.lang.String = js.native
  var vsSourceVarDeclare: java.lang.String = js.native
  def build(
    libs: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<EngineShaderLib> */ js.Any
  ): scala.Unit = js.native
}

@JSImport("wonder.js/dist/es2015/renderer/shader/sourceBuilder/EngineShaderSourceBuilder", "EngineShaderSourceBuilder")
@js.native
object EngineShaderSourceBuilder extends js.Object {
  def create(): wonderDotJsLib.distEs2015RendererShaderSourceBuilderEngineShaderSourceBuilderMod.EngineShaderSourceBuilder = js.native
}

