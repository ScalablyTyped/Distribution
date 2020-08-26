package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeFieldInstance extends WorkItemFieldReference {
  /**
    * The list of field allowed values.
    */
  var allowedValues: js.Array[String] = js.native
  /**
    * Indicates whether field value is always required.
    */
  var alwaysRequired: Boolean = js.native
  /**
    * The list of dependent fields.
    */
  var dependentFields: js.Array[WorkItemFieldReference] = js.native
  /**
    * Gets the help text for the field.
    */
  var helpText: String = js.native
}

object WorkItemTypeFieldInstance {
  @scala.inline
  def apply(
    allowedValues: js.Array[String],
    alwaysRequired: Boolean,
    dependentFields: js.Array[WorkItemFieldReference],
    helpText: String,
    name: String,
    referenceName: String,
    url: String
  ): WorkItemTypeFieldInstance = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], alwaysRequired = alwaysRequired.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], helpText = helpText.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeFieldInstance]
  }
  @scala.inline
  implicit class WorkItemTypeFieldInstanceOps[Self <: WorkItemTypeFieldInstance] (val x: Self) extends AnyVal {
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
    def setAllowedValuesVarargs(value: String*): Self = this.set("allowedValues", js.Array(value :_*))
    @scala.inline
    def setAllowedValues(value: js.Array[String]): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlwaysRequired(value: Boolean): Self = this.set("alwaysRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependentFieldsVarargs(value: WorkItemFieldReference*): Self = this.set("dependentFields", js.Array(value :_*))
    @scala.inline
    def setDependentFields(value: js.Array[WorkItemFieldReference]): Self = this.set("dependentFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelpText(value: String): Self = this.set("helpText", value.asInstanceOf[js.Any])
  }
  
}

