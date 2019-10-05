package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListViewAnimationType extends js.Object

/**
  * Specifies that type of animation for which a contentanimating event was raised.
  **/
@JSGlobal("WinJS.UI.ListViewAnimationType")
@js.native
object ListViewAnimationType extends js.Object {
  /**
    * The animation plays when the ListView is changing its content.
    **/
  @js.native
  sealed trait contentTransition extends ListViewAnimationType
  
  /**
    * The animation plays when the ListView is first displayed.
    **/
  @js.native
  sealed trait entrance extends ListViewAnimationType
  
  /* 1 */ val contentTransition: typings.winjs.WinJS.UI.ListViewAnimationType.contentTransition with Double = js.native
  /* 0 */ val entrance: typings.winjs.WinJS.UI.ListViewAnimationType.entrance with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListViewAnimationType with Double] = js.native
}

