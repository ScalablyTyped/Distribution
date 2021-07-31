package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomAttributes extends StObject {
  
  var name: String
}
object RoomAttributes {
  
  @scala.inline
  def apply(name: String): RoomAttributes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomAttributes]
  }
  
  @scala.inline
  implicit class RoomAttributesMutableBuilder[Self <: RoomAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
