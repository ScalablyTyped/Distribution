package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JenkinsArtifactDownloadInput
  extends StObject
     with ArtifactDownloadInputBase {
  
  var artifactItems: js.Array[String]
}
object JenkinsArtifactDownloadInput {
  
  @scala.inline
  def apply(alias: String, artifactDownloadMode: String, artifactItems: js.Array[String], artifactType: String): JenkinsArtifactDownloadInput = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactDownloadMode = artifactDownloadMode.asInstanceOf[js.Any], artifactItems = artifactItems.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsArtifactDownloadInput]
  }
  
  @scala.inline
  implicit class JenkinsArtifactDownloadInputMutableBuilder[Self <: JenkinsArtifactDownloadInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactItems(value: js.Array[String]): Self = StObject.set(x, "artifactItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactItemsVarargs(value: String*): Self = StObject.set(x, "artifactItems", js.Array(value :_*))
  }
}
