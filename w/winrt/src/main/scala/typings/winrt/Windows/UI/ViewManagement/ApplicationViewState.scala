package typings.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewState extends js.Object

@JSGlobal("Windows.UI.ViewManagement.ApplicationViewState")
@js.native
object ApplicationViewState extends js.Object {
  @js.native
  sealed trait filled extends ApplicationViewState
  
  @js.native
  sealed trait fullScreenLandscape extends ApplicationViewState
  
  @js.native
  sealed trait fullScreenPortrait extends ApplicationViewState
  
  @js.native
  sealed trait snapped extends ApplicationViewState
  
  /* 1 */ val filled: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.filled with Double = js.native
  /* 0 */ val fullScreenLandscape: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.fullScreenLandscape with Double = js.native
  /* 3 */ val fullScreenPortrait: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.fullScreenPortrait with Double = js.native
  /* 2 */ val snapped: typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.snapped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewState with Double] = js.native
}

