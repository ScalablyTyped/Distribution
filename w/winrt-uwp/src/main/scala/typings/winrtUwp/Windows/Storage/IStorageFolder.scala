package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manipulates folders and their contents, and provides information about them. */
@js.native
trait IStorageFolder
  extends StObject
     with IStorageItem {
  
  /**
    * Creates a new file in the current folder.
    * @param desiredName The desired name of the file to create.
    * @return When this method completes, it returns the new file as a StorageFile .
    */
  def createFileAsync(desiredName: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
  /**
    * Creates a new file in the current folder, and specifies what to do if a file with the same name already exists in the current folder.
    * @param desiredName The desired name of the file to create.
    * @param options The enum value that determines how Windows responds if the desiredName is the same as the name of an existing file in the current folder.
    * @return When this method completes, it returns the new file as a StorageFile .
    */
  def createFileAsync(desiredName: String, options: CreationCollisionOption): IPromiseWithIAsyncOperation[StorageFile] = js.native
  
  /**
    * Creates a new folder in the current folder.
    * @param desiredName The desired name of the folder to create.
    * @return When this method completes, it returns the new folder as a StorageFolder .
    */
  def createFolderAsync(desiredName: String): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Creates a new folder in the current folder, and specifies what to do if a folder with the same name already exists in the current folder.
    * @param desiredName The desired name of the folder to create.
    * @param options The enum value that determines how Windows responds if the desiredName is the same as the name of an existing folder in the current folder.
    * @return When this method completes, it returns the new folder as a StorageFolder .
    */
  def createFolderAsync(desiredName: String, options: CreationCollisionOption): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  
  /**
    * Gets the specified file from the current folder.
    * @param name The name (or path relative to the current folder) of the file to retrieve.
    * @return When this method completes successfully, it returns a StorageFile that represents the file.
    */
  def getFileAsync(name: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
  
  /**
    * Gets the files from the current folder.
    * @return When this method completes successfully, it returns a list of the files (type IVectorView ) in the folder. Each file in the list is represented by a StorageFile object.
    */
  def getFilesAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  
  /**
    * Gets the specified folder from the current folder.
    * @param name The name of the child folder to retrieve.
    * @return When this method completes successfully, it returns a StorageFolder that represents the child folder.
    */
  def getFolderAsync(name: String): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  
  /**
    * Gets the folders in the current folder.
    * @return When this method completes successfully, it returns a list of the files (type IVectorView ). Each folder in the list is represented by a StorageFolder .
    */
  def getFoldersAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  
  /**
    * Gets the specified item from the IStorageFolder .
    * @param name The name of the item to retrieve.
    * @return When this method completes successfully, it returns the file or folder (type IStorageItem ).
    */
  def getItemAsync(name: String): IPromiseWithIAsyncOperation[IStorageItem] = js.native
  
  /**
    * Gets the items from the current folder.
    * @return When this method completes successfully, it returns a list of the files and folders (type IVectorView ). The files and folders in the list are represented by objects of type IStorageItem .
    */
  def getItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  
  /**
    * Try to get a single file or sub-folder from the current folder by using the name of the item.
    * @param name The name (or path relative to the current folder) of the file or sub-folder to try to retrieve.
    * @return When this method completes successfully, it returns the file or folder (type IStorageItem ).
    */
  def tryGetItemAsync(name: String): IPromiseWithIAsyncOperation[IStorageItem] = js.native
}
