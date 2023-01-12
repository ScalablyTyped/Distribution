package typings.uuidBrowser

import org.scalablytyped.runtime.Shortcut
import typings.uuidBrowser.interfacesMod.v5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v5Mod extends Shortcut {
  
  @JSImport("uuid-browser/v5", JSImport.Namespace)
  @js.native
  val ^ : v5Static & v5 = js.native
  
  type _To = v5Static & v5
  
  /* This means you don't have to write `^`, but can instead just say `v5Mod.foo` */
  override def _to: v5Static & v5 = ^
  
  trait v5Static extends StObject {
    
    // https://github.com/kelektiv/node-uuid/blob/master/v5.js#L47
    var DNS: String
    
    // https://github.com/kelektiv/node-uuid/blob/master/v5.js#L48
    var URL: String
  }
  object v5Static {
    
    inline def apply(DNS: String, URL: String): v5Static = {
      val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[v5Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: v5Static] (val x: Self) extends AnyVal {
      
      inline def setDNS(value: String): Self = StObject.set(x, "DNS", value.asInstanceOf[js.Any])
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
}
