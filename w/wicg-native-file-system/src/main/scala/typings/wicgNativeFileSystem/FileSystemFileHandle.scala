package typings.wicgNativeFileSystem

import typings.std.File
import typings.wicgNativeFileSystem.wicgNativeFileSystemBooleans.`false`
import typings.wicgNativeFileSystem.wicgNativeFileSystemBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemFileHandle
  extends BaseFileSystemHandle
     with FileSystemHandle {
  @JSName("isDirectory")
  val isDirectory_FileSystemFileHandle: `false` = js.native
  @JSName("isFile")
  val isFile_FileSystemFileHandle: `true` = js.native
  def createWritable(): js.Promise[FileSystemWritableFileStream] = js.native
  def createWritable(options: FileSystemCreateWritableOptions): js.Promise[FileSystemWritableFileStream] = js.native
  def getFile(): js.Promise[File] = js.native
  def isSameEntry(other: FileSystemDirectoryHandle): js.Promise[`false`] = js.native
}

