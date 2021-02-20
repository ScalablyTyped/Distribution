package typings.symphonyApiClientNode.streamsClientMod

import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.IM
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.MIM
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.POST
import typings.symphonyApiClientNode.symphonyApiClientNodeStrings.ROOM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamType extends StObject {
  
  var `type`: IM | MIM | ROOM | POST = js.native
}
object StreamType {
  
  @scala.inline
  def apply(`type`: IM | MIM | ROOM | POST): StreamType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamType]
  }
  
  @scala.inline
  implicit class StreamTypeMutableBuilder[Self <: StreamType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: IM | MIM | ROOM | POST): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
