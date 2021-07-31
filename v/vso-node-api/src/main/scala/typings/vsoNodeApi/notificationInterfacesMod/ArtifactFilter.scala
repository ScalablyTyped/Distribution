package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactFilter
  extends StObject
     with BaseSubscriptionFilter {
  
  var artifactId: String
  
  var artifactType: String
  
  var artifactUri: String
}
object ArtifactFilter {
  
  @scala.inline
  def apply(artifactId: String, artifactType: String, artifactUri: String, eventType: String, `type`: String): ArtifactFilter = {
    val __obj = js.Dynamic.literal(artifactId = artifactId.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any], artifactUri = artifactUri.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactFilter]
  }
  
  @scala.inline
  implicit class ArtifactFilterMutableBuilder[Self <: ArtifactFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactType(value: String): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactUri(value: String): Self = StObject.set(x, "artifactUri", value.asInstanceOf[js.Any])
  }
}
