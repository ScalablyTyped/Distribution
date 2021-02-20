package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeaderPosition extends StObject
/**
  * Specifies the position of group headers relative to their items in a ListView.
  **/
@JSGlobal("WinJS.UI.HeaderPosition")
@js.native
object HeaderPosition extends StObject {
  
  /**
    * Group headers appear to the left of items.
    **/
  @js.native
  sealed trait left extends HeaderPosition
  
  /**
    * Group headers appear above items.
    **/
  @js.native
  sealed trait top extends HeaderPosition
}
