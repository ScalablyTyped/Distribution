package typings.vsoNodeApi.releaseInterfacesMod

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
  implicit class ArtifactSourceTriggerOps[Self <: ArtifactSourceTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArtifactAlias(value: String): Self = this.set("artifactAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerConditionsVarargs(value: ArtifactFilter*): Self = this.set("triggerConditions", js.Array(value :_*))
    
    @scala.inline
    def setTriggerConditions(value: js.Array[ArtifactFilter]): Self = this.set("triggerConditions", value.asInstanceOf[js.Any])
  }
}
