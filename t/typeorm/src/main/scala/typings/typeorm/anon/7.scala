package typings.typeorm.anon

import typings.typeorm.mongodbTypingsMod.ObjectID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `7` extends StObject {
  
  var _id: ObjectID = js.native
}
object `7` {
  
  @scala.inline
  def apply(_id: ObjectID): `7` = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit class `7MutableBuilder`[Self <: `7`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: ObjectID): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
