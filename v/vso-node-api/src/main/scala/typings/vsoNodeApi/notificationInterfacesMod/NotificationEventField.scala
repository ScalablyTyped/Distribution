package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationEventField extends js.Object {
  
  /**
    * Gets or sets the type of this field.
    */
  var fieldType: NotificationEventFieldType = js.native
  
  /**
    * Gets or sets the unique identifier of this field.
    */
  var id: String = js.native
  
  /**
    * Gets or sets the name of this field.
    */
  var name: String = js.native
  
  /**
    * Gets or sets the path to the field in the event object. This path can be either Json Path or XPath, depending on if the event will be serialized into Json or XML
    */
  var path: String = js.native
  
  /**
    * Gets or sets the scopes that this field supports. If not specified then the event type scopes apply.
    */
  var supportedScopes: js.Array[String] = js.native
}
object NotificationEventField {
  
  @scala.inline
  def apply(
    fieldType: NotificationEventFieldType,
    id: String,
    name: String,
    path: String,
    supportedScopes: js.Array[String]
  ): NotificationEventField = {
    val __obj = js.Dynamic.literal(fieldType = fieldType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationEventField]
  }
  
  @scala.inline
  implicit class NotificationEventFieldOps[Self <: NotificationEventField] (val x: Self) extends AnyVal {
    
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
    def setFieldType(value: NotificationEventFieldType): Self = this.set("fieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedScopesVarargs(value: String*): Self = this.set("supportedScopes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedScopes(value: js.Array[String]): Self = this.set("supportedScopes", value.asInstanceOf[js.Any])
  }
}
