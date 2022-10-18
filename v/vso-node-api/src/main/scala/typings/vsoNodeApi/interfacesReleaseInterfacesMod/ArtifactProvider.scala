package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactProvider extends StObject {
  
  var id: Double
  
  var name: String
  
  var sourceUri: String
  
  var version: String
}
object ArtifactProvider {
  
  inline def apply(id: Double, name: String, sourceUri: String, version: String): ArtifactProvider = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceUri = sourceUri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactProvider]
  }
  
  extension [Self <: ArtifactProvider](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
