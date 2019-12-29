package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

/**
  * Specifies the selection mode of a ListView.
  **/
@JSGlobal("WinJS.UI.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  /**
    * Multiple items may be selected. Clicking additional items adds them to the selection.
    **/
  @js.native
  sealed trait multi extends SelectionMode
  
  /**
    * Items cannot be selected.
    **/
  @js.native
  sealed trait none extends SelectionMode
  
  /**
    * A single item may be selected.
    **/
  @js.native
  sealed trait single extends SelectionMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionMode with Double] = js.native
  /* 2 */ @js.native
  object multi extends TopLevel[multi with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object single extends TopLevel[single with Double]
  
}

