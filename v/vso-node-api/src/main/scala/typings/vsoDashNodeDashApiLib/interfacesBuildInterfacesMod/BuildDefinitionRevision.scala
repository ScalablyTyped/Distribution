package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  var changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * The date and time that the definition was changed.
    */
  var changedDate: stdLib.Date
  /**
    * The comment associated with the change.
    */
  var comment: java.lang.String
  /**
    * A link to the definition at this revision.
    */
  var definitionUrl: java.lang.String
  /**
    * The name of the definition.
    */
  var name: java.lang.String
  /**
    * The revision number.
    */
  var revision: scala.Double
}

object BuildDefinitionRevision {
  @scala.inline
  def apply(
    changeType: AuditAction,
    changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    changedDate: stdLib.Date,
    comment: java.lang.String,
    definitionUrl: java.lang.String,
    name: java.lang.String,
    revision: scala.Double
  ): BuildDefinitionRevision = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeType")(changeType)
    __obj.updateDynamic("changedBy")(changedBy)
    __obj.updateDynamic("changedDate")(changedDate)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("definitionUrl")(definitionUrl)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("revision")(revision)
    __obj.asInstanceOf[BuildDefinitionRevision]
  }
}

