package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.vueInbrowserCompilerUtils.typesMod.ParamTag
import typings.vueInbrowserCompilerUtils.typesMod.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotHandlerFunctionalMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/slotHandlerFunctional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait TypedParamTag
    extends StObject
       with ParamTag {
    
    @JSName("type")
    var type_TypedParamTag: ParamType
  }
  object TypedParamTag {
    
    inline def apply(title: String, `type`: ParamType): TypedParamTag = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedParamTag]
    }
    
    extension [Self <: TypedParamTag](x: Self) {
      
      inline def setType(value: ParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
