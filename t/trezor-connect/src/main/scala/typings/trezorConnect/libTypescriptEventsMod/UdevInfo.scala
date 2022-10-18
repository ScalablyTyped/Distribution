package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UdevInfo extends StObject {
  
  var directory: String
  
  var packages: js.Array[Name]
}
object UdevInfo {
  
  inline def apply(directory: String, packages: js.Array[Name]): UdevInfo = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[UdevInfo]
  }
  
  extension [Self <: UdevInfo](x: Self) {
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setPackages(value: js.Array[Name]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesVarargs(value: Name*): Self = StObject.set(x, "packages", js.Array(value*))
  }
}
