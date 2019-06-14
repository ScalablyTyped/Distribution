package typings
package winjsLib.WinJSNs.UINs

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
  sealed trait left
    extends winjsLib.WinJSNs.UINs.HeaderPosition
  
  /**
    * Group headers appear above items.
    **/
  @js.native
  sealed trait top
    extends winjsLib.WinJSNs.UINs.HeaderPosition
  
  /* 0 */ val left: left with scala.Double = js.native
  /* 1 */ val top: top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.HeaderPosition with scala.Double] = js.native
}

