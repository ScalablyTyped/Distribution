package typings.vscode.mod

import typings.std.Uint8Array
import typings.vscode.Thenable
import typings.vscode.anon.Create
import typings.vscode.anon.Excludes
import typings.vscode.anon.Overwrite
import typings.vscode.anon.Recursive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemProvider extends StObject {
  
  /**
    * Copy files or folders. Implementing this function is optional but it will speedup
    * the copy operation.
    *
    * @param source The existing file.
    * @param destination The destination location.
    * @param options Defines if existing files should be overwritten.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when `source` doesn't exist.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when parent of `destination` doesn't exist, e.g. no mkdirp-logic required.
    * @throws [`FileExists`](#FileSystemError.FileExists) when `destination` exists and when the `overwrite` option is not `true`.
    * @throws [`NoPermissions`](#FileSystemError.NoPermissions) when permissions aren't sufficient.
    */
  var copy: js.UndefOr[
    js.Function3[
      /* source */ Uri, 
      /* destination */ Uri, 
      /* options */ Overwrite, 
      Unit | Thenable[Unit]
    ]
  ] = js.native
  
  /**
    * Create a new directory (Note, that new files are created via `write`-calls).
    *
    * @param uri The uri of the new folder.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when the parent of `uri` doesn't exist, e.g. no mkdirp-logic required.
    * @throws [`FileExists`](#FileSystemError.FileExists) when `uri` already exists.
    * @throws [`NoPermissions`](#FileSystemError.NoPermissions) when permissions aren't sufficient.
    */
  def createDirectory(uri: Uri): Unit | Thenable[Unit] = js.native
  
  /**
    * Delete a file.
    *
    * @param uri The resource that is to be deleted.
    * @param options Defines if deletion of folders is recursive.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when `uri` doesn't exist.
    * @throws [`NoPermissions`](#FileSystemError.NoPermissions) when permissions aren't sufficient.
    */
  def delete(uri: Uri, options: Recursive): Unit | Thenable[Unit] = js.native
  
  /**
    * An event to signal that a resource has been created, changed, or deleted. This
    * event should fire for resources that are being [watched](#FileSystemProvider.watch)
    * by clients of this provider.
    *
    * *Note:* It is important that the metadata of the file that changed provides an
    * updated `mtime` that advanced from the previous value in the [stat](#FileStat) and a
    * correct `size` value. Otherwise there may be optimizations in place that will not show
    * the change in an editor for example.
    */
  def onDidChangeFile(listener: js.Function1[/* e */ js.Array[FileChangeEvent], _]): Disposable = js.native
  def onDidChangeFile(
    listener: js.Function1[/* e */ js.Array[FileChangeEvent], _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeFile(listener: js.Function1[/* e */ js.Array[FileChangeEvent], _], thisArgs: js.Any): Disposable = js.native
  def onDidChangeFile(
    listener: js.Function1[/* e */ js.Array[FileChangeEvent], _],
    thisArgs: js.Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
    * Retrieve all entries of a [directory](#FileType.Directory).
    *
    * @param uri The uri of the folder.
    * @return An array of name/type-tuples or a thenable that resolves to such.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when `uri` doesn't exist.
    */
  def readDirectory(uri: Uri): (js.Array[js.Tuple2[String, FileType]]) | (Thenable[js.Array[js.Tuple2[String, FileType]]]) = js.native
  
  /**
    * Read the entire contents of a file.
    *
    * @param uri The uri of the file.
    * @return An array of bytes or a thenable that resolves to such.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when `uri` doesn't exist.
    */
  def readFile(uri: Uri): Uint8Array | Thenable[Uint8Array] = js.native
  
  /**
    * Rename a file or folder.
    *
    * @param oldUri The existing file.
    * @param newUri The new location.
    * @param options Defines if existing files should be overwritten.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when `oldUri` doesn't exist.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when parent of `newUri` doesn't exist, e.g. no mkdirp-logic required.
    * @throws [`FileExists`](#FileSystemError.FileExists) when `newUri` exists and when the `overwrite` option is not `true`.
    * @throws [`NoPermissions`](#FileSystemError.NoPermissions) when permissions aren't sufficient.
    */
  def rename(oldUri: Uri, newUri: Uri, options: Overwrite): Unit | Thenable[Unit] = js.native
  
  /**
    * Retrieve metadata about a file.
    *
    * Note that the metadata for symbolic links should be the metadata of the file they refer to.
    * Still, the [SymbolicLink](#FileType.SymbolicLink)-type must be used in addition to the actual type, e.g.
    * `FileType.SymbolicLink | FileType.Directory`.
    *
    * @param uri The uri of the file to retrieve metadata about.
    * @return The file metadata about the file.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when `uri` doesn't exist.
    */
  def stat(uri: Uri): FileStat | Thenable[FileStat] = js.native
  
  /**
    * Subscribe to events in the file or folder denoted by `uri`.
    *
    * The editor will call this function for files and folders. In the latter case, the
    * options differ from defaults, e.g. what files/folders to exclude from watching
    * and if subfolders, sub-subfolder, etc. should be watched (`recursive`).
    *
    * @param uri The uri of the file to be watched.
    * @param options Configures the watch.
    * @returns A disposable that tells the provider to stop watching the `uri`.
    */
  def watch(uri: Uri, options: Excludes): Disposable = js.native
  
  /**
    * Write data to a file, replacing its entire contents.
    *
    * @param uri The uri of the file.
    * @param content The new content of the file.
    * @param options Defines if missing files should or must be created.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when `uri` doesn't exist and `create` is not set.
    * @throws [`FileNotFound`](#FileSystemError.FileNotFound) when the parent of `uri` doesn't exist and `create` is set, e.g. no mkdirp-logic required.
    * @throws [`FileExists`](#FileSystemError.FileExists) when `uri` already exists, `create` is set but `overwrite` is not set.
    * @throws [`NoPermissions`](#FileSystemError.NoPermissions) when permissions aren't sufficient.
    */
  def writeFile(uri: Uri, content: Uint8Array, options: Create): Unit | Thenable[Unit] = js.native
}
