package typings.watsonDeveloperCloud.sdkMod.AssistantV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listEntities` operation. */
@JSImport("watson-developer-cloud/sdk", "AssistantV1.ListEntitiesConstants")
@js.native
object ListEntitiesConstants extends js.Object {
  
  /** The attribute by which returned entities will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @js.native
  object Sort extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.watsonDeveloperCloud.mod.ListEntitiesConstants.Sort with String] = js.native
    
    /* "entity" */ val ENTITY: typings.watsonDeveloperCloud.mod.ListEntitiesConstants.Sort.ENTITY with String = js.native
    
    /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.mod.ListEntitiesConstants.Sort.UPDATED with String = js.native
  }
}
