package typings.winrtUwp.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SupportedWebAccountActions extends StObject
/** Specifies actions that your app enables on an web account instance in the account settings pane. */
@JSGlobal("Windows.UI.ApplicationSettings.SupportedWebAccountActions")
@js.native
object SupportedWebAccountActions extends StObject {
  
  /** The app displays UI for managing the web account. */
  @js.native
  sealed trait manage
    extends StObject
       with SupportedWebAccountActions
  
  /** The app does a custom action with the web account. */
  @js.native
  sealed trait more
    extends StObject
       with SupportedWebAccountActions
  
  /** No action. */
  @js.native
  sealed trait none
    extends StObject
       with SupportedWebAccountActions
  
  /** The app attempts to connect to the web account. */
  @js.native
  sealed trait reconnect
    extends StObject
       with SupportedWebAccountActions
  
  /** The app removes the web account from the account settings pane. */
  @js.native
  sealed trait remove
    extends StObject
       with SupportedWebAccountActions
  
  /** The app displays details about the web account. */
  @js.native
  sealed trait viewDetails
    extends StObject
       with SupportedWebAccountActions
}
