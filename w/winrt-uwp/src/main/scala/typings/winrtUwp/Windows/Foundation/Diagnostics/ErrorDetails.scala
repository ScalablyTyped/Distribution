package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an error that occurred. */
@js.native
trait ErrorDetails extends js.Object {
  
  /** Gets a short description of the error. */
  var description: String = js.native
  
  /** Gets the address to a help page about the error. */
  var helpUri: Uri = js.native
  
  /** Gets a detailed description of the error. */
  var longDescription: String = js.native
}
object ErrorDetails {
  
  @scala.inline
  def apply(description: String, helpUri: Uri, longDescription: String): ErrorDetails = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], helpUri = helpUri.asInstanceOf[js.Any], longDescription = longDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
  
  @scala.inline
  implicit class ErrorDetailsOps[Self <: ErrorDetails] (val x: Self) extends AnyVal {
    
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
    def setHelpUri(value: Uri): Self = this.set("helpUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDescription(value: String): Self = this.set("longDescription", value.asInstanceOf[js.Any])
  }
}
