package typings.xrm.Xrm.Navigation

import org.scalablytyped.runtime.StringDictionary
import typings.xrm.xrmStrings.entityrecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInputEntityRecord extends js.Object {
  /**
    * Designates a record that will provide default values based on mapped attribute values. The lookup object has the following String properties: entityType, id, and name (optional).
    */
  var createFromEntity: js.UndefOr[Boolean] = js.undefined
  /**
    * A dictionary object that passes extra parameters to the form. Invalid parameters will cause an error.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * ID of the entity record to display the form for. If you don't specify this value, the form will be opened in create mode.
    * */
  var entityId: js.UndefOr[String] = js.undefined
  /**
    * Logical name of the entity to display the form for.
    * */
  var entityName: String
  /**
    * ID of the form instance to be displayed.
    */
  var formId: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the form is navigated to from a different entity using cross-entity business process flow.
    */
  var isCrossEntityNavigate: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether there are any offline sync errors.
    */
  var isOfflineSyncError: js.UndefOr[Boolean] = js.undefined
  var pageType: entityrecord
  /**
    * ID of the business process to be displayed on the form.
    */
  var processId: js.UndefOr[String] = js.undefined
  /**
    * ID of the business process instance to be displayed on the form.
    */
  var processInstanceId: js.UndefOr[String] = js.undefined
  /**
    * Define a relationship object to display the related records on the form.
    */
  var relationship: js.UndefOr[Relationship] = js.undefined
  /**
    * ID of the selected stage in business process instance.
    */
  var selectedStageId: js.UndefOr[String] = js.undefined
}

object PageInputEntityRecord {
  @scala.inline
  def apply(
    entityName: String,
    pageType: entityrecord,
    createFromEntity: js.UndefOr[Boolean] = js.undefined,
    data: StringDictionary[js.Any] = null,
    entityId: String = null,
    formId: String = null,
    isCrossEntityNavigate: js.UndefOr[Boolean] = js.undefined,
    isOfflineSyncError: js.UndefOr[Boolean] = js.undefined,
    processId: String = null,
    processInstanceId: String = null,
    relationship: Relationship = null,
    selectedStageId: String = null
  ): PageInputEntityRecord = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = pageType.asInstanceOf[js.Any])
    if (!js.isUndefined(createFromEntity)) __obj.updateDynamic("createFromEntity")(createFromEntity.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (formId != null) __obj.updateDynamic("formId")(formId.asInstanceOf[js.Any])
    if (!js.isUndefined(isCrossEntityNavigate)) __obj.updateDynamic("isCrossEntityNavigate")(isCrossEntityNavigate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOfflineSyncError)) __obj.updateDynamic("isOfflineSyncError")(isOfflineSyncError.get.asInstanceOf[js.Any])
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    if (processInstanceId != null) __obj.updateDynamic("processInstanceId")(processInstanceId.asInstanceOf[js.Any])
    if (relationship != null) __obj.updateDynamic("relationship")(relationship.asInstanceOf[js.Any])
    if (selectedStageId != null) __obj.updateDynamic("selectedStageId")(selectedStageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInputEntityRecord]
  }
}

