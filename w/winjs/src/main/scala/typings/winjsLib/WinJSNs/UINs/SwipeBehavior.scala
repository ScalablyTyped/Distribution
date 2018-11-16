package typings
package winjsLib.WinJSNs.UINs

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
  sealed trait none
    extends winjsLib.WinJSNs.UINs.SwipeBehavior
  
  /**
           * The swipe interaction selects the elements touched by the swipe.
          **/
  @js.native
  sealed trait select
    extends winjsLib.WinJSNs.UINs.SwipeBehavior
  
  val none: none with java.lang.String = js.native
  val select: select with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winjsLib.WinJSNs.UINs.SwipeBehavior with java.lang.String] = js.native
}

