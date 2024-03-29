package typings.symphonyApiClientNode.streamsClientMod

import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.IM
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.MIM
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.POST
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.ROOM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamType extends StObject {
  
  var `type`: IM | MIM | ROOM | POST
}
object StreamType {
  
  inline def apply(`type`: IM | MIM | ROOM | POST): StreamType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamType] (val x: Self) extends AnyVal {
    
    inline def setType(value: IM | MIM | ROOM | POST): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
