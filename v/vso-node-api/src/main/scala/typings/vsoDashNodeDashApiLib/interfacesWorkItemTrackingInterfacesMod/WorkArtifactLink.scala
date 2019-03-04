package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkArtifactLink extends js.Object {
  /**
    * Target artifact type.
    */
  var artifactType: java.lang.String
  /**
    * Outbound link type.
    */
  var linkType: java.lang.String
  /**
    * Target tool type.
    */
  var toolType: java.lang.String
}

object WorkArtifactLink {
  @scala.inline
  def apply(artifactType: java.lang.String, linkType: java.lang.String, toolType: java.lang.String): WorkArtifactLink = {
    val __obj = js.Dynamic.literal(artifactType = artifactType, linkType = linkType, toolType = toolType)
  
    __obj.asInstanceOf[WorkArtifactLink]
  }
}

