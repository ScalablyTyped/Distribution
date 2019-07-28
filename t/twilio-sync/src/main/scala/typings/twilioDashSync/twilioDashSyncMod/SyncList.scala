package typings.twilioDashSync.twilioDashSyncMod

import typings.twilioDashSync.libSynclistMod.SyncListImpl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("twilio-sync", "SyncList")
@js.native
class SyncList protected ()
  extends typings.twilioDashSync.libSynclistMod.SyncList {
  def this(syncListImpl: SyncListImpl) = this()
}

/* static members */
@JSImport("twilio-sync", "SyncList")
@js.native
object SyncList extends js.Object {
  val `type`: String = js.native
}

