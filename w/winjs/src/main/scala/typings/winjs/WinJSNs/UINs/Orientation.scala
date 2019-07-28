package typings.winjs.WinJSNs.UINs

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
  sealed trait horizontal extends Orientation
  
  /**
    * A vertical layout.
    **/
  @js.native
  sealed trait vertical extends Orientation
  
  /* 0 */ val horizontal: typings.winjs.WinJSNs.UINs.Orientation.horizontal with Double = js.native
  /* 1 */ val vertical: typings.winjs.WinJSNs.UINs.Orientation.vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
}

