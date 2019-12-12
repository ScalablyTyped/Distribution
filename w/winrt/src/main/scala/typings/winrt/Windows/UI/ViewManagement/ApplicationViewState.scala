package typings.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.filled
import typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.fullScreenLandscape
import typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.fullScreenPortrait
import typings.winrt.Windows.UI.ViewManagement.ApplicationViewState.snapped
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewState with Double] = js.native
  /* 1 */ @js.native
  object filled extends TopLevel[filled with Double]
  
  /* 0 */ @js.native
  object fullScreenLandscape extends TopLevel[fullScreenLandscape with Double]
  
  /* 3 */ @js.native
  object fullScreenPortrait extends TopLevel[fullScreenPortrait with Double]
  
  /* 2 */ @js.native
  object snapped extends TopLevel[snapped with Double]
  
}

