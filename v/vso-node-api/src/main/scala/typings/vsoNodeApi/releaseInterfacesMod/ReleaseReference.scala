package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
  var createdBy: IdentityRef
  /**
    * Gets date on which it got created.
    */
  var createdOn: Date
  /**
    * Gets description.
    */
  var description: String
  /**
    * Gets the unique identifier of this field.
    */
  var id: Double
  /**
    * Gets the identity who modified.
    */
  var modifiedBy: IdentityRef
  /**
    * Gets name of release.
    */
  var name: String
  /**
    * Gets reason for release.
    */
  var reason: ReleaseReason
  /**
    * Gets release definition shallow reference.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  var url: String
  var webAccessUri: String
}

object ReleaseReference {
  @scala.inline
  def apply(
    _links: js.Any,
    artifacts: js.Array[Artifact],
    createdBy: IdentityRef,
    createdOn: Date,
    description: String,
    id: Double,
    modifiedBy: IdentityRef,
    name: String,
    reason: ReleaseReason,
    releaseDefinition: ReleaseDefinitionShallowReference,
    url: String,
    webAccessUri: String
  ): ReleaseReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webAccessUri = webAccessUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseReference]
  }
}

