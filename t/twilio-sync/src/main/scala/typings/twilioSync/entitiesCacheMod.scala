package typings.twilioSync

import typings.twilioSync.entityMod.SyncEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-sync/lib/entitiesCache", JSImport.Namespace)
@js.native
object entitiesCacheMod extends js.Object {
  
  @js.native
  class EntitiesCache () extends js.Object {
    
    val entities: js.Any = js.native
    
    def get(id: String, `type`: String): SyncEntity = js.native
    
    /* protected */ def getResolved(id: String, `type`: String): SyncEntity = js.native
    
    val names: js.Any = js.native
    
    def remove(sid: String): Unit = js.native
    
    def store[T /* <: SyncEntity */](entity: T): T = js.native
  }
}
