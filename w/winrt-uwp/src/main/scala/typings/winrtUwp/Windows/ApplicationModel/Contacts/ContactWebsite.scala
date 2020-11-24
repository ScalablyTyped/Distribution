package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the info about a Web site for a contact. */
@js.native
trait ContactWebsite extends js.Object {
  
  /** Gets and sets the description of a Web site for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  
  var rawValue: js.Any = js.native
  
   /* unmapped type */ /** Gets and sets the Uniform Resource Identifier (URI) of a Web site for a contact. */
  var uri: Uri = js.native
}
object ContactWebsite {
  
  @scala.inline
  def apply(description: String, rawValue: js.Any, uri: Uri): ContactWebsite = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactWebsite]
  }
  
  @scala.inline
  implicit class ContactWebsiteOps[Self <: ContactWebsite] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValue(value: js.Any): Self = this.set("rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
}
