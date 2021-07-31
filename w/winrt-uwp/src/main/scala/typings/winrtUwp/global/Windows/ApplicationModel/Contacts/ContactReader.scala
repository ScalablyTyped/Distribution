package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to read Contact objects in batches from the ContactStore which may be local or remotely located. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactReader")
@js.native
abstract class ContactReader ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactReader {
  
  /**
    * Gets the reason a Contact matched the search query. Returns the properties and substrings that match.
    * @param contact The Contact for which to get the matching properties.
    * @return The list of matching properties and match reasons.
    */
  /* CompleteClass */
  override def getMatchingPropertiesWithMatchReason(contact: typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact): IVectorView[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactMatchReason] = js.native
  
  /**
    * Asynchronously reads a batch of Contact objects from the ContactStore .
    * @return The batch of contacts read from the ContactStore .
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatch] = js.native
}
