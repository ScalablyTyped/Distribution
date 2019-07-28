package typings.winjs.WinJSNs.UINs

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
  
  /* 0 */ val directSelect: typings.winjs.WinJSNs.UINs.TapBehavior.directSelect with Double = js.native
  /* 2 */ val invokeOnly: typings.winjs.WinJSNs.UINs.TapBehavior.invokeOnly with Double = js.native
  /* 3 */ val none: typings.winjs.WinJSNs.UINs.TapBehavior.none with Double = js.native
  /* 1 */ val toggleSelect: typings.winjs.WinJSNs.UINs.TapBehavior.toggleSelect with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TapBehavior with Double] = js.native
}

