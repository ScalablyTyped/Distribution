package typings.vsoNodeApi.interfacesBuildInterfacesMod

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
  
  inline def apply(id: Double, name: String, resource: ArtifactResource): BuildArtifact = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildArtifact]
  }
  
  extension [Self <: BuildArtifact](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResource(value: ArtifactResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
