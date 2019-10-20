package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListExamplesConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listExamples` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "ListExamplesConstants")
@js.native
object ListExamplesConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  /** The attribute by which returned examples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait TEXT extends Sort
    
    @js.native
    sealed trait UPDATED extends Sort
    
    /* "text" */ val TEXT: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListExamplesConstants.Sort.TEXT with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListExamplesConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
  }
  
}

