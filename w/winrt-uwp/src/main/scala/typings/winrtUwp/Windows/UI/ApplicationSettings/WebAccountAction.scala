package typings.winrtUwp.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAccountAction extends StObject
/** Specifies actions that your app does on an web account. */
@JSGlobal("Windows.UI.ApplicationSettings.WebAccountAction")
@js.native
object WebAccountAction extends StObject {
  
  /** The app displays UI for managing the web account. */
  @js.native
  sealed trait manage
    extends StObject
       with WebAccountAction
  
  /** The app does a custom action with the web account. */
  @js.native
  sealed trait more
    extends StObject
       with WebAccountAction
  
  /** The app attempts to connect to the web account. */
  @js.native
  sealed trait reconnect
    extends StObject
       with WebAccountAction
  
  /** The app removes the web account from the account settings pane. */
  @js.native
  sealed trait remove
    extends StObject
       with WebAccountAction
  
  /** The app displays details about the web account. */
  @js.native
  sealed trait viewDetails
    extends StObject
       with WebAccountAction
}
