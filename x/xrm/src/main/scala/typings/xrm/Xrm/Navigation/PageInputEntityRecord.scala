package typings.xrm.Xrm.Navigation

import org.scalablytyped.runtime.StringDictionary
import typings.xrm.xrmStrings.entityrecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageInputEntityRecord extends js.Object {
  
  /**
    * Designates a record that will provide default values based on mapped attribute values. The lookup object has the following String properties: entityType, id, and name (optional).
    */
  var createFromEntity: js.UndefOr[Boolean] = js.native
  
  /**
    * A dictionary object that passes extra parameters to the form. Invalid parameters will cause an error.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * ID of the entity record to display the form for. If you don't specify this value, the form will be opened in create mode.
    * */
  var entityId: js.UndefOr[String] = js.native
  
  /**
    * Logical name of the entity to display the form for.
    * */
  var entityName: String = js.native
  
  /**
    * ID of the form instance to be displayed.
    */
  var formId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the form is navigated to from a different entity using cross-entity business process flow.
    */
  var isCrossEntityNavigate: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether there are any offline sync errors.
    */
  var isOfflineSyncError: js.UndefOr[Boolean] = js.native
  
  var pageType: entityrecord = js.native
  
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
}
object PageInputEntityRecord {
  
  @scala.inline
  def apply(entityName: String, pageType: entityrecord): PageInputEntityRecord = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = pageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInputEntityRecord]
  }
  
  @scala.inline
  implicit class PageInputEntityRecordOps[Self <: PageInputEntityRecord] (val x: Self) extends AnyVal {
    
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
    def setEntityName(value: String): Self = this.set("entityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageType(value: entityrecord): Self = this.set("pageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFromEntity(value: Boolean): Self = this.set("createFromEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFromEntity: Self = this.set("createFromEntity", js.undefined)
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = this.set("entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    
    @scala.inline
    def setFormId(value: String): Self = this.set("formId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormId: Self = this.set("formId", js.undefined)
    
    @scala.inline
    def setIsCrossEntityNavigate(value: Boolean): Self = this.set("isCrossEntityNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCrossEntityNavigate: Self = this.set("isCrossEntityNavigate", js.undefined)
    
    @scala.inline
    def setIsOfflineSyncError(value: Boolean): Self = this.set("isOfflineSyncError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOfflineSyncError: Self = this.set("isOfflineSyncError", js.undefined)
    
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
  }
}
