package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows an application to launch the email application with a new message displayed. Use this to allow users to send email from your application. */
@JSGlobal("Windows.ApplicationModel.Email.EmailManager")
@js.native
abstract class EmailManager () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Email.EmailManager")
@js.native
object EmailManager extends js.Object {
  /**
    * Gets an email store that is within the specified scope.
    * @param accessType The enumerator of scope.
    * @return The requested email store.
    */
  def requestStoreAsync(accessType: EmailStoreAccessType): IPromiseWithIAsyncOperation[EmailStore] = js.native
  /**
    * Launches the email application with a new message displayed.
    * @param message The email message that is displayed when the email application is launched.
    * @return An asynchronous action.
    */
  def showComposeNewEmailAsync(message: EmailMessage): IPromiseWithIAsyncAction = js.native
}

