package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listDialogNodes` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "ListDialogNodesConstants")
@js.native
object ListDialogNodesConstants extends js.Object {
  
  @js.native
  sealed trait Sort extends js.Object
  /** The attribute by which returned dialog nodes will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    
    @js.native
    sealed trait DIALOG_NODE extends Sort
    /* "dialog_node" */ @js.native
    object DIALOG_NODE extends TopLevel[DIALOG_NODE with String]
    
    @js.native
    sealed trait UPDATED extends Sort
    /* "updated" */ @js.native
    object UPDATED extends TopLevel[UPDATED with String]
  }
}
