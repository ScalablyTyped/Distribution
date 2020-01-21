package typings.watsonDeveloperCloud.sdkMod.AssistantV1

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
    /* "synonym" */ val SYNONYM: typings.watsonDeveloperCloud.mod.ListSynonymsConstants.Sort.SYNONYM with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.mod.ListSynonymsConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.mod.ListSynonymsConstants.Sort with String] = js.native
  }
  
}

