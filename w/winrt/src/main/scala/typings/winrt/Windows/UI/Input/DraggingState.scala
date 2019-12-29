package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraggingState extends js.Object

@JSGlobal("Windows.UI.Input.DraggingState")
@js.native
object DraggingState extends js.Object {
  @js.native
  sealed trait completed extends DraggingState
  
  @js.native
  sealed trait continuing extends DraggingState
  
  @js.native
  sealed trait started extends DraggingState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraggingState with Double] = js.native
  /* 2 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 1 */ @js.native
  object continuing extends TopLevel[continuing with Double]
  
  /* 0 */ @js.native
  object started extends TopLevel[started with Double]
  
}

