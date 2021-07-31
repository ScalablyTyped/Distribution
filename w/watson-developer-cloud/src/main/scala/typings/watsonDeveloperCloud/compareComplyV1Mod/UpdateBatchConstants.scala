package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `updateBatch` operation. */
object UpdateBatchConstants {
  
  @js.native
  sealed trait Action extends StObject
  /** The action you want to perform on the specified batch-processing job. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "UpdateBatchConstants.Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Action & String] = js.native
    
    @js.native
    sealed trait CANCEL
      extends StObject
         with Action
    /* "cancel" */ val CANCEL: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action.CANCEL & String = js.native
    
    @js.native
    sealed trait RESCAN
      extends StObject
         with Action
    /* "rescan" */ val RESCAN: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Action.RESCAN & String = js.native
  }
  
  @js.native
  sealed trait Model extends StObject
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "UpdateBatchConstants.Model")
  @js.native
  object Model extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model & String] = js.native
    
    @js.native
    sealed trait CONTRACTS
      extends StObject
         with Model
    /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model.CONTRACTS & String = js.native
    
    @js.native
    sealed trait TABLES
      extends StObject
         with Model
    /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.UpdateBatchConstants.Model.TABLES & String = js.native
  }
}
