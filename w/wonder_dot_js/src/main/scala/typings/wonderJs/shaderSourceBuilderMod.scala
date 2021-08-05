package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderSourceBuilderMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/sourceBuilder/ShaderSourceBuilder", "ShaderSourceBuilder")
  @js.native
  abstract class ShaderSourceBuilder () extends StObject {
    
    var attributes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderData> */ js.Any = js.native
    
    def build(args: js.Any*): Unit = js.native
    
    def clearShaderDefinition(): Unit = js.native
    
    /* protected */ def convertAttributesData(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    var fsSource: String = js.native
    
    var uniforms: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<ShaderData> */ js.Any = js.native
    
    var vsSource: String = js.native
  }
  
  trait SourceDefine extends StObject {
    
    var name: String
    
    var value: js.Any
  }
  object SourceDefine {
    
    inline def apply(name: String, value: js.Any): SourceDefine = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceDefine]
    }
    
    extension [Self <: SourceDefine](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
