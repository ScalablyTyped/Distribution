package typings.twilioSync.storageMod

import typings.twilioSync.servicesMod.Configuration
import typings.twilioSync.servicesMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-sync/lib/services/storage", "SessionStorage")
@js.native
class SessionStorage protected () extends Storage {
  def this(config: Configuration) = this()
  def this(config: Configuration, storage: StorageBackend) = this()
  
  var _apply: js.Any = js.native
  
  var _read: js.Any = js.native
  
  var _store: js.Any = js.native
  
  val config: js.Any = js.native
  
  /* private */ def isReady: js.Any = js.native
  
  val storage: js.Any = js.native
  
  var storageId: js.Any = js.native
  
  var storageKey: js.Any = js.native
}
