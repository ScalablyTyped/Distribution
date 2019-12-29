package typings.winrtDashUwp.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SupportedWebAccountActions extends js.Object

/** Specifies actions that your app enables on an web account instance in the account settings pane. */
@JSGlobal("Windows.UI.ApplicationSettings.SupportedWebAccountActions")
@js.native
object SupportedWebAccountActions extends js.Object {
  /** The app displays UI for managing the web account. */
  @js.native
  sealed trait manage extends SupportedWebAccountActions
  
  /** The app does a custom action with the web account. */
  @js.native
  sealed trait more extends SupportedWebAccountActions
  
  /** No action. */
  @js.native
  sealed trait none extends SupportedWebAccountActions
  
  /** The app attempts to connect to the web account. */
  @js.native
  sealed trait reconnect extends SupportedWebAccountActions
  
  /** The app removes the web account from the account settings pane. */
  @js.native
  sealed trait remove extends SupportedWebAccountActions
  
  /** The app displays details about the web account. */
  @js.native
  sealed trait viewDetails extends SupportedWebAccountActions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportedWebAccountActions with Double] = js.native
  /* 4 */ @js.native
  object manage extends TopLevel[manage with Double]
  
  /* 5 */ @js.native
  object more extends TopLevel[more with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object reconnect extends TopLevel[reconnect with Double]
  
  /* 2 */ @js.native
  object remove extends TopLevel[remove with Double]
  
  /* 3 */ @js.native
  object viewDetails extends TopLevel[viewDetails with Double]
  
}

