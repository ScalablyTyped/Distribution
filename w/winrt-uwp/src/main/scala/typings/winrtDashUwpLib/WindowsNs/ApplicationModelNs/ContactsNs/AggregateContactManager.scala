package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for linking individual (raw) contacts across services together into a single aggregate contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.AggregateContactManager")
@js.native
abstract class AggregateContactManager () extends js.Object {
  /**
                   * Returns the list of individual (raw) contacts from the specified aggregate contact.
                   * @param contact The aggregate contact from which to extract the list of raw contacts.
                   * @return The list of individual (raw) contacts from the specified aggregate contact.
                   */
  def findRawContactsAsync(contact: Contact): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Asynchronously attempts to link contacts together to make an aggregate contact.
                   * @param primaryContact The first contact to link.
                   * @param secondaryContact The second contact to link to the primaryContact.
                   * @return The newly created aggregate contact.
                   */
  def tryLinkContactsAsync(primaryContact: Contact, secondaryContact: Contact): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[Contact] = js.native
  /**
                   * Chooses which of the raw contacts provides the main display picture for the aggregate.
                   * @param aggregateContact The aggregate contact on which to set the picture.
                   * @param rawContact The raw contact that provides the picture for the aggregate.
                   * @return True if successful, otherwise false.
                   */
  def trySetPreferredSourceForPictureAsync(aggregateContact: Contact, rawContact: Contact): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Asynchronously unlinks a raw contact from the parent aggregate contact.
                   * @param contact The raw contact to remove from the aggregate.
                   * @return An async action that indicates the operation is complete.
                   */
  def unlinkRawContactAsync(contact: Contact): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

