package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactSourceId extends StObject {
  
  var artifactTypeId: String = js.native
  
  var sourceIdInputs: js.Array[SourceIdInput] = js.native
}
object ArtifactSourceId {
  
  @scala.inline
  def apply(artifactTypeId: String, sourceIdInputs: js.Array[SourceIdInput]): ArtifactSourceId = {
    val __obj = js.Dynamic.literal(artifactTypeId = artifactTypeId.asInstanceOf[js.Any], sourceIdInputs = sourceIdInputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceId]
  }
  
  @scala.inline
  implicit class ArtifactSourceIdMutableBuilder[Self <: ArtifactSourceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactTypeId(value: String): Self = StObject.set(x, "artifactTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdInputs(value: js.Array[SourceIdInput]): Self = StObject.set(x, "sourceIdInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdInputsVarargs(value: SourceIdInput*): Self = StObject.set(x, "sourceIdInputs", js.Array(value :_*))
  }
}
