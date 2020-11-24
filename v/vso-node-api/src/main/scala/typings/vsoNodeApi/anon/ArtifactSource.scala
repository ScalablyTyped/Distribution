package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactSource extends js.Object {
  
  @JSName("package")
  var _package: scala.Double = js.native
  
  var artifactSource: scala.Double = js.native
  
  var containerImage: scala.Double = js.native
  
  var pullRequest: scala.Double = js.native
  
  var schedule: scala.Double = js.native
  
  var sourceRepo: scala.Double = js.native
  
  var undefined: scala.Double = js.native
}
object ArtifactSource {
  
  @scala.inline
  def apply(
    _package: scala.Double,
    artifactSource: scala.Double,
    containerImage: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double,
    sourceRepo: scala.Double,
    undefined: scala.Double
  ): ArtifactSource = {
    val __obj = js.Dynamic.literal(artifactSource = artifactSource.asInstanceOf[js.Any], containerImage = containerImage.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], sourceRepo = sourceRepo.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSource]
  }
  
  @scala.inline
  implicit class ArtifactSourceOps[Self <: ArtifactSource] (val x: Self) extends AnyVal {
    
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
    def set_package(value: scala.Double): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactSource(value: scala.Double): Self = this.set("artifactSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerImage(value: scala.Double): Self = this.set("containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequest(value: scala.Double): Self = this.set("pullRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: scala.Double): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRepo(value: scala.Double): Self = this.set("sourceRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: scala.Double): Self = this.set("undefined", value.asInstanceOf[js.Any])
  }
}
