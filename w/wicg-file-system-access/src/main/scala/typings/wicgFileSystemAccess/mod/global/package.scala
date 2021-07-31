package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * @deprecated Old method just for Chromium <=85. Use `showOpenFilePicker()` in the new API.
  */
@scala.inline
def chooseFileSystemEntries(): js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")().asInstanceOf[js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]
@scala.inline
def chooseFileSystemEntries(options: typings.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFi): js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]
/**
  * @deprecated Old method just for Chromium <=85. Use `showOpenFilePicker()` in the new API.
  */
@scala.inline
def chooseFileSystemEntries(options: typings.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFiAccepts): js.Promise[js.Array[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]]
/**
  * @deprecated Old method just for Chromium <=85. Use `showSaveFilePicker()` in the new API.
  */
@scala.inline
def chooseFileSystemEntries(options: typings.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFiExcludeAcceptAllOption): js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]
/**
  * @deprecated Old method just for Chromium <=85. Use `showDirectoryPicker()` in the new API.
  */
@scala.inline
def chooseFileSystemEntries(options: typings.wicgFileSystemAccess.anon.Type): js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle]]

@scala.inline
def showDirectoryPicker(): js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle] = js.Dynamic.global.applyDynamic("showDirectoryPicker")().asInstanceOf[js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle]]
@scala.inline
def showDirectoryPicker(options: typings.wicgFileSystemAccess.mod.global.DirectoryPickerOptions): js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle] = js.Dynamic.global.applyDynamic("showDirectoryPicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemDirectoryHandle]]

@scala.inline
def showOpenFilePicker(): js.Promise[js.Array[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("showOpenFilePicker")().asInstanceOf[js.Promise[js.Array[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]]
@scala.inline
def showOpenFilePicker(options: typings.wicgFileSystemAccess.anon.OpenFilePickerOptionsmult): js.Promise[js.Array[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("showOpenFilePicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]]
@scala.inline
def showOpenFilePicker(options: typings.wicgFileSystemAccess.mod.global.OpenFilePickerOptions): js.Promise[js.Array[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("showOpenFilePicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]]

@scala.inline
def showSaveFilePicker(): js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle] = js.Dynamic.global.applyDynamic("showSaveFilePicker")().asInstanceOf[js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]
@scala.inline
def showSaveFilePicker(options: typings.wicgFileSystemAccess.mod.global.SaveFilePickerOptions): js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle] = js.Dynamic.global.applyDynamic("showSaveFilePicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.wicgFileSystemAccess.mod.global.FileSystemFileHandle]]

type FileSystemWriteChunkType = typings.std.BufferSource | typings.std.Blob | java.lang.String | typings.wicgFileSystemAccess.mod.global.WriteParams

// tslint:disable-next-line:no-empty-interface
type SaveFilePickerOptions = typings.wicgFileSystemAccess.mod.global.FilePickerOptions
