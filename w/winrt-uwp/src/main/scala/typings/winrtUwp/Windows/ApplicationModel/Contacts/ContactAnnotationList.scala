package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list of ContactAnnotation objects. */
trait ContactAnnotationList extends js.Object {
  /** Gets the ID for this ContactAnnotationList . */
  var id: String
  /** Gets the unique identifier for the app package that created the ContactAnnotationList . */
  var providerPackageFamilyName: String
  /** Gets the ID for the UserDataAccount used by the app. */
  var userDataAccountId: String
  /**
    * Asynchronously deletes the specified ContactAnnotation from the list.
    * @param annotation The annotation to delete from the list.
    * @return An async action indicating that the operation has completed.
    */
  def deleteAnnotationAsync(annotation: ContactAnnotation): IPromiseWithIAsyncAction
  /**
    * Asynchronously deletes this ContactAnnotationList from the ContactAnnotationStore .
    * @return An async action indicating that the operation has completed.
    */
  def deleteAsync(): IPromiseWithIAsyncAction
  /**
    * Asynchronously gets the list of ContactAnnotation objects.
    * @return The list of ContactAnnotation objects.
    */
  def findAnnotationsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
  /**
    * Gets the list of ContactAnnotation objects containing the specified remote ID property.
    * @param remoteId The remote ID used to find the ContactAnnotation objects.
    * @return The list of ContactAnnotation objects containing the specified remote ID property.
    */
  def findAnnotationsByRemoteIdAsync(remoteId: String): IPromiseWithIAsyncOperation[IVectorView[_]]
  /**
    * Gets the ContactAnnotation with the specified Id .
    * @param annotationId The ContactAnnotation.Id used to identify the ContactAnnotation .
    * @return The ContactAnnotation with the specified ID.
    */
  def getAnnotationAsync(annotationId: String): IPromiseWithIAsyncOperation[ContactAnnotation]
  /**
    * Asynchronously attempts to save the ContactAnnotation to the ContactAnnotationList .
    * @param annotation The annotation to save to the list.
    * @return True if the save was successful, otherwise false.
    */
  def trySaveAnnotationAsync(annotation: ContactAnnotation): IPromiseWithIAsyncOperation[Boolean]
}

object ContactAnnotationList {
  @scala.inline
  def apply(
    deleteAnnotationAsync: ContactAnnotation => IPromiseWithIAsyncAction,
    deleteAsync: () => IPromiseWithIAsyncAction,
    findAnnotationsAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]],
    findAnnotationsByRemoteIdAsync: String => IPromiseWithIAsyncOperation[IVectorView[_]],
    getAnnotationAsync: String => IPromiseWithIAsyncOperation[ContactAnnotation],
    id: String,
    providerPackageFamilyName: String,
    trySaveAnnotationAsync: ContactAnnotation => IPromiseWithIAsyncOperation[Boolean],
    userDataAccountId: String
  ): ContactAnnotationList = {
    val __obj = js.Dynamic.literal(deleteAnnotationAsync = js.Any.fromFunction1(deleteAnnotationAsync), deleteAsync = js.Any.fromFunction0(deleteAsync), findAnnotationsAsync = js.Any.fromFunction0(findAnnotationsAsync), findAnnotationsByRemoteIdAsync = js.Any.fromFunction1(findAnnotationsByRemoteIdAsync), getAnnotationAsync = js.Any.fromFunction1(getAnnotationAsync), id = id.asInstanceOf[js.Any], providerPackageFamilyName = providerPackageFamilyName.asInstanceOf[js.Any], trySaveAnnotationAsync = js.Any.fromFunction1(trySaveAnnotationAsync), userDataAccountId = userDataAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactAnnotationList]
  }
}

