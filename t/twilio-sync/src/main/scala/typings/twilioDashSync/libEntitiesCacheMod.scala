package typings.twilioDashSync

import typings.twilioDashSync.libEntityMod.SyncEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/entitiesCache", JSImport.Namespace)
@js.native
object libEntitiesCacheMod extends js.Object {
  @js.native
  class EntitiesCache () extends js.Object {
    val entities: js.Any = js.native
    val names: js.Any = js.native
    def get(id: String, `type`: String): SyncEntity = js.native
    /* protected */ def getResolved(id: String, `type`: String): SyncEntity = js.native
    def remove(sid: String): Unit = js.native
    def store[T /* <: SyncEntity */](entity: T): T = js.native
  }
  
}

