package typings
package vscodeDashLanguageserverLib.vscodeDashLanguageserverMod

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
  def showErrorMessage(message: java.lang.String): scala.Unit = js.native
  def showErrorMessage[T /* <: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.MessageActionItem */](message: java.lang.String, actions: T*): vscodeDashLanguageserverLib.Thenable[js.UndefOr[T]] = js.native
  /**
       * Show an information message.
       *
       * @param message The message to show.
       */
  def showInformationMessage(message: java.lang.String): scala.Unit = js.native
  def showInformationMessage[T /* <: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.MessageActionItem */](message: java.lang.String, actions: T*): vscodeDashLanguageserverLib.Thenable[js.UndefOr[T]] = js.native
  /**
       * Show a warning message.
       *
       * @param message The message to show.
       */
  def showWarningMessage(message: java.lang.String): scala.Unit = js.native
  def showWarningMessage[T /* <: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.MessageActionItem */](message: java.lang.String, actions: T*): vscodeDashLanguageserverLib.Thenable[js.UndefOr[T]] = js.native
}

