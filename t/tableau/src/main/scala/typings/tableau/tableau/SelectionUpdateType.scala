package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionUpdateType extends StObject
@JSGlobal("tableau.SelectionUpdateType")
@js.native
object SelectionUpdateType extends StObject {
  
  /** Adds the values as specified in the call to the current selection. Equivalent to control-clicking in desktop. */
  @js.native
  sealed trait ADD
    extends StObject
       with SelectionUpdateType
  
  /** Removes the values as specified in the call from the current selection. Equivalent to control-clicking an already selected mark in desktop. */
  @js.native
  sealed trait REMOVE
    extends StObject
       with SelectionUpdateType
  
  /** Replaces the current marks values with new ones specified in the call. */
  @js.native
  sealed trait REPLACE
    extends StObject
       with SelectionUpdateType
}
