package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildArtifact extends StObject {
  
  /**
    * The artifact ID.
    */
  var id: Double
  
  /**
    * The name of the artifact.
    */
  var name: String
  
  /**
    * The actual resource.
    */
  var resource: ArtifactResource
}
object BuildArtifact {
  
  @scala.inline
  def apply(id: Double, name: String, resource: ArtifactResource): BuildArtifact = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifact]
  }
  
  @scala.inline
  implicit class BuildArtifactMutableBuilder[Self <: BuildArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: ArtifactResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
