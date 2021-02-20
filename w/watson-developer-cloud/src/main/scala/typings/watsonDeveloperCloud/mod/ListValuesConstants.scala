package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listValues` operation. */
object ListValuesConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** The attribute by which returned entity values will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @JSImport("watson-developer-cloud/assistant/v1", "ListValuesConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    
    @js.native
    sealed trait UPDATED extends Sort
    /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.mod.ListValuesConstants.Sort.UPDATED with String = js.native
    
    @js.native
    sealed trait VALUE extends Sort
    /* "value" */ val VALUE: typings.watsonDeveloperCloud.mod.ListValuesConstants.Sort.VALUE with String = js.native
  }
}
