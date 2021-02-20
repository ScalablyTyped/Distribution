package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamAttributes extends StObject {
  
  var members: js.Array[Double] = js.native
}
object StreamAttributes {
  
  @scala.inline
  def apply(members: js.Array[Double]): StreamAttributes = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamAttributes]
  }
  
  @scala.inline
  implicit class StreamAttributesMutableBuilder[Self <: StreamAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[Double]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: Double*): Self = StObject.set(x, "members", js.Array(value :_*))
  }
}
