package typings.wdioProtocols.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowHandle extends StObject {
  
  var handle: String
  
  var `type`: String
}
object WindowHandle {
  
  inline def apply(handle: String, `type`: String): WindowHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowHandle] (val x: Self) extends AnyVal {
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
