package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionId extends StObject {
  
  var description: String
  
  var id: Double
}
object DescriptionId {
  
  inline def apply(description: String, id: Double): DescriptionId = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionId]
  }
  
  extension [Self <: DescriptionId](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
