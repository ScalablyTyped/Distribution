package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listCounterexamples` operation. */
object ListCounterexamplesConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** The attribute by which returned counterexamples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @JSImport("watson-developer-cloud/assistant/v1", "ListCounterexamplesConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort & String] = js.native
    
    @js.native
    sealed trait TEXT
      extends StObject
         with Sort
    /* "text" */ val TEXT: typings.watsonDeveloperCloud.assistantV1Mod.ListCounterexamplesConstants.Sort.TEXT & String = js.native
    
    @js.native
    sealed trait UPDATED
      extends StObject
         with Sort
    /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListCounterexamplesConstants.Sort.UPDATED & String = js.native
  }
}
