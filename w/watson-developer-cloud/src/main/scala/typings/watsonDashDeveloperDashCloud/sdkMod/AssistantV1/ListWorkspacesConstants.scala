package typings.watsonDashDeveloperDashCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listWorkspaces` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.ListWorkspacesConstants")
@js.native
object ListWorkspacesConstants extends js.Object {
  /** The attribute by which returned workspaces will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    /* "name" */ val NAME: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListWorkspacesConstants.Sort.NAME with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListWorkspacesConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListWorkspacesConstants.Sort with String
      ] = js.native
  }
  
}

