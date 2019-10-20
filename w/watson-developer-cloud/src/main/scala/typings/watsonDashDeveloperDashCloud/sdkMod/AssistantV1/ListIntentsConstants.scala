package typings.watsonDashDeveloperDashCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listIntents` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.ListIntentsConstants")
@js.native
object ListIntentsConstants extends js.Object {
  /** The attribute by which returned intents will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    /* "intent" */ val INTENT: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListIntentsConstants.Sort.INTENT with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListIntentsConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListIntentsConstants.Sort with String
      ] = js.native
  }
  
}

