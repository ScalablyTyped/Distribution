package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHotLoaderTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/ReactHotLoaderTransformer", JSImport.Default)
  @js.native
  open class default protected () extends ReactHotLoaderTransformer {
    def this(tokens: typings.sucrase.tokenProcessorMod.default, filePath: String) = this()
  }
  
  @js.native
  trait ReactHotLoaderTransformer
    extends typings.sucrase.transformerMod.default {
    
    /* private */ var extractedDefaultExportName: Any = js.native
    
    val filePath: String = js.native
    
    def setExtractedDefaultExportName(extractedDefaultExportName: String): Unit = js.native
    
    val tokens: typings.sucrase.tokenProcessorMod.default = js.native
  }
}
