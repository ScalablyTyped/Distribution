package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFieldSettings extends js.Object {
  /**
    * A collection of field information of additional fields on cards. The index in the collection signifies the order of the field among the additional fields. Currently unused. Should be used with User Story 691539: Card setting: additional fields
    */
  var additionalFields: js.Array[FieldInfo]
  /**
    * Display format for the assigned to field
    */
  var assignedToDisplayFormat: IdentityDisplayFormat
  /**
    * A collection of field information of rendered core fields on cards.
    */
  var coreFields: js.Array[FieldInfo]
  /**
    * Flag indicating whether to show assigned to field on cards. When true, AssignedToDisplayFormat will determine how the field will be displayed
    */
  var showAssignedTo: scala.Boolean
  /**
    * Flag indicating whether to show empty fields on cards
    */
  var showEmptyFields: scala.Boolean
  /**
    * Flag indicating whether to show ID on cards
    */
  var showId: scala.Boolean
  /**
    * Flag indicating whether to show state field on cards
    */
  var showState: scala.Boolean
  /**
    * Flag indicating whether to show tags on cards
    */
  var showTags: scala.Boolean
}

object CardFieldSettings {
  @scala.inline
  def apply(
    additionalFields: js.Array[FieldInfo],
    assignedToDisplayFormat: IdentityDisplayFormat,
    coreFields: js.Array[FieldInfo],
    showAssignedTo: scala.Boolean,
    showEmptyFields: scala.Boolean,
    showId: scala.Boolean,
    showState: scala.Boolean,
    showTags: scala.Boolean
  ): CardFieldSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("additionalFields")(additionalFields)
    __obj.updateDynamic("assignedToDisplayFormat")(assignedToDisplayFormat)
    __obj.updateDynamic("coreFields")(coreFields)
    __obj.updateDynamic("showAssignedTo")(showAssignedTo)
    __obj.updateDynamic("showEmptyFields")(showEmptyFields)
    __obj.updateDynamic("showId")(showId)
    __obj.updateDynamic("showState")(showState)
    __obj.updateDynamic("showTags")(showTags)
    __obj.asInstanceOf[CardFieldSettings]
  }
}

