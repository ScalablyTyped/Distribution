package typings.wicgFileSystemAccess.mod.global

import typings.std.File
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped wicg-file-system-access.wicg-file-system-access.<global>.FileSystemFileHandle | wicg-file-system-access.wicg-file-system-access.<global>.FileSystemDirectoryHandle */ @JSGlobal("FileSystemFileHandle")
@js.native
class FileSystemFileHandle () extends FileSystemHandle {
  
  def createWritable(): js.Promise[FileSystemWritableFileStream] = js.native
  def createWritable(options: FileSystemCreateWritableOptions): js.Promise[FileSystemWritableFileStream] = js.native
  
  def getFile(): js.Promise[File] = js.native
  
  val kind: file = js.native
}
