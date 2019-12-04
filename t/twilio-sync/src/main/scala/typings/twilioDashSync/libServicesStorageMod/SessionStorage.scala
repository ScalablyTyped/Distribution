package typings.twilioDashSync.libServicesStorageMod

import typings.twilioDashSync.libInterfacesServicesMod.Configuration
import typings.twilioDashSync.libInterfacesServicesMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/services/storage", "SessionStorage")
@js.native
class SessionStorage protected () extends Storage {
  def this(config: Configuration) = this()
  def this(config: Configuration, storage: StorageBackend) = this()
  var _apply: js.Any = js.native
  var _read: js.Any = js.native
  var _store: js.Any = js.native
  val config: js.Any = js.native
  val isReady: js.Any = js.native
  val storage: js.Any = js.native
  var storageId: js.Any = js.native
  var storageKey: js.Any = js.native
  /* CompleteClass */
  override def read(`type`: String, id: String): js.Object = js.native
  /* CompleteClass */
  override def remove(`type`: String, sid: String, uniqueName: String): js.Any = js.native
  /* CompleteClass */
  override def store(`type`: String, id: String, value: js.Object): js.Any = js.native
  /* CompleteClass */
  override def update(`type`: String, id: String, uniqueName: String, patch: js.Object): js.Any = js.native
  /* CompleteClass */
  override def updateStorageId(storageId: String): js.Any = js.native
}

