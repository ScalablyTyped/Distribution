package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a data store that contains contact annotations. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationStore")
@js.native
abstract class ContactAnnotationStore () extends js.Object {
  /**
    * Asynchronously creates a ContactAnnotationList .
    * @return The newly created ContactAnnotationList .
    */
  def createAnnotationListAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ContactAnnotationList] = js.native
  /**
    * Asynchronously creates a ContactAnnotationList and associates it with the specified user data account ID.
    * @param userDataAccountId The ID for the user data account with which to associate the new ContactAnnotationList . The user data account must be owned by this app.
    * @return The newly created ContactAnnotationList .
    */
  def createAnnotationListAsync(userDataAccountId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ContactAnnotationList] = js.native
  /**
    * Asynchronously disables the specified ContactAnnotation , usually as a result of user input.
    * @param annotation The annotation to disable.
    * @return An async action indicating that the operation has completed.
    */
  def disableAnnotationAsync(annotation: ContactAnnotation): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously gets the list of ContactAnnotationList objects for the app.
    * @return The list of ContactAnnotationList objects.
    */
  def findAnnotationListsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Get the annotations for the specified Contact .
    * @param contact The Contact for which to retrieve annotations.
    * @return The list of ContactAnnotation objects.
    */
  def findAnnotationsForContactAsync(contact: Contact): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Gets a list of Id values based on Contact objects with a specified email address.
    * @param emailAddress The email address used to find the contact Id values.
    * @return The list of Contact objects containing the specified emailAddress.
    */
  def findContactIdsByEmailAsync(emailAddress: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Gets a list of Id values based on Contact objects with a specified phone number.
    * @param phoneNumber The phone number used to find the contact Id values.
    * @return The list of Contact objects containing the specified phoneNumber.
    */
  def findContactIdsByPhoneNumberAsync(phoneNumber: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Asynchronously gets the ContactAnnotationList with the specified ID.
    * @param annotationListId The ID of the ContactAnnotationList to get.
    * @return The ContactAnnotationList with the ID specified in annotationListId.
    */
  def getAnnotationListAsync(annotationListId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ContactAnnotationList] = js.native
}

