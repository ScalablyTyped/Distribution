package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersNumericSeparatorTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/NumericSeparatorTransformer", JSImport.Default)
  @js.native
  open class default protected () extends NumericSeparatorTransformer {
    def this(tokens: typings.sucrase.distTypesTokenProcessorMod.default) = this()
  }
  
  @js.native
  trait NumericSeparatorTransformer
    extends typings.sucrase.distTypesTransformersTransformerMod.default {
    
    val tokens: typings.sucrase.distTypesTokenProcessorMod.default = js.native
  }
}
