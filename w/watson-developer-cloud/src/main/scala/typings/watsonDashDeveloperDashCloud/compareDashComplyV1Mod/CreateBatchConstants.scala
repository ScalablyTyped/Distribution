package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CreateBatchConstants.Function
import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CreateBatchConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `createBatch` operation. */
@JSImport("watson-developer-cloud/compare-comply/v1", "CreateBatchConstants")
@js.native
object CreateBatchConstants extends js.Object {
  @js.native
  sealed trait Function extends js.Object
  
  @js.native
  sealed trait Model extends js.Object
  
  /** The Compare and Comply method to run across the submitted input documents. */
  @js.native
  object Function extends js.Object {
    @js.native
    sealed trait ELEMENT_CLASSIFICATION extends Function
    
    @js.native
    sealed trait HTML_CONVERSION extends Function
    
    @js.native
    sealed trait TABLES extends Function
    
    /* "element_classification" */ val ELEMENT_CLASSIFICATION: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CreateBatchConstants.Function.ELEMENT_CLASSIFICATION with String = js.native
    /* "html_conversion" */ val HTML_CONVERSION: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CreateBatchConstants.Function.HTML_CONVERSION with String = js.native
    /* "tables" */ val TABLES: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CreateBatchConstants.Function.TABLES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Function with String] = js.native
  }
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    @js.native
    sealed trait CONTRACTS extends Model
    
    @js.native
    sealed trait TABLES extends Model
    
    /* "contracts" */ val CONTRACTS: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CreateBatchConstants.Model.CONTRACTS with String = js.native
    /* "tables" */ val TABLES: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.CreateBatchConstants.Model.TABLES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model with String] = js.native
  }
  
}

