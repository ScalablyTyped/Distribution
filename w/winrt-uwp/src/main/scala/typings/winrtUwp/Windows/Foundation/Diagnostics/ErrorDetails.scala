package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an error that occurred. */
@js.native
trait ErrorDetails extends StObject {
  
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
  implicit class ErrorDetailsMutableBuilder[Self <: ErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUri(value: Uri): Self = StObject.set(x, "helpUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
  }
}
