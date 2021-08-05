package typings.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemHandlePermissionDescriptor extends StObject {
  
  var mode: js.UndefOr[FileSystemPermissionMode] = js.undefined
  
  /**
    * @deprecated Old property just for Chromium <=85. Use `mode: ...` in the new API.
    */
  var writable: js.UndefOr[Boolean] = js.undefined
}
object FileSystemHandlePermissionDescriptor {
  
  inline def apply(): FileSystemHandlePermissionDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemHandlePermissionDescriptor]
  }
  
  extension [Self <: FileSystemHandlePermissionDescriptor](x: Self) {
    
    inline def setMode(value: FileSystemPermissionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
