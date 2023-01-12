package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkArtifactLink extends StObject {
  
  /**
    * Target artifact type.
    */
  var artifactType: String
  
  /**
    * Outbound link type.
    */
  var linkType: String
  
  /**
    * Target tool type.
    */
  var toolType: String
}
object WorkArtifactLink {
  
  inline def apply(artifactType: String, linkType: String, toolType: String): WorkArtifactLink = {
    val __obj = js.Dynamic.literal(artifactType = artifactType.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], toolType = toolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkArtifactLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkArtifactLink] (val x: Self) extends AnyVal {
    
    inline def setArtifactType(value: String): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
    
    inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    inline def setToolType(value: String): Self = StObject.set(x, "toolType", value.asInstanceOf[js.Any])
  }
}
