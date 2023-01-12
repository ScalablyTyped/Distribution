package typings.wonderJs

import typings.wonderJs.distEs2015MaterialMaterialMod.Material
import typings.wonderJs.distEs2015RendererCommandRenderCommandMod.RenderCommand
import typings.wonderJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderJs.distEs2015RendererShaderLibShaderLibMod.ShaderLib
import typings.wonderJs.distEs2015RendererShaderSourceBuilderShaderSourceBuilderMod.ShaderSourceBuilder
import typings.wonderJs.distEs2015RendererShaderVariableEvariabletypeMod.EVariableType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderShaderShaderMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/renderer/shader/shader/Shader", "Shader")
  @js.native
  open class Shader () extends StObject {
    
    def addLib(lib: ShaderLib): Unit = js.native
    
    def addShaderLibToTop(lib: ShaderLib): Unit = js.native
    
    var attributes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderData> */ Any = js.native
    
    /* protected */ def buildDefinitionData(cmd: RenderCommand, material: Material): Unit = js.native
    
    def createFsShader(): Any = js.native
    
    /* protected */ def createShaderSourceBuilder(): ShaderSourceBuilder = js.native
    
    def createVsShader(): Any = js.native
    
    var definitionDataDirty: Boolean = js.native
    
    val dirty: Boolean = js.native
    
    def dispose(): Unit = js.native
    
    var fsSource: String = js.native
    
    def getLib(libClass: js.Function): ShaderLib = js.native
    
    def getLibs(): Any = js.native
    
    def hasLib(_class: js.Function): Any = js.native
    def hasLib(lib: ShaderLib): Any = js.native
    
    def init(material: Material): Unit = js.native
    
    /* protected */ def judgeRefreshShader(cmd: RenderCommand, material: Material): Unit = js.native
    
    var libDirty: Boolean = js.native
    
    /* protected */ var libs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<ShaderLib> */ Any = js.native
    
    val program: Program = js.native
    
    def removeAllLibs(): Unit = js.native
    
    def removeLib(func: js.Function): Any = js.native
    def removeLib(lib: ShaderLib): Any = js.native
    
    def sortLib(func: js.Function2[/* a */ ShaderLib, /* b */ ShaderLib, Any]): Unit = js.native
    
    /* protected */ var sourceBuilder: ShaderSourceBuilder = js.native
    
    var uniforms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderData> */ Any = js.native
    
    def update(cmd: RenderCommand, material: Material): Any = js.native
    
    var vsSource: String = js.native
  }
  
  trait ShaderData extends StObject {
    
    var textureId: js.UndefOr[String] = js.undefined
    
    var `type`: EVariableType
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object ShaderData {
    
    inline def apply(`type`: EVariableType): ShaderData = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShaderData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShaderData] (val x: Self) extends AnyVal {
      
      inline def setTextureId(value: String): Self = StObject.set(x, "textureId", value.asInstanceOf[js.Any])
      
      inline def setTextureIdUndefined: Self = StObject.set(x, "textureId", js.undefined)
      
      inline def setType(value: EVariableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
