package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactUriQueryResult extends js.Object {
  /**
    * A Dictionary that maps a list of work item references to the given list of artifact URI.
    */
  var artifactUrisQueryResult: org.scalablytyped.runtime.StringDictionary[js.Array[WorkItemReference]]
}

object ArtifactUriQueryResult {
  @scala.inline
  def apply(artifactUrisQueryResult: org.scalablytyped.runtime.StringDictionary[js.Array[WorkItemReference]]): ArtifactUriQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactUrisQueryResult")(artifactUrisQueryResult)
    __obj.asInstanceOf[ArtifactUriQueryResult]
  }
}

