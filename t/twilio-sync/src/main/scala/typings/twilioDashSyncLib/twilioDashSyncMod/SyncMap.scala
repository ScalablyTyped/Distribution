package typings
package twilioDashSyncLib.twilioDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("twilio-sync", "SyncMap")
@js.native
class SyncMap protected ()
  extends twilioDashSyncLib.libSyncmapMod.SyncMap {
  def this(syncMapImpl: twilioDashSyncLib.libSyncmapMod.SyncMapImpl) = this()
}

/* static members */
@JSImport("twilio-sync", "SyncMap")
@js.native
object SyncMap extends js.Object {
  val `type`: java.lang.String = js.native
}

