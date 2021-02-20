package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactDownloadInputBase extends StObject {
  
  var alias: String = js.native
  
  var artifactDownloadMode: String = js.native
  
  var artifactType: String = js.native
}
object ArtifactDownloadInputBase {
  
  @scala.inline
  def apply(alias: String, artifactDownloadMode: String, artifactType: String): ArtifactDownloadInputBase = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactDownloadMode = artifactDownloadMode.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactDownloadInputBase]
  }
  
  @scala.inline
  implicit class ArtifactDownloadInputBaseMutableBuilder[Self <: ArtifactDownloadInputBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactDownloadMode(value: String): Self = StObject.set(x, "artifactDownloadMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactType(value: String): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
  }
}
