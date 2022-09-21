package typings.trezorConnect.eventsMod

import typings.trezorConnect.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeInfo extends StObject {
  
  var changelog: String
  
  var directory: String
  
  var packages: js.Array[Name]
  
  var version: js.Array[Double]
}
object BridgeInfo {
  
  inline def apply(changelog: String, directory: String, packages: js.Array[Name], version: js.Array[Double]): BridgeInfo = {
    val __obj = js.Dynamic.literal(changelog = changelog.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeInfo]
  }
  
  extension [Self <: BridgeInfo](x: Self) {
    
    inline def setChangelog(value: String): Self = StObject.set(x, "changelog", value.asInstanceOf[js.Any])
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setPackages(value: js.Array[Name]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesVarargs(value: Name*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setVersion(value: js.Array[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionVarargs(value: Double*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
