package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to read Contact objects in batches from the ContactStore which may be local or remotely located. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactReader")
@js.native
abstract class ContactReader () extends js.Object {
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

