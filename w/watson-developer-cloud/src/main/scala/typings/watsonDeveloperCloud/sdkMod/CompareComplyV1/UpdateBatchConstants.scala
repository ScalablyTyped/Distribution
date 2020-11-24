package typings.watsonDeveloperCloud.sdkMod.CompareComplyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `updateBatch` operation. */
@JSImport("watson-developer-cloud/sdk", "CompareComplyV1.UpdateBatchConstants")
@js.native
object UpdateBatchConstants extends js.Object {
  
  /** The action you want to perform on the specified batch-processing job. */
  @js.native
  object Action extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action with String
      ] = js.native
    
    /* "cancel" */ val CANCEL: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action.CANCEL with String = js.native
    
    /* "rescan" */ val RESCAN: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action.RESCAN with String = js.native
  }
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model with String
      ] = js.native
    
    /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model.CONTRACTS with String = js.native
    
    /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model.TABLES with String = js.native
  }
}
