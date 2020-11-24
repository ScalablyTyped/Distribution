package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseUpdatedEvent extends RealtimeReleaseEvent {
  
  var release: Release = js.native
}
object ReleaseUpdatedEvent {
  
  @scala.inline
  def apply(projectId: String, release: Release, releaseId: Double): ReleaseUpdatedEvent = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseUpdatedEvent]
  }
  
  @scala.inline
  implicit class ReleaseUpdatedEventOps[Self <: ReleaseUpdatedEvent] (val x: Self) extends AnyVal {
    
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
    def setRelease(value: Release): Self = this.set("release", value.asInstanceOf[js.Any])
  }
}
