package typings.watsonDashDeveloperDashCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listSynonyms` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.ListSynonymsConstants")
@js.native
object ListSynonymsConstants extends js.Object {
  /** The attribute by which returned entity value synonyms will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    /* "synonym" */ val SYNONYM: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListSynonymsConstants.Sort.SYNONYM with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListSynonymsConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListSynonymsConstants.Sort with String
      ] = js.native
  }
  
}

