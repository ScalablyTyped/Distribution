package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listDialogNodes` operation. */
object ListDialogNodesConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** The attribute by which returned dialog nodes will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @JSImport("watson-developer-cloud/assistant/v1", "ListDialogNodesConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    
    @js.native
    sealed trait DIALOG_NODE extends Sort
    /* "dialog_node" */ val DIALOG_NODE: typings.watsonDeveloperCloud.mod.ListDialogNodesConstants.Sort.DIALOG_NODE with String = js.native
    
    @js.native
    sealed trait UPDATED extends Sort
    /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.mod.ListDialogNodesConstants.Sort.UPDATED with String = js.native
  }
}
