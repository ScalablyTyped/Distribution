package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list of ContactAnnotation objects. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationList")
@js.native
abstract class ContactAnnotationList () extends js.Object {
  /** Gets the ID for this ContactAnnotationList . */
  var id: java.lang.String = js.native
  /** Gets the unique identifier for the app package that created the ContactAnnotationList . */
  var providerPackageFamilyName: java.lang.String = js.native
  /** Gets the ID for the UserDataAccount used by the app. */
  var userDataAccountId: java.lang.String = js.native
  /**
                   * Asynchronously deletes the specified ContactAnnotation from the list.
                   * @param annotation The annotation to delete from the list.
                   * @return An async action indicating that the operation has completed.
                   */
  def deleteAnnotationAsync(annotation: ContactAnnotation): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously deletes this ContactAnnotationList from the ContactAnnotationStore .
                   * @return An async action indicating that the operation has completed.
                   */
  def deleteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously gets the list of ContactAnnotation objects.
                   * @return The list of ContactAnnotation objects.
                   */
  def findAnnotationsAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Gets the list of ContactAnnotation objects containing the specified remote ID property.
                   * @param remoteId The remote ID used to find the ContactAnnotation objects.
                   * @return The list of ContactAnnotation objects containing the specified remote ID property.
                   */
  def findAnnotationsByRemoteIdAsync(remoteId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Gets the ContactAnnotation with the specified Id .
                   * @param annotationId The ContactAnnotation.Id used to identify the ContactAnnotation .
                   * @return The ContactAnnotation with the specified ID.
                   */
  def getAnnotationAsync(annotationId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ContactAnnotation] = js.native
  /**
                   * Asynchronously attempts to save the ContactAnnotation to the ContactAnnotationList .
                   * @param annotation The annotation to save to the list.
                   * @return True if the save was successful, otherwise false.
                   */
  def trySaveAnnotationAsync(annotation: ContactAnnotation): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

