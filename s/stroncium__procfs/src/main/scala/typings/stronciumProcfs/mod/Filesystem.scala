package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filesystem extends StObject {
  
  var name: String
  
  var requiresBlockDevice: Boolean
}
object Filesystem {
  
  inline def apply(name: String, requiresBlockDevice: Boolean): Filesystem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], requiresBlockDevice = requiresBlockDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filesystem]
  }
  
  extension [Self <: Filesystem](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequiresBlockDevice(value: Boolean): Self = StObject.set(x, "requiresBlockDevice", value.asInstanceOf[js.Any])
  }
}
