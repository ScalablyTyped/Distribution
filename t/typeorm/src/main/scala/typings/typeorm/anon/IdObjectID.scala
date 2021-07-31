package typings.typeorm.anon

import typings.typeorm.typingsMod.ObjectID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdObjectID extends StObject {
  
  var _id: ObjectID
}
object IdObjectID {
  
  @scala.inline
  def apply(_id: ObjectID): IdObjectID = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdObjectID]
  }
  
  @scala.inline
  implicit class IdObjectIDMutableBuilder[Self <: IdObjectID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: ObjectID): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
