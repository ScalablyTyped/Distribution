package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list of ContactAnnotation objects. */
@js.native
trait ContactAnnotationList extends js.Object {
  /** Gets the ID for this ContactAnnotationList . */
  var id: String = js.native
  /** Gets the unique identifier for the app package that created the ContactAnnotationList . */
  var providerPackageFamilyName: String = js.native
  /** Gets the ID for the UserDataAccount used by the app. */
  var userDataAccountId: String = js.native
  /**
    * Asynchronously deletes the specified ContactAnnotation from the list.
    * @param annotation The annotation to delete from the list.
    * @return An async action indicating that the operation has completed.
    */
  def deleteAnnotationAsync(annotation: ContactAnnotation): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously deletes this ContactAnnotationList from the ContactAnnotationStore .
    * @return An async action indicating that the operation has completed.
    */
  def deleteAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously gets the list of ContactAnnotation objects.
    * @return The list of ContactAnnotation objects.
    */
  def findAnnotationsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the list of ContactAnnotation objects containing the specified remote ID property.
    * @param remoteId The remote ID used to find the ContactAnnotation objects.
    * @return The list of ContactAnnotation objects containing the specified remote ID property.
    */
  def findAnnotationsByRemoteIdAsync(remoteId: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the ContactAnnotation with the specified Id .
    * @param annotationId The ContactAnnotation.Id used to identify the ContactAnnotation .
    * @return The ContactAnnotation with the specified ID.
    */
  def getAnnotationAsync(annotationId: String): IPromiseWithIAsyncOperation[ContactAnnotation] = js.native
  /**
    * Asynchronously attempts to save the ContactAnnotation to the ContactAnnotationList .
    * @param annotation The annotation to save to the list.
    * @return True if the save was successful, otherwise false.
    */
  def trySaveAnnotationAsync(annotation: ContactAnnotation): IPromiseWithIAsyncOperation[Boolean] = js.native
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
  @scala.inline
  implicit class ContactAnnotationListOps[Self <: ContactAnnotationList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeleteAnnotationAsync(value: ContactAnnotation => IPromiseWithIAsyncAction): Self = this.set("deleteAnnotationAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("deleteAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setFindAnnotationsAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = this.set("findAnnotationsAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setFindAnnotationsByRemoteIdAsync(value: String => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = this.set("findAnnotationsByRemoteIdAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAnnotationAsync(value: String => IPromiseWithIAsyncOperation[ContactAnnotation]): Self = this.set("getAnnotationAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderPackageFamilyName(value: String): Self = this.set("providerPackageFamilyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrySaveAnnotationAsync(value: ContactAnnotation => IPromiseWithIAsyncOperation[Boolean]): Self = this.set("trySaveAnnotationAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setUserDataAccountId(value: String): Self = this.set("userDataAccountId", value.asInstanceOf[js.Any])
  }
  
}

