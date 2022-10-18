package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactVersion extends StObject {
  
  var alias: String
  
  var defaultVersion: BuildVersion
  
  var errorMessage: String
  
  var sourceId: String
  
  var versions: js.Array[BuildVersion]
}
object ArtifactVersion {
  
  inline def apply(
    alias: String,
    defaultVersion: BuildVersion,
    errorMessage: String,
    sourceId: String,
    versions: js.Array[BuildVersion]
  ): ArtifactVersion = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], defaultVersion = defaultVersion.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactVersion]
  }
  
  extension [Self <: ArtifactVersion](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersion(value: BuildVersion): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: js.Array[BuildVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsVarargs(value: BuildVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
