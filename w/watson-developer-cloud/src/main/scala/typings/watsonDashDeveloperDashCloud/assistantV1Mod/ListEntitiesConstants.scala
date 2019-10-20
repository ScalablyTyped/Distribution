package typings.watsonDashDeveloperDashCloud.assistantV1Mod

import typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListEntitiesConstants.Sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listEntities` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "ListEntitiesConstants")
@js.native
object ListEntitiesConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  /** The attribute by which returned entities will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait ENTITY extends Sort
    
    @js.native
    sealed trait UPDATED extends Sort
    
    /* "entity" */ val ENTITY: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListEntitiesConstants.Sort.ENTITY with String = js.native
    /* "updated" */ val UPDATED: typings.watsonDashDeveloperDashCloud.assistantV1Mod.ListEntitiesConstants.Sort.UPDATED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
  }
  
}

