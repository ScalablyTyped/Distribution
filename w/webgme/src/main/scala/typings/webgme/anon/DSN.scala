package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSN extends StObject {
  
  var DSN: String
  
  var enable: Boolean
  
  var ravenOptions: Null | String
}
object DSN {
  
  inline def apply(DSN: String, enable: Boolean): DSN = {
    val __obj = js.Dynamic.literal(DSN = DSN.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], ravenOptions = null)
    __obj.asInstanceOf[DSN]
  }
  
  extension [Self <: DSN](x: Self) {
    
    inline def setDSN(value: String): Self = StObject.set(x, "DSN", value.asInstanceOf[js.Any])
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setRavenOptions(value: String): Self = StObject.set(x, "ravenOptions", value.asInstanceOf[js.Any])
    
    inline def setRavenOptionsNull: Self = StObject.set(x, "ravenOptions", null)
  }
}
