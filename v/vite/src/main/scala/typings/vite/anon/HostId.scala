package typings.vite.anon

import typings.vite.viteStrings.asset
import typings.vite.viteStrings.css
import typings.vite.viteStrings.html
import typings.vite.viteStrings.js_
import typings.vite.viteStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostId extends StObject {
  
  var hostId: String
  
  var hostType: js_ | css | html
  
  var ssr: Boolean
  
  var `type`: asset | public
}
object HostId {
  
  inline def apply(hostId: String, hostType: js_ | css | html, ssr: Boolean, `type`: asset | public): HostId = {
    val __obj = js.Dynamic.literal(hostId = hostId.asInstanceOf[js.Any], hostType = hostType.asInstanceOf[js.Any], ssr = ssr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostId] (val x: Self) extends AnyVal {
    
    inline def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
    
    inline def setHostType(value: js_ | css | html): Self = StObject.set(x, "hostType", value.asInstanceOf[js.Any])
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setType(value: asset | public): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
