package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterUpdateType extends StObject
@JSGlobal("tableau.FilterUpdateType")
@js.native
object FilterUpdateType extends StObject {
  
  /** Adds the filter values as specified in the call to the current filter values. Equivalent to checking a value in a quick filter. */
  @js.native
  sealed trait ADD extends FilterUpdateType
  
  /** Adds all values to the filter. Equivalent to checking the (All) value in a quick filter. */
  @js.native
  sealed trait ALL extends FilterUpdateType
  
  /** Removes the filter values as specified in the call from the current filter values. Equivalent to unchecking a value in a quick filter. */
  @js.native
  sealed trait REMOVE extends FilterUpdateType
  
  /** Replaces the current filter values with new ones specified in the call */
  @js.native
  sealed trait REPLACE extends FilterUpdateType
}
