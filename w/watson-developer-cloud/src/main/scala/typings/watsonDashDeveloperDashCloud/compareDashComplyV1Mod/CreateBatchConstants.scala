package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Function with String] = js.native
    /* "element_classification" */ @js.native
    object ELEMENT_CLASSIFICATION extends TopLevel[ELEMENT_CLASSIFICATION with String]
    
    /* "html_conversion" */ @js.native
    object HTML_CONVERSION extends TopLevel[HTML_CONVERSION with String]
    
    /* "tables" */ @js.native
    object TABLES extends TopLevel[TABLES with String]
    
  }
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    @js.native
    sealed trait CONTRACTS extends Model
    
    @js.native
    sealed trait TABLES extends Model
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model with String] = js.native
    /* "contracts" */ @js.native
    object CONTRACTS extends TopLevel[CONTRACTS with String]
    
    /* "tables" */ @js.native
    object TABLES extends TopLevel[TABLES with String]
    
  }
  
}

