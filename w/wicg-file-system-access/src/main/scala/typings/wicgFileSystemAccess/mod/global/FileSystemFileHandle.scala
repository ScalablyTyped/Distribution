package typings.wicgFileSystemAccess.mod.global

import typings.std.File
import typings.std.FileSystemWritableFileStream
import typings.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`false`
import typings.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`true`
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// class FileSystemWritableFileStream extends WritableStream {
//     write(data: FileSystemWriteChunkType): Promise<void>;
//     seek(position: number): Promise<void>;
//     truncate(size: number): Promise<void>;
// }
@js.native
trait FileSystemFileHandle
  extends StObject
     with FileSystemHandle
     with FileSystemHandleUnion {
  
  def createWritable(): js.Promise[FileSystemWritableFileStream] = js.native
  def createWritable(options: FileSystemCreateWritableOptions): js.Promise[FileSystemWritableFileStream] = js.native
  
  def getFile(): js.Promise[File] = js.native
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `kind` property in the new API.
    */
  @JSName("isDirectory")
  val isDirectory_FileSystemFileHandle: `false` = js.native
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `kind` property in the new API.
    */
  @JSName("isFile")
  val isFile_FileSystemFileHandle: `true` = js.native
  
  @JSName("kind")
  val kind_FileSystemFileHandle: file = js.native
}
