package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailQuerySortDirection extends StObject
/** Defines the order in which to sort query results. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQuerySortDirection")
@js.native
object EmailQuerySortDirection extends StObject {
  
  /** Sort query results in ascending order. */
  @js.native
  sealed trait ascending
    extends StObject
       with EmailQuerySortDirection
  
  /** Sort query results in descending order. */
  @js.native
  sealed trait descending
    extends StObject
       with EmailQuerySortDirection
}
