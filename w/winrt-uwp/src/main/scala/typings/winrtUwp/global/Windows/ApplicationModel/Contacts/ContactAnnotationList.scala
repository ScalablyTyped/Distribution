package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a list of ContactAnnotation objects. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationList")
@js.native
abstract class ContactAnnotationList ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationList {
  
  /**
    * Asynchronously deletes the specified ContactAnnotation from the list.
    * @param annotation The annotation to delete from the list.
    * @return An async action indicating that the operation has completed.
    */
  /* CompleteClass */
  override def deleteAnnotationAsync(annotation: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotation): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously deletes this ContactAnnotationList from the ContactAnnotationStore .
    * @return An async action indicating that the operation has completed.
    */
  /* CompleteClass */
  override def deleteAsync(): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously gets the list of ContactAnnotation objects.
    * @return The list of ContactAnnotation objects.
    */
  /* CompleteClass */
  override def findAnnotationsAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  
  /**
    * Gets the list of ContactAnnotation objects containing the specified remote ID property.
    * @param remoteId The remote ID used to find the ContactAnnotation objects.
    * @return The list of ContactAnnotation objects containing the specified remote ID property.
    */
  /* CompleteClass */
  override def findAnnotationsByRemoteIdAsync(remoteId: String): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  
  /**
    * Gets the ContactAnnotation with the specified Id .
    * @param annotationId The ContactAnnotation.Id used to identify the ContactAnnotation .
    * @return The ContactAnnotation with the specified ID.
    */
  /* CompleteClass */
  override def getAnnotationAsync(annotationId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotation] = js.native
  
  /** Gets the ID for this ContactAnnotationList . */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets the unique identifier for the app package that created the ContactAnnotationList . */
  /* CompleteClass */
  var providerPackageFamilyName: String = js.native
  
  /**
    * Asynchronously attempts to save the ContactAnnotation to the ContactAnnotationList .
    * @param annotation The annotation to save to the list.
    * @return True if the save was successful, otherwise false.
    */
  /* CompleteClass */
  override def trySaveAnnotationAsync(annotation: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotation): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /** Gets the ID for the UserDataAccount used by the app. */
  /* CompleteClass */
  var userDataAccountId: String = js.native
}
