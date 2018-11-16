package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets you add and remove folders from a library like Music or Videos and lets you get a list of folders included in the library. */
@JSGlobal("Windows.Storage.StorageLibrary")
@js.native
abstract class StorageLibrary () extends js.Object {
  /** Gets the folders in the current library. */
  var folders: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IObservableVector[StorageFolder] = js.native
  /** Occurs when the list of folders in the current library changes. */
  @JSName("ondefinitionchanged")
  var ondefinitionchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[StorageLibrary, _] = js.native
  /** Get the default save folder for the current library. */
  var saveFolder: StorageFolder = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_definitionchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.definitionchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[StorageLibrary, _]
  ): scala.Unit = js.native
  /** Occurs when the list of folders in the current library changes. */
  def ondefinitionchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[StorageLibrary]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_definitionchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.definitionchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[StorageLibrary, _]
  ): scala.Unit = js.native
  /**
               * Prompts the user to select a folder, and then adds the folder to the library.
               * @return When this method completes, it returns the folder that the user picked and added as a StorageFolder . If the user cancels the operation and doesn't pick a folder, the method returns null.
               */
  def requestAddFolderAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
               * Prompts the user to confirm removal of the specified folder from the current library, and then removes the folder.
               * @param folder The folder to remove.
               * @return Returns true if the folder was removed; otherwise false.
               */
  def requestRemoveFolderAsync(folder: StorageFolder): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

/** Lets you add and remove folders from a library like Music or Videos and lets you get a list of folders included in the library. */
@JSGlobal("Windows.Storage.StorageLibrary")
@js.native
object StorageLibrary extends js.Object {
  /**
               * Gets the specified library.
               * @param libraryId A KnownLibraryId value that identifies the library to retrieve, like Music or Videos.
               * @return When this method completes successfully, it returns the library (type StorageLibrary ).
               */
  def getLibraryAsync(libraryId: winrtDashUwpLib.WindowsNs.StorageNs.KnownLibraryId): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageLibrary] = js.native
  /**
               * Gets the specified library for a User .
               * @param user The User for which the library is retrieved.
               * @param libraryId A KnownLibraryId value that identifies the library to retrieve, like Music or Videos.
               * @return When this method completes successfully, it returns the library (type StorageLibrary ).
               */
  def getLibraryForUserAsync(
    user: winrtDashUwpLib.WindowsNs.SystemNs.User,
    libraryId: winrtDashUwpLib.WindowsNs.StorageNs.KnownLibraryId
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageLibrary] = js.native
}

