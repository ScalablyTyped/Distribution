package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Database extends js.Object {
  /**
               * (N.B. Experimental feature) 
               * If enable, incoming commits to branches that initially 
               * were FORKED will be attempted to be merged with the head of the branch. 
               * Use with caution as larger (+100k nodes) projects can slow down the commit rate.
               *   config.storage.autoMerge.enable = false;
               */
  var autoMerge: Anon_EnableBoolean
  /**
               * If true, events regarding project/branch creation/deletion 
               * are only broadcasted and not emitted back to the socket who made the change. 
               * Only modify this if you are writing a custom GUI.
               *  config.storage.broadcastProjectEvents = false;
               */
  var broadcastProjectEvents: scala.Boolean
  /**
               * Number of core-objects stored before emptying cache (server side).
               *  config.storage.cache = 2000;
               */
  var cache: scala.Double
  /**
               * Number of core-objects stored before emptying cache (client side).
               *   config.storage.clientCache = 2000;
               */
  var clientCache: scala.Double
  var database: Anon_Type
  /**
               * Since v2.6.2 patched objects on the server are being 
               * checked for consistency w.r.t. the provided hash 
               * before insertion into database. 
               * If true, no checking at all will take place.
               *   config.storage.disableHashChecks = false;
               */
  var disableHashChecks: scala.Boolean
  /**
               * Algorithm used when hashing the objects in the database, 
               * can be 'plainSHA1', 'rand160Bits' or 'ZSSHA'.
               *   config.storage.keyType = 'plainSha';
               */
  var keyType: webgmeLib.webgmeLibStrings.plainSHA1 | webgmeLib.webgmeLibStrings.rand160Bits | webgmeLib.webgmeLibStrings.ZSSHA
  /**
               * Size of bucket before triggering a load of objects from the server.
               *   config.storage.loadBucketSize = 100;
               */
  var loadBucketSize: scala.Double
  /**
               * Time in milliseconds (after a new bucket has been created) 
               * before triggering a load of objects from the server.
               *   config.storage.loadBucketTimer = 10;
               */
  var loadBucketTimer: scala.Double
  /**
               * If greater than -1, the maximum number of core objects 
               * that will be emitted to other clients. 
               * N.B. this only applies to newly created nodes, 
               * any modified data will always be sent as patches.
               *   config.storage.maxEmittedCoreObjects = -1;
               */
  var maxEmittedCoreObjects: scala.Double
  /**
               * Options passed to database client 
               * (unless mongo is specified, in that case config.mongo.options are used).
               *   config.storage.database.options = '{}';
               */
  var options: java.lang.String
  /**
               * If config.storage.disableHashChecks is set to 
               * false and this option is set to true, 
               * will not insert objects if the hashes do not match. 
               * Set this to false to only log the errors.
               *   config.storage.requireHashesToMatch = true;
               */
  var requireHashesToMatch: scala.Boolean
}

