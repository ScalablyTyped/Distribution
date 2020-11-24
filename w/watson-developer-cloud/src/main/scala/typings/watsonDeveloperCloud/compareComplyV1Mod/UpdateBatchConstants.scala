package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `updateBatch` operation. */
@JSImport("watson-developer-cloud/compare-comply/v1", "UpdateBatchConstants")
@js.native
object UpdateBatchConstants extends js.Object {
  
  @js.native
  sealed trait Action extends js.Object
  /** The action you want to perform on the specified batch-processing job. */
  @js.native
  object Action extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Action with String] = js.native
    
    @js.native
    sealed trait CANCEL extends Action
    /* "cancel" */ @js.native
    object CANCEL extends TopLevel[CANCEL with String]
    
    @js.native
    sealed trait RESCAN extends Action
    /* "rescan" */ @js.native
    object RESCAN extends TopLevel[RESCAN with String]
  }
  
  @js.native
  sealed trait Model extends js.Object
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model with String] = js.native
    
    @js.native
    sealed trait CONTRACTS extends Model
    /* "contracts" */ @js.native
    object CONTRACTS extends TopLevel[CONTRACTS with String]
    
    @js.native
    sealed trait TABLES extends Model
    /* "tables" */ @js.native
    object TABLES extends TopLevel[TABLES with String]
  }
}
