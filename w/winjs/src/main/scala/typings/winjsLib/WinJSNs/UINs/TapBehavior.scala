package typings
package winjsLib.WinJSNs.UINs

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
  sealed trait directSelect
    extends winjsLib.WinJSNs.UINs.TapBehavior
  
  /**
           * The item is invoked but not selected.
          **/
  @js.native
  sealed trait invokeOnly
    extends winjsLib.WinJSNs.UINs.TapBehavior
  
  /**
           * Nothing happens.
          **/
  @js.native
  sealed trait none
    extends winjsLib.WinJSNs.UINs.TapBehavior
  
  /**
           * The item is selected if was not already selected, and its deselected if it was already selected.
          **/
  @js.native
  sealed trait toggleSelect
    extends winjsLib.WinJSNs.UINs.TapBehavior
  
  val directSelect: directSelect with java.lang.String = js.native
  val invokeOnly: invokeOnly with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val toggleSelect: toggleSelect with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winjsLib.WinJSNs.UINs.TapBehavior with java.lang.String] = js.native
}

