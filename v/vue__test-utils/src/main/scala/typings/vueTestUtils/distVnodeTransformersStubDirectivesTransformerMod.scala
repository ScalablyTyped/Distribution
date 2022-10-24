package typings.vueTestUtils

import typings.std.Record
import typings.vueRuntimeCore.mod.Directive
import typings.vueTestUtils.distVnodeTransformersUtilMod.VTUVNodeTypeTransformer
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVnodeTransformersStubDirectivesTransformerMod {
  
  @JSImport("@vue/test-utils/dist/vnodeTransformers/stubDirectivesTransformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStubDirectivesTransformer(param0: CreateDirectivesTransformerConfig): VTUVNodeTypeTransformer = ^.asInstanceOf[js.Dynamic].applyDynamic("createStubDirectivesTransformer")(param0.asInstanceOf[js.Any]).asInstanceOf[VTUVNodeTypeTransformer]
  
  trait CreateDirectivesTransformerConfig extends StObject {
    
    var directives: Record[String, (Directive[Any, Any]) | `true`]
  }
  object CreateDirectivesTransformerConfig {
    
    inline def apply(directives: Record[String, (Directive[Any, Any]) | `true`]): CreateDirectivesTransformerConfig = {
      val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateDirectivesTransformerConfig]
    }
    
    extension [Self <: CreateDirectivesTransformerConfig](x: Self) {
      
      inline def setDirectives(value: Record[String, (Directive[Any, Any]) | `true`]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    }
  }
}
