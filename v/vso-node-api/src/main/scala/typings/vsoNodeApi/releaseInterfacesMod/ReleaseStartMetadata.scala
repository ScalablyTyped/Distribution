package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseStartMetadata extends StObject {
  
  /**
    * Sets list of artifact to create a release.
    */
  var artifacts: js.Array[ArtifactMetadata]
  
  /**
    * Sets definition Id to create a release.
    */
  var definitionId: Double
  
  /**
    * Sets description to create a release.
    */
  var description: String
  
  /**
    * Sets 'true' to create release in draft mode, 'false' otherwise.
    */
  var isDraft: Boolean
  
  /**
    * Sets list of environments to manual as condition.
    */
  var manualEnvironments: js.Array[String]
  
  var properties: js.Any
  
  /**
    * Sets reason to create a release.
    */
  var reason: ReleaseReason
}
object ReleaseStartMetadata {
  
  @scala.inline
  def apply(
    artifacts: js.Array[ArtifactMetadata],
    definitionId: Double,
    description: String,
    isDraft: Boolean,
    manualEnvironments: js.Array[String],
    properties: js.Any,
    reason: ReleaseReason
  ): ReleaseStartMetadata = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isDraft = isDraft.asInstanceOf[js.Any], manualEnvironments = manualEnvironments.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseStartMetadata]
  }
  
  @scala.inline
  implicit class ReleaseStartMetadataMutableBuilder[Self <: ReleaseStartMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: js.Array[ArtifactMetadata]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsVarargs(value: ArtifactMetadata*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDraft(value: Boolean): Self = StObject.set(x, "isDraft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualEnvironments(value: js.Array[String]): Self = StObject.set(x, "manualEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualEnvironmentsVarargs(value: String*): Self = StObject.set(x, "manualEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: ReleaseReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
