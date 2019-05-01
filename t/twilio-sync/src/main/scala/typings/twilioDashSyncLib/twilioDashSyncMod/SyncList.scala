package typings
package twilioDashSyncLib.twilioDashSyncMod

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
  extends twilioDashSyncLib.libSynclistMod.SyncList {
  /**
    * @private
    */
  def this(services: twilioDashSyncLib.libSynclistMod.ListServices, descriptor: twilioDashSyncLib.libSynclistMod.ListDescriptor, removalHandler: twilioDashSyncLib.libEntityMod.RemovalHandler) = this()
}

/* static members */
@JSImport("twilio-sync", "SyncList")
@js.native
object SyncList extends js.Object {
  val `type`: java.lang.String = js.native
}

