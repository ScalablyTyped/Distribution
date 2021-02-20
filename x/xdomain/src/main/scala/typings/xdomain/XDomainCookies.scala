package typings.xdomain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDomainCookies extends StObject {
  
  var master: String = js.native
  
  var slave: String = js.native
}
object XDomainCookies {
  
  @scala.inline
  def apply(master: String, slave: String): XDomainCookies = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDomainCookies]
  }
  
  @scala.inline
  implicit class XDomainCookiesMutableBuilder[Self <: XDomainCookies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster(value: String): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlave(value: String): Self = StObject.set(x, "slave", value.asInstanceOf[js.Any])
  }
}
