package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.UpdateBatchConstants.Action
import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.UpdateBatchConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `updateBatch` operation. */
@JSImport("watson-developer-cloud/compare-comply/v1", "UpdateBatchConstants")
@js.native
object UpdateBatchConstants extends js.Object {
  @js.native
  sealed trait Action extends js.Object
  
  @js.native
  sealed trait Model extends js.Object
  
  /** The action you want to perform on the specified batch-processing job. */
  @js.native
  object Action extends js.Object {
    @js.native
    sealed trait CANCEL extends Action
    
    @js.native
    sealed trait RESCAN extends Action
    
    /* "cancel" */ val CANCEL: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.UpdateBatchConstants.Action.CANCEL with String = js.native
    /* "rescan" */ val RESCAN: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.UpdateBatchConstants.Action.RESCAN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Action with String] = js.native
  }
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    @js.native
    sealed trait CONTRACTS extends Model
    
    @js.native
    sealed trait TABLES extends Model
    
    /* "contracts" */ val CONTRACTS: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.UpdateBatchConstants.Model.CONTRACTS with String = js.native
    /* "tables" */ val TABLES: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.UpdateBatchConstants.Model.TABLES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model with String] = js.native
  }
  
}

