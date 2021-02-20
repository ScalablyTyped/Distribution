package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listExamples` operation. */
object ListExamplesConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** The attribute by which returned examples will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @JSImport("watson-developer-cloud/assistant/v1", "ListExamplesConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    
    @js.native
    sealed trait TEXT extends Sort
    /* "text" */ val TEXT: typings.watsonDeveloperCloud.mod.ListExamplesConstants.Sort.TEXT with String = js.native
    
    @js.native
    sealed trait UPDATED extends Sort
    /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.mod.ListExamplesConstants.Sort.UPDATED with String = js.native
  }
}
