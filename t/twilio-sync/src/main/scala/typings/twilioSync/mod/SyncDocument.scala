package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Sync document, the contents of which is a single JSON object.
  * Use the {@link SyncClient.document} method to obtain a reference to a Sync document.
  * Information about rate limits can be found [here](https://www.twilio.com/docs/sync/limits).
  */
@js.native
trait SyncDocument extends Closeable {
  
  /**
    * The contents of this document.
    */
  def data: js.Object = js.native
  
  def dateExpires: String = js.native
  
  /**
    * Date when the document was last updated.
    */
  def dateUpdated: js.Date = js.native
  
  def lastEventId: Double = js.native
  
  /**
    * Schedules a modification to this document that will apply a mutation function.
    * @param mutator A function that outputs new data based on the existing data.
    * May be called multiple times, particularly if this document is modified concurrently by remote code.
    * If the mutation ultimately succeeds, the document will have made the particular transition described
    * by this function.
    * @param metadataUpdates New document metadata.
    * @return Resolves with the most recent Document state, whether the output of a
    * successful mutation or a state that prompted graceful cancellation (mutator returned `null`).
    * @example
    * ```typescript
    * const mutatorFunction = (currentValue) => {
    *     currentValue.viewCount = (currentValue.viewCount ?? 0) + 1;
    *     return currentValue;
    * };
    * document.mutate(mutatorFunction, { ttl: 86400 }))
    *   .then((newValue) => {
    *     console.log('Document mutate() successful, new data:', newValue);
    *   })
    *   .catch((error) => {
    *     console.error('Document mutate() failed', error);
    *   });
    * ```
    */
  def mutate(mutator: Mutator): js.Promise[js.Object] = js.native
  def mutate(mutator: Mutator, metadataUpdates: SyncDocumentMetadata): js.Promise[js.Object] = js.native
  
  /**
    * Delete a document.
    * @return A promise which resolves if (and only if) the document is ultimately deleted.
    * @example
    * ```typescript
    * document.removeDocument()
    *   .then(() => {
    *     console.log('Document removeDocument() successful');
    *   })
    *   .catch((error) => {
    *     console.error('Document removeDocument() failed', error);
    *   });
    * ```
    */
  def removeDocument(): js.Promise[scala.Nothing] = js.native
  
  def revision: String = js.native
  
  /**
    * Assign new contents to this document. The current data will be overwritten.
    * @param data The new contents to assign.
    * @param metadataUpdates New document metadata.
    * @return A promise resolving to the new data of the document.
    * @example
    * ```typescript
    * // Say, the Document data is `{ name: 'John Smith', age: 34 }`
    * document.set({ name: 'Barbara Oaks' }, { ttl: 86400 })
    *   .then((newValue) => {
    *     // Now the Document data is `{ name: 'Barbara Oaks' }`
    *     console.log('Document set() successful, new data:', newValue);
    *   })
    *   .catch((error) => {
    *     console.error('Document set() failed', error);
    *   });
    * ```
    */
  def set(data: js.Object): js.Promise[js.Object] = js.native
  def set(data: js.Object, metadataUpdates: SyncDocumentMetadata): js.Promise[js.Object] = js.native
  
  /**
    * Update the time-to-live of the document.
    * @param ttl Specifies the time-to-live in seconds after which the document is subject to automatic deletion. The value 0 means infinity.
    * @return A promise that resolves after the TTL update was successful.
    * @example
    * ```typescript
    * document.setTtl(3600)
    *   .then(() => {
    *     console.log('Document setTtl() successful');
    *   })
    *   .catch((error) => {
    *     console.error('Document setTtl() failed', error);
    *   });
    * ```
    */
  def setTtl(ttl: Double): js.Promise[Unit] = js.native
  
  /**
    * The immutable identifier of this document, assigned by the system.
    */
  def sid: String = js.native
  
  /* private */ val syncDocumentImpl: Any = js.native
  
  def `type`: String = js.native
  
  /**
    * An optional immutable identifier that may be assigned by the programmer
    * to this document during creation. Globally unique among other documents.
    */
  def uniqueName: String = js.native
  
  /**
    * Modify a document by appending new fields (or by overwriting existing ones) with the values from the provided Object.
    * This is equivalent to:
    * ```typescript
    * document.mutate((currentValue) => Object.assign(currentValue, obj));
    * ```
    * @param obj Specifies the particular (top-level) attributes that will receive new values.
    * @param metadataUpdates New document metadata.
    * @return A promise resolving to the new data of the document.
    * @example
    * ```typescript
    * // Say, the Document data is `{ name: 'John Smith' }`
    * document.update({ age: 34 }, { ttl: 86400 })
    *   .then((newValue) => {
    *     // Now the Document data is `{ name: 'John Smith', age: 34 }`
    *     console.log('Document update() successful, new data:', newValue);
    *   })
    *   .catch((error) => {
    *     console.error('Document update() failed', error);
    *   });
    * ```
    */
  def update(obj: js.Object): js.Promise[js.Object] = js.native
  def update(obj: js.Object, metadataUpdates: SyncDocumentMetadata): js.Promise[js.Object] = js.native
  
  // private props
  def uri: String = js.native
}
