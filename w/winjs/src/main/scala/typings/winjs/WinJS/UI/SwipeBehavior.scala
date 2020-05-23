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
  
}

