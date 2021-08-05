package typings.twilsock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offlinestorageMod {
  
  @JSImport("twilsock/lib/offlinestorage", "OfflineProductStorage")
  @js.native
  class OfflineProductStorage protected () extends StObject {
    def this(id: String) = this()
    
    val id: String = js.native
  }
  object OfflineProductStorage {
    
    @JSImport("twilsock/lib/offlinestorage", "OfflineProductStorage")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(productPayload: js.Any): OfflineProductStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(productPayload.asInstanceOf[js.Any]).asInstanceOf[OfflineProductStorage]
  }
}
