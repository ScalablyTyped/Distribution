package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericSeparatorTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/NumericSeparatorTransformer", JSImport.Default)
  @js.native
  open class default protected () extends NumericSeparatorTransformer {
    def this(tokens: typings.sucrase.tokenProcessorMod.default) = this()
  }
  
  @js.native
  trait NumericSeparatorTransformer
    extends typings.sucrase.transformerMod.default {
    
    val tokens: typings.sucrase.tokenProcessorMod.default = js.native
  }
}
