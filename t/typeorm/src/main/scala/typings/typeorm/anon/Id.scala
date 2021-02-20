package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends StObject {
  
  var _id_ : Double = js.native
  
  var username: Double = js.native
}
object Id {
  
  @scala.inline
  def apply(_id_ : Double, username: Double): Id = {
    val __obj = js.Dynamic.literal(_id_ = _id_.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: Double): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id_(value: Double): Self = StObject.set(x, "_id_", value.asInstanceOf[js.Any])
  }
}
