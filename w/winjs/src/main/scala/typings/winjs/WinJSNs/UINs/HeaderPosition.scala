package typings.winjs.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderPosition extends js.Object

/**
  * Specifies the position of group headers relative to their items in a ListView.
  **/
@JSGlobal("WinJS.UI.HeaderPosition")
@js.native
object HeaderPosition extends js.Object {
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
  
  /* 0 */ val left: typings.winjs.WinJSNs.UINs.HeaderPosition.left with Double = js.native
  /* 1 */ val top: typings.winjs.WinJSNs.UINs.HeaderPosition.top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeaderPosition with Double] = js.native
}

