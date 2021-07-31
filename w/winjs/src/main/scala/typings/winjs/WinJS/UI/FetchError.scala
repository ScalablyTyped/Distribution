package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FetchError extends StObject
/**
  * Specifies the type of error encountered when retrieving items from an IListDataAdapter.
  **/
@JSGlobal("WinJS.UI.FetchError")
@js.native
object FetchError extends StObject {
  
  /**
    * The specified item could not be located.
    **/
  @js.native
  sealed trait doesNotExist
    extends StObject
       with FetchError
  
  /**
    * The fetch operation timed out.
    **/
  @js.native
  sealed trait noResponse
    extends StObject
       with FetchError
}
