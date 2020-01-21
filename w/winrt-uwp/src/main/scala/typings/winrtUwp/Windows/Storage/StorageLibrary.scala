package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IObservableVector
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.System.User
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.definitionchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets you add and remove folders from a library like Music or Videos and lets you get a list of folders included in the library. */
@JSGlobal("Windows.Storage.StorageLibrary")
@js.native
abstract class StorageLibrary () extends js.Object {
  /** Gets the folders in the current library. */
  var folders: IObservableVector[StorageFolder] = js.native
  /** Occurs when the list of folders in the current library changes. */
  @JSName("ondefinitionchanged")
  var ondefinitionchanged_Original: TypedEventHandler[StorageLibrary, _] = js.native
  /** Get the default save folder for the current library. */
  var saveFolder: StorageFolder = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_definitionchanged(`type`: definitionchanged, listener: TypedEventHandler[StorageLibrary, _]): Unit = js.native
  /** Occurs when the list of folders in the current library changes. */
  def ondefinitionchanged(ev: js.Any with WinRTEvent[StorageLibrary]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_definitionchanged(`type`: definitionchanged, listener: TypedEventHandler[StorageLibrary, _]): Unit = js.native
  /**
    * Prompts the user to select a folder, and then adds the folder to the library.
    * @return When this method completes, it returns the folder that the user picked and added as a StorageFolder . If the user cancels the operation and doesn't pick a folder, the method returns null.
    */
  def requestAddFolderAsync(): IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Prompts the user to confirm removal of the specified folder from the current library, and then removes the folder.
    * @param folder The folder to remove.
    * @return Returns true if the folder was removed; otherwise false.
    */
  def requestRemoveFolderAsync(folder: StorageFolder): IPromiseWithIAsyncOperation[Boolean] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.StorageLibrary")
@js.native
object StorageLibrary extends js.Object {
  /**
    * Gets the specified library.
    * @param libraryId A KnownLibraryId value that identifies the library to retrieve, like Music or Videos.
    * @return When this method completes successfully, it returns the library (type StorageLibrary ).
    */
  def getLibraryAsync(libraryId: KnownLibraryId): IPromiseWithIAsyncOperation[StorageLibrary] = js.native
  /**
    * Gets the specified library for a User .
    * @param user The User for which the library is retrieved.
    * @param libraryId A KnownLibraryId value that identifies the library to retrieve, like Music or Videos.
    * @return When this method completes successfully, it returns the library (type StorageLibrary ).
    */
  def getLibraryForUserAsync(user: User, libraryId: KnownLibraryId): IPromiseWithIAsyncOperation[StorageLibrary] = js.native
}

