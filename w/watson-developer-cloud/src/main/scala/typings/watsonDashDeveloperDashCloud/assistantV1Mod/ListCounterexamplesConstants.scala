package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListCounterexamplesConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listCounterexamples` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "ListCounterexamplesConstants")
@js.native
object ListCounterexamplesConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  /** The attribute by which returned counterexamples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait TEXT extends Sort
    
    @js.native
    sealed trait UPDATED extends Sort
    
    /* "text" */ val TEXT: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListCounterexamplesConstants.Sort.TEXT with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListCounterexamplesConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
  }
  
}

