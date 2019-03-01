package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseReference extends js.Object {
  /**
    * Gets links to access the release.
    */
  var _links: js.Any
  /**
    * Gets list of artifacts.
    */
  var artifacts: js.Array[Artifact]
  /**
    * Gets the identity who created.
    */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets date on which it got created.
    */
  var createdOn: stdLib.Date
  /**
    * Gets description.
    */
  var description: java.lang.String
  /**
    * Gets the unique identifier of this field.
    */
  var id: scala.Double
  /**
    * Gets the identity who modified.
    */
  var modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Gets name of release.
    */
  var name: java.lang.String
  /**
    * Gets reason for release.
    */
  var reason: ReleaseReason
  /**
    * Gets release definition shallow reference.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  var url: java.lang.String
  var webAccessUri: java.lang.String
}

object ReleaseReference {
  @scala.inline
  def apply(
    _links: js.Any,
    artifacts: js.Array[Artifact],
    createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdOn: stdLib.Date,
    description: java.lang.String,
    id: scala.Double,
    modifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    name: java.lang.String,
    reason: ReleaseReason,
    releaseDefinition: ReleaseDefinitionShallowReference,
    url: java.lang.String,
    webAccessUri: java.lang.String
  ): ReleaseReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("artifacts")(artifacts)
    __obj.updateDynamic("createdBy")(createdBy)
    __obj.updateDynamic("createdOn")(createdOn)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("modifiedBy")(modifiedBy)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("releaseDefinition")(releaseDefinition)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("webAccessUri")(webAccessUri)
    __obj.asInstanceOf[ReleaseReference]
  }
}

