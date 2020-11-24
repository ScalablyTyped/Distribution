package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.protocolMod.MessageActionItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _RemoteWindow extends js.Object {
  
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection = js.native
  
  /**
    * Shows an error message in the client's user interface. Depending on the client this might
    * be a modal dialog with a confirmation button or a notification in a notification center
    *
    * @param message The message to show.
    * @param actions Possible additional actions presented in the user interface. The selected action
    *  will be the value of the resolved promise
    */
  def showErrorMessage(message: String): Unit = js.native
  def showErrorMessage[T /* <: MessageActionItem */](message: String, actions: T*): js.Promise[js.UndefOr[T]] = js.native
  
  /**
    * Shows an information message in the client's user interface. Depending on the client this might
    * be a modal dialog with a confirmation button or a notification in a notification center
    *
    * @param message The message to show.
    * @param actions Possible additional actions presented in the user interface. The selected action
    *  will be the value of the resolved promise
    */
  def showInformationMessage(message: String): Unit = js.native
  def showInformationMessage[T /* <: MessageActionItem */](message: String, actions: T*): js.Promise[js.UndefOr[T]] = js.native
  
  /**
    * Shows a warning message in the client's user interface. Depending on the client this might
    * be a modal dialog with a confirmation button or a notification in a notification center
    *
    * @param message The message to show.
    * @param actions Possible additional actions presented in the user interface. The selected action
    *  will be the value of the resolved promise
    */
  def showWarningMessage(message: String): Unit = js.native
  def showWarningMessage[T /* <: MessageActionItem */](message: String, actions: T*): js.Promise[js.UndefOr[T]] = js.native
}
