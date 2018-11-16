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
  
  val horizontal: horizontal with java.lang.String = js.native
  val vertical: vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winjsLib.WinJSNs.UINs.Orientation with java.lang.String] = js.native
}

