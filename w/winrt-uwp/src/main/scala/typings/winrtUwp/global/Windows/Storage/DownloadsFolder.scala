package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates files and folders inside the Downloads folder. */
@JSGlobal("Windows.Storage.DownloadsFolder")
@js.native
abstract class DownloadsFolder ()
  extends StObject
     with typings.winrtUwp.Windows.Storage.DownloadsFolder
object DownloadsFolder {
  
  @JSGlobal("Windows.Storage.DownloadsFolder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new file inside the Downloads folder.
    * @param desiredName The desired name of the file to create.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  /* static member */
  inline def createFileAsync(desiredName: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileAsync")(desiredName.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFile]]
  /**
    * Creates a new file in the Downloads folder, and specifies what to do if a file with the same name already exists in the Downloads folder.
    * @param desiredName The desired name of the file to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing file in the current folder.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  /* static member */
  inline def createFileAsync(desiredName: String, option: typings.winrtUwp.Windows.Storage.CreationCollisionOption): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileAsync")(desiredName.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFile]]
  
  /**
    * Creates a new file inside the Downloads folder of a specific User .
    * @param user The User for which the file is created.
    * @param desiredName The desired name of the file to create.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  /* static member */
  inline def createFileForUserAsync(user: User, desiredName: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileForUserAsync")(user.asInstanceOf[js.Any], desiredName.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFile]]
  /**
    * Creates a new file in the Downloads folder of a specific User , and specifies what to do if a file with the same name already exists in the Downloads folder.
    * @param user The User for which the file is created.
    * @param desiredName The desired name of the file to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing file in the current folder.
    * @return When this method completes, it returns the new file as a StorageFile object.
    */
  /* static member */
  inline def createFileForUserAsync(user: User, desiredName: String, option: typings.winrtUwp.Windows.Storage.CreationCollisionOption): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFileForUserAsync")(user.asInstanceOf[js.Any], desiredName.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFile]]
  
  /**
    * Creates a new subfolder in the Downloads folder.
    * @param desiredName The desired name of the subfolder to create.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  /* static member */
  inline def createFolderAsync(desiredName: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFolderAsync")(desiredName.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder]]
  /**
    * Creates a new subfolder in the Downloads folder, and specifies what to do if a subfolder with the same name already exists in the Downloads folder.
    * @param desiredName The desired name of the subfolder to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing subfolder in the Downloads folder.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  /* static member */
  inline def createFolderAsync(desiredName: String, option: typings.winrtUwp.Windows.Storage.CreationCollisionOption): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFolderAsync")(desiredName.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder]]
  
  /**
    * Creates a new subfolder inside the Downloads folder of a specific User .
    * @param user The User for which the folder is created.
    * @param desiredName The desired name of the subfolder to create.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  /* static member */
  inline def createFolderForUserAsync(user: User, desiredName: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFolderForUserAsync")(user.asInstanceOf[js.Any], desiredName.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder]]
  /**
    * Creates a new subfolder in the Downloads folder of a specific User , and specifies what to do if a subfolder with the same name already exists in the Downloads folder.
    * @param user The User for which the folder is created.
    * @param desiredName The desired name of the subfolder to create.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing subfolder in the Downloads folder.
    * @return When this method completes, it returns the new subfolder as a StorageFolder .
    */
  /* static member */
  inline def createFolderForUserAsync(user: User, desiredName: String, option: typings.winrtUwp.Windows.Storage.CreationCollisionOption): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFolderForUserAsync")(user.asInstanceOf[js.Any], desiredName.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Storage.StorageFolder]]
}
