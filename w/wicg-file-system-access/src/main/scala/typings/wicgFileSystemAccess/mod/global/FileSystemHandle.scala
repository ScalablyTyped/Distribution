package typings.wicgFileSystemAccess.mod.global

import typings.std.PermissionState
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.directory
import typings.wicgFileSystemAccess.wicgFileSystemAccessStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemHandle extends StObject {
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `kind` property in the new API.
    */
  val isDirectory: Boolean = js.native
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `kind` property in the new API.
    */
  val isFile: Boolean = js.native
  
  def isSameEntry(other: FileSystemHandle): js.Promise[Boolean] = js.native
  
  val kind: file | directory = js.native
  
  val name: String = js.native
  
  def queryPermission(): js.Promise[PermissionState] = js.native
  def queryPermission(descriptor: FileSystemHandlePermissionDescriptor): js.Promise[PermissionState] = js.native
  
  def requestPermission(): js.Promise[PermissionState] = js.native
  def requestPermission(descriptor: FileSystemHandlePermissionDescriptor): js.Promise[PermissionState] = js.native
}
