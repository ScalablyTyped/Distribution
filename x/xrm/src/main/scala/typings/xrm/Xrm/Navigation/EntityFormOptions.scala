package typings.xrm.Xrm.Navigation

import typings.xrm.Xrm.LookupValue
import typings.xrm.Xrm.Url.NavBarDisplay
import typings.xrm.XrmEnum.WindowPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entity form options for opening the form
  */
@js.native
trait EntityFormOptions extends js.Object {
  
  /**
    * Indicates whether to display the command bar.If you do not specify this parameter, the command bar is displayed by default.
    */
  var cmdbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Designates a record that will provide default values based on mapped attribute values.The lookup object has the following String properties: entityType, id, and name (optional).
    */
  var createFromEntity: js.UndefOr[LookupValue] = js.native
  
  /**
    * ID of the entity record to display the form for.
    */
  var entityId: js.UndefOr[String] = js.native
  
  /**
    * Logical name of the entity to display the form for.
    */
  var entityName: js.UndefOr[String] = js.native
  
  /**
    * ID of the form instance to be displayed.
    */
  var formId: js.UndefOr[String] = js.native
  
  /**
    * Height of the form window to be displayed in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Undocumented at this time
    */
  var isCrossEntityNavigate: js.UndefOr[Boolean] = js.native
  
  /**
    * Undocumented at this time
    */
  var isOfflineSyncError: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls whether the navigation bar is displayed and whether application navigation is available using the areas and subareas defined in the sitemap.Valid vlaues are: "on", "off", or "entity".
    * * on: The navigation bar is displayed.This is the default behavior if the navBar parameter is not used.
    * * off: The navigation bar is not displayed.People can navigate using other user interface elements or the back and forward buttons.
    * * entity: On an entity form, only the navigation options for related entities are available.After navigating to a related entity, a back button is displayed in the navigation bar to allow returning to the original record.
    */
  var navBar: js.UndefOr[NavBarDisplay] = js.native
  
  /**
    * Indicates whether to display form in a new window.
    */
  var openInNewWindow: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of the business process to be displayed on the form.
    */
  var processId: js.UndefOr[String] = js.native
  
  /**
    * ID of the business process instance to be displayed on the form.
    */
  var processInstanceId: js.UndefOr[String] = js.native
  
  /**
    * Define a relationship object to display the related records on the form.
    */
  var relationship: js.UndefOr[Relationship] = js.native
  
  /**
    * ID of the selected stage in business process instance.
    */
  var selectedStageId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether to open a quick create form.
    */
  var useQuickCreateForm: js.UndefOr[Boolean] = js.native
  
  /**
    * Width of the form window to be displayed in pixels.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * Specify one of the following values for the window position of the form on the screen:
    * * 1:center
    * * 2:side
    */
  var windowPosition: js.UndefOr[WindowPositions] = js.native
}
object EntityFormOptions {
  
  @scala.inline
  def apply(): EntityFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityFormOptions]
  }
  
  @scala.inline
  implicit class EntityFormOptionsOps[Self <: EntityFormOptions] (val x: Self) extends AnyVal {
    
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
    def setCmdbar(value: Boolean): Self = this.set("cmdbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmdbar: Self = this.set("cmdbar", js.undefined)
    
    @scala.inline
    def setCreateFromEntity(value: LookupValue): Self = this.set("createFromEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFromEntity: Self = this.set("createFromEntity", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    
    @scala.inline
    def setEntityName(value: String): Self = this.set("entityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityName: Self = this.set("entityName", js.undefined)
    
    @scala.inline
    def setFormId(value: String): Self = this.set("formId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormId: Self = this.set("formId", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsCrossEntityNavigate(value: Boolean): Self = this.set("isCrossEntityNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCrossEntityNavigate: Self = this.set("isCrossEntityNavigate", js.undefined)
    
    @scala.inline
    def setIsOfflineSyncError(value: Boolean): Self = this.set("isOfflineSyncError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOfflineSyncError: Self = this.set("isOfflineSyncError", js.undefined)
    
    @scala.inline
    def setNavBar(value: NavBarDisplay): Self = this.set("navBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavBar: Self = this.set("navBar", js.undefined)
    
    @scala.inline
    def setOpenInNewWindow(value: Boolean): Self = this.set("openInNewWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenInNewWindow: Self = this.set("openInNewWindow", js.undefined)
    
    @scala.inline
    def setProcessId(value: String): Self = this.set("processId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessId: Self = this.set("processId", js.undefined)
    
    @scala.inline
    def setProcessInstanceId(value: String): Self = this.set("processInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessInstanceId: Self = this.set("processInstanceId", js.undefined)
    
    @scala.inline
    def setRelationship(value: Relationship): Self = this.set("relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationship: Self = this.set("relationship", js.undefined)
    
    @scala.inline
    def setSelectedStageId(value: String): Self = this.set("selectedStageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedStageId: Self = this.set("selectedStageId", js.undefined)
    
    @scala.inline
    def setUseQuickCreateForm(value: Boolean): Self = this.set("useQuickCreateForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseQuickCreateForm: Self = this.set("useQuickCreateForm", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWindowPosition(value: WindowPositions): Self = this.set("windowPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowPosition: Self = this.set("windowPosition", js.undefined)
  }
}
