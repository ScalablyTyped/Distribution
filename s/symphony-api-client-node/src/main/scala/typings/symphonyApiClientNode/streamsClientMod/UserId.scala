package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserId extends StObject {
  
  var id: String
}
object UserId {
  
  @scala.inline
  def apply(id: String): UserId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserId]
  }
  
  @scala.inline
  implicit class UserIdMutableBuilder[Self <: UserId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
