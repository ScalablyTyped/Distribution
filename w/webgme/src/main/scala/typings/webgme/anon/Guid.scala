package typings.webgme.anon

import typings.webgme.v1Mod.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Guid extends StObject {
  
  var guid: GUID
  
  var path: String
}
object Guid {
  
  inline def apply(guid: GUID, path: String): Guid = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
  
  extension [Self <: Guid](x: Self) {
    
    inline def setGuid(value: GUID): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
