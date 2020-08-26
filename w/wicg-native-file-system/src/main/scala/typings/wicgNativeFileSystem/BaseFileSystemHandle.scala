package typings.wicgNativeFileSystem

import typings.std.PermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseFileSystemHandle extends js.Object {
  val isDirectory: Boolean = js.native
  val isFile: Boolean = js.native
  val name: String = js.native
  def isSameEntry(other: FileSystemHandle): js.Promise[Boolean] = js.native
  def queryPermission(): js.Promise[PermissionState] = js.native
  def queryPermission(descriptor: FileSystemHandlePermissionDescriptor): js.Promise[PermissionState] = js.native
  def requestPermission(): js.Promise[PermissionState] = js.native
  def requestPermission(descriptor: FileSystemHandlePermissionDescriptor): js.Promise[PermissionState] = js.native
}

