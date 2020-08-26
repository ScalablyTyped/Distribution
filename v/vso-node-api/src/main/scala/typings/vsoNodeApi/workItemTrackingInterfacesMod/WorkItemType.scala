package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemType extends WorkItemTrackingResource {
  /**
    * The color.
    */
  var color: String = js.native
  /**
    * The description of the work item type.
    */
  var description: String = js.native
  /**
    * The fields that exist on the work item type.
    */
  var fieldInstances: js.Array[WorkItemTypeFieldInstance] = js.native
  /**
    * The fields that exist on the work item type.
    */
  var fields: js.Array[WorkItemTypeFieldInstance] = js.native
  /**
    * The icon of the work item type.
    */
  var icon: WorkItemIcon = js.native
  /**
    * True if work item type is disabled
    */
  var isDisabled: Boolean = js.native
  /**
    * Gets the name of the work item type.
    */
  var name: String = js.native
  /**
    * The reference name of the work item type.
    */
  var referenceName: String = js.native
  /**
    * Gets the various state transition mappings in the work item type.
    */
  var transitions: StringDictionary[js.Array[WorkItemStateTransition]] = js.native
  /**
    * The XML form.
    */
  var xmlForm: String = js.native
}

object WorkItemType {
  @scala.inline
  def apply(
    _links: js.Any,
    color: String,
    description: String,
    fieldInstances: js.Array[WorkItemTypeFieldInstance],
    fields: js.Array[WorkItemTypeFieldInstance],
    icon: WorkItemIcon,
    isDisabled: Boolean,
    name: String,
    referenceName: String,
    transitions: StringDictionary[js.Array[WorkItemStateTransition]],
    url: String,
    xmlForm: String
  ): WorkItemType = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fieldInstances = fieldInstances.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xmlForm = xmlForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemType]
  }
  @scala.inline
  implicit class WorkItemTypeOps[Self <: WorkItemType] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldInstancesVarargs(value: WorkItemTypeFieldInstance*): Self = this.set("fieldInstances", js.Array(value :_*))
    @scala.inline
    def setFieldInstances(value: js.Array[WorkItemTypeFieldInstance]): Self = this.set("fieldInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldsVarargs(value: WorkItemTypeFieldInstance*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[WorkItemTypeFieldInstance]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: WorkItemIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceName(value: String): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitions(value: StringDictionary[js.Array[WorkItemStateTransition]]): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlForm(value: String): Self = this.set("xmlForm", value.asInstanceOf[js.Any])
  }
  
}

