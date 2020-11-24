package typings.watsonDeveloperCloud.sdkMod.CompareComplyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createBatch` operation. */
@JSImport("watson-developer-cloud/sdk", "CompareComplyV1.CreateBatchConstants")
@js.native
object CreateBatchConstants extends js.Object {
  
  /** The Compare and Comply method to run across the submitted input documents. */
  @js.native
  object Function extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function with String
      ] = js.native
    
    /* "element_classification" */ val ELEMENT_CLASSIFICATION: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.ELEMENT_CLASSIFICATION with String = js.native
    
    /* "html_conversion" */ val HTML_CONVERSION: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.HTML_CONVERSION with String = js.native
    
    /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.TABLES with String = js.native
  }
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model with String
      ] = js.native
    
    /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model.CONTRACTS with String = js.native
    
    /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model.TABLES with String = js.native
  }
}
