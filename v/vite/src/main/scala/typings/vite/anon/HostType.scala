package typings.vite.anon

import typings.vite.viteStrings.html
import typings.vite.viteStrings.js_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostType extends StObject {
  
  var hostId: String
  
  var hostType: html | js_
}
object HostType {
  
  inline def apply(hostId: String, hostType: html | js_): HostType = {
    val __obj = js.Dynamic.literal(hostId = hostId.asInstanceOf[js.Any], hostType = hostType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostType] (val x: Self) extends AnyVal {
    
    inline def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
    
    inline def setHostType(value: html | js_): Self = StObject.set(x, "hostType", value.asInstanceOf[js.Any])
  }
}
