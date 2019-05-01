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
@JSImport("twilio-sync/lib/syncdocument", JSImport.Default)
@js.native
class default protected () extends SyncDocument {
  /**
    * @private
    */
  def this(services: DocumentServices, descriptor: DocumentDescriptor, removalHandler: twilioDashSyncLib.libEntityMod.RemovalHandler) = this()
}

/* static members */
@JSImport("twilio-sync/lib/syncdocument", JSImport.Default)
@js.native
object default extends js.Object {
  val `type`: java.lang.String = js.native
}

