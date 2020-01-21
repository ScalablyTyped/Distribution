package typings.watsonDeveloperCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listExamples` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.ListExamplesConstants")
@js.native
object ListExamplesConstants extends js.Object {
  /** The attribute by which returned examples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    /* "text" */ val TEXT: typings.watsonDeveloperCloud.mod.ListExamplesConstants.Sort.TEXT with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.mod.ListExamplesConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.mod.ListExamplesConstants.Sort with String] = js.native
  }
  
}

