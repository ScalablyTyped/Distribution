package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionMode extends StObject
/**
  * Specifies the selection mode of a ListView.
  **/
@JSGlobal("WinJS.UI.SelectionMode")
@js.native
object SelectionMode extends StObject {
  
  /**
    * Multiple items may be selected. Clicking additional items adds them to the selection.
    **/
  @js.native
  sealed trait multi
    extends StObject
       with SelectionMode
  
  /**
    * Items cannot be selected.
    **/
  @js.native
  sealed trait none
    extends StObject
       with SelectionMode
  
  /**
    * A single item may be selected.
    **/
  @js.native
  sealed trait single
    extends StObject
       with SelectionMode
}
