package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listEntities` operation. */
object ListEntitiesConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** The attribute by which returned entities will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @JSImport("watson-developer-cloud/assistant/v1", "ListEntitiesConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort & String] = js.native
    
    @js.native
    sealed trait ENTITY
      extends StObject
         with Sort
    /* "entity" */ val ENTITY: typings.watsonDeveloperCloud.mod.ListEntitiesConstants.Sort.ENTITY & String = js.native
    
    @js.native
    sealed trait UPDATED
      extends StObject
         with Sort
    /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.mod.ListEntitiesConstants.Sort.UPDATED & String = js.native
  }
}
