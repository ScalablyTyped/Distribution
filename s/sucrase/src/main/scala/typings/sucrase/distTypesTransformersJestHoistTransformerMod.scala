package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersJestHoistTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/JestHoistTransformer", JSImport.Default)
  @js.native
  open class default protected () extends JestHoistTransformer {
    def this(
      rootTransformer: typings.sucrase.distTypesTransformersRootTransformerMod.default,
      tokens: typings.sucrase.distTypesTokenProcessorMod.default,
      nameManager: typings.sucrase.distTypesNameManagerMod.default
    ) = this()
    def this(
      rootTransformer: typings.sucrase.distTypesTransformersRootTransformerMod.default,
      tokens: typings.sucrase.distTypesTokenProcessorMod.default,
      nameManager: typings.sucrase.distTypesNameManagerMod.default,
      importProcessor: typings.sucrase.distTypesCjsimportprocessorMod.default
    ) = this()
  }
  
  @js.native
  trait JestHoistTransformer
    extends typings.sucrase.distTypesTransformersTransformerMod.default {
    
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
    
    val importProcessor: typings.sucrase.distTypesCjsimportprocessorMod.default | Null = js.native
    
    val nameManager: typings.sucrase.distTypesNameManagerMod.default = js.native
    
    val rootTransformer: typings.sucrase.distTypesTransformersRootTransformerMod.default = js.native
    
    val tokens: typings.sucrase.distTypesTokenProcessorMod.default = js.native
  }
}
