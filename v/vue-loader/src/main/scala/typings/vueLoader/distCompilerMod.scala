package typings.vueLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompilerMod {
  
  @JSImport("vue-loader/dist/compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vue-loader/dist/compiler", "compiler")
  @js.native
  def compiler: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _compiler */ Any = js.native
  inline def compiler_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _compiler */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compiler")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object vueCompilerSfcAugmentingMod {
    
    trait SFCDescriptor extends StObject {
      
      var id: String
    }
    object SFCDescriptor {
      
      inline def apply(id: String): SFCDescriptor = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[SFCDescriptor]
      }
      
      extension [Self <: SFCDescriptor](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
  }
}
