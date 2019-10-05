package typings.winrtDashUwp.Windows.ApplicationModel.DataTransfer

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Storage.IStorageFile
import typings.winrtDashUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables an app to share a file with another app by passing a token as part of a Uri activation. The target app redeems the token to get the file shared by the source app. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager")
@js.native
abstract class SharedStorageAccessManager () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.SharedStorageAccessManager")
@js.native
object SharedStorageAccessManager extends js.Object {
  /**
    * Gets the sharing token that enables an app to share the specified file with another app.
    * @param file The file to share with the target app.
    * @return The sharing token to provide to the target app as part of a Uri activation.
    */
  def addFile(file: IStorageFile): String = js.native
  /**
    * Gets a file shared by another app by providing the sharing token received from the source app.
    * @param token The sharing token for the shared file.
    * @return A wrapper object that contains the shared file.
    */
  def redeemTokenForFileAsync(token: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Revokes an existing sharing token.
    * @param token The sharing token to revoke.
    */
  def removeFile(token: String): Unit = js.native
}

