package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildDefinitionRevision extends js.Object {
  /**
    * The change type (add, edit, delete).
    */
  var changeType: AuditAction = js.native
  /**
    * The identity of the person or process that changed the definition.
    */
  var changedBy: IdentityRef = js.native
  /**
    * The date and time that the definition was changed.
    */
  var changedDate: Date = js.native
  /**
    * The comment associated with the change.
    */
  var comment: String = js.native
  /**
    * A link to the definition at this revision.
    */
  var definitionUrl: String = js.native
  /**
    * The name of the definition.
    */
  var name: String = js.native
  /**
    * The revision number.
    */
  var revision: Double = js.native
}

object BuildDefinitionRevision {
  @scala.inline
  def apply(
    changeType: AuditAction,
    changedBy: IdentityRef,
    changedDate: Date,
    comment: String,
    definitionUrl: String,
    name: String,
    revision: Double
  ): BuildDefinitionRevision = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionUrl = definitionUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionRevision]
  }
  @scala.inline
  implicit class BuildDefinitionRevisionOps[Self <: BuildDefinitionRevision] (val x: Self) extends AnyVal {
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
    def setChangeType(value: AuditAction): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedBy(value: IdentityRef): Self = this.set("changedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedDate(value: Date): Self = this.set("changedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionUrl(value: String): Self = this.set("definitionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
  }
  
}

