package typings.winrtDashUwp.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIStatus extends js.Object

/** Indicates the status of the file picker UI. */
@JSGlobal("Windows.Storage.Provider.UIStatus")
@js.native
object UIStatus extends js.Object {
  /** The file picker is currently showing UI and all */
  @js.native
  sealed trait complete extends UIStatus
  
  /** The file picker is not showing UI, but UI can be requested. */
  @js.native
  sealed trait hidden extends UIStatus
  
  /** The file picker is not showing UI and UI can't be requested. */
  @js.native
  sealed trait unavailable extends UIStatus
  
  /** The file picker is currently showing UI because UI was requested by the app. */
  @js.native
  sealed trait visible extends UIStatus
  
  /* 3 */ val complete: typings.winrtDashUwp.Windows.Storage.Provider.UIStatus.complete with Double = js.native
  /* 1 */ val hidden: typings.winrtDashUwp.Windows.Storage.Provider.UIStatus.hidden with Double = js.native
  /* 0 */ val unavailable: typings.winrtDashUwp.Windows.Storage.Provider.UIStatus.unavailable with Double = js.native
  /* 2 */ val visible: typings.winrtDashUwp.Windows.Storage.Provider.UIStatus.visible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UIStatus with Double] = js.native
}

