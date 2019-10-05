package typings.twilioDashSync

import typings.twilioDashSync.libListitemMod.ListItem
import typings.twilioDashSync.libListitemMod.ListItemDescriptor
import typings.twilioDashSync.libMapitemMod.MapItem
import typings.twilioDashSync.libMapitemMod.MapItemDescriptor
import typings.twilioDashSync.libSyncdocumentMod.SyncDocumentImpl
import typings.twilioDashSync.libSynclistMod.SyncListImpl
import typings.twilioDashSync.libSyncmapMod.SyncMapImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync", JSImport.Namespace)
@js.native
object twilioDashSyncMod extends js.Object {
  /**
    * @class Client
    * @classdesc
    * Client for the Twilio Sync service.
    * @constructor
    * @param {String} token - Twilio access token.
    * @param {Client#ClientOptions} [options] - Options to customize the Client.
    * @example
    * // Using NPM
    * var SyncClient = require('twilio-sync');
    * var syncClient = new SyncClient(token, { logLevel: 'debug' });
    *
    * // Using CDN
    * var SyncClient = new Twilio.Sync.Client(token, { logLevel: 'debug' });
    *
    * @property {Client#ConnectionState} connectionState - Contains current service connection state.
    * Valid options are ['connecting', 'connected', 'disconnecting', 'disconnected', 'denied', 'error'].
    */
  @js.native
  class SyncClient protected ()
    extends typings.twilioDashSync.libClientMod.SyncClient {
    def this(fpaToken: String) = this()
    def this(fpaToken: String, options: js.Any) = this()
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
  @js.native
  class SyncDocument protected ()
    extends typings.twilioDashSync.libSyncdocumentMod.SyncDocument {
    def this(syncDocumentImpl: SyncDocumentImpl) = this()
  }
  
  /**
    * @class
    * @alias List
    * @classdesc Represents a Sync List, which stores an ordered list of values.
    * Use the {@link Client#list} method to obtain a reference to a Sync List.
    * @property {String} sid - List unique id, immutable identifier assigned by the system.
    * @property {String} [uniqueName=null] - List unique name, immutable identifier that can be assigned to list during creation.
    * @property {Date} dateUpdated Date when the List was last updated.
    *
    * @fires List#removed
    * @fires List#itemAdded
    * @fires List#itemRemoved
    * @fires List#itemUpdated
    */
  @js.native
  class SyncList protected ()
    extends typings.twilioDashSync.libSynclistMod.SyncList {
    def this(syncListImpl: SyncListImpl) = this()
  }
  
  /**
    * @class
    * @classdesc Represents an individual element in a Sync List.
    * @alias ListItem
    * @property {Number} index The index, within the containing List, of this item. This index is stable;
    * even if lower-indexed Items are removed, this index will remain as is.
    * @property {Object} value The contents of the item.
    * @property {Date} dateUpdated Date when the List Item was last updated.
    */
  @js.native
  class SyncListItem protected () extends ListItem {
    /**
      * @private
      * @constructor
      * @param {Object} data Item descriptor
      * @param {Number} data.index Item identifier
      * @param {String} data.uri Item URI
      * @param {Object} data.value Item data
      */
    def this(data: ListItemDescriptor) = this()
  }
  
  /**
    * @class
    * @alias Map
    * @classdesc Represents a Sync Map, which stores an unordered set of key:value pairs.
    * Use the {@link Client#map} method to obtain a reference to a Sync Map.
    * @property {String} sid An immutable identifier (a SID) assigned by the system on creation.
    * @property {String} [uniqueName=null] - An optional immutable identifier that may be assigned by the
    * programmer to this map on creation. Unique among other Maps.
    * @property {Date} dateUpdated Date when the Map was last updated.
    *
    * @fires Map#removed
    * @fires Map#itemAdded
    * @fires Map#itemRemoved
    * @fires Map#itemUpdated
    */
  @js.native
  class SyncMap protected ()
    extends typings.twilioDashSync.libSyncmapMod.SyncMap {
    def this(syncMapImpl: SyncMapImpl) = this()
  }
  
  /**
    * @class
    * @classdesc Represents an individual element in a Sync Map.
    * @alias MapItem
    * @property {String} key The identifier that maps to this item within the containing Map.
    * @property {Object} value The contents of the item.
    * @property {Date} dateUpdated Date when the Map Item was last updated, given in UTC ISO 8601 format (e.g., '2018-04-26T15:23:19.732Z')
    */
  @js.native
  class SyncMapItem protected () extends MapItem {
    /**
      * @private
      * @constructor
      */
    def this(descriptor: MapItemDescriptor) = this()
  }
  
  /**
    * @class Client
    * @classdesc
    * Client for the Twilio Sync service.
    * @constructor
    * @param {String} token - Twilio access token.
    * @param {Client#ClientOptions} [options] - Options to customize the Client.
    * @example
    * // Using NPM
    * var SyncClient = require('twilio-sync');
    * var syncClient = new SyncClient(token, { logLevel: 'debug' });
    *
    * // Using CDN
    * var SyncClient = new Twilio.Sync.Client(token, { logLevel: 'debug' });
    *
    * @property {Client#ConnectionState} connectionState - Contains current service connection state.
    * Valid options are ['connecting', 'connected', 'disconnecting', 'disconnected', 'denied', 'error'].
    */
  @js.native
  class default protected ()
    extends typings.twilioDashSync.libClientMod.SyncClient {
    def this(fpaToken: String) = this()
    def this(fpaToken: String, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object SyncClient extends js.Object {
    /**
      * Current version of Sync client.
      * @name Client#version
      * @type String
      * @readonly
      */
    val version: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SyncDocument extends js.Object {
    val `type`: String = js.native
  }
  
  /* static members */
  @js.native
  object SyncList extends js.Object {
    val `type`: String = js.native
  }
  
  /* static members */
  @js.native
  object SyncMap extends js.Object {
    val `type`: String = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Current version of Sync client.
      * @name Client#version
      * @type String
      * @readonly
      */
    val version: js.Any = js.native
  }
  
}

