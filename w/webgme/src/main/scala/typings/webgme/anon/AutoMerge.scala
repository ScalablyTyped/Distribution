package typings.webgme.anon

import typings.webgme.webgmeStrings.ZSSHA
import typings.webgme.webgmeStrings.plainSHA1
import typings.webgme.webgmeStrings.rand160Bits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMerge extends js.Object {
  /**
    * (N.B. Experimental feature) 
    * If enable, incoming commits to branches that initially 
    * were FORKED will be attempted to be merged with the head of the branch. 
    * Use with caution as larger (+100k nodes) projects can slow down the commit rate.
    *   config.storage.autoMerge.enable = false;
    */
  var autoMerge: Enable = js.native
  /**
    * If true, events regarding project/branch creation/deletion 
    * are only broadcasted and not emitted back to the socket who made the change. 
    * Only modify this if you are writing a custom GUI.
    *  config.storage.broadcastProjectEvents = false;
    */
  var broadcastProjectEvents: Boolean = js.native
  /**
    * Number of core-objects stored before emptying cache (server side).
    *  config.storage.cache = 2000;
    */
  var cache: Double = js.native
  /**
    * Number of core-objects stored before emptying cache (client side).
    *   config.storage.clientCache = 2000;
    */
  var clientCache: Double = js.native
  var database: Type = js.native
  /**
    * Since v2.6.2 patched objects on the server are being 
    * checked for consistency w.r.t. the provided hash 
    * before insertion into database. 
    * If true, no checking at all will take place.
    *   config.storage.disableHashChecks = false;
    */
  var disableHashChecks: Boolean = js.native
  /**
    * Algorithm used when hashing the objects in the database, 
    * can be 'plainSHA1', 'rand160Bits' or 'ZSSHA'.
    *   config.storage.keyType = 'plainSha';
    */
  var keyType: plainSHA1 | rand160Bits | ZSSHA = js.native
  /**
    * Size of bucket before triggering a load of objects from the server.
    *   config.storage.loadBucketSize = 100;
    */
  var loadBucketSize: Double = js.native
  /**
    * Time in milliseconds (after a new bucket has been created) 
    * before triggering a load of objects from the server.
    *   config.storage.loadBucketTimer = 10;
    */
  var loadBucketTimer: Double = js.native
  /**
    * If greater than -1, the maximum number of core objects 
    * that will be emitted to other clients. 
    * N.B. this only applies to newly created nodes, 
    * any modified data will always be sent as patches.
    *   config.storage.maxEmittedCoreObjects = -1;
    */
  var maxEmittedCoreObjects: Double = js.native
  /**
    * Options passed to database client 
    * (unless mongo is specified, in that case config.mongo.options are used).
    *   config.storage.database.options = '{}';
    */
  var options: String = js.native
  /**
    * If config.storage.disableHashChecks is set to 
    * false and this option is set to true, 
    * will not insert objects if the hashes do not match. 
    * Set this to false to only log the errors.
    *   config.storage.requireHashesToMatch = true;
    */
  var requireHashesToMatch: Boolean = js.native
}

object AutoMerge {
  @scala.inline
  def apply(
    autoMerge: Enable,
    broadcastProjectEvents: Boolean,
    cache: Double,
    clientCache: Double,
    database: Type,
    disableHashChecks: Boolean,
    keyType: plainSHA1 | rand160Bits | ZSSHA,
    loadBucketSize: Double,
    loadBucketTimer: Double,
    maxEmittedCoreObjects: Double,
    options: String,
    requireHashesToMatch: Boolean
  ): AutoMerge = {
    val __obj = js.Dynamic.literal(autoMerge = autoMerge.asInstanceOf[js.Any], broadcastProjectEvents = broadcastProjectEvents.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], clientCache = clientCache.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], disableHashChecks = disableHashChecks.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any], loadBucketSize = loadBucketSize.asInstanceOf[js.Any], loadBucketTimer = loadBucketTimer.asInstanceOf[js.Any], maxEmittedCoreObjects = maxEmittedCoreObjects.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], requireHashesToMatch = requireHashesToMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMerge]
  }
  @scala.inline
  implicit class AutoMergeOps[Self <: AutoMerge] (val x: Self) extends AnyVal {
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
    def setAutoMerge(value: Enable): Self = this.set("autoMerge", value.asInstanceOf[js.Any])
    @scala.inline
    def setBroadcastProjectEvents(value: Boolean): Self = this.set("broadcastProjectEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: Double): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientCache(value: Double): Self = this.set("clientCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabase(value: Type): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableHashChecks(value: Boolean): Self = this.set("disableHashChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyType(value: plainSHA1 | rand160Bits | ZSSHA): Self = this.set("keyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBucketSize(value: Double): Self = this.set("loadBucketSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBucketTimer(value: Double): Self = this.set("loadBucketTimer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxEmittedCoreObjects(value: Double): Self = this.set("maxEmittedCoreObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequireHashesToMatch(value: Boolean): Self = this.set("requireHashesToMatch", value.asInstanceOf[js.Any])
  }
  
}

