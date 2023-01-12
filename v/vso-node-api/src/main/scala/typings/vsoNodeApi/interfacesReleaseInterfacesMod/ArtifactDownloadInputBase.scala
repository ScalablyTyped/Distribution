package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactDownloadInputBase extends StObject {
  
  var alias: String
  
  var artifactDownloadMode: String
  
  var artifactType: String
}
object ArtifactDownloadInputBase {
  
  inline def apply(alias: String, artifactDownloadMode: String, artifactType: String): ArtifactDownloadInputBase = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactDownloadMode = artifactDownloadMode.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDownloadInputBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactDownloadInputBase] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setArtifactDownloadMode(value: String): Self = StObject.set(x, "artifactDownloadMode", value.asInstanceOf[js.Any])
    
    inline def setArtifactType(value: String): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
  }
}
