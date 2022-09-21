package typings.sucrase

import typings.sucrase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactDisplayNameTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/ReactDisplayNameTransformer", JSImport.Default)
  @js.native
  open class default protected () extends ReactDisplayNameTransformer {
    def this(
      rootTransformer: typings.sucrase.rootTransformerMod.default,
      tokens: typings.sucrase.tokenProcessorMod.default,
      importProcessor: Null,
      options: Options
    ) = this()
    def this(
      rootTransformer: typings.sucrase.rootTransformerMod.default,
      tokens: typings.sucrase.tokenProcessorMod.default,
      importProcessor: typings.sucrase.cjsimportprocessorMod.default,
      options: Options
    ) = this()
  }
  
  @js.native
  trait ReactDisplayNameTransformer
    extends typings.sucrase.transformerMod.default {
    
    /**
      * We only want to add a display name when this is a function call containing
      * one argument, which is an object literal without `displayName` as an
      * existing key.
      */
    /* private */ var classNeedsDisplayName: Any = js.native
    
    /* private */ var findDisplayName: Any = js.native
    
    /* private */ var getDisplayNameFromFilename: Any = js.native
    
    val importProcessor: typings.sucrase.cjsimportprocessorMod.default | Null = js.native
    
    val options: Options = js.native
    
    val rootTransformer: typings.sucrase.rootTransformerMod.default = js.native
    
    val tokens: typings.sucrase.tokenProcessorMod.default = js.native
    
    /**
      * This is called with the token position at the open-paren.
      */
    /* private */ var tryProcessCreateClassCall: Any = js.native
  }
}
