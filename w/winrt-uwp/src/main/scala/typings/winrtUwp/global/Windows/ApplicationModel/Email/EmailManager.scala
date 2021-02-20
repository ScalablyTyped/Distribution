package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows an application to launch the email application with a new message displayed. Use this to allow users to send email from your application. */
@JSGlobal("Windows.ApplicationModel.Email.EmailManager")
@js.native
abstract class EmailManager ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailManager
object EmailManager {
  
  /**
    * Gets an email store that is within the specified scope.
    * @param accessType The enumerator of scope.
    * @return The requested email store.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Email.EmailManager.requestStoreAsync")
  @js.native
  def requestStoreAsync(accessType: typings.winrtUwp.Windows.ApplicationModel.Email.EmailStoreAccessType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Email.EmailStore] = js.native
  
  /**
    * Launches the email application with a new message displayed.
    * @param message The email message that is displayed when the email application is launched.
    * @return An asynchronous action.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Email.EmailManager.showComposeNewEmailAsync")
  @js.native
  def showComposeNewEmailAsync(message: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessage): IPromiseWithIAsyncAction = js.native
}
