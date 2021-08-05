package typings.typeorm.anon

import typings.typeorm.mongodbTypingsMod.ObjectID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var _id: ObjectID
}
object `7` {
  
  inline def apply(_id: ObjectID): `7` = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def set_id(value: ObjectID): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
