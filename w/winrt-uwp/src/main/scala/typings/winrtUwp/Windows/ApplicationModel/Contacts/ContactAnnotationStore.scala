package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a data store that contains contact annotations. */
@js.native
trait ContactAnnotationStore extends js.Object {
  /**
    * Asynchronously creates a ContactAnnotationList .
    * @return The newly created ContactAnnotationList .
    */
  def createAnnotationListAsync(): IPromiseWithIAsyncOperation[ContactAnnotationList] = js.native
  /**
    * Asynchronously creates a ContactAnnotationList and associates it with the specified user data account ID.
    * @param userDataAccountId The ID for the user data account with which to associate the new ContactAnnotationList . The user data account must be owned by this app.
    * @return The newly created ContactAnnotationList .
    */
  def createAnnotationListAsync(userDataAccountId: String): IPromiseWithIAsyncOperation[ContactAnnotationList] = js.native
  /**
    * Asynchronously disables the specified ContactAnnotation , usually as a result of user input.
    * @param annotation The annotation to disable.
    * @return An async action indicating that the operation has completed.
    */
  def disableAnnotationAsync(annotation: ContactAnnotation): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously gets the list of ContactAnnotationList objects for the app.
    * @return The list of ContactAnnotationList objects.
    */
  def findAnnotationListsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Get the annotations for the specified Contact .
    * @param contact The Contact for which to retrieve annotations.
    * @return The list of ContactAnnotation objects.
    */
  def findAnnotationsForContactAsync(contact: Contact): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets a list of Id values based on Contact objects with a specified email address.
    * @param emailAddress The email address used to find the contact Id values.
    * @return The list of Contact objects containing the specified emailAddress.
    */
  def findContactIdsByEmailAsync(emailAddress: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets a list of Id values based on Contact objects with a specified phone number.
    * @param phoneNumber The phone number used to find the contact Id values.
    * @return The list of Contact objects containing the specified phoneNumber.
    */
  def findContactIdsByPhoneNumberAsync(phoneNumber: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Asynchronously gets the ContactAnnotationList with the specified ID.
    * @param annotationListId The ID of the ContactAnnotationList to get.
    * @return The ContactAnnotationList with the ID specified in annotationListId.
    */
  def getAnnotationListAsync(annotationListId: String): IPromiseWithIAsyncOperation[ContactAnnotationList] = js.native
}

