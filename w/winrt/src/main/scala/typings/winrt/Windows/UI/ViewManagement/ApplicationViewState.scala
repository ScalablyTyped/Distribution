package typings.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
