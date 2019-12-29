package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TapBehavior extends js.Object

/**
  * Specifies how items in a ListView respond to the tap interaction.
  **/
@JSGlobal("WinJS.UI.TapBehavior")
@js.native
object TapBehavior extends js.Object {
  /**
    * The item is selected and invoked.
    **/
  @js.native
  sealed trait directSelect extends TapBehavior
  
  /**
    * The item is invoked but not selected.
    **/
  @js.native
  sealed trait invokeOnly extends TapBehavior
  
  /**
    * Nothing happens.
    **/
  @js.native
  sealed trait none extends TapBehavior
  
  /**
    * The item is selected if was not already selected, and its deselected if it was already selected.
    **/
  @js.native
  sealed trait toggleSelect extends TapBehavior
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TapBehavior with Double] = js.native
  /* 0 */ @js.native
  object directSelect extends TopLevel[directSelect with Double]
  
  /* 2 */ @js.native
  object invokeOnly extends TopLevel[invokeOnly with Double]
  
  /* 3 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object toggleSelect extends TopLevel[toggleSelect with Double]
  
}

