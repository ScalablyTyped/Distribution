package typings.yaDisk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disk extends StObject {
  
  var system_folders: SystemFolders
  
  var total_space: Double
  
  var trash_size: Double
  
  var used_space: Double
}
object Disk {
  
  inline def apply(system_folders: SystemFolders, total_space: Double, trash_size: Double, used_space: Double): Disk = {
    val __obj = js.Dynamic.literal(system_folders = system_folders.asInstanceOf[js.Any], total_space = total_space.asInstanceOf[js.Any], trash_size = trash_size.asInstanceOf[js.Any], used_space = used_space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disk] (val x: Self) extends AnyVal {
    
    inline def setSystem_folders(value: SystemFolders): Self = StObject.set(x, "system_folders", value.asInstanceOf[js.Any])
    
    inline def setTotal_space(value: Double): Self = StObject.set(x, "total_space", value.asInstanceOf[js.Any])
    
    inline def setTrash_size(value: Double): Self = StObject.set(x, "trash_size", value.asInstanceOf[js.Any])
    
    inline def setUsed_space(value: Double): Self = StObject.set(x, "used_space", value.asInstanceOf[js.Any])
  }
}
