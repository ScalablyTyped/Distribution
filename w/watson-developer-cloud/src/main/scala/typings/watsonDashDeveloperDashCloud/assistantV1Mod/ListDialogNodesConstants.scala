package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListDialogNodesConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listDialogNodes` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "ListDialogNodesConstants")
@js.native
object ListDialogNodesConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  /** The attribute by which returned dialog nodes will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait DIALOG_NODE extends Sort
    
    @js.native
    sealed trait UPDATED extends Sort
    
    /* "dialog_node" */ val DIALOG_NODE: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListDialogNodesConstants.Sort.DIALOG_NODE with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListDialogNodesConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
  }
  
}

