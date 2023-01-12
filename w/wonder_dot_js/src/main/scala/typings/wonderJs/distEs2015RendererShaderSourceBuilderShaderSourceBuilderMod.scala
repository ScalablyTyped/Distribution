package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderSourceBuilderShaderSourceBuilderMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/renderer/shader/sourceBuilder/ShaderSourceBuilder", "ShaderSourceBuilder")
  @js.native
  open class ShaderSourceBuilder () extends StObject {
    
    var attributes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderData> */ Any = js.native
    
    def build(args: Any*): Unit = js.native
    
    def clearShaderDefinition(): Unit = js.native
    
    /* protected */ def convertAttributesData(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    var fsSource: String = js.native
    
    var uniforms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderData> */ Any = js.native
    
    var vsSource: String = js.native
  }
  
  trait SourceDefine extends StObject {
    
    var name: String
    
    var value: Any
  }
  object SourceDefine {
    
    inline def apply(name: String, value: Any): SourceDefine = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceDefine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceDefine] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
