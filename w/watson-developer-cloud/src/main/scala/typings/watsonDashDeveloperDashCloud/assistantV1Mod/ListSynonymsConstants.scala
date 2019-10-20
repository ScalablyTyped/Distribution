package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListSynonymsConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listSynonyms` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "ListSynonymsConstants")
@js.native
object ListSynonymsConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  /** The attribute by which returned entity value synonyms will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait SYNONYM extends Sort
    
    @js.native
    sealed trait UPDATED extends Sort
    
    /* "synonym" */ val SYNONYM: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListSynonymsConstants.Sort.SYNONYM with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListSynonymsConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
  }
  
}

