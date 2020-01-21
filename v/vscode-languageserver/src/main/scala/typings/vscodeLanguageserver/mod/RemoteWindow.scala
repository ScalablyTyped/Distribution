package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.Thenable
import typings.vscodeLanguageserverProtocol.protocolMod.MessageActionItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteWindow extends Remote {
  /**
    * Show an error message.
    *
    * @param message The message to show.
    */
  def showErrorMessage(message: String): Unit = js.native
  def showErrorMessage[T /* <: MessageActionItem */](message: String, actions: T*): Thenable[js.UndefOr[T]] = js.native
  /**
    * Show an information message.
    *
    * @param message The message to show.
    */
  def showInformationMessage(message: String): Unit = js.native
  def showInformationMessage[T /* <: MessageActionItem */](message: String, actions: T*): Thenable[js.UndefOr[T]] = js.native
  /**
    * Show a warning message.
    *
    * @param message The message to show.
    */
  def showWarningMessage(message: String): Unit = js.native
  def showWarningMessage[T /* <: MessageActionItem */](message: String, actions: T*): Thenable[js.UndefOr[T]] = js.native
}

