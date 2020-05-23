package typings.xrm.Xrm.Navigation

import typings.xrm.Xrm.LookupValue
import typings.xrm.Xrm.Url.NavBarDisplay
import typings.xrm.XrmEnum.WindowPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity form options for opening the form
  */
trait EntityFormOptions extends js.Object {
  /**
    * Indicates whether to display the command bar.If you do not specify this parameter, the command bar is displayed by default.
    */
  var cmdbar: js.UndefOr[Boolean] = js.undefined
  /**
    * Designates a record that will provide default values based on mapped attribute values.The lookup object has the following String properties: entityType, id, and name (optional).
    */
  var createFromEntity: js.UndefOr[LookupValue] = js.undefined
  /**
    * ID of the entity record to display the form for.
    */
  var entityId: js.UndefOr[String] = js.undefined
  /**
    * Logical name of the entity to display the form for.
    */
  var entityName: js.UndefOr[String] = js.undefined
  /**
    * ID of the form instance to be displayed.
    */
  var formId: js.UndefOr[String] = js.undefined
  /**
    * Height of the form window to be displayed in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Undocumented at this time
    */
  var isCrossEntityNavigate: js.UndefOr[Boolean] = js.undefined
  /**
    * Undocumented at this time
    */
  var isOfflineSyncError: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls whether the navigation bar is displayed and whether application navigation is available using the areas and subareas defined in the sitemap.Valid vlaues are: "on", "off", or "entity".
    * * on: The navigation bar is displayed.This is the default behavior if the navBar parameter is not used.
    * * off: The navigation bar is not displayed.People can navigate using other user interface elements or the back and forward buttons.
    * * entity: On an entity form, only the navigation options for related entities are available.After navigating to a related entity, a back button is displayed in the navigation bar to allow returning to the original record.
    */
  var navBar: js.UndefOr[NavBarDisplay] = js.undefined
  /**
    * Indicates whether to display form in a new window.
    */
  var openInNewWindow: js.UndefOr[Boolean] = js.undefined
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
  /**
    * Indicates whether to open a quick create form.
    */
  var useQuickCreateForm: js.UndefOr[Boolean] = js.undefined
  /**
    * Width of the form window to be displayed in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * Specify one of the following values for the window position of the form on the screen:
    * * 1:center
    * * 2:side
    */
  var windowPosition: js.UndefOr[WindowPositions] = js.undefined
}

object EntityFormOptions {
  @scala.inline
  def apply(
    cmdbar: js.UndefOr[Boolean] = js.undefined,
    createFromEntity: LookupValue = null,
    entityId: String = null,
    entityName: String = null,
    formId: String = null,
    height: js.UndefOr[Double] = js.undefined,
    isCrossEntityNavigate: js.UndefOr[Boolean] = js.undefined,
    isOfflineSyncError: js.UndefOr[Boolean] = js.undefined,
    navBar: NavBarDisplay = null,
    openInNewWindow: js.UndefOr[Boolean] = js.undefined,
    processId: String = null,
    processInstanceId: String = null,
    relationship: Relationship = null,
    selectedStageId: String = null,
    useQuickCreateForm: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    windowPosition: WindowPositions = null
  ): EntityFormOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cmdbar)) __obj.updateDynamic("cmdbar")(cmdbar.get.asInstanceOf[js.Any])
    if (createFromEntity != null) __obj.updateDynamic("createFromEntity")(createFromEntity.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (entityName != null) __obj.updateDynamic("entityName")(entityName.asInstanceOf[js.Any])
    if (formId != null) __obj.updateDynamic("formId")(formId.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCrossEntityNavigate)) __obj.updateDynamic("isCrossEntityNavigate")(isCrossEntityNavigate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOfflineSyncError)) __obj.updateDynamic("isOfflineSyncError")(isOfflineSyncError.get.asInstanceOf[js.Any])
    if (navBar != null) __obj.updateDynamic("navBar")(navBar.asInstanceOf[js.Any])
    if (!js.isUndefined(openInNewWindow)) __obj.updateDynamic("openInNewWindow")(openInNewWindow.get.asInstanceOf[js.Any])
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    if (processInstanceId != null) __obj.updateDynamic("processInstanceId")(processInstanceId.asInstanceOf[js.Any])
    if (relationship != null) __obj.updateDynamic("relationship")(relationship.asInstanceOf[js.Any])
    if (selectedStageId != null) __obj.updateDynamic("selectedStageId")(selectedStageId.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuickCreateForm)) __obj.updateDynamic("useQuickCreateForm")(useQuickCreateForm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityFormOptions]
  }
}

