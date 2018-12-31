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
  
  val multi: multi with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val single: single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winjsLib.WinJSNs.UINs.SelectionMode with java.lang.String] = js.native
}

