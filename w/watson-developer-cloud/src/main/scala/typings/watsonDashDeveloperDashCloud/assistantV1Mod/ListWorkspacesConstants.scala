package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListWorkspacesConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listWorkspaces` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "ListWorkspacesConstants")
@js.native
object ListWorkspacesConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  /** The attribute by which returned workspaces will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait NAME extends Sort
    
    @js.native
    sealed trait UPDATED extends Sort
    
    /* "name" */ val NAME: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListWorkspacesConstants.Sort.NAME with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListWorkspacesConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
  }
  
}

