package typings.swellJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSectionSnake
  extends StObject
     with /* otherAttr */ StringDictionary[String | Double | Boolean | Null] {
  
  var id: String
  
  var `type`: String
}
object ContentSectionSnake {
  
  inline def apply(id: String, `type`: String): ContentSectionSnake = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSectionSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentSectionSnake] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
