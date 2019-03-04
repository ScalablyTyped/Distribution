package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactUriQuery extends js.Object {
  /**
    * List of artifact URIs to use for querying work items.
    */
  var artifactUris: js.Array[java.lang.String]
}

object ArtifactUriQuery {
  @scala.inline
  def apply(artifactUris: js.Array[java.lang.String]): ArtifactUriQuery = {
    val __obj = js.Dynamic.literal(artifactUris = artifactUris)
  
    __obj.asInstanceOf[ArtifactUriQuery]
  }
}

