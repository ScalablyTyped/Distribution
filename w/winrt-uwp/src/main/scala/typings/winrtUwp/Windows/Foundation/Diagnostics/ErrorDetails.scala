package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an error that occurred. */
trait ErrorDetails extends StObject {
  
  /** Gets a short description of the error. */
  var description: String
  
  /** Gets the address to a help page about the error. */
  var helpUri: Uri
  
  /** Gets a detailed description of the error. */
  var longDescription: String
}
object ErrorDetails {
  
  inline def apply(description: String, helpUri: Uri, longDescription: String): ErrorDetails = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], helpUri = helpUri.asInstanceOf[js.Any], longDescription = longDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
  
  extension [Self <: ErrorDetails](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHelpUri(value: Uri): Self = StObject.set(x, "helpUri", value.asInstanceOf[js.Any])
    
    inline def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
  }
}
