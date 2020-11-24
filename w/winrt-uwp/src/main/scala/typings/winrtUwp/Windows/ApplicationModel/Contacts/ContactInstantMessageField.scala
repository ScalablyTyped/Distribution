package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a field that is an instant messaging (IM) address. */
@js.native
trait ContactInstantMessageField extends js.Object {
  
  /** Gets the category for the contact data. */
  var category: ContactFieldCategory = js.native
  
  /** Gets the display text for the Uniform Resource Identifier (URI) that starts an instant message. */
  var displayText: String = js.native
  
  /** Gets the Uniform Resource Identifier (URI) that can start an instant message. */
  var launchUri: Uri = js.native
  
  /** Gets the name of the field. */
  var name: String = js.native
  
  /** Gets the name of the service used for sending instant messages. */
  var service: String = js.native
  
  /** Gets the contact field type for the data. */
  var `type`: ContactFieldType = js.native
  
  /** Gets the user's name. */
  var userName: String = js.native
  
  /** Gets the value of the contact data. */
  var value: String = js.native
}
object ContactInstantMessageField {
  
  @scala.inline
  def apply(
    category: ContactFieldCategory,
    displayText: String,
    launchUri: Uri,
    name: String,
    service: String,
    `type`: ContactFieldType,
    userName: String,
    value: String
  ): ContactInstantMessageField = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], displayText = displayText.asInstanceOf[js.Any], launchUri = launchUri.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactInstantMessageField]
  }
  
  @scala.inline
  implicit class ContactInstantMessageFieldOps[Self <: ContactInstantMessageField] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: ContactFieldCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayText(value: String): Self = this.set("displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchUri(value: Uri): Self = this.set("launchUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContactFieldType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
