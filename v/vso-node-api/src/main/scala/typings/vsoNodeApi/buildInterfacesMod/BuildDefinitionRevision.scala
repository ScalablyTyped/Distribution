package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionRevision extends js.Object {
  /**
    * The change type (add, edit, delete).
    */
  var changeType: AuditAction
  /**
    * The identity of the person or process that changed the definition.
    */
  var changedBy: IdentityRef
  /**
    * The date and time that the definition was changed.
    */
  var changedDate: Date
  /**
    * The comment associated with the change.
    */
  var comment: String
  /**
    * A link to the definition at this revision.
    */
  var definitionUrl: String
  /**
    * The name of the definition.
    */
  var name: String
  /**
    * The revision number.
    */
  var revision: Double
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
}

