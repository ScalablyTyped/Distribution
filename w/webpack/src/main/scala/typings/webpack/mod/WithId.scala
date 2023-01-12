package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithId extends StObject {
  
  var id: String | Double
}
object WithId {
  
  inline def apply(id: String | Double): WithId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WithId] (val x: Self) extends AnyVal {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
