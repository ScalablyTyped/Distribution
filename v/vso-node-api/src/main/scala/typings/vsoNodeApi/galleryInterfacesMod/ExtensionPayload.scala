package typings.vsoNodeApi.galleryInterfacesMod

import typings.vsoNodeApi.anon.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionPayload extends StObject {
  
  var description: String
  
  var displayName: String
  
  var fileName: String
  
  var installationTargets: js.Array[InstallationTarget]
  
  var isSignedByMicrosoft: Boolean
  
  var isValid: Boolean
  
  var metadata: js.Array[KeyValue]
  
  var `type`: ExtensionDeploymentTechnology
}
object ExtensionPayload {
  
  inline def apply(
    description: String,
    displayName: String,
    fileName: String,
    installationTargets: js.Array[InstallationTarget],
    isSignedByMicrosoft: Boolean,
    isValid: Boolean,
    metadata: js.Array[KeyValue],
    `type`: ExtensionDeploymentTechnology
  ): ExtensionPayload = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], installationTargets = installationTargets.asInstanceOf[js.Any], isSignedByMicrosoft = isSignedByMicrosoft.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPayload]
  }
  
  extension [Self <: ExtensionPayload](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setInstallationTargets(value: js.Array[InstallationTarget]): Self = StObject.set(x, "installationTargets", value.asInstanceOf[js.Any])
    
    inline def setInstallationTargetsVarargs(value: InstallationTarget*): Self = StObject.set(x, "installationTargets", js.Array(value*))
    
    inline def setIsSignedByMicrosoft(value: Boolean): Self = StObject.set(x, "isSignedByMicrosoft", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: js.Array[KeyValue]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataVarargs(value: KeyValue*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setType(value: ExtensionDeploymentTechnology): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
