package typings.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An enumeration that indicates what to do with null values for a given filter or mark selection call. */
@JSGlobal("tableau.NullOption")
@js.native
object NullOption extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.tableau.tableau.NullOption with String] = js.native
  
  /* "allValues" */ val ALL_VALUES: typings.tableau.tableau.NullOption.ALL_VALUES with String = js.native
  
  /* "nonNullValues" */ val NON_NULL_VALUES: typings.tableau.tableau.NullOption.NON_NULL_VALUES with String = js.native
  
  /* "nullValues" */ val NULL_VALUES: typings.tableau.tableau.NullOption.NULL_VALUES with String = js.native
}
