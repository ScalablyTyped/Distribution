package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listSynonyms` operation. */
object ListSynonymsConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** The attribute by which returned entity value synonyms will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @JSImport("watson-developer-cloud/assistant/v1", "ListSynonymsConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort & String] = js.native
    
    @js.native
    sealed trait SYNONYM
      extends StObject
         with Sort
    /* "synonym" */ val SYNONYM: typings.watsonDeveloperCloud.assistantV1Mod.ListSynonymsConstants.Sort.SYNONYM & String = js.native
    
    @js.native
    sealed trait UPDATED
      extends StObject
         with Sort
    /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListSynonymsConstants.Sort.UPDATED & String = js.native
  }
}
