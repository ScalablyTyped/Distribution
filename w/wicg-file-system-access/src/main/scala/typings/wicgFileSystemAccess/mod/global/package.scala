package typings.wicgFileSystemAccess.mod.global

import typings.std.Blob
import typings.std.BufferSource
import typings.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFi
import typings.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFiAccepts
import typings.wicgFileSystemAccess.anon.ChooseFileSystemEntriesFiExcludeAcceptAllOption
import typings.wicgFileSystemAccess.anon.OpenFilePickerOptionsmult
import typings.wicgFileSystemAccess.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * @deprecated Old method just for Chromium <=85. Use `showOpenFilePicker()` in the new API.
  */
inline def chooseFileSystemEntries(): js.Promise[FileSystemFileHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")().asInstanceOf[js.Promise[FileSystemFileHandle]]
inline def chooseFileSystemEntries(options: ChooseFileSystemEntriesFi): js.Promise[FileSystemFileHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileSystemFileHandle]]
/**
  * @deprecated Old method just for Chromium <=85. Use `showOpenFilePicker()` in the new API.
  */
inline def chooseFileSystemEntries(options: ChooseFileSystemEntriesFiAccepts): js.Promise[js.Array[FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileSystemFileHandle]]]
/**
  * @deprecated Old method just for Chromium <=85. Use `showSaveFilePicker()` in the new API.
  */
inline def chooseFileSystemEntries(options: ChooseFileSystemEntriesFiExcludeAcceptAllOption): js.Promise[FileSystemFileHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileSystemFileHandle]]
/**
  * @deprecated Old method just for Chromium <=85. Use `showDirectoryPicker()` in the new API.
  */
inline def chooseFileSystemEntries(options: Type): js.Promise[FileSystemDirectoryHandle] = js.Dynamic.global.applyDynamic("chooseFileSystemEntries")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileSystemDirectoryHandle]]

inline def showDirectoryPicker(): js.Promise[FileSystemDirectoryHandle] = js.Dynamic.global.applyDynamic("showDirectoryPicker")().asInstanceOf[js.Promise[FileSystemDirectoryHandle]]
inline def showDirectoryPicker(options: DirectoryPickerOptions): js.Promise[FileSystemDirectoryHandle] = js.Dynamic.global.applyDynamic("showDirectoryPicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileSystemDirectoryHandle]]

inline def showOpenFilePicker(): js.Promise[js.Array[FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("showOpenFilePicker")().asInstanceOf[js.Promise[js.Array[FileSystemFileHandle]]]
inline def showOpenFilePicker(options: OpenFilePickerOptionsmult): js.Promise[js.Array[FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("showOpenFilePicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileSystemFileHandle]]]
inline def showOpenFilePicker(options: OpenFilePickerOptions): js.Promise[js.Array[FileSystemFileHandle]] = js.Dynamic.global.applyDynamic("showOpenFilePicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileSystemFileHandle]]]

inline def showSaveFilePicker(): js.Promise[FileSystemFileHandle] = js.Dynamic.global.applyDynamic("showSaveFilePicker")().asInstanceOf[js.Promise[FileSystemFileHandle]]
inline def showSaveFilePicker(options: SaveFilePickerOptions): js.Promise[FileSystemFileHandle] = js.Dynamic.global.applyDynamic("showSaveFilePicker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileSystemFileHandle]]

type FileSystemWriteChunkType = BufferSource | Blob | String | WriteParams
