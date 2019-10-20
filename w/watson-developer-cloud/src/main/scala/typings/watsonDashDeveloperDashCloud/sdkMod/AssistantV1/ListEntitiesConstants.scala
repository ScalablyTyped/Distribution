package typings.watsonDashDeveloperDashCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listEntities` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.ListEntitiesConstants")
@js.native
object ListEntitiesConstants extends js.Object {
  /** The attribute by which returned entities will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    /* "entity" */ val ENTITY: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListEntitiesConstants.Sort.ENTITY with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListEntitiesConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListEntitiesConstants.Sort with String
      ] = js.native
  }
  
}

