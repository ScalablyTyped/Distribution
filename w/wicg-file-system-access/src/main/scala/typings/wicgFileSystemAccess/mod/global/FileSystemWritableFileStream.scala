package typings.wicgFileSystemAccess.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("FileSystemWritableFileStream")
@js.native
class FileSystemWritableFileStream () extends WritableStream {
  
  def seek(position: Double): js.Promise[Unit] = js.native
  
  def truncate(size: Double): js.Promise[Unit] = js.native
  
  def write(data: FileSystemWriteChunkType): js.Promise[Unit] = js.native
}
