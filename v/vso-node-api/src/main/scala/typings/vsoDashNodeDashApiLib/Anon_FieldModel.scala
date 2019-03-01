package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldModel extends js.Object {
  var FieldModel: js.Any
  var FieldType: Anon_EnumValuesAnonBooleanDateTimeDoubleGuidHistory
  var FormLayout: js.Any
  var GetWorkItemTypeExpand: Anon_EnumValuesAnonBehaviors
  var Page: js.Any
  var PageType: Anon_EnumValuesAnonAttachments
  var WorkItemTypeClass: Anon_EnumValuesAnonCustomDerived
  var WorkItemTypeFieldModel: js.Any
  var WorkItemTypeModel: js.Any
}

object Anon_FieldModel {
  @scala.inline
  def apply(
    FieldModel: js.Any,
    FieldType: Anon_EnumValuesAnonBooleanDateTimeDoubleGuidHistory,
    FormLayout: js.Any,
    GetWorkItemTypeExpand: Anon_EnumValuesAnonBehaviors,
    Page: js.Any,
    PageType: Anon_EnumValuesAnonAttachments,
    WorkItemTypeClass: Anon_EnumValuesAnonCustomDerived,
    WorkItemTypeFieldModel: js.Any,
    WorkItemTypeModel: js.Any
  ): Anon_FieldModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FieldModel")(FieldModel)
    __obj.updateDynamic("FieldType")(FieldType)
    __obj.updateDynamic("FormLayout")(FormLayout)
    __obj.updateDynamic("GetWorkItemTypeExpand")(GetWorkItemTypeExpand)
    __obj.updateDynamic("Page")(Page)
    __obj.updateDynamic("PageType")(PageType)
    __obj.updateDynamic("WorkItemTypeClass")(WorkItemTypeClass)
    __obj.updateDynamic("WorkItemTypeFieldModel")(WorkItemTypeFieldModel)
    __obj.updateDynamic("WorkItemTypeModel")(WorkItemTypeModel)
    __obj.asInstanceOf[Anon_FieldModel]
  }
}

