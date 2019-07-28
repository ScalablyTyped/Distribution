package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkArtifactLink extends js.Object {
  /**
    * Target artifact type.
    */
  var artifactType: String
  /**
    * Outbound link type.
    */
  var linkType: String
  /**
    * Target tool type.
    */
  var toolType: String
}

object WorkArtifactLink {
  @scala.inline
  def apply(artifactType: String, linkType: String, toolType: String): WorkArtifactLink = {
    val __obj = js.Dynamic.literal(artifactType = artifactType, linkType = linkType, toolType = toolType)
  
    __obj.asInstanceOf[WorkArtifactLink]
  }
}

