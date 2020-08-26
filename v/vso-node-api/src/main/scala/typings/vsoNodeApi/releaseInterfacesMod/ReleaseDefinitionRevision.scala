package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseDefinitionRevision extends js.Object {
  /**
    * Gets api-version for revision object.
    */
  var apiVersion: String = js.native
  /**
    * Gets type of change.
    */
  var changeType: AuditAction = js.native
  /**
    * Gets the identity who did change.
    */
  var changedBy: IdentityRef = js.native
  /**
    * Gets date on which it got changed.
    */
  var changedDate: Date = js.native
  /**
    * Gets comments for revision.
    */
  var comment: String = js.native
  /**
    * Get id of the definition.
    */
  var definitionId: Double = js.native
  /**
    * Gets definition url.
    */
  var definitionUrl: String = js.native
  /**
    * Get revision number of the definition.
    */
  var revision: Double = js.native
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
  @scala.inline
  implicit class ReleaseDefinitionRevisionOps[Self <: ReleaseDefinitionRevision] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeType(value: AuditAction): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedBy(value: IdentityRef): Self = this.set("changedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedDate(value: Date): Self = this.set("changedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionId(value: Double): Self = this.set("definitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionUrl(value: String): Self = this.set("definitionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
  }
  
}

