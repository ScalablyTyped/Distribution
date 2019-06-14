package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

/**
  * Specifies the orientation of a control.
  **/
@JSGlobal("WinJS.UI.Orientation")
@js.native
object Orientation extends js.Object {
  /**
    * A horizontal layout.
    **/
  @js.native
  sealed trait horizontal
    extends winjsLib.WinJSNs.UINs.Orientation
  
  /**
    * A vertical layout.
    **/
  @js.native
  sealed trait vertical
    extends winjsLib.WinJSNs.UINs.Orientation
  
  /* 0 */ val horizontal: horizontal with scala.Double = js.native
  /* 1 */ val vertical: vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.Orientation with scala.Double] = js.native
}

