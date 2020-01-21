package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactUriQuery extends js.Object {
  /**
    * List of artifact URIs to use for querying work items.
    */
  var artifactUris: js.Array[String]
}

object ArtifactUriQuery {
  @scala.inline
  def apply(artifactUris: js.Array[String]): ArtifactUriQuery = {
    val __obj = js.Dynamic.literal(artifactUris = artifactUris.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArtifactUriQuery]
  }
}

