package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HoldingState extends js.Object

@JSGlobal("Windows.UI.Input.HoldingState")
@js.native
object HoldingState extends js.Object {
  @js.native
  sealed trait canceled extends HoldingState
  
  @js.native
  sealed trait completed extends HoldingState
  
  @js.native
  sealed trait started extends HoldingState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HoldingState with Double] = js.native
  /* 2 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 1 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 0 */ @js.native
  object started extends TopLevel[started with Double]
  
}

