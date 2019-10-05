package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SwipeBehavior extends js.Object

/**
  * Specifies whether elements are selected when the user performs a swipe interaction.
  **/
@JSGlobal("WinJS.UI.SwipeBehavior")
@js.native
object SwipeBehavior extends js.Object {
  /**
    * The swipe interaction does not change which elements are selected.
    **/
  @js.native
  sealed trait none extends SwipeBehavior
  
  /**
    * The swipe interaction selects the elements touched by the swipe.
    **/
  @js.native
  sealed trait select extends SwipeBehavior
  
  /* 1 */ val none: typings.winjs.WinJS.UI.SwipeBehavior.none with Double = js.native
  /* 0 */ val select: typings.winjs.WinJS.UI.SwipeBehavior.select with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SwipeBehavior with Double] = js.native
}

