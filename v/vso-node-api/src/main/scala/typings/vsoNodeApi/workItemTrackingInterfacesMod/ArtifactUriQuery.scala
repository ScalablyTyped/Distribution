package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactUriQuery extends StObject {
  
  /**
    * List of artifact URIs to use for querying work items.
    */
  var artifactUris: js.Array[String]
}
object ArtifactUriQuery {
  
  @scala.inline
  def apply(artifactUris: js.Array[String]): ArtifactUriQuery = {
    val __obj = js.Dynamic.literal(artifactUris = artifactUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactUriQuery]
  }
  
  @scala.inline
  implicit class ArtifactUriQueryMutableBuilder[Self <: ArtifactUriQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactUris(value: js.Array[String]): Self = StObject.set(x, "artifactUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactUrisVarargs(value: String*): Self = StObject.set(x, "artifactUris", js.Array(value :_*))
  }
}
