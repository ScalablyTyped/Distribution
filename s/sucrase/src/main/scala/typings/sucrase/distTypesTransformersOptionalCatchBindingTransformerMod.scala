package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersOptionalCatchBindingTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/OptionalCatchBindingTransformer", JSImport.Default)
  @js.native
  open class default protected () extends OptionalCatchBindingTransformer {
    def this(
      tokens: typings.sucrase.distTypesTokenProcessorMod.default,
      nameManager: typings.sucrase.distTypesNameManagerMod.default
    ) = this()
  }
  
  @js.native
  trait OptionalCatchBindingTransformer
    extends typings.sucrase.distTypesTransformersTransformerMod.default {
    
    val nameManager: typings.sucrase.distTypesNameManagerMod.default = js.native
    
    val tokens: typings.sucrase.distTypesTokenProcessorMod.default = js.native
  }
}
