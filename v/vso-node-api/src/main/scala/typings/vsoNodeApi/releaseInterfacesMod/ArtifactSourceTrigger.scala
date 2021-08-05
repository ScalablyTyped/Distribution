package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactSourceTrigger
  extends StObject
     with ReleaseTriggerBase {
  
  /**
    * Artifact source alias for Artifact Source trigger type
    */
  var artifactAlias: String
  
  var triggerConditions: js.Array[ArtifactFilter]
}
object ArtifactSourceTrigger {
  
  inline def apply(
    artifactAlias: String,
    triggerConditions: js.Array[ArtifactFilter],
    triggerType: ReleaseTriggerType
  ): ArtifactSourceTrigger = {
    val __obj = js.Dynamic.literal(artifactAlias = artifactAlias.asInstanceOf[js.Any], triggerConditions = triggerConditions.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceTrigger]
  }
  
  extension [Self <: ArtifactSourceTrigger](x: Self) {
    
    inline def setArtifactAlias(value: String): Self = StObject.set(x, "artifactAlias", value.asInstanceOf[js.Any])
    
    inline def setTriggerConditions(value: js.Array[ArtifactFilter]): Self = StObject.set(x, "triggerConditions", value.asInstanceOf[js.Any])
    
    inline def setTriggerConditionsVarargs(value: ArtifactFilter*): Self = StObject.set(x, "triggerConditions", js.Array(value :_*))
  }
}
