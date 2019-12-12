package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
import typings.winjs.WinJS.UI.HeaderPosition.left
import typings.winjs.WinJS.UI.HeaderPosition.top
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeaderPosition with Double] = js.native
  /* 0 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 1 */ @js.native
  object top extends TopLevel[top with Double]
  
}

