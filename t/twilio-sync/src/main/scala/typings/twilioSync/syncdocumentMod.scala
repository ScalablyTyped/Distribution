package typings.twilioSync

import typings.std.Date
import typings.twilioSync.entityMod.EntityServices
import typings.twilioSync.entityMod.RemovalHandler
import typings.twilioSync.entityMod.SyncEntity
import typings.twilioSync.mutatorMod.Mutator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncdocumentMod {
  
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
  @JSImport("twilio-sync/lib/syncdocument", JSImport.Default)
  @js.native
  class default protected () extends SyncDocument {
    def this(syncDocumentImpl: SyncDocumentImpl) = this()
  }
  
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
    extends typings.twilioSync.closeableMod.default {
    def this(syncDocumentImpl: SyncDocumentImpl) = this()
    
    def dateExpires: String = js.native
    
    def dateUpdated: Date = js.native
    
    def lastEventId: Double = js.native
    
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
    def mutate(mutator: Mutator): js.Promise[js.Object] = js.native
    def mutate(mutator: Mutator, metadataUpdates: DocumentMetadata): js.Promise[js.Object] = js.native
    
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
    
    def revision: String = js.native
    
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
    def setTtl(ttl: Double): js.Promise[Unit] = js.native
    
    def sid: String = js.native
    
    /* private */ val syncDocumentImpl: js.Any = js.native
    
    def `type`: String = js.native
    
    def uniqueName: String = js.native
    
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
    
    def uri: String = js.native
    
    def value: js.Object = js.native
  }
  
  @JSImport("twilio-sync/lib/syncdocument", "SyncDocumentImpl")
  @js.native
  class SyncDocumentImpl protected () extends SyncEntity {
    /**
      * @private
      */
    def this(services: DocumentServices, descriptor: DocumentDescriptor, removalHandler: RemovalHandler) = this()
    
    /**
      * @private
      */
    /* private */ var _handleSuccessfulUpdateResult: js.Any = js.native
    
    /**
      * @private
      */
    /* private */ var _postUpdateToServer: js.Any = js.native
    
    /**
      * @private
      */
    /* private */ var _setUnconditionally: js.Any = js.native
    
    /**
      * @private
      */
    /* private */ var _setWithIfMatch: js.Any = js.native
    
    /**
      * Get new data from server
      * @private
      */
    /* private */ var _softSync: js.Any = js.native
    
    /**
      * Update data entity with new data
      * @private
      */
    def _update(update: js.Any): Unit = js.native
    
    def dateExpires: String = js.native
    
    def dateUpdated: Date = js.native
    
    /* private */ val descriptor: js.Any = js.native
    
    /* private */ var isDeleted: js.Any = js.native
    
    def mutate(mutator: Mutator): js.Promise[js.Object] = js.native
    def mutate(mutator: Mutator, metadataUpdates: DocumentMetadata): js.Promise[js.Object] = js.native
    
    def removeDocument(): js.Promise[scala.Nothing] = js.native
    
    def revision: String = js.native
    
    def set(value: js.Object): js.Promise[js.Object] = js.native
    def set(value: js.Object, metadataUpdates: DocumentMetadata): js.Promise[js.Object] = js.native
    
    def setTtl(ttl: Double): js.Promise[Unit] = js.native
    
    def update(obj: js.Object): js.Promise[js.Object] = js.native
    def update(obj: js.Object, metadataUpdates: DocumentMetadata): js.Promise[js.Object] = js.native
    
    /* private */ val updateMergingQueue: js.Any = js.native
    
    def uri: String = js.native
    
    def value: js.Object = js.native
  }
  
  trait DocumentDescriptor extends StObject {
    
    var data: js.Object
    
    var date_expires: String
    
    var date_updated: Date
    
    var last_event_id: Double
    
    var revision: String
    
    var sid: String
    
    var unique_name: String
    
    var url: String
  }
  object DocumentDescriptor {
    
    inline def apply(
      data: js.Object,
      date_expires: String,
      date_updated: Date,
      last_event_id: Double,
      revision: String,
      sid: String,
      unique_name: String,
      url: String
    ): DocumentDescriptor = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentDescriptor]
    }
    
    extension [Self <: DocumentDescriptor](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDate_expires(value: String): Self = StObject.set(x, "date_expires", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setLast_event_id(value: Double): Self = StObject.set(x, "last_event_id", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DocumentMetadata extends StObject {
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object DocumentMetadata {
    
    inline def apply(): DocumentMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentMetadata]
    }
    
    extension [Self <: DocumentMetadata](x: Self) {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  type DocumentServices = EntityServices
}
