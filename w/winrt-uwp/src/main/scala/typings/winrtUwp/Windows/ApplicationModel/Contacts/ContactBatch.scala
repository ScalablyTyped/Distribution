package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of Contact objects and server search status. */
trait ContactBatch extends StObject {
  
  /** Gets the list of Contact objects returned by a search operation. */
  var contacts: IVectorView[Contact]
  
  /** Gets a ContactBatchStatus value that indicates if a search was successful or if there was a server error. */
  var status: ContactBatchStatus
}
object ContactBatch {
  
  inline def apply(contacts: IVectorView[Contact], status: ContactBatchStatus): ContactBatch = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactBatch]
  }
  
  extension [Self <: ContactBatch](x: Self) {
    
    inline def setContacts(value: IVectorView[Contact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ContactBatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
