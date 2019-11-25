package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDefinitionRevision extends js.Object {
  /**
    * Gets api-version for revision object.
    */
  var apiVersion: String
  /**
    * Gets type of change.
    */
  var changeType: AuditAction
  /**
    * Gets the identity who did change.
    */
  var changedBy: IdentityRef
  /**
    * Gets date on which it got changed.
    */
  var changedDate: Date
  /**
    * Gets comments for revision.
    */
  var comment: String
  /**
    * Get id of the definition.
    */
  var definitionId: Double
  /**
    * Gets definition url.
    */
  var definitionUrl: String
  /**
    * Get revision number of the definition.
    */
  var revision: Double
}

object ReleaseDefinitionRevision {
  @scala.inline
  def apply(
    apiVersion: String,
    changeType: AuditAction,
    changedBy: IdentityRef,
    changedDate: Date,
    comment: String,
    definitionId: Double,
    definitionUrl: String,
    revision: Double
  ): ReleaseDefinitionRevision = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionId = definitionId.asInstanceOf[js.Any], definitionUrl = definitionUrl.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseDefinitionRevision]
  }
}

