package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionalCatchBindingTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/OptionalCatchBindingTransformer", JSImport.Default)
  @js.native
  open class default protected () extends OptionalCatchBindingTransformer {
    def this(
      tokens: typings.sucrase.tokenProcessorMod.default,
      nameManager: typings.sucrase.nameManagerMod.default
    ) = this()
  }
  
  @js.native
  trait OptionalCatchBindingTransformer
    extends typings.sucrase.transformerMod.default {
    
    val nameManager: typings.sucrase.nameManagerMod.default = js.native
    
    val tokens: typings.sucrase.tokenProcessorMod.default = js.native
  }
}
