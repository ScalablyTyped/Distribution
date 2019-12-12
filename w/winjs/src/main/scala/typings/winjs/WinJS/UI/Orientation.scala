package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
import typings.winjs.WinJS.UI.Orientation.horizontal
import typings.winjs.WinJS.UI.Orientation.vertical
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Orientation with Double] = js.native
  /* 0 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  /* 1 */ @js.native
  object vertical extends TopLevel[vertical with Double]
  
}

