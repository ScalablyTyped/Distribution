package typings.wicgFileSystemAccess.mod.global

import typings.std.AsyncIterableIterator
import typings.wicgFileSystemAccess.mod.BaseFileSystemHandle
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.directory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("FileSystemDirectoryHandle")
@js.native
class FileSystemDirectoryHandle ()
  extends StObject
     with BaseFileSystemHandle {
  
  def entries(): AsyncIterableIterator[js.Tuple2[String, FileSystemHandle]] = js.native
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `.getDirectoryHandle()` in the new API.
    */
  def getDirectory(name: String): js.Promise[FileSystemDirectoryHandle] = js.native
  def getDirectory(name: String, options: FileSystemGetDirectoryOptions): js.Promise[FileSystemDirectoryHandle] = js.native
  
  def getDirectoryHandle(name: String): js.Promise[FileSystemDirectoryHandle] = js.native
  def getDirectoryHandle(name: String, options: FileSystemGetDirectoryOptions): js.Promise[FileSystemDirectoryHandle] = js.native
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `.getDirectoryHandle()` in the new API.
    */
  @JSName("getDirectory")
  var getDirectory_Original: js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[FileSystemGetDirectoryOptions], 
    js.Promise[FileSystemDirectoryHandle]
  ] = js.native
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `.keys()`, `.values()`, `.entries()`, or the directory itself as an async iterable in the new API.
    */
  def getEntries(): AsyncIterableIterator[FileSystemHandle] = js.native
  /**
    * @deprecated Old property just for Chromium <=85. Use `.keys()`, `.values()`, `.entries()`, or the directory itself as an async iterable in the new API.
    */
  @JSName("getEntries")
  var getEntries_Original: js.Function0[AsyncIterableIterator[FileSystemHandle]] = js.native
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `.getFileHandle()` in the new API.
    */
  def getFile(name: String): js.Promise[FileSystemFileHandle] = js.native
  def getFile(name: String, options: FileSystemGetFileOptions): js.Promise[FileSystemFileHandle] = js.native
  
  def getFileHandle(name: String): js.Promise[FileSystemFileHandle] = js.native
  def getFileHandle(name: String, options: FileSystemGetFileOptions): js.Promise[FileSystemFileHandle] = js.native
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `.getFileHandle()` in the new API.
    */
  @JSName("getFile")
  var getFile_Original: js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[FileSystemGetFileOptions], 
    js.Promise[FileSystemFileHandle]
  ] = js.native
  
  def keys(): AsyncIterableIterator[String] = js.native
  
  @JSName("kind")
  val kind_FileSystemDirectoryHandle: directory = js.native
  
  def removeEntry(name: String): js.Promise[Unit] = js.native
  def removeEntry(name: String, options: FileSystemRemoveOptions): js.Promise[Unit] = js.native
  
  def resolve(possibleDescendant: FileSystemHandle): js.Promise[js.Array[String] | Null] = js.native
  
  def values(): AsyncIterableIterator[FileSystemHandle] = js.native
}
object FileSystemDirectoryHandle {
  
  @JSGlobal("FileSystemDirectoryHandle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @deprecated Old method just for Chromium <=85. Use `navigator.storage.getDirectory()` in the new API.
    */
  /* static member */
  inline def getSystemDirectory(options: GetSystemDirectoryOptions): js.Promise[FileSystemDirectoryHandle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemDirectory")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileSystemDirectoryHandle]]
}
