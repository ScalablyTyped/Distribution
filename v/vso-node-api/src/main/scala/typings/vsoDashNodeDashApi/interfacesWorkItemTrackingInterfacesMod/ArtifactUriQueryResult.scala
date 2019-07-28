package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactUriQueryResult extends js.Object {
  /**
    * A Dictionary that maps a list of work item references to the given list of artifact URI.
    */
  var artifactUrisQueryResult: StringDictionary[js.Array[WorkItemReference]]
}

object ArtifactUriQueryResult {
  @scala.inline
  def apply(artifactUrisQueryResult: StringDictionary[js.Array[WorkItemReference]]): ArtifactUriQueryResult = {
    val __obj = js.Dynamic.literal(artifactUrisQueryResult = artifactUrisQueryResult)
  
    __obj.asInstanceOf[ArtifactUriQueryResult]
  }
}

