package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestHoistTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/JestHoistTransformer", JSImport.Default)
  @js.native
  open class default protected () extends JestHoistTransformer {
    def this(
      rootTransformer: typings.sucrase.rootTransformerMod.default,
      tokens: typings.sucrase.tokenProcessorMod.default,
      nameManager: typings.sucrase.nameManagerMod.default
    ) = this()
    def this(
      rootTransformer: typings.sucrase.rootTransformerMod.default,
      tokens: typings.sucrase.tokenProcessorMod.default,
      nameManager: typings.sucrase.nameManagerMod.default,
      importProcessor: typings.sucrase.cjsimportprocessorMod.default
    ) = this()
  }
  
  @js.native
  trait JestHoistTransformer
    extends typings.sucrase.transformerMod.default {
    
    /**
      * Extracts any methods calls on the jest-object that should be hoisted.
      *
      * According to the jest docs, https://jestjs.io/docs/en/jest-object#jestmockmodulename-factory-options,
      * mock, unmock, enableAutomock, disableAutomock, are the methods that should be hoisted.
      *
      * We do not apply the same checks of the arguments as babel-plugin-jest-hoist does.
      */
    /* private */ var extractHoistedCalls: Any = js.native
    
    /* private */ val hoistedFunctionNames: Any = js.native
    
    val importProcessor: typings.sucrase.cjsimportprocessorMod.default | Null = js.native
    
    val nameManager: typings.sucrase.nameManagerMod.default = js.native
    
    val rootTransformer: typings.sucrase.rootTransformerMod.default = js.native
    
    val tokens: typings.sucrase.tokenProcessorMod.default = js.native
  }
}
