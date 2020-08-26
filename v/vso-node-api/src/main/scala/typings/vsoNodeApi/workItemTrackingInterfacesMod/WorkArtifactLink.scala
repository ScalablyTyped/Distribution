package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkArtifactLink extends js.Object {
  /**
    * Target artifact type.
    */
  var artifactType: String = js.native
  /**
    * Outbound link type.
    */
  var linkType: String = js.native
  /**
    * Target tool type.
    */
  var toolType: String = js.native
}

object WorkArtifactLink {
  @scala.inline
  def apply(artifactType: String, linkType: String, toolType: String): WorkArtifactLink = {
    val __obj = js.Dynamic.literal(artifactType = artifactType.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], toolType = toolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkArtifactLink]
  }
  @scala.inline
  implicit class WorkArtifactLinkOps[Self <: WorkArtifactLink] (val x: Self) extends AnyVal {
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
    def setArtifactType(value: String): Self = this.set("artifactType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkType(value: String): Self = this.set("linkType", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolType(value: String): Self = this.set("toolType", value.asInstanceOf[js.Any])
  }
  
}

