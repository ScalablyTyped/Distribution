package typings.wicgFileSystemAccess.mod

import typings.std.PermissionState
import typings.wicgFileSystemAccess.mod.global.FileSystemHandle
import typings.wicgFileSystemAccess.mod.global.FileSystemHandleKind
import typings.wicgFileSystemAccess.mod.global.FileSystemHandlePermissionDescriptor
import typings.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`false`
import typings.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseFileSystemHandle extends StObject {
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `kind` property in the new API.
    */
  val isDirectory: `false` | `true` = js.native
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `kind` property in the new API.
    */
  val isFile: `false` | `true` = js.native
  
  def isSameEntry(other: FileSystemHandle): js.Promise[Boolean] = js.native
  
  val kind: FileSystemHandleKind = js.native
  
  val name: String = js.native
  
  def queryPermission(): js.Promise[PermissionState] = js.native
  def queryPermission(descriptor: FileSystemHandlePermissionDescriptor): js.Promise[PermissionState] = js.native
  
  def requestPermission(): js.Promise[PermissionState] = js.native
  def requestPermission(descriptor: FileSystemHandlePermissionDescriptor): js.Promise[PermissionState] = js.native
}
