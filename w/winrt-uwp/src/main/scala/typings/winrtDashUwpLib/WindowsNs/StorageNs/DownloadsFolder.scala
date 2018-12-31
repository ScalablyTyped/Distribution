package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates files and folders inside the Downloads folder. */
@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
abstract class DownloadsFolder () extends js.Object

/** Creates files and folders inside the Downloads folder. */
@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
object DownloadsFolder extends js.Object {
  /**
    * Creates a new file inside the Downloads folder.
    * @param desiredName The desired name of the file to create.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  def createFileAsync(desiredName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Creates a new file in the Downloads folder, and specifies what to do if a file with the same name already exists in the Downloads folder.
    * @param desiredName The desired name of the file to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing file in the current folder.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  def createFileAsync(desiredName: java.lang.String, option: winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Creates a new file inside the Downloads folder of a specific User .
    * @param user The User for which the file is created.
    * @param desiredName The desired name of the file to create.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  def createFileForUserAsync(user: winrtDashUwpLib.WindowsNs.SystemNs.User, desiredName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Creates a new file in the Downloads folder of a specific User , and specifies what to do if a file with the same name already exists in the Downloads folder.
    * @param user The User for which the file is created.
    * @param desiredName The desired name of the file to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing file in the current folder.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  def createFileForUserAsync(
    user: winrtDashUwpLib.WindowsNs.SystemNs.User,
    desiredName: java.lang.String,
    option: winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Creates a new subfolder in the Downloads folder.
    * @param desiredName The desired name of the subfolder to create.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  def createFolderAsync(desiredName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
  /**
    * Creates a new subfolder in the Downloads folder, and specifies what to do if a subfolder with the same name already exists in the Downloads folder.
    * @param desiredName The desired name of the subfolder to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing subfolder in the Downloads folder.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  def createFolderAsync(desiredName: java.lang.String, option: winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
  /**
    * Creates a new subfolder inside the Downloads folder of a specific User .
    * @param user The User for which the folder is created.
    * @param desiredName The desired name of the subfolder to create.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  def createFolderForUserAsync(user: winrtDashUwpLib.WindowsNs.SystemNs.User, desiredName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
  /**
    * Creates a new subfolder in the Downloads folder of a specific User , and specifies what to do if a subfolder with the same name already exists in the Downloads folder.
    * @param user The User for which the folder is created.
    * @param desiredName The desired name of the subfolder to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing subfolder in the Downloads folder.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  def createFolderForUserAsync(
    user: winrtDashUwpLib.WindowsNs.SystemNs.User,
    desiredName: java.lang.String,
    option: winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
}

