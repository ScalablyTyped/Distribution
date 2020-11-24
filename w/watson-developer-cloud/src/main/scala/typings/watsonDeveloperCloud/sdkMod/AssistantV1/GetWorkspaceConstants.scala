package typings.watsonDeveloperCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `getWorkspace` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.GetWorkspaceConstants")
@js.native
object GetWorkspaceConstants extends js.Object {
  
  /** Indicates how the returned workspace data will be sorted. This parameter is valid only if **export**=`true`. Specify `sort=stable` to sort all workspace objects by unique identifier, in ascending alphabetical order. */
  @js.native
  object Sort extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.mod.GetWorkspaceConstants.Sort with String] = js.native
    
    /* "stable" */ val STABLE: typings.watsonDeveloperCloud.mod.GetWorkspaceConstants.Sort.STABLE with String = js.native
  }
}
