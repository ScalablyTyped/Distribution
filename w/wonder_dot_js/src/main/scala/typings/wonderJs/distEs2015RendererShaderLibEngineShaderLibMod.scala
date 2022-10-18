package typings.wonderJs

import typings.wonderJs.distEs2015MaterialMaterialMod.Material
import typings.wonderJs.distEs2015RendererCommandRenderCommandMod.RenderCommand
import typings.wonderJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderJs.distEs2015RendererShaderChunkShaderChunkMod.GLSLChunk
import typings.wonderJs.distEs2015RendererShaderLibShaderLibMod.ShaderLib
import typings.wonderJs.distEs2015RendererShaderShaderEngineShaderMod.EngineShader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderLibEngineShaderLibMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/renderer/shader/lib/EngineShaderLib", "EngineShaderLib")
  @js.native
  open class EngineShaderLib () extends ShaderLib {
    
    /* protected */ def addAttributeVariable(variableArr: js.Array[String]): Unit = js.native
    
    /* protected */ def addUniformVariable(variableArr: js.Array[String]): Unit = js.native
    
    var attributes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderVariable> */ Any = js.native
    
    var fsChunk: GLSLChunk = js.native
    
    var fsSource: String = js.native
    
    var fsSourceBody: String = js.native
    
    var fsSourceDefine: String = js.native
    
    var fsSourceDefineList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ Any = js.native
    
    var fsSourceExtensionList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<string> */ Any = js.native
    
    var fsSourceFuncDeclare: String = js.native
    
    var fsSourceFuncDefine: String = js.native
    
    var fsSourceTop: String = js.native
    
    var fsSourceVarDeclare: String = js.native
    
    /* protected */ def getFsChunk(): Any = js.native
    /* protected */ def getFsChunk(chunk: GLSLChunk): Any = js.native
    
    /* protected */ def getVsChunk(): Any = js.native
    /* protected */ def getVsChunk(chunk: GLSLChunk): Any = js.native
    
    /* protected */ def sendAttributeBuffer(program: Program, name: String, data: Any): Unit = js.native
    
    /* protected */ def sendUniformData(program: Program, name: String, data: Any): Unit = js.native
    
    /* protected */ def setFsSource(fs: String): Unit = js.native
    /* protected */ def setFsSource(fs: String, operator: String): Unit = js.native
    /* protected */ def setFsSource(fs: GLSLChunk): Unit = js.native
    /* protected */ def setFsSource(fs: GLSLChunk, operator: String): Unit = js.native
    
    def setShaderDefinition(cmd: RenderCommand, material: Material): Unit = js.native
    
    /* protected */ def setVsSource(vs: String): Unit = js.native
    /* protected */ def setVsSource(vs: String, operator: String): Unit = js.native
    /* protected */ def setVsSource(vs: GLSLChunk): Unit = js.native
    /* protected */ def setVsSource(vs: GLSLChunk, operator: String): Unit = js.native
    
    @JSName("shader")
    var shader_EngineShaderLib: EngineShader = js.native
    
    var uniforms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderVariable> */ Any = js.native
    
    var vsChunk: GLSLChunk = js.native
    
    var vsSource: String = js.native
    
    var vsSourceBody: String = js.native
    
    var vsSourceDefine: String = js.native
    
    var vsSourceDefineList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ Any = js.native
    
    var vsSourceExtensionList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<string> */ Any = js.native
    
    var vsSourceFuncDeclare: String = js.native
    
    var vsSourceFuncDefine: String = js.native
    
    var vsSourceTop: String = js.native
    
    var vsSourceVarDeclare: String = js.native
  }
}
