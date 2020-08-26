package typings.wicgNativeFileSystem

import typings.wicgNativeFileSystem.anon.ChooseFileSystemEntriesFi
import typings.wicgNativeFileSystem.anon.ChooseFileSystemEntriesFiAccepts
import typings.wicgNativeFileSystem.anon.ChooseFileSystemEntriesFiExcludeAcceptAllOption
import typings.wicgNativeFileSystem.anon.OpenFilePickerOptionsmult
import typings.wicgNativeFileSystem.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  def chooseFileSystemEntries(): js.Promise[FileSystemFileHandle] = js.native
  def chooseFileSystemEntries(options: ChooseFileSystemEntriesFi): js.Promise[FileSystemFileHandle] = js.native
  def chooseFileSystemEntries(options: ChooseFileSystemEntriesFiAccepts): js.Promise[js.Array[FileSystemFileHandle]] = js.native
  def chooseFileSystemEntries(options: ChooseFileSystemEntriesFiExcludeAcceptAllOption): js.Promise[FileSystemFileHandle] = js.native
  def chooseFileSystemEntries(options: Type): js.Promise[FileSystemDirectoryHandle] = js.native
  def getOriginPrivateDirectory(): js.Promise[FileSystemDirectoryHandle] = js.native
  def showDirectoryPicker(): js.Promise[FileSystemDirectoryHandle] = js.native
  def showDirectoryPicker(options: DirectoryPickerOptions): js.Promise[FileSystemDirectoryHandle] = js.native
  def showOpenFilePicker(): js.Promise[js.Array[FileSystemFileHandle]] = js.native
  def showOpenFilePicker(options: OpenFilePickerOptions): js.Promise[js.Array[FileSystemFileHandle]] = js.native
  def showOpenFilePicker(options: OpenFilePickerOptionsmult): js.Promise[js.Array[FileSystemFileHandle]] = js.native
  def showSaveFilePicker(): js.Promise[FileSystemFileHandle] = js.native
  def showSaveFilePicker(options: SaveFilePickerOptions): js.Promise[FileSystemFileHandle] = js.native
  @js.native
  object FileSystemDirectoryHandle extends js.Object {
    def getSystemDirectory(options: GetSystemDirectoryOptions): js.Promise[typings.wicgNativeFileSystem.FileSystemDirectoryHandle] = js.native
  }
  
}

