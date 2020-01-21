package typings.winrtUwp.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountAction extends js.Object

/** Specifies actions that your app does on an web account. */
@JSGlobal("Windows.UI.ApplicationSettings.WebAccountAction")
@js.native
object WebAccountAction extends js.Object {
  /** The app displays UI for managing the web account. */
  @js.native
  sealed trait manage extends WebAccountAction
  
  /** The app does a custom action with the web account. */
  @js.native
  sealed trait more extends WebAccountAction
  
  /** The app attempts to connect to the web account. */
  @js.native
  sealed trait reconnect extends WebAccountAction
  
  /** The app removes the web account from the account settings pane. */
  @js.native
  sealed trait remove extends WebAccountAction
  
  /** The app displays details about the web account. */
  @js.native
  sealed trait viewDetails extends WebAccountAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountAction with Double] = js.native
  /* 3 */ @js.native
  object manage extends TopLevel[manage with Double]
  
  /* 4 */ @js.native
  object more extends TopLevel[more with Double]
  
  /* 0 */ @js.native
  object reconnect extends TopLevel[reconnect with Double]
  
  /* 1 */ @js.native
  object remove extends TopLevel[remove with Double]
  
  /* 2 */ @js.native
  object viewDetails extends TopLevel[viewDetails with Double]
  
}

