package typings.wonderJs

import typings.wonderJs.shaderSourceBuilderMod.ShaderSourceBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineShaderSourceBuilderMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/sourceBuilder/EngineShaderSourceBuilder", "EngineShaderSourceBuilder")
  @js.native
  class EngineShaderSourceBuilder () extends ShaderSourceBuilder {
    
    def build(
      libs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<EngineShaderLib> */ js.Any
    ): Unit = js.native
    
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
  }
  /* static members */
  object EngineShaderSourceBuilder {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/sourceBuilder/EngineShaderSourceBuilder", "EngineShaderSourceBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): EngineShaderSourceBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EngineShaderSourceBuilder]
  }
}
