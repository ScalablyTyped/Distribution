package typings.vis.anon

import typings.vis.mod.IdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromId extends StObject {
  
  var fromId: IdType
  
  var toId: IdType
}
object FromId {
  
  inline def apply(fromId: IdType, toId: IdType): FromId = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromId] (val x: Self) extends AnyVal {
    
    inline def setFromId(value: IdType): Self = StObject.set(x, "fromId", value.asInstanceOf[js.Any])
    
    inline def setToId(value: IdType): Self = StObject.set(x, "toId", value.asInstanceOf[js.Any])
  }
}
