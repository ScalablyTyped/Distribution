package typings.xdomain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDomainCookies extends StObject {
  
  var master: String
  
  var slave: String
}
object XDomainCookies {
  
  inline def apply(master: String, slave: String): XDomainCookies = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDomainCookies]
  }
  
  extension [Self <: XDomainCookies](x: Self) {
    
    inline def setMaster(value: String): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setSlave(value: String): Self = StObject.set(x, "slave", value.asInstanceOf[js.Any])
  }
}
