package typings
package twilioDashSyncLib.libSyncdocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @alias Document
  * @classdesc Represents a Sync Document, the contents of which is a single JSON object.
  * Use the {@link Client#document} method to obtain a reference to a Sync Document.
  * @property {String} sid The immutable identifier of this document, assigned by the system.
  * @property {String} [uniqueName=null] An optional immutable identifier that may be assigned by the programmer
  * to this document during creation. Globally unique among other Documents.
  * @property {Date} dateUpdated Date when the Document was last updated.
  * @property {Object} value The contents of this document.
  *
  * @fires Document#removed
  * @fires Document#updated
  */
@JSImport("twilio-sync/lib/syncdocument", "SyncDocument")
@js.native
class SyncDocument protected ()
  extends twilioDashSyncLib.libEntityMod.SyncEntity {
  /**
    * @private
    */
  def this(services: DocumentServices, descriptor: DocumentDescriptor, removalHandler: twilioDashSyncLib.libEntityMod.RemovalHandler) = this()
  /**
    * @private
    */
  var _handleSuccessfulUpdateResult: js.Any = js.native
  /**
    * @private
    */
  var _postUpdateToServer: js.Any = js.native
  /**
    * @private
    */
  var _setUnconditionally: js.Any = js.native
  /**
    * @private
    */
  var _setWithIfMatch: js.Any = js.native
  /**
    * Get new data from server
    * @private
    */
  var _softSync: js.Any = js.native
  val dateExpires: java.lang.String = js.native
  val dateUpdated: stdLib.Date = js.native
  val descriptor: js.Any = js.native
  var isDeleted: js.Any = js.native
  val revision: java.lang.String = js.native
  val updateMergingQueue: js.Any = js.native
  val uri: java.lang.String = js.native
  val value: js.Object = js.native
  /**
    * Update data entity with new data
    * @private
    */
  def _update(update: js.Any): scala.Unit = js.native
  /**
    * Schedules a modification to this document that will apply a mutation function.
    * @param {Document~Mutator} mutator A function that outputs a new value based on the existing value.
    * May be called multiple times, particularly if this Document is modified concurrently by remote code.
    * If the mutation ultimately succeeds, the Document will have made the particular transition described
    * by this function.
    * @param {Document#Metadata} [metadataUpdates] New document metadata.
    * @return {Promise<Object>} Resolves with the most recent Document state, whether the output of a
    *    successful mutation or a state that prompted graceful cancellation (mutator returned <code>null</code>).
    * @public
    * @example
    * var mutatorFunction = function(currentValue) {
    *     currentValue.viewCount = (currentValue.viewCount || 0) + 1;
    *     return currentValue;
    * };
    * document.mutate(mutatorFunction, { ttl: 86400 }))
    *   .then(function(newValue) {
    *     console.log('Document mutate() successful, new value:', newValue);
    *   })
    *   .catch(function(error) {
    *     console.error('Document mutate() failed', error);
    *   });
    */
  def mutate(mutator: twilioDashSyncLib.libInterfacesMutatorMod.Mutator): js.Promise[js.Object] = js.native
  def mutate(mutator: twilioDashSyncLib.libInterfacesMutatorMod.Mutator, metadataUpdates: DocumentMetadata): js.Promise[js.Object] = js.native
  /**
    * Delete a document.
    * @return {Promise<void>} A promise which resolves if (and only if) the document is ultimately deleted.
    * @public
    * @example
    * document.removeDocument()
    *   .then(function() {
    *     console.log('Document removeDocument() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('Document removeDocument() failed', error);
    *   });
    */
  def removeDocument(): js.Promise[scala.Nothing] = js.native
  /**
    * Assign new contents to this document. The current value will be overwritten.
    * @param {Object} value The new contents to assign.
    * @param {Document#Metadata} [metadataUpdates] New document metadata.
    * @returns {Promise<Object>} A promise resolving to the new value of the document.
    * @public
    * @example
    * // Say, the Document value is { name: 'John Smith', age: 34 }
    * document.set({ name: 'Barbara Oaks' }, { ttl: 86400 })
    *   .then(function(newValue) {
    *     // Now the Document value is { name: 'Barbara Oaks' }
    *     console.log('Document set() successful, new value:', newValue);
    *   })
    *   .catch(function(error) {
    *     console.error('Document set() failed', error);
    *   });
    */
  def set(value: js.Object): js.Promise[js.Object] = js.native
  def set(value: js.Object, metadataUpdates: DocumentMetadata): js.Promise[js.Object] = js.native
  /**
    * Update the time-to-live of the document.
    * @param {Number} ttl Specifies the time-to-live in seconds after which the document is subject to automatic deletion. The value 0 means infinity.
    * @return {Promise<void>} A promise that resolves after the TTL update was successful.
    * @public
    * @example
    * document.setTtl(3600)
    *   .then(function() {
    *     console.log('Document setTtl() successful');
    *   })
    *   .catch(function(error) {
    *     console.error('Document setTtl() failed', error);
    *   });
    */
  def setTtl(ttl: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Modify a document by appending new fields (or by overwriting existing ones) with the values from the provided Object.
    * This is equivalent to
    * <pre>
    * document.mutate(function(currentValue) {
    *   return Object.assign(currentValue, obj));
    * });
    * </pre>
    * @param {Object} obj Specifies the particular (top-level) attributes that will receive new values.
    * @param {Document#Metadata} [metadataUpdates] New document metadata.
    * @return {Promise<Object>} A promise resolving to the new value of the document.
    * @public
    * @example
    * // Say, the Document value is { name: 'John Smith' }
    * document.update({ age: 34 }, { ttl: 86400 })
    *   .then(function(newValue) {
    *     // Now the Document value is { name: 'John Smith', age: 34 }
    *     console.log('Document update() successful, new value:', newValue);
    *   })
    *   .catch(function(error) {
    *     console.error('Document update() failed', error);
    *   });
    */
  def update(obj: js.Object): js.Promise[js.Object] = js.native
  def update(obj: js.Object, metadataUpdates: DocumentMetadata): js.Promise[js.Object] = js.native
}

/* static members */
@JSImport("twilio-sync/lib/syncdocument", "SyncDocument")
@js.native
object SyncDocument extends js.Object {
  val `type`: java.lang.String = js.native
}

