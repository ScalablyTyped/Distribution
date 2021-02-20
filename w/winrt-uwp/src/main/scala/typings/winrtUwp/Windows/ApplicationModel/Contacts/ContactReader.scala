package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to read Contact objects in batches from the ContactStore which may be local or remotely located. */
@js.native
trait ContactReader extends StObject {
  
  /**
    * Gets the reason a Contact matched the search query. Returns the properties and substrings that match.
    * @param contact The Contact for which to get the matching properties.
    * @return The list of matching properties and match reasons.
    */
  def getMatchingPropertiesWithMatchReason(contact: Contact): IVectorView[ContactMatchReason] = js.native
  
  /**
    * Asynchronously reads a batch of Contact objects from the ContactStore .
    * @return The batch of contacts read from the ContactStore .
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[ContactBatch] = js.native
}
object ContactReader {
  
  @scala.inline
  def apply(
    getMatchingPropertiesWithMatchReason: Contact => IVectorView[ContactMatchReason],
    readBatchAsync: () => IPromiseWithIAsyncOperation[ContactBatch]
  ): ContactReader = {
    val __obj = js.Dynamic.literal(getMatchingPropertiesWithMatchReason = js.Any.fromFunction1(getMatchingPropertiesWithMatchReason), readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[ContactReader]
  }
  
  @scala.inline
  implicit class ContactReaderMutableBuilder[Self <: ContactReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMatchingPropertiesWithMatchReason(value: Contact => IVectorView[ContactMatchReason]): Self = StObject.set(x, "getMatchingPropertiesWithMatchReason", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[ContactBatch]): Self = StObject.set(x, "readBatchAsync", js.Any.fromFunction0(value))
  }
}
