package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIStatus extends js.Object

@JSGlobal("Windows.Storage.Provider.UIStatus")
@js.native
object UIStatus extends js.Object {
  @js.native
  sealed trait complete extends UIStatus
  
  @js.native
  sealed trait hidden extends UIStatus
  
  @js.native
  sealed trait unavailable extends UIStatus
  
  @js.native
  sealed trait visible extends UIStatus
  
  /* 3 */ val complete: typings.winrt.Windows.Storage.Provider.UIStatus.complete with Double = js.native
  /* 1 */ val hidden: typings.winrt.Windows.Storage.Provider.UIStatus.hidden with Double = js.native
  /* 0 */ val unavailable: typings.winrt.Windows.Storage.Provider.UIStatus.unavailable with Double = js.native
  /* 2 */ val visible: typings.winrt.Windows.Storage.Provider.UIStatus.visible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIStatus with Double] = js.native
}

