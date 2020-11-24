package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactSourceIdsQueryResult extends js.Object {
  
  var artifactSourceIds: js.Array[ArtifactSourceId] = js.native
}
object ArtifactSourceIdsQueryResult {
  
  @scala.inline
  def apply(artifactSourceIds: js.Array[ArtifactSourceId]): ArtifactSourceIdsQueryResult = {
    val __obj = js.Dynamic.literal(artifactSourceIds = artifactSourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSourceIdsQueryResult]
  }
  
  @scala.inline
  implicit class ArtifactSourceIdsQueryResultOps[Self <: ArtifactSourceIdsQueryResult] (val x: Self) extends AnyVal {
    
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
    def setArtifactSourceIdsVarargs(value: ArtifactSourceId*): Self = this.set("artifactSourceIds", js.Array(value :_*))
    
    @scala.inline
    def setArtifactSourceIds(value: js.Array[ArtifactSourceId]): Self = this.set("artifactSourceIds", value.asInstanceOf[js.Any])
  }
}
