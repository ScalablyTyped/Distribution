package typings.wonderJs

import typings.wonderJs.shaderSourceBuilderMod.ShaderSourceBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/shader/sourceBuilder/EngineShaderSourceBuilder", JSImport.Namespace)
@js.native
object engineShaderSourceBuilderMod extends js.Object {
  @js.native
  class EngineShaderSourceBuilder () extends ShaderSourceBuilder {
    var fsSourceBody: String = js.native
    var fsSourceDefine: String = js.native
    var fsSourceDefineList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<SourceDefine> */ js.Any = js.native
    var fsSourceExtensionList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<string> */ js.Any = js.native
    var fsSourceFuncDeclare: String = js.native
    var fsSourceFuncDefine: String = js.native
    var fsSourceTop: String = js.native
    var fsSourceVarDeclare: String = js.native
    var vsSourceBody: String = js.native
    var vsSourceDefine: String = js.native
    var vsSourceDefineList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<SourceDefine> */ js.Any = js.native
    var vsSourceExtensionList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<string> */ js.Any = js.native
    var vsSourceFuncDeclare: String = js.native
    var vsSourceFuncDefine: String = js.native
    var vsSourceTop: String = js.native
    var vsSourceVarDeclare: String = js.native
    def build(
      libs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<EngineShaderLib> */ js.Any
    ): Unit = js.native
  }
  
  /* static members */
  @js.native
  object EngineShaderSourceBuilder extends js.Object {
    def create(): EngineShaderSourceBuilder = js.native
  }
  
}

