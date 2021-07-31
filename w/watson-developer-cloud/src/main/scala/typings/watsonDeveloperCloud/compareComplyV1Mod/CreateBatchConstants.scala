package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createBatch` operation. */
object CreateBatchConstants {
  
  @js.native
  sealed trait Function extends StObject
  /** The Compare and Comply method to run across the submitted input documents. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "CreateBatchConstants.Function")
  @js.native
  object Function extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Function & String] = js.native
    
    @js.native
    sealed trait ELEMENT_CLASSIFICATION
      extends StObject
         with Function
    /* "element_classification" */ val ELEMENT_CLASSIFICATION: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.ELEMENT_CLASSIFICATION & String = js.native
    
    @js.native
    sealed trait HTML_CONVERSION
      extends StObject
         with Function
    /* "html_conversion" */ val HTML_CONVERSION: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.HTML_CONVERSION & String = js.native
    
    @js.native
    sealed trait TABLES
      extends StObject
         with Function
    /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Function.TABLES & String = js.native
  }
  
  @js.native
  sealed trait Model extends StObject
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "CreateBatchConstants.Model")
  @js.native
  object Model extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model & String] = js.native
    
    @js.native
    sealed trait CONTRACTS
      extends StObject
         with Model
    /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model.CONTRACTS & String = js.native
    
    @js.native
    sealed trait TABLES
      extends StObject
         with Model
    /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.CreateBatchConstants.Model.TABLES & String = js.native
  }
}
