package typings
package winjsLib.WinJSNs.UINs

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
  sealed trait multi
    extends winjsLib.WinJSNs.UINs.SelectionMode
  
  /**
    * Items cannot be selected.
    **/
  @js.native
  sealed trait none
    extends winjsLib.WinJSNs.UINs.SelectionMode
  
  /**
    * A single item may be selected.
    **/
  @js.native
  sealed trait single
    extends winjsLib.WinJSNs.UINs.SelectionMode
  
  /* 2 */ val multi: multi with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val single: single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.SelectionMode with scala.Double] = js.native
}

