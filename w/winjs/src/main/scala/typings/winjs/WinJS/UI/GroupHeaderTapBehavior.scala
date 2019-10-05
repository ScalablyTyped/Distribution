package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupHeaderTapBehavior extends js.Object

/**
  * Specifies how group headers in a ListView respond to the tap interaction.
  **/
@JSGlobal("WinJS.UI.GroupHeaderTapBehavior")
@js.native
object GroupHeaderTapBehavior extends js.Object {
  /**
    * The group is invoked.
    **/
  @js.native
  sealed trait invoke extends GroupHeaderTapBehavior
  
  /**
    * Nothing happens.
    **/
  @js.native
  sealed trait none extends GroupHeaderTapBehavior
  
  /* 0 */ val invoke: typings.winjs.WinJS.UI.GroupHeaderTapBehavior.invoke with Double = js.native
  /* 1 */ val none: typings.winjs.WinJS.UI.GroupHeaderTapBehavior.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupHeaderTapBehavior with Double] = js.native
}

