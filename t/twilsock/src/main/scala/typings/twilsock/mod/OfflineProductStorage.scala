package typings.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineProductStorage extends StObject {
  
  val id: String
}
object OfflineProductStorage {
  
  inline def apply(id: String): OfflineProductStorage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineProductStorage]
  }
  
  extension [Self <: OfflineProductStorage](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
