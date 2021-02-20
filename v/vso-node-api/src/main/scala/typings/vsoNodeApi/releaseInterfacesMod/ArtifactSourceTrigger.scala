package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactSourceTrigger extends ReleaseTriggerBase {
  
  /**
    * Artifact source alias for Artifact Source trigger type
    */
  var artifactAlias: String = js.native
  
  var triggerConditions: js.Array[ArtifactFilter] = js.native
}
object ArtifactSourceTrigger {
  
  @scala.inline
  def apply(
    artifactAlias: String,
    triggerConditions: js.Array[ArtifactFilter],
    triggerType: ReleaseTriggerType
  ): ArtifactSourceTrigger = {
    val __obj = js.Dynamic.literal(artifactAlias = artifactAlias.asInstanceOf[js.Any], triggerConditions = triggerConditions.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceTrigger]
  }
  
  @scala.inline
  implicit class ArtifactSourceTriggerMutableBuilder[Self <: ArtifactSourceTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactAlias(value: String): Self = StObject.set(x, "artifactAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerConditions(value: js.Array[ArtifactFilter]): Self = StObject.set(x, "triggerConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerConditionsVarargs(value: ArtifactFilter*): Self = StObject.set(x, "triggerConditions", js.Array(value :_*))
  }
}
